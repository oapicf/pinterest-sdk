--  Pinterest REST API
--  Pinterest's REST API
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with Swagger.Servers;
with .Models;
with .Skeletons;

package .Servers is
   pragma Warnings (Off, "*use clause for package*");
   use .Models;
   type Server_Type is limited new .Skeletons.Server_Type with null record;


   --  Get ad account analytics
   --  Get analytics for the specified `ad_account_id`, filtered by the specified options.
   --  
   --    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  
   --    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --  
   --    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
   overriding
   procedure Ad_Account_Analytics
      (Server : in out Server_Type;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Ad_Account_Id : in Swagger.UString;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get targeting analytics for an ad account
   --  Get targeting analytics for an ad account.
   --  For the requested account and metrics, the response will include the requested metric information
   --  (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/>
   --  
   --  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --  * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   overriding
   procedure Ad_Account_Targeting_Analytics_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Targeting_Types : in .Models.AdsAnalyticsAccountTargetingType_Type_Vectors.Vector;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Attribution_Types : in .Models.ConversionReportAttributionType_Type_Vectors.Vector;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Result  : out .Models.MetricsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create ad account
   --  Create a new ad account. Different ad accounts can support different currencies, payment methods, etc.
   --  An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.
   --  
   --  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.)
   --  For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
   overriding
   procedure Ad_Accounts_Create
      (Server : in out Server_Type;
       Ad_Account_Create_Type : in AdAccountCreate_Type;
       Result  : out .Models.AdAccount_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get ad account
   --  Get an ad account
   overriding
   procedure Ad_Accounts_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.AdAccount_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List ad accounts
   --  Get a list of the ad_accounts that the "operation user_account" has access to.
   --          - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
   overriding
   procedure Ad_Accounts_List
      (Server : in out Server_Type;
       Include_Shared_Accounts : in Swagger.Nullable_Boolean;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.AdAccountsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a request for a brand, category, SKU report
   --  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)
   --    This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
   overriding
   procedure Analytics_Create_Conversion_Product_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Conversion_Product_Report_Create_Type : in ConversionProductReportCreate_Type;
       Result  : out .Models.ConversionProductReport_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a request for a Marketing Mix Modeling (MMM) report
   --  This creates an asynchronous mmm report based on the given request.
   --      It returns a token that you can use to download the report when it is
   --      ready. NOTE: An additional limit of 5 queries per minute per advertiser
   --      applies to this endpoint while it's in beta release.
   --      For the ADVERTISER_PAID_SPEND_IN_DOLLAR,
   --      ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR
   --      columns: if you receive bonus media, this value still includes that spend, and it will
   --      need to be removed manually with support from your Pinterest account team for a
   --      fully netted value. Over time, we'll also subtract bonus media and other incentives as
   --      data becomes available. Production and other non-media fees are excluded.
   overriding
   procedure Analytics_Create_Mmm_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       M_MMReport_Create_Type : in MMMReportCreate_Type;
       Result  : out .Models.MMMReport_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create async request for an account analytics report
   --  This returns a token that you can use to download the report when it is ready.
   --    Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
   --    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --    - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.
   --    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   --    - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.
   --    - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
   overriding
   procedure Analytics_Create_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ads_Analytics_Create_Async_Request_Type : in AdsAnalyticsCreateAsyncRequest_Type;
       Result  : out .Models.AdsAnalyticsCreateAsyncResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create async request for an analytics report using a template
   --  This takes a template ID and an optional custom timeframe and
   --    constructs an asynchronous report based on the template. It returns
   --    a token that you can use to download the report when it is ready.
   overriding
   procedure Analytics_Create_Template_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Template_Id : in Swagger.UString;
       Start_Date : in Swagger.Nullable_Date;
       End_Date : in Swagger.Nullable_Date;
       Granularity : in Granularity_Type;
       Result  : out .Models.TemplateBasedReport_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get advertiser brand, category, SKU report
   --  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)
   --    Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
   overriding
   procedure Analytics_Get_Conversion_Product_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Token : in Swagger.UString;
       Result  : out .Models.ConversionProductReport_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get advertiser Marketing Mix Modeling (MMM) report.
   --  Get an mmm report for an ad account. This returns a URL to an
   --      mmm metrics report given a token returned from the create mmm report endpoint.
   overriding
   procedure Analytics_Get_Mmm_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Token : in Swagger.UString;
       Result  : out .Models.MMMReport_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get the account analytics report created by the async call
   --  This returns a URL to an analytics report given a token returned from the post request report creation call.
   --    You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.
   --    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   overriding
   procedure Analytics_Get_Report
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Token : in Swagger.UString;
       Result  : out .Models.AdsAnalyticsGetAsyncResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete ads data for ad account in API Sandbox
   --  Delete an ad account and all the ads data associated with that account.
   --  A string message is returned indicating the status of the delete operation.
   --  
   --  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).
   --  Go to /docs/developer-tools/sandbox/ for more information.
   overriding
   procedure Sandbox_Delete
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  List templates
   --  Gets all Templates associated with an ad account ID.
   overriding
   procedure Templates_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Result  : out .Models.TemplatesList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get ad group analytics
   --  Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.
   --  
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   overriding
   procedure Ad_Groups_Analytics
      (Server : in out Server_Type;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Ad_Account_Id : in Swagger.UString;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Aggregate_Report_Rows : in Swagger.Nullable_Boolean;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get audience sizing
   --  Get potential audience size for an ad group with given targeting criteria.
   --  Potential audience size estimates the number of people you may be able to reach per month with your campaign.
   --  It is based on historical advertising data and the targeting criteria you select.
   --  It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
   overriding
   procedure Ad_Groups_Audience_Sizing
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Group_Audience_Sizing_Create_Type : in AdGroupAudienceSizingCreate_Type;
       Result  : out .Models.AdGroupAudienceSizing_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get bid floors
   --  List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.
   --  
   --  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.
   --  
   --  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.
   --  
   --  **Equivalency equations**, using dollars as an example currency:
   --  
   --  * $1 = 1,000,000 microdollars
   --  * 1 microdollar = $0.000001
   --  
   --  **To convert between currency and microcurrency**, using dollars as an example currency:
   --  
   --  * To convert dollars to microdollars, mutiply dollars by 1,000,000
   --  * To convert microdollars to dollars, divide microdollars by 1,000,000
   --  
   --  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
   overriding
   procedure Ad_Groups_Bid_Floor_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bid_Floor_Create_Type : in BidFloorCreate_Type;
       Result  : out .Models.BidFloor_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create ad groups
   --  Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).
   --  
   --  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).
   --  
   --  **Notes:**
   --  - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.
   --  
   --  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.
   --  
   --  **Equivalency equations**, using dollars as an example currency:
   --  - $1 = 1,000,000 microdollars
   --  - 1 microdollar = $0.000001
   --  
   --  **To convert between currency and microcurrency**, using dollars as an example currency:
   --  - To convert dollars to microdollars, multiply dollars by 1,000,000
   --  - To convert microdollars to dollars, divide microdollars by 1,000,000
   --  
   --  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.
   --  - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only.
   --  - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
   overriding
   procedure Ad_Groups_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Group_Create_Create : in .Models.AdGroupCreateCreate_Type_Vectors.Vector;
       Result  : out .Models.AdGroupsCreate200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get dynamic titles CSV download URL
   --  Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
   overriding
   procedure Ad_Groups_Dynamic_Titles_Download_Csv
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Group_Id : in Swagger.UString;
       Result  : out .Models.DynamicTitlesDownloadCSV_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get dynamic titles status
   --  Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
   overriding
   procedure Ad_Groups_Dynamic_Titles_Get_Status
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Group_Id : in Swagger.UString;
       Result  : out .Models.DynamicTitlesGetStatus_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get dynamic titles upload URL
   --  Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
   overriding
   procedure Ad_Groups_Dynamic_Titles_Get_Upload_Url
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Group_Id : in Swagger.UString;
       Result  : out .Models.DynamicTitlesUploadURL_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Process dynamic titles CSV
   --  Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
   overriding
   procedure Ad_Groups_Dynamic_Titles_Process_Csv
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Group_Id : in Swagger.UString;
       Dynamic_Titles_Process_CSVCreate_Type : in DynamicTitlesProcessCSVCreate_Type;
       Result  : out .Models.DynamicTitlesProcessCSV_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get ad group
   --  Get a specific ad group given the ad group ID.
   overriding
   procedure Ad_Groups_Get
      (Server : in out Server_Type;
       Ad_Group_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.AdGroup_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List ad groups
   --  List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids).
   --  **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
   overriding
   procedure Ad_Groups_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Entity_Statuses : in .Models.EntityStatus_Type_Vectors.Vector;
       Translate_Interests_To_Names : in Swagger.Nullable_Boolean;
       Result  : out .Models.AdGroupsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get targeting analytics for ad groups
   --  Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").
   --  
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   overriding
   procedure Ad_Groups_Targeting_Analytics_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Targeting_Types : in .Models.AdsAnalyticsAdGroupTargetingType_Type_Vectors.Vector;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Attribution_Types : in .Models.ConversionReportAttributionType_Type_Vectors.Vector;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Sort_Columns : in Swagger.UString_Vectors.Vector;
       Sort_Ascending : in Swagger.Nullable_Boolean;
       Result  : out .Models.MetricsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update ad groups
   --  Update multiple existing ad groups.
   overriding
   procedure Ad_Groups_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Group_Update_Batch_Update : in .Models.AdGroupUpdateBatchUpdate_Type_Vectors.Vector;
       Result  : out .Models.AdGroupsCreate200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List of ad groups using promotions IDs.
   --  Get a list of ad groups that are associated with those promotion ids
   overriding
   procedure Get_Ad_Groups_By_Promotion_Ids_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Promotion_Ids : in Swagger.UString_Vectors.Vector;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Result  : out .Models.AdGroupsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create ad preview with pin or image
   --  Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.
   --  
   --  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)
   --  
   --  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
   overriding
   procedure Ad_Previews_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Preview_Request_Type : in AdPreviewRequest_Type;
       Result  : out .Models.AdPreviewURLResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get targeting analytics for ads
   --  Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").
   --  
   --  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --  * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   overriding
   procedure Ad_Targeting_Analytics_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Ids : in Swagger.UString_Vectors.Vector;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Targeting_Types : in .Models.AdsAnalyticsAdTargetingType_Type_Vectors.Vector;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Click_Window_Days : in ConversionAttributionWindowDays_Type;
       Engagement_Window_Days : in ConversionAttributionWindowDays_Type;
       View_Window_Days : in ConversionAttributionWindowDays_Type;
       Conversion_Report_Time : in ConversionReportTimeType_Type;
       Attribution_Types : in .Models.ConversionReportAttributionType_Type_Vectors.Vector;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Sort_Columns : in Swagger.UString_Vectors.Vector;
       Sort_Ascending : in Swagger.Nullable_Boolean;
       Result  : out .Models.MetricsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get ad analytics
   --  Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.
   --      - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --      - The request must contain either ad_ids or both campaign_ids and pin_ids.
   --      - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --      - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   overriding
   procedure Ads_Analytics
      (Server : in out Server_Type;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Ad_Account_Id : in Swagger.UString;
       Pin_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Ids : in Swagger.UString_Vectors.Vector;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Create ads
   --  Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
   overriding
   procedure Ads_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Create : in .Models.AdCreate_Type_Vectors.Vector;
       Result  : out .Models.AdBatchWriteResponseModel_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get ad
   --  Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will
   --  contain additional information from the Ad Review process.
   --  For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
   overriding
   procedure Ads_Get
      (Server : in out Server_Type;
       Ad_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.Ad_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List ads
   --  List ads that meet the filters provided:
   --      - Listed campaign ids or ad group ids or ad ids
   --      - Listed entity statuses
   --  
   --  If no filter is provided, all ads in the ad account are returned.
   --  
   --  **Note:**
   --  Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.
   --  
   --  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.
   --  
   --  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
   overriding
   procedure Ads_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Ids : in Swagger.UString_Vectors.Vector;
       Entity_Statuses : in .Models.EntityStatus_Type_Vectors.Vector;
       Result  : out .Models.AdsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update ads
   --  Update multiple existing ads
   overriding
   procedure Ads_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Batch_Update : in .Models.AdBatchUpdate_Type_Vectors.Vector;
       Result  : out .Models.AdBatchWriteResponseModel_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create ad preview records for one or more ad groups
   --  Create ad preview records for one or more ad groups that can be shared.
   --  Each ad group is processed independently; individual failures do not block other previews.
   overriding
   procedure Campaign_Ad_Preview_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Ad_Preview_Create : in .Models.CampaignAdPreviewCreate_Type_Vectors.Vector;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete ad preview records for one or more ad groups
   --  Delete ad preview records for one or more ad groups.
   --  All ad groups are validated before deleting any records.
   overriding
   procedure Campaign_Ad_Preview_Delete
      (Server : in out Server_Type;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Account_Id : in Swagger.UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Fetch ad preview records for one or more ad groups
   --  Fetch ad preview records for one or more ad groups.
   --  Returns all active previews associated with the provided ad group IDs.
   overriding
   procedure Campaign_Ad_Preview_Read
      (Server : in out Server_Type;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Ad_Account_Id : in Swagger.UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get item bid options (POST)
   --  Get the bid options for a batch of retail catalog items.
   --  
   --  The catalog must be owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.
   --  
   --  This endpoint is not available to all users.
   overriding
   procedure Advanced_Auction_Items_Get_Post
      (Server : in out Server_Type;
       Advanced_Auction_Items_Get_Request_Type : in AdvancedAuctionItemsGetRequest_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.AdvancedAuctionItems_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Operate on item level bid options
   --  This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.
   --  
   --  The catalog must be owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.
   --  
   --  This endpoint is not available to all users.
   overriding
   procedure Advanced_Auction_Items_Submit_Post
      (Server : in out Server_Type;
       Advanced_Auction_Items_Submit_Request_Type : in AdvancedAuctionItemsSubmitRequest_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.AdvancedAuctionProcessedItems_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get audience insights
   --  Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.
   --  
   --  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).
   overriding
   procedure Audience_Insights_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Audience_Insight_Type : in AudienceInsightType_Type;
       Result  : out .Models.AudienceInsights_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get audience insights scope and type
   --  Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
   overriding
   procedure Audience_Insights_Scope_And_Type_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.AudienceInsightsScopeAndTypeGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List accounts with access to an audience owned by an ad account
   --  List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
   overriding
   procedure Ad_Accounts_Audiences_Shared_Accounts_List
      (Server : in out Server_Type;
       Audience_Id : in Swagger.UString;
       Account_Type : in AudienceAccountType_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.AdAccountsAudiencesSharedAccountsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List accounts with access to an audience owned by a business
   --  List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
   overriding
   procedure Business_Account_Audiences_Shared_Accounts_List
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Audience_Id : in Swagger.UString;
       Account_Type : in AudienceAccountType_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.AdAccountsAudiencesSharedAccountsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List received audiences for a business
   --  Get a list of received audiences for the given business.
   overriding
   procedure Shared_Audiences_For_Business_List
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Order : in Order_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.SharedAudiencesForBusinessList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update audience sharing between ad accounts
   --  From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.
   --  
   --  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
   overriding
   procedure Update_Ad_Account_To_Ad_Account_Shared_Audience
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Account_To_Ad_Account_Shared_Audience_Update_With_Required_Body_Type : in AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody_Type;
       Result  : out .Models.AdAccountToAdAccountSharedAudience_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update audience sharing from an ad account to businesses
   --  From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.
   --  
   --  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
   overriding
   procedure Update_Ad_Account_To_Business_Shared_Audience
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Account_To_Business_Shared_Audience_Update_With_Required_Body_Type : in AdAccountToBusinessSharedAudienceUpdateWithRequiredBody_Type;
       Result  : out .Models.AdAccountToBusinessSharedAudience_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update audience sharing from a business to ad accounts
   --  From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.
   --  
   --  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.
   --  - If the business is the recipient of the audience, it can share with any of its owned ad accounts.
   --  
   --  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
   overriding
   procedure Update_Business_To_Ad_Account_Shared_Audience
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Business_To_Ad_Account_Shared_Audience_Update_With_Required_Body_Type : in BusinessToAdAccountSharedAudienceUpdateWithRequiredBody_Type;
       Result  : out .Models.BusinessToAdAccountSharedAudience_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update audience sharing between businesses
   --  From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.
   --  
   --  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
   overriding
   procedure Update_Business_To_Business_Shared_Audience
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Business_To_Business_Shared_Audience_Update_With_Required_Body_Type : in BusinessToBusinessSharedAudienceUpdateWithRequiredBody_Type;
       Result  : out .Models.BusinessToBusinessSharedAudience_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create audience
   --  Create a new audience for the ad account.
   overriding
   procedure Audiences_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ad_Accounts_Audience_Create_Type : in AdAccountsAudienceCreate_Type;
       Result  : out .Models.AdAccountsAudience_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get audience
   --  Get a specific audience given the audience ID.
   overriding
   procedure Audiences_Get
      (Server : in out Server_Type;
       Audience_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.AdAccountsAudience_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List audiences
   --  Get list of audiences for the ad account.
   overriding
   procedure Audiences_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Ownership_Type : in AudienceOwnershipType_Type;
       Exclude_Nca : in Swagger.Nullable_Boolean;
       Result  : out .Models.AudiencesList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update audience
   --  Update an existing audience for the ad account.
   overriding
   procedure Audiences_Update
      (Server : in out Server_Type;
       Audience_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Ad_Accounts_Audience_Update_Type : in AdAccountsAudienceUpdate_Type;
       Result  : out .Models.AdAccountsAudience_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Redeem ad credits
   --  Redeem ads credit on behalf of the ad account id and apply it towards billing.
   --  
   --  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
   overriding
   procedure Ads_Credit_Redeem
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Ads_Credit_Redeem_Create_Type : in AdsCreditRedeemCreate_Type;
       Result  : out .Models.AdsCreditRedeem_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get ads credit discounts
   --  Returns the list of discounts applied to the account.
   --  
   --  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
   overriding
   procedure Ads_Credits_Discounts_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.AdsCreditsDiscountsGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get download url for a billing invoice
   --  Get download url for a billing invoice.
   overriding
   procedure Billing_Invoice_Download_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Billing_Invoice_Id : in Swagger.UString;
       Result  : out .Models.BillingInvoiceDownloadResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get billing invoices
   --  Get billing invoices in the advertiser account.
   overriding
   procedure Billing_Invoices_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Sort : in BillingInvoiceSortField_Type;
       Status : in BillingInvoiceStatus_Type;
       Document_Type : in BillingInvoiceDocumentType_Type;
       Start_Due_Date : in Swagger.Nullable_Date;
       End_Due_Date : in Swagger.Nullable_Date;
       Result  : out .Models.BillingInvoicesGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get billing profiles
   --  Get billing profiles in the advertiser account.
   --  
   --  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
   overriding
   procedure Billing_Profiles_Get
      (Server : in out Server_Type;
       Is_Active : in Boolean;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BillingProfilesGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get Salesforce account details including bill_to information.
   --  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.
   --    - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
   overriding
   procedure Ssio_Accounts_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.SSIOAccount_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create insertion order through SSIO.
   --  Create insertion order through SSIO for `ad_account_id`.
   --    - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
   overriding
   procedure Ssio_Insertion_Order_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       S_SIOInsertion_Order_Create_Type : in SSIOInsertionOrderCreate_Type;
       Result  : out .Models.SSIOInsertionOrder_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Edit insertion order through SSIO.
   --  Edit insertion order through SSIO for `ad_account_id`.
   --    - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
   overriding
   procedure Ssio_Insertion_Order_Edit
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       S_SIOInsertion_Order_Update_Type : in SSIOInsertionOrderUpdate_Type;
       Result  : out .Models.SSIOInsertionOrder_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get insertion order status by ad account id.
   --  Get insertion order status for `ad_account_id`.
   --    - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
   overriding
   procedure Ssio_Insertion_Orders_Status_Get_By_Ad_Account
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.SsioInsertionOrdersStatusGetByAdAccount200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get insertion order status by pin order id.
   --  Get insertion order status for `pin_order_id`.
   --    - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
   overriding
   procedure Ssio_Insertion_Orders_Status_Get_By_Pin_Order_Id
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Pin_Order_Id : in Swagger.UString;
       Result  : out .Models.SSIOInsertionOrderStatusResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get Salesforce order lines by ad account id.
   --  Get Salesforce order lines for account id `ad_account_id`.
   --    - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
   overriding
   procedure Ssio_Order_Lines_Get_By_Ad_Account
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Pin_Order_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.SsioOrderLinesGetByAdAccount200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create board section
   --  Create a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_Create
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Board_Section_Create_Type : in BoardSectionCreate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.BoardSection_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete board section
   --  Delete a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_Delete
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Section_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.BoardSection_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List board sections
   --  Get a list of all board sections from a board owned by the "operation user_account" - or a group board that has been shared with this account.
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_List
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BoardSectionsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List Pins on board section
   --  Get a list of the Pins on a board section of a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_List_Pins
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Section_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BoardsListPins200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update board section
   --  Update a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Board_Sections_Update
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Section_Id : in Swagger.UString;
       Board_Section_Update_With_Required_Body_Type : in BoardSectionUpdateWithRequiredBody_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.BoardSection_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create board
   --  Create a board owned by the "operation user_account".
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  * By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_Create
      (Server : in out Server_Type;
       Board_Create_Type : in BoardCreate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Board_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete board
   --  Delete a board owned by the "operation user_account".
   --  * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  * By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_Delete
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Board_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get board
   --  Get a board owned by the operation user_account - or a group board that has been shared with this account.
   --  * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  * By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_Get
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Board_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List boards
   --  Get a list of the boards owned by the "operation user_account" + group boards where this account is a collaborator
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return.
   --  * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
   overriding
   procedure Boards_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Privacy : in BoardPrivacyFilter_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BoardsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List Pins on board
   --  Get a list of the Pins on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_List_Pins
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Creative_Types : in .Models.CreativeType_Type_Vectors.Vector;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Pin_Metrics : in Swagger.Nullable_Boolean;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BoardsListPins200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update board
   --  Update a board owned by the "operating user_account".
   --  * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   --  * By default, the "operation user_account" is the token user_account.
   overriding
   procedure Boards_Update
      (Server : in out Server_Type;
       Board_Id : in Swagger.UString;
       Board_With_Update_Privacy_Update_Type : in BoardWithUpdatePrivacyUpdate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.BoardWithUpdatePrivacy_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get advertiser entities in bulk
   --  Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads,
   --  keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused,
   --  only active entities will return data.
   overriding
   procedure Bulk_Download_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bulk_Download_Create_Type : in BulkDownloadCreate_Type;
       Result  : out .Models.BulkDownload_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Download advertiser entities in bulk
   --  Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the
   --  new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
   overriding
   procedure Bulk_Request_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bulk_Request_Id : in Swagger.UString;
       Include_Details : in Swagger.Nullable_Boolean;
       Result  : out .Models.BulkJobData_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create/update ad entities in bulk
   --  Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels.
   --  Note that this request will be processed asynchronously; the response will include a <code>request_id</code>
   --  that can be used to obtain the status of the request.
   overriding
   procedure Bulk_Upsert_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bulk_Upsert_Request_Type : in BulkUpsertRequest_Type;
       Result  : out .Models.BulkUpsertResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a new asset group.
   --  Create a new asset group with the specified parameters.
   --  - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
   overriding
   procedure Asset_Group_Create
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Asset_Group_Input_Create_Type : in AssetGroupInputCreate_Type;
       Result  : out .Models.AssetGroupInput_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete asset groups.
   --  Delete a batch of asset groups.
   overriding
   procedure Asset_Group_Delete
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Asset_Group_Deletion_Delete_Type : in AssetGroupDeletionDelete_Type;
       Result  : out .Models.AssetGroupDeletion_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update asset groups.
   --  Update a batch of asset groups with the specified parameters.
   overriding
   procedure Asset_Group_Update
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Asset_Group_Modification_Read_Or_Update_Type : in AssetGroupModificationReadOrUpdate_Type;
       Result  : out .Models.AssetGroupModification_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get members with access to asset
   --  Get all the members the requesting business has granted access to on the given asset.
   overriding
   procedure Business_Asset_Members_Get
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Asset_Id : in Swagger.UString;
       Start_Index : in Swagger.Nullable_Integer;
       Fetch_System_Users : in Swagger.Nullable_Boolean;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BusinessAssetMembersGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get partners with access to asset
   --  Get all the partners the requesting business has granted access to on the given asset.
   --  Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with
   --  you cannot be shared with a different partner.
   overriding
   procedure Business_Asset_Partners_Get
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Asset_Id : in Swagger.UString;
       Start_Index : in Swagger.Nullable_Integer;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BusinessAssetMembersGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List business assets
   --  Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
   overriding
   procedure Business_Assets_Get
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Permissions : in .Models.PermissionsWithOwner_Type_Vectors.Vector;
       Child_Asset_Id : in Swagger.Nullable_UString;
       Asset_Group_Id : in Swagger.Nullable_UString;
       Asset_Type : in Swagger.Nullable_UString;
       Start_Index : in Swagger.Nullable_Integer;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BusinessAssetsGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get assets assigned to a member
   --  Get assets on which you assigned asset permissions to the given member. Can be used to:
   --  - get all assets, regardless of asset type or
   --  - get assets of one asset type by using the asset_type query.
   --  The return response will include the permissions the member has to that asset and the asset type.
   overriding
   procedure Business_Member_Assets_Get
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Member_Id : in Swagger.UString;
       Asset_Type : in Swagger.Nullable_UString;
       Start_Index : in Swagger.Nullable_Integer;
       Sort_By : in AssetSortBy_Type;
       Sort_Ascending : in Swagger.Nullable_Boolean;
       Search_By : in AssetSearchBy_Type;
       Search_Value : in Swagger.Nullable_UString;
       Asset_Permission_Type : in AssetPermissionType_Type;
       Ad_Account_Statuses : in .Models.NonDraftEntityStatus_Type_Vectors.Vector;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BusinessMemberAssetsGetResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete member access to asset
   --  Terminate multiple members' access to an asset.
   overriding
   procedure Business_Members_Asset_Access_Delete
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Business_Members_Asset_Access_Delete_Body_Type : in BusinessMembersAssetAccessDeleteBody_Type;
       Result  : out .Models.DeleteMemberAccessResultsResponseArray_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Assign/Update member asset permissions
   --  Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset.
   --  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
   overriding
   procedure Business_Members_Asset_Access_Update
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Update_Member_Asset_Access_Body_Type : in UpdateMemberAssetAccessBody_Type;
       Result  : out .Models.UpdateMemberAssetsResultsResponseArray_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get assets assigned to a partner or assets assigned by a partner
   --  Can be used to get the business assets your partner has granted you access to or the business assets you have
   --  granted your partner access to. If you specify:
   --  - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to.
   --  - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
   overriding
   procedure Business_Partner_Asset_Access_Get
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Partner_Id : in Swagger.UString;
       Partner_Type : in Swagger.Nullable_UString;
       Asset_Type : in Swagger.Nullable_UString;
       Start_Index : in Swagger.Nullable_Integer;
       Sort_By : in AssetSortBy_Type;
       Sort_Ascending : in Swagger.Nullable_Boolean;
       Search_By : in AssetSearchBy_Type;
       Search_Value : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BusinessPartnerAssetAccessGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete partner access to asset
   --  Terminate multiple partners' access to an asset. If
   --  - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets.
   --  - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
   overriding
   procedure Delete_Partner_Asset_Access_Handler_Impl
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Delete_Partner_Asset_Access_Body_Type : in DeletePartnerAssetAccessBody_Type;
       Result  : out .Models.DeletePartnerAssetAccessResultsResponseArray_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Assign/Update partner asset permissions
   --  Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset.
   --  If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them.
   --  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview
   --  
   --  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be
   --  applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of
   --  the type PROFILE.
   overriding
   procedure Update_Partner_Asset_Access_Handler_Impl
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Update_Partner_Asset_Access_Body_Type : in UpdatePartnerAssetAccessBody_Type;
       Result  : out .Models.UpdatePartnerAssetsResultsResponseArray_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a request to access an existing partner's assets.
   --  Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
   overriding
   procedure Asset_Access_Requests_Create
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Create_Asset_Access_Request_Body_Type : in CreateAssetAccessRequestBody_Type;
       Result  : out .Models.CreateAssetAccessRequestResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Cancel invites/requests
   --  Cancel membership/partnership invites and/or requests.
   overriding
   procedure Cancel_Invites_Or_Requests
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Cancel_Invites_Request_Type : in CancelInvitesRequest_Type;
       Result  : out .Models.CancelInvitesResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update invite/request with an asset permission
   --  Assign asset permissions information to an existing invite/request. Can be used to:
   --  - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing
   --    partnership exists, use "Create a request to access an existing partner's assets" to request access to your
   --    partner's assets.
   --      - invite_type="PARTNER_REQUEST"
   --  - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.
   --    If there is an existing partnership, use "Assign/Update partner asset permissions" to assign a partner access to
   --    new assets.
   --      - invite_type="PARTNER_INVITE"
   --  - Invite a member to access your business assets. Note: This is only for when there is no existing membership.
   --    If there is an existing membership, use "Assign/Update member asset permissions" to assign a member access to new
   --    assets.
   --      - invite_type="MEMBER_INVITE"
   --  
   --  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
   overriding
   procedure Create_Asset_Invites
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Create_Asset_Invites_Request_Type : in CreateAssetInvitesRequest_Type;
       Result  : out .Models.UpdateInvitesResultsResponseArray_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create invites or requests
   --  Create batch invites or requests. Can create batch invites or requests as described below.
   --  - Invite members to join the business. This would required specifying the following:
   --      - invite_type="MEMBER_INVITE"
   --      - business_role="EMPLOYEE" OR business_role="BIZ_ADMIN" (To learn more about business roles, visit
   --      https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)
   --      - members
   --  - Invite partners to access your business assets. This would require specifying the following:
   --      - invite_type="PARTNER_INVITE"
   --      - business_role="PARTNER"
   --      - partners
   --  - Request to be a partner so you can access their assets. This would require specifying the following:
   --      - invite_type="PARTNER_REQUEST"
   --      - business_role="PARTNER"
   --      - partners
   overriding
   procedure Create_Membership_Or_Partnership_Invites
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Create_Membership_Or_Partnership_Invites_Body_Type : in CreateMembershipOrPartnershipInvitesBody_Type;
       Result  : out .Models.CreateInvitesResultsResponseArray_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get invites/requests
   --  Get the membership/partnership invites and/or requests for the authorized user.
   overriding
   procedure Get_Invites
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Is_Member : in Swagger.Nullable_Boolean;
       Invite_Status : in .Models.InviteFilterStatus_Type_Vectors.Vector;
       Invite_Type : in InviteType_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.GetInvites200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Accept or decline an invite/request
   --  Accept or decline invites or requests.
   overriding
   procedure Respond_Business_Access_Invites
      (Server : in out Server_Type;
       Auth_Respond_Invites_Body_Type : in AuthRespondInvitesBody_Type;
       Result  : out .Models.RespondToInvitesResponseArray_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a Brand Account
   --  Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
   overriding
   procedure Brand_Accounts_Create
      (Server : in out Server_Type;
       Business_Hierarchy_Id : in Swagger.UString;
       Brand_Account_Create_Type : in BrandAccountCreate_Type;
       Result  : out .Models.BrandAccount_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update a Brand Account
   --  Update an existing Brand Account
   overriding
   procedure Brand_Accounts_Update
      (Server : in out Server_Type;
       Brand_Account_Id : in Swagger.UString;
       Business_Hierarchy_Id : in Swagger.UString;
       Brand_Account_Update_Type : in BrandAccountUpdate_Type;
       Result  : out .Models.BrandAccount_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Terminate business memberships
   --  Terminate memberships between the specified members and your business.
   overriding
   procedure Delete_Business_Membership
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Delete_Business_Membership_Body_Type : in DeleteBusinessMembershipBody_Type;
       Result  : out .Models.DeleteBusinessMembership200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Terminate business partnerships
   --  Terminate partnerships between the specified partners and your business.
   --  Note: You may only batch terminate partners of the same partner type.
   overriding
   procedure Delete_Business_Partners
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Delete_Business_Partners_Delete_Type : in DeleteBusinessPartnersDelete_Type;
       Result  : out .Models.DeleteBusinessPartners_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List business employers for user
   --  Get all of the viewing user's business employers.
   overriding
   procedure Get_Business_Employers
      (Server : in out Server_Type;
       Assets_Summary : in Swagger.Nullable_Boolean;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.GetBusinessEmployers200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get business members
   --  Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
   overriding
   procedure Get_Business_Members
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Fetch_System_Users : in Swagger.Nullable_Boolean;
       Assets_Summary : in Swagger.Nullable_Boolean;
       Business_Roles : in .Models.MemberBusinessRole_Type_Vectors.Vector;
       Member_Ids : in Swagger.Nullable_UString;
       Start_Index : in Swagger.Nullable_Integer;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.GetBusinessEmployers200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get business partners
   --  Get all partners of the specified business.
   --  
   --  If the assets_summary=TRUE and:
   --  - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to.
   --  - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you
   --    access to.
   overriding
   procedure Get_Business_Partners
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Assets_Summary : in Swagger.Nullable_Boolean;
       Partner_Type : in PartnerType_Type;
       Partner_Ids : in Swagger.Nullable_UString;
       Start_Index : in Swagger.Nullable_Integer;
       Sort_Ascending : in Swagger.Nullable_Boolean;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.GetBusinessEmployers200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update a system user information.
   --  Update a system user information such as name.
   overriding
   procedure System_User_Update
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       System_User_Id : in Swagger.UString;
       System_User_Update_With_Required_Body_Type : in SystemUserUpdateWithRequiredBody_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update member's business role
   --  Update a member's business role within the business.
   overriding
   procedure Update_Business_Memberships
      (Server : in out Server_Type;
       Business_Id : in Swagger.UString;
       Business_Membership_Member : in .Models.BusinessMembershipMember_Type_Vectors.Vector;
       Result  : out .Models.UpdateBusinessMembershipsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pins analytics
   --  Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
   --  - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
   overriding
   procedure Ad_Pins_Analytics
      (Server : in out Server_Type;
       Campaign_Id : in Swagger.UString;
       Pin_Ids : in Swagger.UString_Vectors.Vector;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Ad_Account_Id : in Swagger.UString;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get targeting analytics for campaigns
   --  Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").
   --  
   --  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --  * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   overriding
   procedure Campaign_Targeting_Analytics_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Targeting_Types : in .Models.AdsAnalyticsCampaignTargetingType_Type_Vectors.Vector;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Attribution_Types : in .Models.ConversionReportAttributionType_Type_Vectors.Vector;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Result  : out .Models.MetricsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get campaign analytics
   --  Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   overriding
   procedure Campaigns_Analytics
      (Server : in out Server_Type;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Ad_Account_Id : in Swagger.UString;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Aggregate_Report_Rows : in Swagger.Nullable_Boolean;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Create campaigns
   --  Create multiple new campaigns. Every campaign has its own campaign_id
   --  and houses one or more ad groups, which contain one or more ads.
   --  
   --  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).
   --  
   --  **Note:**
   --  - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).
   --  
   --  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.
   --  
   --  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.
   --  
   --  **Equivalency equations**, using dollars as an example currency:
   --  
   --  - $1 = 1,000,000 microdollars
   --  - 1 microdollar = $0.000001
   --  
   --  **To convert between currency and microcurrency**, using dollars as an example currency:
   --  
   --  - To convert dollars to microdollars, multiply dollars by 1,000,000
   --  - To convert microdollars to dollars, divide microdollars by 1,000,000
   overriding
   procedure Campaigns_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Create_Item : in .Models.CampaignCreateItem_Type_Vectors.Vector;
       Result  : out .Models.CampaignBatchWriteResponseModel_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get campaign
   --  Get a specific campaign given the campaign ID.
   overriding
   procedure Campaigns_Get
      (Server : in out Server_Type;
       Campaign_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.Campaign_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List campaigns
   --  Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options.
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary
   --  roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   overriding
   procedure Campaigns_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Entity_Statuses : in .Models.EntityStatus_Type_Vectors.Vector;
       Result  : out .Models.CampaignsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update campaigns
   --  Update multiple ad campaigns based on campaign_ids.
   --  
   --  **Note:**
   --  - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).
   --  
   --  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.
   --  
   --  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.
   --  
   --  **Equivalency equations**, using dollars as an example currency:
   --  
   --  - $1 = 1,000,000 microdollars
   --  - 1 microdollar = $0.000001
   --  
   --  **To convert between currency and microcurrency**, using dollars as an example currency:
   --  
   --  - To convert dollars to microdollars, multiply dollars by 1,000,000
   --  - To convert microdollars to dollars, divide microdollars by 1,000,000
   overriding
   procedure Campaigns_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Batch_Update_Item : in .Models.CampaignBatchUpdateItem_Type_Vectors.Vector;
       Result  : out .Models.CampaignBatchWriteResponseModel_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get campaign delivery estimates
   --  Get delivery estimates for an ads campaign
   --  
   --  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
   overriding
   procedure Get_Campaign_Delivery_Estimates
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Delivery_Estimates_Campaign : in .Models.CampaignDeliveryEstimatesCampaign_Type_Vectors.Vector;
       Result  : out .Models.CampaignDeliveryEstimatesResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List feed processing results
   --  Fetch a feed processing results owned by the "operation user_account". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Feed_Processing_Results_List
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.FeedProcessingResultsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create feed
   --  Create a new feed owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Please, be aware that "default_country"
   --  and "default_locale" are not required in the spec for forward compatibility
   --  but for now the API will not accept requests without those fields.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
   --  
   --  Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
   --  If you require access, please reach out to your partner manager.
   overriding
   procedure Feeds_Create
      (Server : in out Server_Type;
       Catalogs_Feed_Create_Request_Schema_Type : in CatalogsFeedCreateRequestSchema_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsFeed_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete feed
   --  Delete a feed owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
   overriding
   procedure Feeds_Delete
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsFeed_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get feed
   --  Get a single feed owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
   overriding
   procedure Feeds_Get
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsFeed_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Ingest feed items
   --  Ingest items for a given feed owned by the "operation user_account".
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   --  
   --  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
   overriding
   procedure Feeds_Ingest
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsFeedIngestion_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List feeds
   --  Fetch feeds owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
   overriding
   procedure Feeds_List
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.Nullable_UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.FeedsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update feed
   --  Update a feed owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
   --  
   --  Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
   --  If you require access, please reach out to your partner manager.
   overriding
   procedure Feeds_Update
      (Server : in out Server_Type;
       Feed_Id : in Swagger.UString;
       Catalogs_Feed_Update_Request_Schema_Type : in CatalogsFeedUpdateRequestSchema_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsFeed_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List item issues
   --  List item validation issues for a given feed processing result owned by the "operation user_account". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Items_Issues_List
      (Server : in out Server_Type;
       Processing_Result_Id : in Swagger.UString;
       Item_Numbers : in Integer_Vectors.Vector;
       Item_Validation_Issue : in CatalogsItemValidationIssue_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.ItemsIssuesList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get item batch status
   --  Get a single catalogs items batch owned by the "operating user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch)
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   overriding
   procedure Items_Batch_Get
      (Server : in out Server_Type;
       Batch_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsItemsBatch_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Operate on item batch
   --  This endpoint supports multiple operations on a set of one or more catalog items owned by the "operation user_account". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/)
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  Note:
   --  - Access to the Creative Assets catalog type is restricted to a specific group of users.
   --  If you require access, please reach out to your partner manager.
   --  - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
   overriding
   procedure Items_Batch_Post
      (Server : in out Server_Type;
       Catalogs_Items_Batch_Post_Request_Type : in CatalogsItemsBatchPostRequest_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsItemsBatch_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get catalogs items (POST)
   --  Get the items of the catalog owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch)
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
   --  If you require access, please reach out to your partner manager.
   overriding
   procedure Items_Post
      (Server : in out Server_Type;
       Catalogs_Items_Request_Type : in CatalogsItemsRequest_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.ItemsPost200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List products by product group
   --  Get a list of product pins for a given Catalogs Product Group Id owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Product_Group_Pins_List
      (Server : in out Server_Type;
       Product_Group_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Pin_Metrics : in Swagger.Nullable_Boolean;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.CatalogsProductGroupPinsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create product group
   --  Create product group to use in Catalogs owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  "Catalog-based product groups" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the "retail feed-based" option.
   --  [Learn more](/docs/api-features/shopping-overview/)
   --  
   --  Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
   --  If you require access, please reach out to your partner manager.
   overriding
   procedure Catalogs_Product_Groups_Create
      (Server : in out Server_Type;
       Catalogs_Product_Groups_Create_Request_Schema_Type : in CatalogsProductGroupsCreateRequestSchema_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsVerticalProductGroup_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create product groups
   --  Create product group to use in Catalogs owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   --  
   --  Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
   --  If you require access, please reach out to your partner manager.
   overriding
   procedure Catalogs_Product_Groups_Create_Many
      (Server : in out Server_Type;
       Catalogs_Product_Groups_Create_Many_Request_Items : in .Models.CatalogsProductGroupsCreateManyRequestItems_Type_Vectors.Vector;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete product group
   --  Delete a product group owned by the "operation user_account" from being in use in Catalogs.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Product_Groups_Delete
      (Server : in out Server_Type;
       Product_Group_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsVerticalProductGroup_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete product groups
   --  Delete product groups owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Product_Groups_Delete_Many
      (Server : in out Server_Type;
       Id : in Integer_Vectors.Vector;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  Get product group
   --  Get a single product group for a given Catalogs Product Group Id owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Product_Groups_Get
      (Server : in out Server_Type;
       Product_Group_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsVerticalProductGroup_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List product groups
   --  Get a list of product groups for a given Catalogs Feed Id owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Product_Groups_List
      (Server : in out Server_Type;
       Id : in Integer_Vectors.Vector;
       Feed_Id : in Swagger.Nullable_UString;
       Catalog_Id : in Swagger.Nullable_UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.CatalogsProductGroupsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get product counts
   --  Get a product counts for a given Catalogs Product Group owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Product_Groups_Product_Counts_Get
      (Server : in out Server_Type;
       Product_Group_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsProductGroupProductCountsVertical_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update single product group
   --  Update product group owned by the "operation user_account" to use in Catalogs.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  "Catalog-based product groups" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the "retail feed-based" option.
   --  [Learn more](/docs/api-features/shopping-overview/)
   --  
   --  Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
   --  If you require access, please reach out to your partner manager.
   overriding
   procedure Catalogs_Product_Groups_Update
      (Server : in out Server_Type;
       Product_Group_Id : in Swagger.UString;
       Catalogs_Product_Groups_Update_Request_Schema_Type : in CatalogsProductGroupsUpdateRequestSchema_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsVerticalProductGroup_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List products by filter
   --  List products Pins owned by the "operation user_account" that meet the criteria specified in the Catalogs Product Group Filter given in the request.
   --  - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  Note: This endpoint only supports RETAIL catalog at the moment.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Products_By_Product_Group_Filter_List
      (Server : in out Server_Type;
       Catalogs_List_Products_By_Filter_Request_Type : in CatalogsListProductsByFilterRequest_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Pin_Metrics : in Swagger.Nullable_Boolean;
       Result  : out .Models.CatalogsProductGroupPinsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Build catalogs report
   --  Async request to create a report of the catalog owned by the "operation user_account". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  Note: The All Items report is limited to 25 million items per catalog.
   overriding
   procedure Reports_Create
      (Server : in out Server_Type;
       Catalogs_Report_Parameters_Type : in CatalogsReportParameters_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsCreateReportResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get catalogs report
   --  This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   overriding
   procedure Reports_Get
      (Server : in out Server_Type;
       Token : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsReport_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List report stats
   --  List aggregated numbers of issues for a catalog owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   overriding
   procedure Reports_Stats
      (Server : in out Server_Type;
       Parameters : in CatalogsReportStatsParameters_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.ReportsStats200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Operate on local inventory item batch
   --  Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations.
   --  Up to 1000 items per request to match catalogs/items.
   --  
   --  - Must provide both item_id and store_code to identify a local inventory item.
   --  
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Local_Inventory_Items_Batch_Operate
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.UString;
       Local_Inventory_Items_Batch_Create_Type : in LocalInventoryItemsBatchCreate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.SupplementalItemsBatchResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get local inventory items (POST)
   --  Get local inventory items for a catalog owned by the "operation user_account".
   --  
   --  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.
   --  
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Local_Inventory_Items_Post
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.UString;
       Local_Inventory_Items_Get_Create_Type : in LocalInventoryItemsGetCreate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.LocalInventoryItemsGet_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create local stores
   --  Create a local store for a catalog owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  - Supports optional filtering by store codes.
   --  
   --  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Local_Stores_Create
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.UString;
       Local_Store_Create : in .Models.LocalStoreCreate_Type_Vectors.Vector;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete local stores
   --  Delete multiple local stores for a catalog owned by the "operation user_account".
   --    - By default, the "operation user_account" is the token user_account.
   --    - Supports optional filtering by store codes.
   --  
   --    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --    [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Local_Stores_Delete
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.UString;
       Ids : in Swagger.UString_Vectors.Vector;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  List local stores
   --  Fetch local stores for a catalog owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  - Supports optional filtering by store codes.
   --  
   --  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Local_Stores_List
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.UString;
       Ids : in Swagger.UString_Vectors.Vector;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.CatalogsLocalStoresList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update local stores
   --  Update a local store for a catalog owned by the "operation user_account".
   --    - By default, the "operation user_account" is the token user_account.
   --    - Supports optional filtering by store codes.
   --  
   --    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --    [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Local_Stores_Update
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.UString;
       Local_Store_Batch_Update : in .Models.LocalStoreBatchUpdate_Type_Vectors.Vector;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get supplemental items batch status
   --  Fetch the status and results of a supplemental items batch operation.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Supplemental_Items_Batch_Get
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.UString;
       Batch_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.SupplementalItemsBatchResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List available filter values
   --  Get the available filter attributes and values associated with a given feed or catalog owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  - `country`, `language`, and `feed_id` are only used in retail catalogs.
   --  - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_Available_Filter_Values
      (Server : in out Server_Type;
       Catalog_Id : in Swagger.UString;
       Feed_Id : in Swagger.Nullable_UString;
       Country : in Country_Type;
       Language : in CatalogsLocale_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.CatalogsAvailableFilterValues_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create catalog
   --  Create a new catalog owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   --  
   --  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
   overriding
   procedure Catalogs_Create
      (Server : in out Server_Type;
       Catalog_Create_Type : in CatalogCreate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Catalog_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List catalogs
   --  Fetch catalogs owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
   --  
   --  [Learn more](/docs/api-features/shopping-overview/)
   overriding
   procedure Catalogs_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.CatalogsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a conversion deletion request
   --  **This endpoint is currently in beta and not available to all apps.**
   --  [Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
   --  Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`.
   --  After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion
   --  within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
   overriding
   procedure Conversion_Deletion_Request_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Conversion_Deletion_Request_Create_Type : in ConversionDeletionRequestCreate_Type;
       Result  : out .Models.ConversionDeletionRequest_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete a conversion deletion request
   --  **This endpoint is currently in beta and not available to all apps.**
   --  [Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
   --  Delete a conversion deletion request from `ad_account_id` with `request_id`.
   --  This will cancel the request and prevent it from being processed. This can only be
   --  done if the request is in the `PENDING` status and before the 72 hours mark.
   overriding
   procedure Conversion_Deletion_Request_Delete
      (Server : in out Server_Type;
       Request_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.ConversionDeletionRequest_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get a single conversion deletion request
   --  **This endpoint is currently in beta and not available to all apps.**
   --  [Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
   --  Get a single conversion deletion request from `ad_account_id` with `request_id`.
   overriding
   procedure Conversion_Deletion_Request_Get
      (Server : in out Server_Type;
       Request_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.ConversionDeletionRequest_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List conversion deletion requests
   --  **This endpoint is currently in beta and not available to all apps.**
   --  [Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
   --  Get a list of the conversion deletion requests for the specified `ad_account_id`.
   overriding
   procedure Conversion_Deletion_Request_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Result  : out .Models.ConversionDeletionRequestList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get event quality score (EQS)
   --  Get the Event Quality Score (EQS) of your conversion signals.
   --  
   --  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
   overriding
   procedure Conversion_Eqs_List
      (Server : in out Server_Type;
       Lookback_Period : in LookbackPeriodOptions_Type;
       Ad_Account_Id : in Swagger.UString;
       Source_Platform : in SourcePlatformOptions_Type;
       Ingestion_Source : in IngestionSourceOptions_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Send conversions
   --  The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object.
   --  - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`).
   --  - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.)
   --  - This endpoint has a rate limit of 5,000 calls per minute per ad account.
   --  - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
   overriding
   procedure Events_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Conversion_Events_Create_Type : in ConversionEventsCreate_Type;
       Test : in Swagger.Nullable_Boolean;
       Result  : out .Models.ConversionEvents_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create conversion tag
   --  Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.
   --  
   --  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.
   --  
   --  For more information, see:
   --  
   --  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)
   --  
   --  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)
   --  
   --  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
   overriding
   procedure Conversion_Tags_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Conversion_Tag_Create_Type : in ConversionTagCreate_Type;
       Result  : out .Models.ConversionTag_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get conversion tag
   --  Get information about an existing conversion tag.
   overriding
   procedure Conversion_Tags_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Conversion_Tag_Id : in Swagger.UString;
       Result  : out .Models.ConversionTag_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List conversion tags
   --  List conversion tags associated with an ad account.
   overriding
   procedure Conversion_Tags_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Filter_Deleted : in Swagger.Nullable_Boolean;
       Result  : out .Models.ConversionTagsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get Ocpm eligible conversion tags
   --  Get Ocpm eligible conversion tag events for an ad account.
   overriding
   procedure Ocpm_Eligible_Conversion_Tags_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get page visit conversion tags
   --  Get all page visit conversion tag events for an ad account.
   overriding
   procedure Page_Visit_Conversion_Tags_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Result  : out .Models.PageVisitConversionTagsGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create advertiser defined events
   --  Map advertiser defined events to standard events for the given ad account.
   overriding
   procedure Advertiser_Defined_Events_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Advertiser_Defined_Events_Create_Request_Type : in AdvertiserDefinedEventsCreateRequest_Type;
       Result  : out .Models.AdvertiserDefinedEventsCreate200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete advertiser defined events
   --  Untrack advertiser defined events for the given ad account.
   overriding
   procedure Advertiser_Defined_Events_Delete
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Event_Names : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.AdvertiserDefinedEventsCreate200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get advertiser defined events
   --  Get advertiser defined events for the given ad account.
   overriding
   procedure Advertiser_Defined_Events_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.AdvertiserDefinedEventsGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update advertiser defined events
   --  Update advertiser defined event names or mappings for the given ad account.
   overriding
   procedure Advertiser_Defined_Events_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Advertiser_Defined_Events_Create_Request_Type : in AdvertiserDefinedEventsCreateRequest_Type;
       Result  : out .Models.AdvertiserDefinedEventsCreate200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create customer list upload
   --  Create a customer list upload request for multipart S3 upload.
   --  
   --  Note: Each part must be at least 5mb; however the last part can be any size greater than 0.
   --  Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.
   --  
   --  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
   overriding
   procedure Customer_List_Uploads_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Customer_List_Id : in Swagger.UString;
       Customer_List_Upload_Create_Request_Type : in CustomerListUploadCreateRequest_Type;
       Result  : out .Models.CustomerListUploadCreateResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get customer list upload
   --  Get the metadata for a given upload by its ID.
   overriding
   procedure Customer_List_Uploads_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Customer_List_Id : in Swagger.UString;
       Customer_List_Upload_Id : in Swagger.UString;
       Result  : out .Models.CustomerListUpload_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Run customer list upload
   --  Begin processing a customer list upload.
   overriding
   procedure Customer_List_Uploads_Run
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Customer_List_Id : in Swagger.UString;
       Customer_List_Upload_Id : in Swagger.UString;
       Result  : out .Models.CustomerListUpload_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create customer lists
   --  Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).
   --  
   --  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
   --  
   --  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**
   --   
   --  When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.
   --   
   --  To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
   overriding
   procedure Customer_Lists_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Customer_List_Create_Type : in CustomerListCreate_Type;
       Result  : out .Models.CustomerList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get customer list
   --  Gets a specific customer list given the customer list ID.
   overriding
   procedure Customer_Lists_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Customer_List_Id : in Swagger.UString;
       Result  : out .Models.CustomerList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get customer lists
   --  Get a set of customer lists including id and name based on the filters provided.
   --  
   --  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
   overriding
   procedure Customer_Lists_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Exclude_Nca : in Swagger.Nullable_Boolean;
       Result  : out .Models.CustomerListsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update customer list
   --  Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)
   --  
   --  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your "CUSTOMER_LIST" audience. Your original list of records to add will be deleted when the matching process is complete.
   --  
   --  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
   overriding
   procedure Customer_Lists_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Customer_List_Id : in Swagger.UString;
       Customer_List_Update_With_Required_Body_Type : in CustomerListUpdateWithRequiredBody_Type;
       Result  : out .Models.CustomerList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create customer segments
   --  Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
   overriding
   procedure Customer_Segment_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Customer_Segment_Create_Type : in CustomerSegmentCreate_Type;
       Result  : out .Models.CustomerSegment_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List customer segments
   --  Get a list of the customer segments in the specified `ad_account_id`.
   overriding
   procedure Customer_Segment_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Include_Sizing : in Swagger.Nullable_Boolean;
       Search_Query : in Swagger.Nullable_UString;
       Result  : out .Models.CustomerSegmentList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update customer segments
   --  Update the customer segment given advertiser ID and customer segment ID
   overriding
   procedure Customer_Segment_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Customer_Segment_Update_Request_Update_With_Required_Body_Type : in CustomerSegmentUpdateRequestUpdateWithRequiredBody_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete commerce integration
   --  Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
   overriding
   procedure Integrations_Commerce_Del
      (Server : in out Server_Type;
       External_Business_Id : in Swagger.UString;
       Result  : out .Models.IntegrationMetadata_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get commerce integration
   --  Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
   overriding
   procedure Integrations_Commerce_Get
      (Server : in out Server_Type;
       External_Business_Id : in Swagger.UString;
       Result  : out .Models.IntegrationMetadata_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update commerce integration
   --  Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
   overriding
   procedure Integrations_Commerce_Patch
      (Server : in out Server_Type;
       External_Business_Id : in Swagger.UString;
       Integration_Metadata_Update_Type : in IntegrationMetadataUpdate_Type;
       Result  : out .Models.IntegrationMetadata_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create commerce integration
   --  Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
   overriding
   procedure Integrations_Commerce_Post
      (Server : in out Server_Type;
       Integration_Metadata_Create_Type : in IntegrationMetadataCreate_Type;
       Result  : out .Models.IntegrationMetadata_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get integration metadata
   --  Get integration metadata by ID.
   --  Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
   overriding
   procedure Integrations_Get_By_Id
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.IntegrationRecord_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get integration metadata list
   --  Get integration metadata list.
   --  Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
   overriding
   procedure Integrations_Get_List
      (Server : in out Server_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.IntegrationsGetList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Receives batched logs from integration applications.
   --  This endpoint receives batched logs from integration applications on partner platforms.
   --  Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
   overriding
   procedure Integrations_Logs_Post
      (Server : in out Server_Type;
       Integration_Logs_Request_Create_Type : in IntegrationLogsRequestCreate_Type;
       Result  : out .Models.IntegrationLogsSuccessResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get country's keyword metrics
   --  See keyword metrics for a specified country, aggregated across all of Pinterest.
   --    (Definitions are available from the "Get delivery metrics definitions"
   --    [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
   overriding
   procedure Country_Keywords_Metrics_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Country_Code : in Swagger.UString;
       Keywords : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.KeywordsMetricsArrayResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create keywords
   --  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).
   --  
   --    **Notes:**
   --    - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).
   --    - All keyword match types are available for ad groups.
   --  
   --    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).
   --  
   --    **Returns:**
   --    - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.
   --    - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:
   --      ```json
   --      {
   --        "keywords": [],
   --        "errors": [
   --          {
   --            "data": {
   --              "archived": null,
   --              "match_type": "EXACT",
   --              "parent_type": null,
   --              "value": "foobar",
   --              "parent_id": null,
   --              "type": "keyword",
   --              "id": null
   --            },
   --            "error_messages": [
   --              "Advertisers and Campaigns only accept excluded targeting attributes."
   --            ]
   --          }
   --        ]
   --      }
   overriding
   procedure Keywords_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Keywords_Create_Type : in KeywordsCreate_Type;
       Result  : out .Models.Keywords_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get keywords
   --  Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.
   --  
   --      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).
   --  
   --      **Notes:**
   --      - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).
   --      - All keyword match types are available for ad groups.
   --  
   --      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).
   --  
   --      **Returns:**
   --      - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.
   --      - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:
   --        ```json
   --        {
   --          "keywords": [],
   --          "errors": [
   --            {
   --              "data": {
   --                "archived": null,
   --                "match_type": "EXACT",
   --                "parent_type": null,
   --                "value": "foobar",
   --                "parent_id": null,
   --                "type": "keyword",
   --                "id": null
   --              },
   --              "error_messages": [
   --                "Advertisers and Campaigns only accept excluded targeting attributes."
   --              ]
   --            }
   --          ]
   --        }
   overriding
   procedure Keywords_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Id : in Swagger.Nullable_UString;
       Ad_Group_Id : in Swagger.Nullable_UString;
       Ad_Group_Ids : in Swagger.UString_Vectors.Vector;
       Match_Types : in .Models.MatchType_Type_Vectors.Vector;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.KeywordsGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update keywords
   --  Update one or more keywords' bid and archived fields. Archiving
   --    a keyword effectively deletes it - keywords no longer receive metrics and
   --    are no longer visible within the parent entity's keywords list.
   overriding
   procedure Keywords_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Keywords_Update_Type : in KeywordsUpdate_Type;
       Result  : out .Models.Keywords_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List trending keywords
   --  Get the top trending search keywords among the Pinterest user audience.
   --  
   --  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.
   --  
   --  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.
   --  
   --  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
   overriding
   procedure Trending_Keywords_List
      (Server : in out Server_Type;
       Region : in TrendsSupportedRegion_Type;
       Trend_Type : in TrendType_Type;
       Interests : in .Models.TrendsL1Interest_Type_Vectors.Vector;
       Genders : in .Models.TrendsGenderFilter_Type_Vectors.Vector;
       Ages : in .Models.TrendsAgeBucket_Type_Vectors.Vector;
       Include_Keywords : in Swagger.UString_Vectors.Vector;
       Normalize_Against_Group : in Swagger.Nullable_Boolean;
       Limit : in Swagger.Nullable_Integer;
       Include_Demographics : in Swagger.Nullable_Boolean;
       Result  : out .Models.TrendingKeywordsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Apply label to entity
   --  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)
   --  
   --    Apply a label to one or more campaigns.
   --    Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.
   --    Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.
   --  
   --    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
   overriding
   procedure Labels_Apply
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Label_Id : in Swagger.UString;
       Labeled_Entities_Create_Type : in LabeledEntitiesCreate_Type;
       Result  : out .Models.LabeledEntities_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create labels
   --  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)
   --  
   --  Apply one or more labels to a campaign.
   --  Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/).
   --  Currently, you can apply brand and custom labels. Future releases will provide more options.
   --  
   --  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
   overriding
   procedure Labels_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Label_Create_Request_Type : in LabelCreateRequest_Type;
       Result  : out .Models.LabelsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List labels
   --  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)
   --  
   --  See a list of labels for assets that your account owns, and filter the list by different criteria.
   --  If no filter is provided, it will default to labels associated with the ad account id.
   overriding
   procedure Labels_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Campaign_Ids : in Swagger.UString_Vectors.Vector;
       Label_Ids : in Swagger.UString_Vectors.Vector;
       Entity_Statuses : in .Models.QueryLabelEntityStatusesItems_Type_Vectors.Vector;
       Label_Types : in .Models.QueryLabelTypesItems_Type_Vectors.Vector;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.LabelsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Remove label from entities
   --  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)
   --  
   --    Remove a label from one or more entities.
   overriding
   procedure Labels_Remove
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Label_Id : in Swagger.UString;
       Labeled_Entities_Create_Type : in LabeledEntitiesCreate_Type;
       Result  : out .Models.LabeledEntities_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update labels
   --  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)
   --  
   --  Change the properties of one or more labels.
   overriding
   procedure Labels_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Label_Update_Request_Type : in LabelUpdateRequest_Type;
       Result  : out .Models.LabelsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete lead ads subscription
   --  Delete an existing lead ads webhook subscription by ID.
   --    - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
   overriding
   procedure Ad_Accounts_Subscriptions_Del_By_Id
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Subscription_Id : in Swagger.UString;
       Result  : out .Models.LeadSubscription_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get lead ads subscription by ID
   --  Get an existing lead ads webhook subscription by ID.
   --    - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
   overriding
   procedure Ad_Accounts_Subscriptions_Get_By_Id
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Subscription_Id : in Swagger.UString;
       Result  : out .Models.LeadSubscription_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get lead ads subscriptions
   --  Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
   overriding
   procedure Ad_Accounts_Subscriptions_Get_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.AdAccountsSubscriptionsGetList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create lead ads subscription
   --  Create a lead ads webhook subscription.
   --  Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.
   --    - Only requests for the OWNER or ADMIN of the ad_account will be allowed.
   --    - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.
   --    - For data security, egress lead data is encrypted with AES-256-GCM.
   overriding
   procedure Ad_Accounts_Subscriptions_Post
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Lead_Subscription_Post_Params_Create_Type : in LeadSubscriptionPostParamsCreate_Type;
       Result  : out .Models.LeadSubscription_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get lead form by id
   --  **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**
   --  
   --  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.
   --  
   --  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
   overriding
   procedure Lead_Form_Get
      (Server : in out Server_Type;
       Lead_Form_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.LeadForm_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create lead form test data
   --  Create lead form test data based on the list of answers provided as part of the body.
   --  - List of answers should follow the questions creation order.
   overriding
   procedure Lead_Form_Test_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Lead_Form_Id : in Swagger.UString;
       Lead_Form_Test_Create_Type : in LeadFormTestCreate_Type;
       Result  : out .Models.LeadFormTest_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create lead forms
   --  **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**
   --  
   --  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.
   --  
   --  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
   overriding
   procedure Lead_Forms_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Lead_Form_Create : in .Models.LeadFormCreate_Type_Vectors.Vector;
       Result  : out .Models.LeadFormsCreate200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List lead forms
   --  **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**
   --  
   --  List lead forms associated with an ad account ID.
   --  
   --  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
   overriding
   procedure Lead_Forms_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Result  : out .Models.LeadFormsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update lead forms
   --  **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**
   --  
   --  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.
   --  
   --  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
   overriding
   procedure Lead_Forms_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Lead_Form_Batch_Update : in .Models.LeadFormBatchUpdate_Type_Vectors.Vector;
       Result  : out .Models.LeadFormsCreate200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a request to export leads collected from a lead ad
   --  **This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**
   --  
   --  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.
   --  
   --  Note: Lead ad data will be available up to 30 days after the lead has been submitted.
   --  
   --  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
   overriding
   procedure Leads_Export_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Leads_Exports_Create_Type : in LeadsExportsCreate_Type;
       Result  : out .Models.LeadsExports_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get the lead export from the lead export create call
   --  **This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**
   --  
   --  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.
   --  
   --  Note: Lead ad data will be available up to 30 days after the lead has been submitted.
   --  
   --  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
   overriding
   procedure Leads_Export_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Leads_Export_Id : in Swagger.UString;
       Result  : out .Models.LeadsExportResponseData_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Register media upload
   --  Register your intent to upload media.
   --  
   --  The response includes all of the information needed to upload the media to Pinterest.
   --  
   --  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.
   --  
   --  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
   overriding
   procedure Media_Create
      (Server : in out Server_Type;
       Media_Upload_Create_Type : in MediaUploadCreate_Type;
       Result  : out .Models.MediaUpload_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get media upload details
   --  Get details for a registered media upload, including its current status.
   --  
   --  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
   overriding
   procedure Media_Get
      (Server : in out Server_Type;
       Media_Id : in Swagger.UString;
       Result  : out .Models.Media_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List media uploads
   --  List media uploads filtered by given parameters.
   --  
   --  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
   overriding
   procedure Media_List
      (Server : in out Server_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.MediaList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Send Measurement Source Of Truth (MSOT) attributed conversion events
   --  **This feature is currently in beta and not available to all apps.**
   --  If you are interested in joining the beta, reach out to your Pinterest account manager.
   --  
   --  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest
   --  based on their `ad_account_id`. The request body should be a JSON object.
   --  
   --  - These events will not be used in Reporting.
   overriding
   procedure Msot_Events_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Conversion_MSOTEvents_Create_Type : in ConversionMSOTEventsCreate_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Receive notifications from external partners.
   --  Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
   overriding
   procedure Notification_Post
      (Server : in out Server_Type;
       Notification_Post_Request_Type : in NotificationPostRequest_Type;
       Result  : out .Models.NotificationResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Generate OAuth access token for conversion API
   --  Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
   overriding
   procedure Oauth_Conversion_Token
      (Server : in out Server_Type
       ;
       Result  : out .Models.ConversionAccessToken_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Generate OAuth access token
   --  Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.
   --  
   --  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).
   --  
   --  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).
   --  
   --  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.
   --  
   --  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token.
   overriding
   procedure Oauth_Token
      (Server : in out Server_Type;
       Grant_Type : in .Models.TokenGrantType_Type;
       Code : in Swagger.Nullable_UString;
       Continuous_Refresh : in Swagger.Nullable_UString;
       Redirect_Uri : in Swagger.Nullable_UString;
       Refresh_Token : in Swagger.Nullable_UString;
       Scope : in Swagger.Nullable_UString;
       Result  : out .Models.OauthAccessToken_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Revoke a token
   --  Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
   overriding
   procedure Token_Revoke
      (Server : in out Server_Type;
       Token : in Swagger.UString;
       Token_Type_Hint : in .Models.TokenTypeHint_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get order line
   --  Get a specific existing order line associated with an ad account.
   overriding
   procedure Order_Lines_Get
      (Server : in out Server_Type;
       Order_Line_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.OrderLine_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get order lines.
   --  List existing order lines associated with an ad account.
   overriding
   procedure Order_Lines_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Result  : out .Models.OrderLinesList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get multiple Pin analytics
   --  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
   --  
   --  Get analytics for multiple pins owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - The maximum number of pins supported in a single request is 100.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:
   --  
   --  - For Pins on public or protected boards: Admin, Analyst.
   --  - For Pins on secret boards: Admin.
   --  
   --  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
   overriding
   procedure Multi_Pins_Analytics
      (Server : in out Server_Type;
       Pin_Ids : in Swagger.UString_Vectors.Vector;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Metric_Types : in .Models.MultiPinsAnalyticsMetricTypesItem_Type_Vectors.Vector;
       App_Types : in Swagger.Nullable_UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get Pin analytics
   --  Get analytics for a Pin owned by the "operation user_account" - or on a group board that has been shared with this account.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:
   --  
   --  - For Pins on public or protected boards: Admin, Analyst.
   --  - For Pins on secret boards: Admin.
   --  
   --  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
   overriding
   procedure Pins_Analytics
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Metric_Types : in .Models.QuerypinanalyticsmetrictypesItems_Type_Vectors.Vector;
       App_Types : in Swagger.Nullable_UString;
       Split_Field : in Swagger.Nullable_UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Create Pin
   --  Create a Pin on a board or board section owned by the "operation user_account".
   --  
   --   Note: If the current "operation user_account" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).
   --  
   --  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).
   --  
   --  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
   --  
   --  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
   overriding
   procedure Pins_Create
      (Server : in out Server_Type;
       Pin_Create_Type : in PinCreate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Pin_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete Pin
   --  Delete a Pins owned by the "operation user_account" - or on a group board that has been shared with this account.
   --    - By default, the "operation user_account" is the token user_account.
   --  
   --    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:
   --  
   --    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
   --    - For Pins on secret boards: Owner, Admin.
   overriding
   procedure Pins_Delete
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Pin_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get Pin
   --  Get a Pin owned by the "operation user_account" - or on a group board that has been shared with this account.
   --    - By default, the "operation user_account" is the token user_account.
   --  
   --    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:
   --  
   --    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
   --    - For Pins on secret boards: Owner, Admin.
   overriding
   procedure Pins_Get
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Pin_Metrics : in Swagger.Nullable_Boolean;
       Result  : out .Models.Pin_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List Pins
   --  Get a list of the Pins owned by the "operation user_account".
   --      - By default, the "operation user_account" is the token user_account.
   --      - All Pins owned by the "operation user_account" are included, regardless of who owns the board they are on.
   --  
   --      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the "operation user_account".
   --  
   --      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.
   --      If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
   overriding
   procedure Pins_List
      (Server : in out Server_Type;
       Pin_Filter : in PinFilter_Type;
       Pin_Metrics : in Swagger.Nullable_Boolean;
       Include_Protected_Pins : in Swagger.Nullable_Boolean;
       Pin_Type : in PinType_Type;
       Creative_Types : in .Models.CreativeType_Type_Vectors.Vector;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Domain : in Swagger.Nullable_UString;
       Domains : in Swagger.UString_Vectors.Vector;
       Include_Product_Tag_Obj : in Swagger.Nullable_Boolean;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.PinsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Save Pin
   --  Save a Pin on a board or board section owned by the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:
   --  
   --  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
   --  - For Pins on secret boards: Owner, Admin.
   --  
   --  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc.
   --  - Any public Pin can be saved given a pin ID.
   overriding
   procedure Pins_Save
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Pins_Save_Request_Create_Type : in PinsSaveRequestCreate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Pin_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update Pin
   --  Update a pin owned by the "operating user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:
   --  
   --  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
   --  - For Pins on secret boards: Owner, Admin.
   --  
   --  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
   overriding
   procedure Pins_Update
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Pin_Update_Type : in PinUpdate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Pin_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create product group promotions
   --  Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
   overriding
   procedure Product_Group_Promotions_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Product_Group_Promotions_Create_Type : in ProductGroupPromotionsCreate_Type;
       Result  : out .Models.ProductGroupPromotions_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get a product group promotion by id
   --  Get a product group promotion by id
   overriding
   procedure Product_Group_Promotions_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Product_Group_Promotion_Id : in Swagger.UString;
       Result  : out .Models.ProductGroupPromotion_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get product group promotions
   --  List existing product group promotions associated with an ad account.
   --  
   --  Include either ad_group_id or product_group_promotion_ids in your request.
   --  
   --  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters.
   --  Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
   overriding
   procedure Product_Group_Promotions_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Product_Group_Promotion_Ids : in Swagger.UString_Vectors.Vector;
       Entity_Statuses : in .Models.EntityStatus_Type_Vectors.Vector;
       Ad_Group_Id : in Swagger.Nullable_UString;
       Result  : out .Models.ProductGroupPromotionsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update product group promotions
   --  Update multiple existing Product Group Promotions (by product_group_id)
   overriding
   procedure Product_Group_Promotions_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Product_Group_Promotions_Update_With_Required_Body_Type : in ProductGroupPromotionsUpdateWithRequiredBody_Type;
       Result  : out .Models.ProductGroupPromotions_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get product group analytics
   --  Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.
   --  
   --  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
   --  - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
   --  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
   overriding
   procedure Product_Groups_Analytics
      (Server : in out Server_Type;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Product_Group_Ids : in Swagger.UString_Vectors.Vector;
       Columns : in .Models.ReportingColumnSync_Type_Vectors.Vector;
       Granularity : in Granularity_Type;
       Ad_Account_Id : in Swagger.UString;
       Click_Window_Days : in Swagger.Number;
       Engagement_Window_Days : in Swagger.Number;
       View_Window_Days : in Swagger.Number;
       Conversion_Report_Time : in Swagger.Nullable_UString;
       Reporting_Timezone : in ReportingTimeZone_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Add product tags to pin
   --  Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin.
   --  - Maximum 24 product tags can be added in a single request.
   --  - Duplicate pin_ids in the request will result in an error.
   --  - If any product tag fails eligibility check, the entire request fails (all-or-nothing).
   --  - If a product tag is already tagged on the pin, it is treated as a no-op success.
   overriding
   procedure Product_Tags_Bulk_Add
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Product_Tags_Bulk_Add_Request_Type : in ProductTagsBulkAddRequest_Type;
       Result  : out .Models.ProductTagsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete product tags from pin
   --  Delete product tags from a pin.
   --  - If a product tag is not found on the pin, it is treated as a no-op success.
   overriding
   procedure Product_Tags_Bulk_Delete
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Product_Tags_Bulk_Delete_Request_Type : in ProductTagsBulkDeleteRequest_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get product tags for pin
   --  Retrieve all product tags for a pin.
   --  - Returns an empty array if the pin has no product tags.
   overriding
   procedure Product_Tags_List
      (Server : in out Server_Type;
       Pin_Id : in Swagger.UString;
       Result  : out .Models.ProductTagsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create promotions
   --  Create multiple new promotions.
   overriding
   procedure Promotions_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Promotion_Create : in .Models.PromotionCreate_Type_Vectors.Vector;
       Result  : out .Models.PromotionsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete promotion by id
   --  Delete a promotion within Pinterest.
   overriding
   procedure Promotions_Delete
      (Server : in out Server_Type;
       Promotion_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.Promotion_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get promotion by id
   --  Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
   overriding
   procedure Promotions_Get
      (Server : in out Server_Type;
       Promotion_Id : in Swagger.UString;
       Ad_Account_Id : in Swagger.UString;
       Result  : out .Models.Promotion_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get promotions
   --  Gets all promotions associated with an ad account ID that can be
   --  applied to an ad group. Can be either internally-saved promotions or external
   --  promotions imported from a commerce integration.
   overriding
   procedure Promotions_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Result  : out .Models.PromotionsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update promotions
   --  Update multiple promotions.
   overriding
   procedure Promotions_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Promotion_Batch_Update : in .Models.PromotionBatchUpdate_Type_Vectors.Vector;
       Result  : out .Models.PromotionsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get ad accounts countries
   --  Get Ad Accounts countries
   overriding
   procedure Ad_Account_Countries_Get
      (Server : in out Server_Type
       ;
       Result  : out .Models.AdAccountCountriesGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get available metrics' definitions
   --  Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints.
   --  The `display_name` attribute will match how the metric is named in our native tools like Ads Manager.
   --  See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
   overriding
   procedure Delivery_Metrics_Get
      (Server : in out Server_Type;
       Report_Type : in ReportType_Type;
       Result  : out .Models.DeliveryMetricsGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get interest details
   --  Get details of a specific interest given interest ID.
   --  
   --  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
   overriding
   procedure Interest_Targeting_Options_Get
      (Server : in out Server_Type;
       Interest_Id : in Swagger.UString;
       Result  : out .Models.SingleInterestTargetingOption_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get lead form questions
   --  Get a list of all lead form question type names. Some questions might not be used.
   --  
   --  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
   overriding
   procedure Lead_Form_Questions_Get
      (Server : in out Server_Type
       ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get metrics ready state
   --  Learn whether conversion or non-conversion metrics are finalized and ready to query.
   overriding
   procedure Metrics_Ready_State_Get
      (Server : in out Server_Type;
       Date : in Swagger.UString;
       Result  : out .Models.BookClosed_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get targeting options
   --  You can use targeting values in ads placement to define your intended audience.
   --  
   --      Targeting metrics are organized around targeting specifications.
   --  
   --      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).
   --  
   --      **Sample return:**
   --  
   --      ```
   --      [{"36313": "Australia: Moreton Bay - North", "124735": "Canada: North Battleford", "36109": "Australia: Murray", "36108": "Australia: Mid North Coast", "36101": "Australia: Capital Region", "811": "U.S.: Reno", "36103": "Australia: Central West", "36102": "Australia: Central Coast", "36105": "Australia: Far West and Orana", "36104": "Australia: Coffs Harbour - Grafton", "36107": "Australia: Illawarra", "36106": "Australia: Hunter Valley Exc Newcastle", "554017": "New Zealand: Wanganui", "554016": "New Zealand: Marlborough", "554015": "New Zealand: Gisborne", "554014": "New Zealand: Tararua", "554013": "New Zealand: Invercargill", "GR": "Greece", "554011": "New Zealand: Whangarei", "554010": "New Zealand: Far North", "717": "U.S.: Quincy-Hannibal-Keokuk", "716": "U.S.: Baton Rouge",...}]
   --      ```
   overriding
   procedure Targeting_Options_Get
      (Server : in out Server_Type;
       Targeting_Type : in PublicTargetingType_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Client_Id : in Swagger.Nullable_UString;
       Oauth_Signature : in Swagger.Nullable_UString;
       Timestamp : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Create schedules
   --  Batch create schedules
   overriding
   procedure Schedules_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Schedule_Create : in .Models.ScheduleCreate_Type_Vectors.Vector;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get Schedules
   --  Get schedules for a specific advertiser
   overriding
   procedure Schedules_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Entity_Ids : in Swagger.UString_Vectors.Vector;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Schedule_Statuses : in .Models.ScheduleStatus_Type_Vectors.Vector;
       Schedule_Type : in ScheduleType_Type;
       Result  : out .Models.SchedulesList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update schedules
   --  Update one or more schedules
   overriding
   procedure Schedules_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Schedule_Batch_Update : in .Models.ScheduleBatchUpdate_Type_Vectors.Vector;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Search pins by a given search term
   --  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
   --  
   --  Get the top 10 Pins by a given search term.
   overriding
   procedure Search_Partner_Pins
      (Server : in out Server_Type;
       Term : in Swagger.UString;
       Country_Code : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Locale : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.SearchPartnerPins200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Search user's boards
   --  Search for boards for the "operation user_account". This includes boards of all board types.
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
   overriding
   procedure Search_User_Boards_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Query : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BoardsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Search user's Pins
   --  Search for pins for the "operation user_account".
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
   overriding
   procedure Search_User_Pins_List
      (Server : in out Server_Type;
       Query : in Swagger.UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Bookmark : in Swagger.Nullable_UString;
       Result  : out .Models.PinsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create targeting templates
   --  Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.
   --  
   --  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
   overriding
   procedure Targeting_Template_Create
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Targeting_Template_Create_Type : in TargetingTemplateCreate_Type;
       Result  : out .Models.TargetingTemplate_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List targeting templates
   --  Get a list of the targeting templates in the specified `ad_account_id`
   overriding
   procedure Targeting_Template_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Order : in PinterestLibPaginationOrder_Type;
       Include_Sizing : in Swagger.Nullable_Boolean;
       Search_Query : in Swagger.Nullable_UString;
       Result  : out .Models.TargetingTemplateList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Update targeting templates
   --  Update the targeting template given advertiser ID and targeting template ID
   overriding
   procedure Targeting_Template_Update
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Targeting_Template_Update_Request_Read_Or_Update_Type : in TargetingTemplateUpdateRequestReadOrUpdate_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List related terms
   --  Get a list of terms logically related to each input term.
   --  
   --  Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
   overriding
   procedure Terms_Related_List
      (Server : in out Server_Type;
       Terms : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.RelatedTerms_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List suggested terms
   --  Get popular search terms that begin with your input term.
   --  
   --  Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
   overriding
   procedure Terms_Suggested_List
      (Server : in out Server_Type;
       Term : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get terms of service
   --  Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
   overriding
   procedure Terms_Of_Service_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.UString;
       Include_Html : in Swagger.Nullable_Boolean;
       Tos_Type : in Swagger.Nullable_UString;
       Result  : out .Models.TermsOfService_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns editorial articles for a given region
   --  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
   overriding
   procedure Trends_Editorial_Articles_List
      (Server : in out Server_Type;
       Region : in ProductCategoryRegion_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get featured topics
   --  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
   overriding
   procedure Trends_Featured_Topics_List
      (Server : in out Server_Type;
       Region : in ProductCategoryRegion_Type;
       Interest : in InterestsEnum_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get product category details
   --  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
   overriding
   procedure Trends_Product_Categories_Details_List
      (Server : in out Server_Type;
       Product_Categories : in .Models.ProductCategoryEnum_Type_Vectors.Vector;
       Region : in ProductCategoryRegion_Type;
       Lookback_Window : in ProductCategoryDetailLookbackWindow_Type;
       Engagement_Type : in ProductCategoriesEngagementType_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get a list of growing Shopping Product Categories
   --  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
   overriding
   procedure Trends_Product_Categories_Trending_List
      (Server : in out Server_Type;
       Region : in ProductCategoryRegion_Type;
       Verticals : in .Models.VerticalProductCategory_Type_Vectors.Vector;
       Ages : in .Models.AgeTrendsBucket_Type_Vectors.Vector;
       Genders : in .Models.GenderBucket_Type_Vectors.Vector;
       Engagement_Type : in ProductCategoriesEngagementType_Type;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  List following boards
   --  Get a list of the boards a user follows. The request returns a board summary object array.
   overriding
   procedure Boards_User_Follows_List
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Explicit_Following : in Swagger.Nullable_Boolean;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.BoardsList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Follow user
   --  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
   --  
   --  Use this request, as a signed-in user, to follow another user.
   overriding
   procedure Follow_User_Update
      (Server : in out Server_Type;
       Username : in Swagger.UString;
       Follow_User_Create_Type : in FollowUserCreate_Type;
       Result  : out .Models.FollowUser_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List followers
   --  Get a list of your followers.
   overriding
   procedure Followers_List
      (Server : in out Server_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.FollowersList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List linked businesses
   --  Get a list of your linked business accounts.
   overriding
   procedure Linked_Business_Accounts_Get
      (Server : in out Server_Type
       ;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Unverify website
   --  Unverify a website verified by the signed-in user.
   overriding
   procedure Unverify_Website_Delete
      (Server : in out Server_Type;
       Website : in Swagger.UString;
       Result  : out .Models.UserWebsite_Type;
       Context : in out Swagger.Servers.Context_Type);

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
       Content_Type : in Swagger.Nullable_UString;
       Source : in Swagger.Nullable_UString;
       Metric_Types : in .Models.QuerymetrictypesItems_Type_Vectors.Vector;
       Split_Field : in Swagger.Nullable_UString;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type);

   --  Get user account top pins analytics
   --  Gets analytics data about a user's top pins (limited to the top 50).
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   overriding
   procedure User_Account_Analytics_Top_Pins
      (Server : in out Server_Type;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Sort_By : in TopPinsSortBy_Type;
       From_Claimed_Content : in Swagger.Nullable_UString;
       Pin_Format : in Swagger.Nullable_UString;
       App_Types : in Swagger.Nullable_UString;
       Content_Type : in Swagger.Nullable_UString;
       Source : in Swagger.Nullable_UString;
       Metric_Types : in .Models.QuerymetrictypesItems_Type_Vectors.Vector;
       Num_Of_Pins : in Swagger.Nullable_Integer;
       Created_In_Last_NDays : in Swagger.Number;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.TopPinsAnalyticsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get user account top video pins analytics
   --  Gets analytics data about a user's top video pins (limited to the top 50).
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
   overriding
   procedure User_Account_Analytics_Top_Video_Pins
      (Server : in out Server_Type;
       Start_Date : in Swagger.Date;
       End_Date : in Swagger.Date;
       Sort_By : in TopVideoPinsSortBy_Type;
       From_Claimed_Content : in Swagger.Nullable_UString;
       Pin_Format : in Swagger.Nullable_UString;
       App_Types : in Swagger.Nullable_UString;
       Content_Type : in Swagger.Nullable_UString;
       Source : in Swagger.Nullable_UString;
       Metric_Types : in .Models.QueryvideopinmetrictypesItems_Type_Vectors.Vector;
       Num_Of_Pins : in Swagger.Nullable_Integer;
       Created_In_Last_NDays : in Swagger.Number;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.TopVideoPinsAnalyticsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List following interests
   --  Get a list of a user's following interests in one place.
   overriding
   procedure User_Account_Followed_Interests
      (Server : in out Server_Type;
       Username : in Swagger.UString;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.UserAccountFollowedInterests200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get user account
   --  Get account information for the "operation user_account"
   --  - By default, the "operation user_account" is the token user_account.
   --  
   --  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ "Understanding Business Access"
   --  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See [Understanding Business Access] for more information.
   overriding
   procedure User_Account_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.Account_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List following
   --  Get a list of who a certain user follows.
   overriding
   procedure User_Following_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Explicit_Following : in Swagger.Nullable_Boolean;
       Feed_Type : in UserFollowingFeedType_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.FollowersList200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get user websites
   --  Get user websites, claimed or not
   overriding
   procedure User_Websites_Get
      (Server : in out Server_Type;
       Bookmark : in Swagger.Nullable_UString;
       Page_Size : in Swagger.Nullable_Integer;
       Result  : out .Models.UserWebsitesGet200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Verify website
   --  Verify a website as a signed-in user.
   overriding
   procedure Verify_Website_Update
      (Server : in out Server_Type;
       User_Website_Create_Type : in UserWebsiteCreate_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.UserWebsite_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get user verification code for website claiming
   --  Get verification code for user to install on the website to claim it.
   overriding
   procedure Website_Verification_Get
      (Server : in out Server_Type;
       Ad_Account_Id : in Swagger.Nullable_UString;
       Result  : out .Models.UserWebsiteVerification_Type;
       Context : in out Swagger.Servers.Context_Type);

   package Server_Impl is
      new .Skeletons.Shared_Instance (Server_Type);

end .Servers;
