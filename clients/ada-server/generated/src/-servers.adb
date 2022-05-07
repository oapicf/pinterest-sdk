--  Pinterest REST API
--  Pinterest's REST API
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  Get ad account analytics
   --  Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Ad_Account_Analytics
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Columns : in Swagger.UString_Vectors.Vector;
       Granularity : in .Models.Granularity_Type;
       Click_Window_Days : in Swagger.Nullable_Integer;
       Engagement_Window_Days : in Swagger.Nullable_Integer;
       View_Window_Days : in Swagger.Nullable_Integer;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Result  : out Swagger.Object_Map_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Ad_Account_Analytics;

   --  List ad accounts
   --  Get a list of the ad_accounts that the "operation user_account" has access to.
   --  - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>.
   overriding
   procedure Ad_Accounts_List
      (Server : in out Server_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Include_Shared_Accounts : in Swagger.Nullable_Boolean;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Ad_Accounts_List;

   --  Get ad group analytics
   --  Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Ad_Groups_Analytics
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Columns : in Swagger.UString_Vectors.Vector;
       Granularity : in .Models.Granularity_Type;
       Click_Window_Days : in Swagger.Nullable_Integer;
       Engagement_Window_Days : in Swagger.Nullable_Integer;
       View_Window_Days : in Swagger.Nullable_Integer;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Result  : out Swagger.Object_Map_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Ad_Groups_Analytics;

   --  List ad groups
   --  Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Ad_Groups_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Entity_Statuses : in Swagger.UString_Vectors.Vector;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Translate_Interests_To_Names : in Swagger.Nullable_Boolean;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Ad_Groups_List;

   --  Get ad analytics
   --  Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Ads_Analytics
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Ad_Ids : in Swagger.UString_Vectors.Vector;
       Columns : in Swagger.UString_Vectors.Vector;
       Granularity : in .Models.Granularity_Type;
       Click_Window_Days : in Swagger.Nullable_Integer;
       Engagement_Window_Days : in Swagger.Nullable_Integer;
       View_Window_Days : in Swagger.Nullable_Integer;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Result  : out Swagger.Object_Map_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Ads_Analytics;

   --  List ads
   --  Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Ads_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Ids : in Swagger.UString_Vectors.Vector;
       Entity_Statuses : in Swagger.UString_Vectors.Vector;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Ads_List;

   --  Create async request for an account analytics report
   --  This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Analytics_Create_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ads_Analytics_Create_Async_Request_Type : in AdsAnalyticsCreateAsyncRequest_Type;
       Result  : out .Models.AdsAnalyticsCreateAsyncResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Analytics_Create_Report;

   --  Get the account analytics report created by the async call
   --  This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Analytics_Get_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Token : in Swagger.UString;
       Result  : out .Models.AdsAnalyticsGetAsyncResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Analytics_Get_Report;

   --  Get campaign analytics
   --  Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Campaigns_Analytics
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Columns : in Swagger.UString_Vectors.Vector;
       Granularity : in .Models.Granularity_Type;
       Click_Window_Days : in Swagger.Nullable_Integer;
       Engagement_Window_Days : in Swagger.Nullable_Integer;
       View_Window_Days : in Swagger.Nullable_Integer;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Result  : out Swagger.Object_Map_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Campaigns_Analytics;

   --  List campaigns
   --  Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Campaigns_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Entity_Statuses : in Swagger.UString_Vectors.Vector;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Campaigns_List;

   --  Get product group analytics
   --  Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
   overriding
   procedure Product_Groups_Analytics
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Product_Group_Ids : in Swagger.UString_Vectors.Vector;
       Columns : in Swagger.UString_Vectors.Vector;
       Granularity : in .Models.Granularity_Type;
       Click_Window_Days : in Swagger.Nullable_Integer;
       Engagement_Window_Days : in Swagger.Nullable_Integer;
       View_Window_Days : in Swagger.Nullable_Integer;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Result  : out Swagger.Object_Map_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Product_Groups_Analytics;

   --  Create board section
   --  Create a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_Create
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Board_Section_Type : in BoardSection_Type;
       Result  : out .Models.BoardSection_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Board_Sections_Create;

   --  Delete board section
   --  Delete a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_Delete
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Section_Id : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Board_Sections_Delete;

   --  List board sections
   --  Get a list of all board sections from a board owned by the "operation user_account" - or a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_List
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Board_Sections_List;

   --  List Pins on board section
   --  Get a list of the Pins on a board section of a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_List_Pins
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Section_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Board_Sections_List_Pins;

   --  Update board section
   --  Update a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_Update
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Section_Id : in Swagger.UString;
       Board_Section_Type : in BoardSection_Type;
       Result  : out .Models.BoardSection_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Board_Sections_Update;

   --  Create board
   --  Create a board owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_Create
      (Server : in out Server_Type;
       Board_Type : in Board_Type;
       Result  : out .Models.Board_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Boards_Create;

   --  Delete board
   --  Delete a board owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_Delete
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Boards_Delete;

   --  Get board
   --  Get a board owned by the operation user_account - or a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_Get
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Result  : out .Models.Board_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Boards_Get;

   --  List boards
   --  Get a list of the boards owned by the "operation user_account" + group boards where this account is a collaborator
   --  
   --  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return.
   --  - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
   overriding
   procedure Boards_List
      (Server : in out Server_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Privacy : in Swagger.Nullable_UString;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Boards_List;

   --  List Pins on board
   --  Get a list of the Pins on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_List_Pins
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Boards_List_Pins;

   --  Update board
   --  Update a board owned by the "operating user_account".
   overriding
   procedure Boards_Update
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Board_Update_Type : in BoardUpdate_Type;
       Result  : out .Models.Board_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Boards_Update;

   --  Create product group
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Create product group to use in Catalogs.
   overriding
   procedure Catalogs_Product_Groups_Create
      (Server : in out Server_Type;
       Catalogs_Product_Group_Create_Request_Type : in CatalogsProductGroupCreateRequest_Type;
       Result  : out Swagger.Object;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Catalogs_Product_Groups_Create;

   --  Delete product group
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Delete a product group from being in use in Catalogs.
   overriding
   procedure Catalogs_Product_Groups_Delete
      (Server : in out Server_Type;
       Product_Group_Id : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Catalogs_Product_Groups_Delete;

   --  Get product groups list
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Get a list of product groups for a given Catalogs Feed Id.
   overriding
   procedure Catalogs_Product_Groups_List
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Catalogs_Product_Groups_List;

   --  Update product group
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Update product group to use in Catalogs.
   overriding
   procedure Catalogs_Product_Groups_Update
      (Server : in out Server_Type;
       Product_Group_Id : in Swagger.UString;
       Catalogs_Product_Group_Update_Request_Type : in CatalogsProductGroupUpdateRequest_Type;
       Result  : out .Models.CatalogsProductGroup_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Catalogs_Product_Groups_Update;

   --  List processing results for a given feed
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Fetch a feed processing results owned by the owner user account.
   overriding
   procedure Feed_Processing_Results_List
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Feed_Processing_Results_List;

   --  Create feed
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Create a new feed owned by the "operating user_account".
   overriding
   procedure Feeds_Create
      (Server : in out Server_Type;
       Catalogs_Feeds_Create_Request_Type : in CatalogsFeedsCreateRequest_Type;
       Result  : out .Models.CatalogsFeed_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Feeds_Create;

   --  Delete feed
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Delete a feed owned by the "operating user_account".
   overriding
   procedure Feeds_Delete
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Feeds_Delete;

   --  Get feed
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Get a single feed owned by the "operating user_account".
   overriding
   procedure Feeds_Get
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Result  : out .Models.CatalogsFeed_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Feeds_Get;

   --  List feeds
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Fetch feeds owned by the "operating user_account".
   overriding
   procedure Feeds_List
      (Server : in out Server_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Feeds_List;

   --  Update feed
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Update a feed owned by the "operating user_account".
   overriding
   procedure Feeds_Update
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Catalogs_Feeds_Update_Request_Type : in CatalogsFeedsUpdateRequest_Type;
       Result  : out .Models.CatalogsFeed_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Feeds_Update;

   --  Get catalogs items batch
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  Get a single catalogs items batch created by the "operating user_account".
   overriding
   procedure Items_Batch_Get
      (Server : in out Server_Type;
       Batch_Id : in Swagger.UString;
       Result  : out .Models.CatalogsItemsBatch_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Items_Batch_Get;

   --  Perform an operation on an item batch
   --  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>
   --  
   --  This endpoint supports multiple operations on a set of one or more catalog items.
   overriding
   procedure Items_Batch_Post
      (Server : in out Server_Type;
       Catalogs_Items_Batch_Request_Type : in CatalogsItemsBatchRequest_Type;
       Result  : out .Models.CatalogsItemsBatch_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Items_Batch_Post;

   --  Get catalogs items
   --  Get the items of the catalog created by the "operating user_account"
   overriding
   procedure Items_Get
      (Server : in out Server_Type;
       Country : in Swagger.UString;
       Item_Ids : in Swagger.UString_Vectors.Vector;
       Language : in Swagger.UString;
       Result  : out .Models.CatalogsItems_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Items_Get;

   --  Register media upload
   --  Register your intent to upload media
   --  
   --  The response includes all of the information needed to upload the media
   --  to Pinterest.
   --  
   --  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for
   --  example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header
   --  value. Send the media file's contents as the request's <tt>file</tt>
   --  parameter and also include all of the parameters from
   --  <tt>upload_parameters</tt>.
   --  
   --  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
   overriding
   procedure Media_Create
      (Server : in out Server_Type;
       Media_Upload_Request_Type : in MediaUploadRequest_Type;
       Result  : out .Models.MediaUpload_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Media_Create;

   --  Get media upload details
   --  Get details for a registered media upload, including its current status.
   --  
   --  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
   overriding
   procedure Media_Get
      (Server : in out Server_Type;
       Media_Id : in Swagger.UString;
       Result  : out .Models.MediaUploadDetails_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Media_Get;

   --  List media uploads
   --  List media uploads filtered by given parameters.
   --  
   --  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
   overriding
   procedure Media_List
      (Server : in out Server_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.Paginated_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Media_List;

   --  Generate OAuth access token
   --  Generate an OAuth access token by using an authorization code or a refresh token.
   --  
   --  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.
   overriding
   procedure Oauth_Token
      (Server : in out Server_Type;
       Grant_Type : in Swagger.UString;
       Result  : out .Models.OauthAccessTokenResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Oauth_Token;

   --  Get Pin analytics
   --  Get analytics for a Pin owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href="https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list">List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account:
   --  
   --  - For Pins on public or protected boards: Admin, Analyst.
   --  - For Pins on secret boards: Admin.
   overriding
   procedure Pins_Analytics
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Metric_Types : in Swagger.UString_Vectors.Vector;
       App_Types : in Swagger.Nullable_UString;
       Split_Field : in Swagger.Nullable_UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out Swagger..Models.AnalyticsMetricsResponse_Type_Map;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Pins_Analytics;

   --  Create Pin
   --  Create a Pin on a board or board section owned by the "operation user_account".
   --  
   --  Note: If the current "operation user_account" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).
   --  
   --  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.
   --  
   --  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
   overriding
   procedure Pins_Create
      (Server : in out Server_Type;
       Pin_Type : in Pin_Type;
       Result  : out .Models.Pin_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Pins_Create;

   --  Delete Pin
   --  Delete a Pins owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Pins_Delete
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Pins_Delete;

   --  Get Pin
   --  Get a Pin owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account:
   --  
   --  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
   --  - For Pins on secret boards: Owner, Admin.
   overriding
   procedure Pins_Get
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Pin_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Pins_Get;

   --  Get user account analytics
   --  Get analytics for the "operation user_account"
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   overriding
   procedure User_Account_Analytics
      (Server : in out Server_Type;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       From_Claimed_Content : in Swagger.Nullable_UString;
       Pin_Format : in Swagger.Nullable_UString;
       App_Types : in Swagger.Nullable_UString;
       Metric_Types : in Swagger.UString_Vectors.Vector;
       Split_Field : in Swagger.Nullable_UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out Swagger..Models.AnalyticsMetricsResponse_Type_Map;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end User_Account_Analytics;

   --  Get user account
   --  Get account information for the "operation user_account"
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.
   overriding
   procedure User_Account_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Account_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end User_Account_Get;

end .Servers;
