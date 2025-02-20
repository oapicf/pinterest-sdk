/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.pinterestsdk.api;

import com.github.oapicf.pinterestsdk.ApiCallback;
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.ApiResponse;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.Pair;
import com.github.oapicf.pinterestsdk.ProgressRequestBody;
import com.github.oapicf.pinterestsdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.oapicf.pinterestsdk.model.BulkDownloadRequest;
import com.github.oapicf.pinterestsdk.model.BulkDownloadResponse;
import com.github.oapicf.pinterestsdk.model.BulkUpsertRequest;
import com.github.oapicf.pinterestsdk.model.BulkUpsertResponse;
import com.github.oapicf.pinterestsdk.model.BulkUpsertStatusResponse;
import com.github.oapicf.pinterestsdk.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BulkApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BulkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BulkApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for bulkDownloadCreate
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkDownloadRequest Parameters to get ad entities in bulk (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkDownloadCreateCall(String adAccountId, BulkDownloadRequest bulkDownloadRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = bulkDownloadRequest;

        // create path and map variables
        String localVarPath = "/ad_accounts/{ad_account_id}/bulk/download"
            .replace("{" + "ad_account_id" + "}", localVarApiClient.escapeString(adAccountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "pinterest_oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkDownloadCreateValidateBeforeCall(String adAccountId, BulkDownloadRequest bulkDownloadRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'adAccountId' is set
        if (adAccountId == null) {
            throw new ApiException("Missing the required parameter 'adAccountId' when calling bulkDownloadCreate(Async)");
        }

        // verify the required parameter 'bulkDownloadRequest' is set
        if (bulkDownloadRequest == null) {
            throw new ApiException("Missing the required parameter 'bulkDownloadRequest' when calling bulkDownloadCreate(Async)");
        }

        return bulkDownloadCreateCall(adAccountId, bulkDownloadRequest, _callback);

    }

    /**
     * Get advertiser entities in bulk
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkDownloadRequest Parameters to get ad entities in bulk (required)
     * @return BulkDownloadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public BulkDownloadResponse bulkDownloadCreate(String adAccountId, BulkDownloadRequest bulkDownloadRequest) throws ApiException {
        ApiResponse<BulkDownloadResponse> localVarResp = bulkDownloadCreateWithHttpInfo(adAccountId, bulkDownloadRequest);
        return localVarResp.getData();
    }

    /**
     * Get advertiser entities in bulk
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkDownloadRequest Parameters to get ad entities in bulk (required)
     * @return ApiResponse&lt;BulkDownloadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BulkDownloadResponse> bulkDownloadCreateWithHttpInfo(String adAccountId, BulkDownloadRequest bulkDownloadRequest) throws ApiException {
        okhttp3.Call localVarCall = bulkDownloadCreateValidateBeforeCall(adAccountId, bulkDownloadRequest, null);
        Type localVarReturnType = new TypeToken<BulkDownloadResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get advertiser entities in bulk (asynchronously)
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkDownloadRequest Parameters to get ad entities in bulk (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkDownloadCreateAsync(String adAccountId, BulkDownloadRequest bulkDownloadRequest, final ApiCallback<BulkDownloadResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkDownloadCreateValidateBeforeCall(adAccountId, bulkDownloadRequest, _callback);
        Type localVarReturnType = new TypeToken<BulkDownloadResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bulkRequestGet
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkRequestId Unique identifier of a bulk upsert request. (required)
     * @param includeDetails if set to True then attach the errors/details to all the requests (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkRequestGetCall(String adAccountId, String bulkRequestId, Boolean includeDetails, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}"
            .replace("{" + "ad_account_id" + "}", localVarApiClient.escapeString(adAccountId.toString()))
            .replace("{" + "bulk_request_id" + "}", localVarApiClient.escapeString(bulkRequestId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeDetails != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_details", includeDetails));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "pinterest_oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkRequestGetValidateBeforeCall(String adAccountId, String bulkRequestId, Boolean includeDetails, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'adAccountId' is set
        if (adAccountId == null) {
            throw new ApiException("Missing the required parameter 'adAccountId' when calling bulkRequestGet(Async)");
        }

        // verify the required parameter 'bulkRequestId' is set
        if (bulkRequestId == null) {
            throw new ApiException("Missing the required parameter 'bulkRequestId' when calling bulkRequestGet(Async)");
        }

        return bulkRequestGetCall(adAccountId, bulkRequestId, includeDetails, _callback);

    }

    /**
     * Download advertiser entities in bulk
     * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkRequestId Unique identifier of a bulk upsert request. (required)
     * @param includeDetails if set to True then attach the errors/details to all the requests (optional, default to false)
     * @return BulkUpsertStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public BulkUpsertStatusResponse bulkRequestGet(String adAccountId, String bulkRequestId, Boolean includeDetails) throws ApiException {
        ApiResponse<BulkUpsertStatusResponse> localVarResp = bulkRequestGetWithHttpInfo(adAccountId, bulkRequestId, includeDetails);
        return localVarResp.getData();
    }

    /**
     * Download advertiser entities in bulk
     * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkRequestId Unique identifier of a bulk upsert request. (required)
     * @param includeDetails if set to True then attach the errors/details to all the requests (optional, default to false)
     * @return ApiResponse&lt;BulkUpsertStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BulkUpsertStatusResponse> bulkRequestGetWithHttpInfo(String adAccountId, String bulkRequestId, Boolean includeDetails) throws ApiException {
        okhttp3.Call localVarCall = bulkRequestGetValidateBeforeCall(adAccountId, bulkRequestId, includeDetails, null);
        Type localVarReturnType = new TypeToken<BulkUpsertStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Download advertiser entities in bulk (asynchronously)
     * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkRequestId Unique identifier of a bulk upsert request. (required)
     * @param includeDetails if set to True then attach the errors/details to all the requests (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkRequestGetAsync(String adAccountId, String bulkRequestId, Boolean includeDetails, final ApiCallback<BulkUpsertStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkRequestGetValidateBeforeCall(adAccountId, bulkRequestId, includeDetails, _callback);
        Type localVarReturnType = new TypeToken<BulkUpsertStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bulkUpsertCreate
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkUpsertCreateCall(String adAccountId, BulkUpsertRequest bulkUpsertRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = bulkUpsertRequest;

        // create path and map variables
        String localVarPath = "/ad_accounts/{ad_account_id}/bulk/upsert"
            .replace("{" + "ad_account_id" + "}", localVarApiClient.escapeString(adAccountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "pinterest_oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkUpsertCreateValidateBeforeCall(String adAccountId, BulkUpsertRequest bulkUpsertRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'adAccountId' is set
        if (adAccountId == null) {
            throw new ApiException("Missing the required parameter 'adAccountId' when calling bulkUpsertCreate(Async)");
        }

        // verify the required parameter 'bulkUpsertRequest' is set
        if (bulkUpsertRequest == null) {
            throw new ApiException("Missing the required parameter 'bulkUpsertRequest' when calling bulkUpsertCreate(Async)");
        }

        return bulkUpsertCreateCall(adAccountId, bulkUpsertRequest, _callback);

    }

    /**
     * Create/update ad entities in bulk
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk (required)
     * @return BulkUpsertResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public BulkUpsertResponse bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest) throws ApiException {
        ApiResponse<BulkUpsertResponse> localVarResp = bulkUpsertCreateWithHttpInfo(adAccountId, bulkUpsertRequest);
        return localVarResp.getData();
    }

    /**
     * Create/update ad entities in bulk
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk (required)
     * @return ApiResponse&lt;BulkUpsertResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BulkUpsertResponse> bulkUpsertCreateWithHttpInfo(String adAccountId, BulkUpsertRequest bulkUpsertRequest) throws ApiException {
        okhttp3.Call localVarCall = bulkUpsertCreateValidateBeforeCall(adAccountId, bulkUpsertRequest, null);
        Type localVarReturnType = new TypeToken<BulkUpsertResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create/update ad entities in bulk (asynchronously)
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkUpsertCreateAsync(String adAccountId, BulkUpsertRequest bulkUpsertRequest, final ApiCallback<BulkUpsertResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkUpsertCreateValidateBeforeCall(adAccountId, bulkUpsertRequest, _callback);
        Type localVarReturnType = new TypeToken<BulkUpsertResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
