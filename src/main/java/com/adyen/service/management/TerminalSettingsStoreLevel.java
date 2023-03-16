/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.service.management;

import com.adyen.ApiKeyAuthenticatedService;
import com.adyen.Client;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.JSON;
import com.adyen.model.management.Logo;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.TerminalSettings;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalSettingsStoreLevel extends ApiKeyAuthenticatedService {
    public TerminalSettingsStoreLevel(Client client) {
        super(client);
        new JSON();
    }

    /**
     * Get the terminal logo
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param reference The reference that identifies the store. (required)
     * @param queryParams  (optional)
     *    model: The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T. (optional)
     * @return Logo
     * @throws ApiException if fails to make API call
     */
    public Logo getTheTerminalLogo(String merchantId, String reference, Map<String, String> queryParams) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (reference == null) {
            throw new ApiException("Missing the required parameter 'reference'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("reference", reference);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/stores/{reference}/terminalLogos");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return Logo.fromJson(jsonResult);
    }
    
    /**
     * Get terminal settings
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param reference The reference that identifies the store. (required)
     * @return TerminalSettings
     * @throws ApiException if fails to make API call
     */
    public TerminalSettings getTerminalSettings(String merchantId, String reference) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (reference == null) {
            throw new ApiException("Missing the required parameter 'reference'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("reference", reference);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/stores/{reference}/terminalSettings");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalSettings.fromJson(jsonResult);
    }
    
    /**
     * Get the terminal logo
     *
     * @param storeId The unique identifier of the store. (required)
     * @param queryParams  (optional)
     *    model: The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T. (optional)
     * @return Logo
     * @throws ApiException if fails to make API call
     */
    public Logo getTheTerminalLogo(String storeId, Map<String, String> queryParams) throws ApiException, IOException {
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("storeId", storeId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/stores/{storeId}/terminalLogos");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return Logo.fromJson(jsonResult);
    }
    
    /**
     * Get terminal settings
     *
     * @param storeId The unique identifier of the store. (required)
     * @return TerminalSettings
     * @throws ApiException if fails to make API call
     */
    public TerminalSettings getTerminalSettings(String storeId) throws ApiException, IOException {
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("storeId", storeId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/stores/{storeId}/terminalSettings");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalSettings.fromJson(jsonResult);
    }
    
    /**
     * Update the terminal logo
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param reference The reference that identifies the store. (required)
     * @param logo  (optional)
     * @param queryParams  (optional)
     *    model: The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T (optional)
     * @return Logo
     * @throws ApiException if fails to make API call
     */
    public Logo updateTheTerminalLogo(String merchantId, String reference, Logo logo, Map<String, String> queryParams) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (reference == null) {
            throw new ApiException("Missing the required parameter 'reference'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("reference", reference);

        String requestBody = logo.toJson();
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/stores/{reference}/terminalLogos");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams, queryParams);
        return Logo.fromJson(jsonResult);
    }
    
    /**
     * Update terminal settings
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param reference The reference that identifies the store. (required)
     * @param terminalSettings  (optional)
     * @return TerminalSettings
     * @throws ApiException if fails to make API call
     */
    public TerminalSettings updateTerminalSettings(String merchantId, String reference, TerminalSettings terminalSettings) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (reference == null) {
            throw new ApiException("Missing the required parameter 'reference'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("reference", reference);

        String requestBody = terminalSettings.toJson();
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/stores/{reference}/terminalSettings");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams);
        return TerminalSettings.fromJson(jsonResult);
    }
    
    /**
     * Update the terminal logo
     *
     * @param storeId The unique identifier of the store. (required)
     * @param logo  (optional)
     * @param queryParams  (optional)
     *    model: The terminal model. Possible values: E355, VX675WIFIBT, VX680, VX690, VX700, VX820, M400, MX925, P400Plus, UX300, UX410, V200cPlus, V240mPlus, V400cPlus, V400m, e280, e285, e285p, S1E, S1EL, S1F2, S1L, S1U, S7T. (optional)
     * @return Logo
     * @throws ApiException if fails to make API call
     */
    public Logo updateTheTerminalLogo(String storeId, Logo logo, Map<String, String> queryParams) throws ApiException, IOException {
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("storeId", storeId);

        String requestBody = logo.toJson();
        ManagementResource resource = new ManagementResource(this, "/stores/{storeId}/terminalLogos");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams, queryParams);
        return Logo.fromJson(jsonResult);
    }
    
    /**
     * Update terminal settings
     *
     * @param storeId The unique identifier of the store. (required)
     * @param terminalSettings  (optional)
     * @return TerminalSettings
     * @throws ApiException if fails to make API call
     */
    public TerminalSettings updateTerminalSettings(String storeId, TerminalSettings terminalSettings) throws ApiException, IOException {
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("storeId", storeId);

        String requestBody = terminalSettings.toJson();
        ManagementResource resource = new ManagementResource(this, "/stores/{storeId}/terminalSettings");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams);
        return TerminalSettings.fromJson(jsonResult);
    }
    
}
