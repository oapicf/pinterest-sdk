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
    public interface IUserAccountApi
    {
        /// <summary>
        /// Get user account analytics Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
        /// </summary>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="fromClaimedContent">Filter on Pins that match your claimed domain.</param>
        /// <param name="pinFormat">Pin formats to get data for, default is all.</param>
        /// <param name="appTypes">Apps or devices to get data for, default is all.</param>
        /// <param name="metricTypes">Metric types to get data for, default is all. </param>
        /// <param name="splitField">How to split the data into groups. Not including this param means data won&#39;t be split.</param>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <returns>Dictionary&lt;string, AnalyticsMetricsResponse&gt;</returns>
        Dictionary<string, AnalyticsMetricsResponse> UserAccountAnalytics (DateTime? startDate, DateTime? endDate, string fromClaimedContent, string pinFormat, string appTypes, List<string> metricTypes, string splitField, string adAccountId);
        /// <summary>
        /// Get user account Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <returns>Account</returns>
        Account UserAccountGet (string adAccountId);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class UserAccountApi : IUserAccountApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserAccountApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public UserAccountApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserAccountApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UserAccountApi(String basePath)
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
        /// Get user account analytics Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
        /// </summary>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="fromClaimedContent">Filter on Pins that match your claimed domain.</param>
        /// <param name="pinFormat">Pin formats to get data for, default is all.</param>
        /// <param name="appTypes">Apps or devices to get data for, default is all.</param>
        /// <param name="metricTypes">Metric types to get data for, default is all. </param>
        /// <param name="splitField">How to split the data into groups. Not including this param means data won&#39;t be split.</param>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <returns>Dictionary&lt;string, AnalyticsMetricsResponse&gt;</returns>
        public Dictionary<string, AnalyticsMetricsResponse> UserAccountAnalytics (DateTime? startDate, DateTime? endDate, string fromClaimedContent, string pinFormat, string appTypes, List<string> metricTypes, string splitField, string adAccountId)
        {
            
            // verify the required parameter 'startDate' is set
            if (startDate == null) throw new ApiException(400, "Missing required parameter 'startDate' when calling UserAccountAnalytics");
            
            // verify the required parameter 'endDate' is set
            if (endDate == null) throw new ApiException(400, "Missing required parameter 'endDate' when calling UserAccountAnalytics");
            

            var path = "/user_account/analytics";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (startDate != null) queryParams.Add("start_date", ApiClient.ParameterToString(startDate)); // query parameter
 if (endDate != null) queryParams.Add("end_date", ApiClient.ParameterToString(endDate)); // query parameter
 if (fromClaimedContent != null) queryParams.Add("from_claimed_content", ApiClient.ParameterToString(fromClaimedContent)); // query parameter
 if (pinFormat != null) queryParams.Add("pin_format", ApiClient.ParameterToString(pinFormat)); // query parameter
 if (appTypes != null) queryParams.Add("app_types", ApiClient.ParameterToString(appTypes)); // query parameter
 if (metricTypes != null) queryParams.Add("metric_types", ApiClient.ParameterToString(metricTypes)); // query parameter
 if (splitField != null) queryParams.Add("split_field", ApiClient.ParameterToString(splitField)); // query parameter
 if (adAccountId != null) queryParams.Add("ad_account_id", ApiClient.ParameterToString(adAccountId)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserAccountAnalytics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserAccountAnalytics: " + response.ErrorMessage, response.ErrorMessage);

            return (Dictionary<string, AnalyticsMetricsResponse>) ApiClient.Deserialize(response.Content, typeof(Dictionary<string, AnalyticsMetricsResponse>), response.Headers);
        }

        /// <summary>
        /// Get user account Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <returns>Account</returns>
        public Account UserAccountGet (string adAccountId)
        {
            

            var path = "/user_account";
            path = path.Replace("{format}", "json");
            
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
                throw new ApiException ((int)response.StatusCode, "Error calling UserAccountGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserAccountGet: " + response.ErrorMessage, response.ErrorMessage);

            return (Account) ApiClient.Deserialize(response.Content, typeof(Account), response.Headers);
        }

    }
}
