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
    public interface IOauthApi
    {
        /// <summary>
        /// Generate OAuth access token Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.
        /// </summary>
        /// <param name="grantType"></param>
        /// <returns>OauthAccessTokenResponse</returns>
        OauthAccessTokenResponse OauthToken (string grantType);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class OauthApi : IOauthApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OauthApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public OauthApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="OauthApi"/> class.
        /// </summary>
        /// <returns></returns>
        public OauthApi(String basePath)
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
        /// Generate OAuth access token Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.
        /// </summary>
        /// <param name="grantType"></param>
        /// <returns>OauthAccessTokenResponse</returns>
        public OauthAccessTokenResponse OauthToken (string grantType)
        {
            
            // verify the required parameter 'grantType' is set
            if (grantType == null) throw new ApiException(400, "Missing required parameter 'grantType' when calling OauthToken");
            

            var path = "/oauth/token";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                    if (grantType != null) formParams.Add("grant_type", ApiClient.ParameterToString(grantType)); // form parameter
            
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OauthToken: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OauthToken: " + response.ErrorMessage, response.ErrorMessage);

            return (OauthAccessTokenResponse) ApiClient.Deserialize(response.Content, typeof(OauthAccessTokenResponse), response.Headers);
        }

    }
}
