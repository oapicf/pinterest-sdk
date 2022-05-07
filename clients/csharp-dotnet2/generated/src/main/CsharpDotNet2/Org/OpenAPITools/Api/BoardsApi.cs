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
    public interface IBoardsApi
    {
        /// <summary>
        /// Create board section Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="boardSection">Create a board section.</param>
        /// <returns>BoardSection</returns>
        BoardSection BoardSectionsCreate (string boardId, BoardSection boardSection);
        /// <summary>
        /// Delete board section Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="sectionId">Unique identifier of a board section.</param>
        /// <returns></returns>
        void BoardSectionsDelete (string boardId, string sectionId);
        /// <summary>
        /// List board sections Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        Paginated BoardSectionsList (string boardId, string bookmark, int? pageSize);
        /// <summary>
        /// List Pins on board section Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="sectionId">Unique identifier of a board section.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        Paginated BoardSectionsListPins (string boardId, string sectionId, string bookmark, int? pageSize);
        /// <summary>
        /// Update board section Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="sectionId">Unique identifier of a board section.</param>
        /// <param name="boardSection">Update a board section.</param>
        /// <returns>BoardSection</returns>
        BoardSection BoardSectionsUpdate (string boardId, string sectionId, BoardSection boardSection);
        /// <summary>
        /// Create board Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="board">Create a board using a single board json object.</param>
        /// <returns>Board</returns>
        Board BoardsCreate (Board board);
        /// <summary>
        /// Delete board Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <returns></returns>
        void BoardsDelete (string boardId);
        /// <summary>
        /// Get board Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <returns>Board</returns>
        Board BoardsGet (string boardId);
        /// <summary>
        /// List boards Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
        /// </summary>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="privacy">Privacy setting for a board.</param>
        /// <returns>Paginated</returns>
        Paginated BoardsList (string bookmark, int? pageSize, string privacy);
        /// <summary>
        /// List Pins on board Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        Paginated BoardsListPins (string boardId, string bookmark, int? pageSize);
        /// <summary>
        /// Update board Update a board owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="boardUpdate">Update a board.</param>
        /// <returns>Board</returns>
        Board BoardsUpdate (string boardId, BoardUpdate boardUpdate);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class BoardsApi : IBoardsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BoardsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public BoardsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BoardsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public BoardsApi(String basePath)
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
        /// Create board section Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="boardSection">Create a board section.</param>
        /// <returns>BoardSection</returns>
        public BoardSection BoardSectionsCreate (string boardId, BoardSection boardSection)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardSectionsCreate");
            
            // verify the required parameter 'boardSection' is set
            if (boardSection == null) throw new ApiException(400, "Missing required parameter 'boardSection' when calling BoardSectionsCreate");
            

            var path = "/boards/{board_id}/sections";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(boardSection); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsCreate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsCreate: " + response.ErrorMessage, response.ErrorMessage);

            return (BoardSection) ApiClient.Deserialize(response.Content, typeof(BoardSection), response.Headers);
        }

        /// <summary>
        /// Delete board section Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="sectionId">Unique identifier of a board section.</param>
        /// <returns></returns>
        public void BoardSectionsDelete (string boardId, string sectionId)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardSectionsDelete");
            
            // verify the required parameter 'sectionId' is set
            if (sectionId == null) throw new ApiException(400, "Missing required parameter 'sectionId' when calling BoardSectionsDelete");
            

            var path = "/boards/{board_id}/sections/{section_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));
path = path.Replace("{" + "section_id" + "}", ApiClient.ParameterToString(sectionId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsDelete: " + response.ErrorMessage, response.ErrorMessage);

            return;
        }

        /// <summary>
        /// List board sections Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        public Paginated BoardSectionsList (string boardId, string bookmark, int? pageSize)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardSectionsList");
            

            var path = "/boards/{board_id}/sections";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// List Pins on board section Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="sectionId">Unique identifier of a board section.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        public Paginated BoardSectionsListPins (string boardId, string sectionId, string bookmark, int? pageSize)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardSectionsListPins");
            
            // verify the required parameter 'sectionId' is set
            if (sectionId == null) throw new ApiException(400, "Missing required parameter 'sectionId' when calling BoardSectionsListPins");
            

            var path = "/boards/{board_id}/sections/{section_id}/pins";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));
path = path.Replace("{" + "section_id" + "}", ApiClient.ParameterToString(sectionId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsListPins: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsListPins: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Update board section Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="sectionId">Unique identifier of a board section.</param>
        /// <param name="boardSection">Update a board section.</param>
        /// <returns>BoardSection</returns>
        public BoardSection BoardSectionsUpdate (string boardId, string sectionId, BoardSection boardSection)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardSectionsUpdate");
            
            // verify the required parameter 'sectionId' is set
            if (sectionId == null) throw new ApiException(400, "Missing required parameter 'sectionId' when calling BoardSectionsUpdate");
            
            // verify the required parameter 'boardSection' is set
            if (boardSection == null) throw new ApiException(400, "Missing required parameter 'boardSection' when calling BoardSectionsUpdate");
            

            var path = "/boards/{board_id}/sections/{section_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));
path = path.Replace("{" + "section_id" + "}", ApiClient.ParameterToString(sectionId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(boardSection); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsUpdate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardSectionsUpdate: " + response.ErrorMessage, response.ErrorMessage);

            return (BoardSection) ApiClient.Deserialize(response.Content, typeof(BoardSection), response.Headers);
        }

        /// <summary>
        /// Create board Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="board">Create a board using a single board json object.</param>
        /// <returns>Board</returns>
        public Board BoardsCreate (Board board)
        {
            
            // verify the required parameter 'board' is set
            if (board == null) throw new ApiException(400, "Missing required parameter 'board' when calling BoardsCreate");
            

            var path = "/boards";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(board); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsCreate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsCreate: " + response.ErrorMessage, response.ErrorMessage);

            return (Board) ApiClient.Deserialize(response.Content, typeof(Board), response.Headers);
        }

        /// <summary>
        /// Delete board Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <returns></returns>
        public void BoardsDelete (string boardId)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardsDelete");
            

            var path = "/boards/{board_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsDelete: " + response.ErrorMessage, response.ErrorMessage);

            return;
        }

        /// <summary>
        /// Get board Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <returns>Board</returns>
        public Board BoardsGet (string boardId)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardsGet");
            

            var path = "/boards/{board_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsGet: " + response.ErrorMessage, response.ErrorMessage);

            return (Board) ApiClient.Deserialize(response.Content, typeof(Board), response.Headers);
        }

        /// <summary>
        /// List boards Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
        /// </summary>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="privacy">Privacy setting for a board.</param>
        /// <returns>Paginated</returns>
        public Paginated BoardsList (string bookmark, int? pageSize, string privacy)
        {
            

            var path = "/boards";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (bookmark != null) queryParams.Add("bookmark", ApiClient.ParameterToString(bookmark)); // query parameter
 if (pageSize != null) queryParams.Add("page_size", ApiClient.ParameterToString(pageSize)); // query parameter
 if (privacy != null) queryParams.Add("privacy", ApiClient.ParameterToString(privacy)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// List Pins on board Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <returns>Paginated</returns>
        public Paginated BoardsListPins (string boardId, string bookmark, int? pageSize)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardsListPins");
            

            var path = "/boards/{board_id}/pins";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));

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
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsListPins: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsListPins: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Update board Update a board owned by the \&quot;operating user_account\&quot;.
        /// </summary>
        /// <param name="boardId">Unique identifier of a board.</param>
        /// <param name="boardUpdate">Update a board.</param>
        /// <returns>Board</returns>
        public Board BoardsUpdate (string boardId, BoardUpdate boardUpdate)
        {
            
            // verify the required parameter 'boardId' is set
            if (boardId == null) throw new ApiException(400, "Missing required parameter 'boardId' when calling BoardsUpdate");
            
            // verify the required parameter 'boardUpdate' is set
            if (boardUpdate == null) throw new ApiException(400, "Missing required parameter 'boardUpdate' when calling BoardsUpdate");
            

            var path = "/boards/{board_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "board_id" + "}", ApiClient.ParameterToString(boardId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(boardUpdate); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsUpdate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling BoardsUpdate: " + response.ErrorMessage, response.ErrorMessage);

            return (Board) ApiClient.Deserialize(response.Content, typeof(Board), response.Headers);
        }

    }
}
