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
    public interface IMediaApi
    {
        /// <summary>
        /// Register media upload Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        /// </summary>
        /// <param name="mediaUploadRequest">Create a media upload request</param>
        /// <returns>MediaUpload</returns>
        MediaUpload MediaCreate (MediaUploadRequest mediaUploadRequest);
        /// <summary>
        /// Get media upload details Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        /// </summary>
        /// <param name="mediaId">Media identifier</param>
        /// <returns>MediaUploadDetails</returns>
        MediaUploadDetails MediaGet (string mediaId);
        /// <summary>
        /// List media uploads List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        /// </summary>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        Paginated MediaList (string bookmark, int? pageSize);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class MediaApi : IMediaApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public MediaApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MediaApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MediaApi(String basePath)
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
        /// Register media upload Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        /// </summary>
        /// <param name="mediaUploadRequest">Create a media upload request</param>
        /// <returns>MediaUpload</returns>
        public MediaUpload MediaCreate (MediaUploadRequest mediaUploadRequest)
        {
            
            // verify the required parameter 'mediaUploadRequest' is set
            if (mediaUploadRequest == null) throw new ApiException(400, "Missing required parameter 'mediaUploadRequest' when calling MediaCreate");
            

            var path = "/media";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(mediaUploadRequest); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MediaCreate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MediaCreate: " + response.ErrorMessage, response.ErrorMessage);

            return (MediaUpload) ApiClient.Deserialize(response.Content, typeof(MediaUpload), response.Headers);
        }

        /// <summary>
        /// Get media upload details Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        /// </summary>
        /// <param name="mediaId">Media identifier</param>
        /// <returns>MediaUploadDetails</returns>
        public MediaUploadDetails MediaGet (string mediaId)
        {
            
            // verify the required parameter 'mediaId' is set
            if (mediaId == null) throw new ApiException(400, "Missing required parameter 'mediaId' when calling MediaGet");
            

            var path = "/media/{media_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "media_id" + "}", ApiClient.ParameterToString(mediaId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MediaGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MediaGet: " + response.ErrorMessage, response.ErrorMessage);

            return (MediaUploadDetails) ApiClient.Deserialize(response.Content, typeof(MediaUploadDetails), response.Headers);
        }

        /// <summary>
        /// List media uploads List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        /// </summary>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        public Paginated MediaList (string bookmark, int? pageSize)
        {
            

            var path = "/media";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (bookmark != null) queryParams.Add("bookmark", ApiClient.ParameterToString(bookmark)); // query parameter
 if (pageSize != null) queryParams.Add("page_size", ApiClient.ParameterToString(pageSize)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MediaList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MediaList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

    }
}
