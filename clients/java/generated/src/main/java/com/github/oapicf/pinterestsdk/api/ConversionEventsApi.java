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


import com.github.oapicf.pinterestsdk.model.ConversionApiResponse;
import com.github.oapicf.pinterestsdk.model.ConversionEvents;
import com.github.oapicf.pinterestsdk.model.DetailedError;
import com.github.oapicf.pinterestsdk.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversionEventsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConversionEventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConversionEventsApi(ApiClient apiClient) {
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
     * Build call for eventsCreate
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionEvents Conversion events. (required)
     * @param test Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request was invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authorized to send conversion events </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Not all events were successfully processed. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The endpoint has been ramped down and is currently not accepting any traffic. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected errors </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call eventsCreateCall(String adAccountId, ConversionEvents conversionEvents, Boolean test, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = conversionEvents;

        // create path and map variables
        String localVarPath = "/ad_accounts/{ad_account_id}/events"
            .replace("{" + "ad_account_id" + "}", localVarApiClient.escapeString(adAccountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (test != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("test", test));
        }

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

        String[] localVarAuthNames = new String[] { "pinterest_oauth2", "conversion_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call eventsCreateValidateBeforeCall(String adAccountId, ConversionEvents conversionEvents, Boolean test, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'adAccountId' is set
        if (adAccountId == null) {
            throw new ApiException("Missing the required parameter 'adAccountId' when calling eventsCreate(Async)");
        }

        // verify the required parameter 'conversionEvents' is set
        if (conversionEvents == null) {
            throw new ApiException("Missing the required parameter 'conversionEvents' when calling eventsCreate(Async)");
        }

        return eventsCreateCall(adAccountId, conversionEvents, test, _callback);

    }

    /**
     * Send conversions
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionEvents Conversion events. (required)
     * @param test Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)
     * @return ConversionApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request was invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authorized to send conversion events </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Not all events were successfully processed. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The endpoint has been ramped down and is currently not accepting any traffic. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected errors </td><td>  -  </td></tr>
     </table>
     */
    public ConversionApiResponse eventsCreate(String adAccountId, ConversionEvents conversionEvents, Boolean test) throws ApiException {
        ApiResponse<ConversionApiResponse> localVarResp = eventsCreateWithHttpInfo(adAccountId, conversionEvents, test);
        return localVarResp.getData();
    }

    /**
     * Send conversions
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionEvents Conversion events. (required)
     * @param test Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)
     * @return ApiResponse&lt;ConversionApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request was invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authorized to send conversion events </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Not all events were successfully processed. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The endpoint has been ramped down and is currently not accepting any traffic. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected errors </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConversionApiResponse> eventsCreateWithHttpInfo(String adAccountId, ConversionEvents conversionEvents, Boolean test) throws ApiException {
        okhttp3.Call localVarCall = eventsCreateValidateBeforeCall(adAccountId, conversionEvents, test, null);
        Type localVarReturnType = new TypeToken<ConversionApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send conversions (asynchronously)
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionEvents Conversion events. (required)
     * @param test Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request was invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authorized to send conversion events </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Not all events were successfully processed. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The endpoint has been ramped down and is currently not accepting any traffic. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected errors </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call eventsCreateAsync(String adAccountId, ConversionEvents conversionEvents, Boolean test, final ApiCallback<ConversionApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = eventsCreateValidateBeforeCall(adAccountId, conversionEvents, test, _callback);
        Type localVarReturnType = new TypeToken<ConversionApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
