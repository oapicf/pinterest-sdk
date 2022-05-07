using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPinsApi
    {
        /// <summary>
        /// Get Pin analytics Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
        /// </summary>
        /// <param name="pinId">Unique identifier of a Pin.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="metricTypes">Pin metric types to get data for, default is all.</param>
        /// <param name="appTypes">Apps or devices to get data for, default is all.</param>
        /// <param name="splitField">How to split the data into groups. Not including this param means data won&#39;t be split.</param>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <returns>Dictionary&lt;string, AnalyticsMetricsResponse&gt;</returns>
        Dictionary<string, AnalyticsMetricsResponse> PinsAnalytics (string pinId, DateTime? startDate, DateTime? endDate, List<string> metricTypes, string appTypes, string splitField, string adAccountId);
        /// <summary>
        /// Create Pin Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        /// </summary>
        /// <param name="pin">Create a new Pin.</param>
        /// <returns>Pin</returns>
        Pin PinsCreate (Pin pin);
        /// <summary>
        /// Delete Pin Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="pinId">Unique identifier of a Pin.</param>
        /// <returns></returns>
        void PinsDelete (string pinId);
        /// <summary>
        /// Get Pin Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
        /// </summary>
        /// <param name="pinId">Unique identifier of a Pin.</param>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <returns>Pin</returns>
        Pin PinsGet (string pinId, string adAccountId);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PinsApi : IPinsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PinsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PinsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PinsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PinsApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }

        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}

        /// <summary>
        /// Get Pin analytics Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
        /// </summary>
        /// <param name="pinId">Unique identifier of a Pin.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="metricTypes">Pin metric types to get data for, default is all.</param>
        /// <param name="appTypes">Apps or devices to get data for, default is all.</param>
        /// <param name="splitField">How to split the data into groups. Not including this param means data won&#39;t be split.</param>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <returns>Dictionary&lt;string, AnalyticsMetricsResponse&gt;</returns>
        public Dictionary<string, AnalyticsMetricsResponse> PinsAnalytics (string pinId, DateTime? startDate, DateTime? endDate, List<string> metricTypes, string appTypes, string splitField, string adAccountId)
        {
            
            // verify the required parameter 'pinId' is set
            if (pinId == null) throw new ApiException(400, "Missing required parameter 'pinId' when calling PinsAnalytics");
            
            // verify the required parameter 'startDate' is set
            if (startDate == null) throw new ApiException(400, "Missing required parameter 'startDate' when calling PinsAnalytics");
            
            // verify the required parameter 'endDate' is set
            if (endDate == null) throw new ApiException(400, "Missing required parameter 'endDate' when calling PinsAnalytics");
            
            // verify the required parameter 'metricTypes' is set
            if (metricTypes == null) throw new ApiException(400, "Missing required parameter 'metricTypes' when calling PinsAnalytics");
            

            var path = "/pins/{pin_id}/analytics";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "pin_id" + "}", ApiClient.ParameterToString(pinId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (startDate != null) queryParams.Add("start_date", ApiClient.ParameterToString(startDate)); // query parameter
 if (endDate != null) queryParams.Add("end_date", ApiClient.ParameterToString(endDate)); // query parameter
 if (appTypes != null) queryParams.Add("app_types", ApiClient.ParameterToString(appTypes)); // query parameter
 if (metricTypes != null) queryParams.Add("metric_types", ApiClient.ParameterToString(metricTypes)); // query parameter
 if (splitField != null) queryParams.Add("split_field", ApiClient.ParameterToString(splitField)); // query parameter
 if (adAccountId != null) queryParams.Add("ad_account_id", ApiClient.ParameterToString(adAccountId)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PinsAnalytics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinsAnalytics: " + response.ErrorMessage, response.ErrorMessage);

            return (Dictionary<string, AnalyticsMetricsResponse>) ApiClient.Deserialize(response.Content, typeof(Dictionary<string, AnalyticsMetricsResponse>), response.Headers);
        }

        /// <summary>
        /// Create Pin Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        /// </summary>
        /// <param name="pin">Create a new Pin.</param>
        /// <returns>Pin</returns>
        public Pin PinsCreate (Pin pin)
        {
            
            // verify the required parameter 'pin' is set
            if (pin == null) throw new ApiException(400, "Missing required parameter 'pin' when calling PinsCreate");
            

            var path = "/pins";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(pin); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PinsCreate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinsCreate: " + response.ErrorMessage, response.ErrorMessage);

            return (Pin) ApiClient.Deserialize(response.Content, typeof(Pin), response.Headers);
        }

        /// <summary>
        /// Delete Pin Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="pinId">Unique identifier of a Pin.</param>
        /// <returns></returns>
        public void PinsDelete (string pinId)
        {
            
            // verify the required parameter 'pinId' is set
            if (pinId == null) throw new ApiException(400, "Missing required parameter 'pinId' when calling PinsDelete");
            

            var path = "/pins/{pin_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "pin_id" + "}", ApiClient.ParameterToString(pinId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PinsDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinsDelete: " + response.ErrorMessage, response.ErrorMessage);

            return;
        }

        /// <summary>
        /// Get Pin Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
        /// </summary>
        /// <param name="pinId">Unique identifier of a Pin.</param>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <returns>Pin</returns>
        public Pin PinsGet (string pinId, string adAccountId)
        {
            
            // verify the required parameter 'pinId' is set
            if (pinId == null) throw new ApiException(400, "Missing required parameter 'pinId' when calling PinsGet");
            

            var path = "/pins/{pin_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "pin_id" + "}", ApiClient.ParameterToString(pinId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (adAccountId != null) queryParams.Add("ad_account_id", ApiClient.ParameterToString(adAccountId)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PinsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinsGet: " + response.ErrorMessage, response.ErrorMessage);

            return (Pin) ApiClient.Deserialize(response.Content, typeof(Pin), response.Headers);
        }

    }
}
