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
    public interface ICatalogsApi
    {
        /// <summary>
        /// Create product group &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
        /// </summary>
        /// <param name="catalogsProductGroupCreateRequest">Request object used to created a catalogs product group.</param>
        /// <returns>Object</returns>
        Object CatalogsProductGroupsCreate (CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest);
        /// <summary>
        /// Delete product group &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
        /// </summary>
        /// <param name="productGroupId">Unique identifier of a product group</param>
        /// <returns></returns>
        void CatalogsProductGroupsDelete (string productGroupId);
        /// <summary>
        /// Get product groups list &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        Paginated CatalogsProductGroupsList (string feedId, string bookmark, int? pageSize);
        /// <summary>
        /// Update product group &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
        /// </summary>
        /// <param name="productGroupId">Unique identifier of a product group</param>
        /// <param name="catalogsProductGroupUpdateRequest">Request object used to Update a catalogs product group.</param>
        /// <returns>CatalogsProductGroup</returns>
        CatalogsProductGroup CatalogsProductGroupsUpdate (string productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest);
        /// <summary>
        /// List processing results for a given feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        Paginated FeedProcessingResultsList (string feedId, string bookmark, int? pageSize);
        /// <summary>
        /// Create feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="catalogsFeedsCreateRequest">Request object used to created a feed.</param>
        /// <returns>CatalogsFeed</returns>
        CatalogsFeed FeedsCreate (CatalogsFeedsCreateRequest catalogsFeedsCreateRequest);
        /// <summary>
        /// Delete feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <returns></returns>
        void FeedsDelete (string feedId);
        /// <summary>
        /// Get feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <returns>CatalogsFeed</returns>
        CatalogsFeed FeedsGet (string feedId);
        /// <summary>
        /// List feeds &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        Paginated FeedsList (string bookmark, int? pageSize);
        /// <summary>
        /// Update feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <param name="catalogsFeedsUpdateRequest">Request object used to update a feed.</param>
        /// <returns>CatalogsFeed</returns>
        CatalogsFeed FeedsUpdate (string feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest);
        /// <summary>
        /// Get catalogs items batch &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="batchId">Id of a catalogs items batch to fetch</param>
        /// <returns>CatalogsItemsBatch</returns>
        CatalogsItemsBatch ItemsBatchGet (string batchId);
        /// <summary>
        /// Perform an operation on an item batch &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
        /// </summary>
        /// <param name="catalogsItemsBatchRequest">Request object used to create catalogs items in a batch</param>
        /// <returns>CatalogsItemsBatch</returns>
        CatalogsItemsBatch ItemsBatchPost (CatalogsItemsBatchRequest catalogsItemsBatchRequest);
        /// <summary>
        /// Get catalogs items Get the items of the catalog created by the \&quot;operating user_account\&quot;
        /// </summary>
        /// <param name="country">Country for the Catalogs Items</param>
        /// <param name="itemIds">Catalos Item ids</param>
        /// <param name="language">Language for the Catalogs Items</param>
        /// <returns>CatalogsItems</returns>
        CatalogsItems ItemsGet (string country, List<string> itemIds, string language);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CatalogsApi : ICatalogsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CatalogsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CatalogsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CatalogsApi(String basePath)
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
        /// Create product group &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
        /// </summary>
        /// <param name="catalogsProductGroupCreateRequest">Request object used to created a catalogs product group.</param>
        /// <returns>Object</returns>
        public Object CatalogsProductGroupsCreate (CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest)
        {
            
            // verify the required parameter 'catalogsProductGroupCreateRequest' is set
            if (catalogsProductGroupCreateRequest == null) throw new ApiException(400, "Missing required parameter 'catalogsProductGroupCreateRequest' when calling CatalogsProductGroupsCreate");
            

            var path = "/catalogs/product_groups";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(catalogsProductGroupCreateRequest); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CatalogsProductGroupsCreate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CatalogsProductGroupsCreate: " + response.ErrorMessage, response.ErrorMessage);

            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }

        /// <summary>
        /// Delete product group &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
        /// </summary>
        /// <param name="productGroupId">Unique identifier of a product group</param>
        /// <returns></returns>
        public void CatalogsProductGroupsDelete (string productGroupId)
        {
            
            // verify the required parameter 'productGroupId' is set
            if (productGroupId == null) throw new ApiException(400, "Missing required parameter 'productGroupId' when calling CatalogsProductGroupsDelete");
            

            var path = "/catalogs/product_groups/{product_group_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "product_group_id" + "}", ApiClient.ParameterToString(productGroupId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling CatalogsProductGroupsDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CatalogsProductGroupsDelete: " + response.ErrorMessage, response.ErrorMessage);

            return;
        }

        /// <summary>
        /// Get product groups list &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        public Paginated CatalogsProductGroupsList (string feedId, string bookmark, int? pageSize)
        {
            
            // verify the required parameter 'feedId' is set
            if (feedId == null) throw new ApiException(400, "Missing required parameter 'feedId' when calling CatalogsProductGroupsList");
            

            var path = "/catalogs/product_groups";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (feedId != null) queryParams.Add("feed_id", ApiClient.ParameterToString(feedId)); // query parameter
 if (bookmark != null) queryParams.Add("bookmark", ApiClient.ParameterToString(bookmark)); // query parameter
 if (pageSize != null) queryParams.Add("page_size", ApiClient.ParameterToString(pageSize)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CatalogsProductGroupsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CatalogsProductGroupsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Update product group &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
        /// </summary>
        /// <param name="productGroupId">Unique identifier of a product group</param>
        /// <param name="catalogsProductGroupUpdateRequest">Request object used to Update a catalogs product group.</param>
        /// <returns>CatalogsProductGroup</returns>
        public CatalogsProductGroup CatalogsProductGroupsUpdate (string productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest)
        {
            
            // verify the required parameter 'productGroupId' is set
            if (productGroupId == null) throw new ApiException(400, "Missing required parameter 'productGroupId' when calling CatalogsProductGroupsUpdate");
            
            // verify the required parameter 'catalogsProductGroupUpdateRequest' is set
            if (catalogsProductGroupUpdateRequest == null) throw new ApiException(400, "Missing required parameter 'catalogsProductGroupUpdateRequest' when calling CatalogsProductGroupsUpdate");
            

            var path = "/catalogs/product_groups/{product_group_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "product_group_id" + "}", ApiClient.ParameterToString(productGroupId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(catalogsProductGroupUpdateRequest); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CatalogsProductGroupsUpdate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CatalogsProductGroupsUpdate: " + response.ErrorMessage, response.ErrorMessage);

            return (CatalogsProductGroup) ApiClient.Deserialize(response.Content, typeof(CatalogsProductGroup), response.Headers);
        }

        /// <summary>
        /// List processing results for a given feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        public Paginated FeedProcessingResultsList (string feedId, string bookmark, int? pageSize)
        {
            
            // verify the required parameter 'feedId' is set
            if (feedId == null) throw new ApiException(400, "Missing required parameter 'feedId' when calling FeedProcessingResultsList");
            

            var path = "/catalogs/feeds/{feed_id}/processing_results";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "feed_id" + "}", ApiClient.ParameterToString(feedId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling FeedProcessingResultsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FeedProcessingResultsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Create feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="catalogsFeedsCreateRequest">Request object used to created a feed.</param>
        /// <returns>CatalogsFeed</returns>
        public CatalogsFeed FeedsCreate (CatalogsFeedsCreateRequest catalogsFeedsCreateRequest)
        {
            
            // verify the required parameter 'catalogsFeedsCreateRequest' is set
            if (catalogsFeedsCreateRequest == null) throw new ApiException(400, "Missing required parameter 'catalogsFeedsCreateRequest' when calling FeedsCreate");
            

            var path = "/catalogs/feeds";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(catalogsFeedsCreateRequest); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsCreate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsCreate: " + response.ErrorMessage, response.ErrorMessage);

            return (CatalogsFeed) ApiClient.Deserialize(response.Content, typeof(CatalogsFeed), response.Headers);
        }

        /// <summary>
        /// Delete feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <returns></returns>
        public void FeedsDelete (string feedId)
        {
            
            // verify the required parameter 'feedId' is set
            if (feedId == null) throw new ApiException(400, "Missing required parameter 'feedId' when calling FeedsDelete");
            

            var path = "/catalogs/feeds/{feed_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "feed_id" + "}", ApiClient.ParameterToString(feedId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsDelete: " + response.ErrorMessage, response.ErrorMessage);

            return;
        }

        /// <summary>
        /// Get feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <returns>CatalogsFeed</returns>
        public CatalogsFeed FeedsGet (string feedId)
        {
            
            // verify the required parameter 'feedId' is set
            if (feedId == null) throw new ApiException(400, "Missing required parameter 'feedId' when calling FeedsGet");
            

            var path = "/catalogs/feeds/{feed_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "feed_id" + "}", ApiClient.ParameterToString(feedId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsGet: " + response.ErrorMessage, response.ErrorMessage);

            return (CatalogsFeed) ApiClient.Deserialize(response.Content, typeof(CatalogsFeed), response.Headers);
        }

        /// <summary>
        /// List feeds &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        public Paginated FeedsList (string bookmark, int? pageSize)
        {
            

            var path = "/catalogs/feeds";
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
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Update feed &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="feedId">Unique identifier of a feed</param>
        /// <param name="catalogsFeedsUpdateRequest">Request object used to update a feed.</param>
        /// <returns>CatalogsFeed</returns>
        public CatalogsFeed FeedsUpdate (string feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest)
        {
            
            // verify the required parameter 'feedId' is set
            if (feedId == null) throw new ApiException(400, "Missing required parameter 'feedId' when calling FeedsUpdate");
            
            // verify the required parameter 'catalogsFeedsUpdateRequest' is set
            if (catalogsFeedsUpdateRequest == null) throw new ApiException(400, "Missing required parameter 'catalogsFeedsUpdateRequest' when calling FeedsUpdate");
            

            var path = "/catalogs/feeds/{feed_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "feed_id" + "}", ApiClient.ParameterToString(feedId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(catalogsFeedsUpdateRequest); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsUpdate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FeedsUpdate: " + response.ErrorMessage, response.ErrorMessage);

            return (CatalogsFeed) ApiClient.Deserialize(response.Content, typeof(CatalogsFeed), response.Headers);
        }

        /// <summary>
        /// Get catalogs items batch &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="batchId">Id of a catalogs items batch to fetch</param>
        /// <returns>CatalogsItemsBatch</returns>
        public CatalogsItemsBatch ItemsBatchGet (string batchId)
        {
            
            // verify the required parameter 'batchId' is set
            if (batchId == null) throw new ApiException(400, "Missing required parameter 'batchId' when calling ItemsBatchGet");
            

            var path = "/catalogs/items/batch/{batch_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "batch_id" + "}", ApiClient.ParameterToString(batchId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling ItemsBatchGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ItemsBatchGet: " + response.ErrorMessage, response.ErrorMessage);

            return (CatalogsItemsBatch) ApiClient.Deserialize(response.Content, typeof(CatalogsItemsBatch), response.Headers);
        }

        /// <summary>
        /// Perform an operation on an item batch &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
        /// </summary>
        /// <param name="catalogsItemsBatchRequest">Request object used to create catalogs items in a batch</param>
        /// <returns>CatalogsItemsBatch</returns>
        public CatalogsItemsBatch ItemsBatchPost (CatalogsItemsBatchRequest catalogsItemsBatchRequest)
        {
            
            // verify the required parameter 'catalogsItemsBatchRequest' is set
            if (catalogsItemsBatchRequest == null) throw new ApiException(400, "Missing required parameter 'catalogsItemsBatchRequest' when calling ItemsBatchPost");
            

            var path = "/catalogs/items/batch";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(catalogsItemsBatchRequest); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ItemsBatchPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ItemsBatchPost: " + response.ErrorMessage, response.ErrorMessage);

            return (CatalogsItemsBatch) ApiClient.Deserialize(response.Content, typeof(CatalogsItemsBatch), response.Headers);
        }

        /// <summary>
        /// Get catalogs items Get the items of the catalog created by the \&quot;operating user_account\&quot;
        /// </summary>
        /// <param name="country">Country for the Catalogs Items</param>
        /// <param name="itemIds">Catalos Item ids</param>
        /// <param name="language">Language for the Catalogs Items</param>
        /// <returns>CatalogsItems</returns>
        public CatalogsItems ItemsGet (string country, List<string> itemIds, string language)
        {
            
            // verify the required parameter 'country' is set
            if (country == null) throw new ApiException(400, "Missing required parameter 'country' when calling ItemsGet");
            
            // verify the required parameter 'itemIds' is set
            if (itemIds == null) throw new ApiException(400, "Missing required parameter 'itemIds' when calling ItemsGet");
            
            // verify the required parameter 'language' is set
            if (language == null) throw new ApiException(400, "Missing required parameter 'language' when calling ItemsGet");
            

            var path = "/catalogs/items";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (country != null) queryParams.Add("country", ApiClient.ParameterToString(country)); // query parameter
 if (itemIds != null) queryParams.Add("item_ids", ApiClient.ParameterToString(itemIds)); // query parameter
 if (language != null) queryParams.Add("language", ApiClient.ParameterToString(language)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ItemsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ItemsGet: " + response.ErrorMessage, response.ErrorMessage);

            return (CatalogsItems) ApiClient.Deserialize(response.Content, typeof(CatalogsItems), response.Headers);
        }

    }
}
