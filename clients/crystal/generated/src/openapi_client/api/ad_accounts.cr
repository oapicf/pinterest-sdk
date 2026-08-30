require "json"

module OpenAPIClient
  module Api
  class AdAccounts
    def initialize(@conn : Connection); end

    # Create ad preview with pin or image Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
    def ad_previews(ad_account_id : String, ad_preview_request : OpenAPIClient::AdPreviewRequest) : Response(OpenAPIClient::AdPreviewURLResponse)
      @conn.request(OpenAPIClient::AdPreviewURLResponse,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/ad_previews".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_preview_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get ads credit discounts Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    def ads_credit_discounts(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::AdsCreditsDiscountsGet200Response)
      @conn.request(OpenAPIClient::AdsCreditsDiscountsGet200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ads_credit/discounts".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Redeem ad credits Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    def ads_credit_redeem(ad_account_id : String, ads_credit_redeem_create : OpenAPIClient::AdsCreditRedeemCreate) : Response(OpenAPIClient::AdsCreditRedeem)
      @conn.request(OpenAPIClient::AdsCreditRedeem,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/ads_credit/redeem".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ads_credit_redeem_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get advertiser defined events Get advertiser defined events for the given ad account.
    def advertiser_defined_events(ad_account_id : String) : Response(OpenAPIClient::AdvertiserDefinedEventsGet200Response)
      @conn.request(OpenAPIClient::AdvertiserDefinedEventsGet200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/advertiser_defined_events".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Delete advertiser defined events Untrack advertiser defined events for the given ad account.
    def advertiser_defined_events_delete(ad_account_id : String, *, event_names : Array(String)? = nil) : Response(OpenAPIClient::AdvertiserDefinedEventsCreate200Response)
      @conn.request(OpenAPIClient::AdvertiserDefinedEventsCreate200Response,
        method: :DELETE,
        path: "/ad_accounts/{ad_account_id}/advertiser_defined_events".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "event_names" => event_names.try(&.map(&.to_s).join(",")) },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update advertiser defined events Update advertiser defined event names or mappings for the given ad account.
    def advertiser_defined_events_patch(ad_account_id : String, advertiser_defined_events_create_request : OpenAPIClient::AdvertiserDefinedEventsCreateRequest) : Response(OpenAPIClient::AdvertiserDefinedEventsCreate200Response)
      @conn.request(OpenAPIClient::AdvertiserDefinedEventsCreate200Response,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/advertiser_defined_events".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: advertiser_defined_events_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Create advertiser defined events Map advertiser defined events to standard events for the given ad account.
    def advertiser_defined_events_post(ad_account_id : String, advertiser_defined_events_create_request : OpenAPIClient::AdvertiserDefinedEventsCreateRequest) : Response(OpenAPIClient::AdvertiserDefinedEventsCreate200Response)
      @conn.request(OpenAPIClient::AdvertiserDefinedEventsCreate200Response,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/advertiser_defined_events".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: advertiser_defined_events_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get ad account analytics   Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
    def analytics(ad_account_id : String, *, start_date : Time? = nil, end_date : Time? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil) : Response(Array(OpenAPIClient::AdAccountAnalyticsItems))
      @conn.request(Array(OpenAPIClient::AdAccountAnalyticsItems),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "start_date" => start_date, "end_date" => end_date, "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "reporting_timezone" => reporting_timezone },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get audience insights Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).
    def audience_insights(ad_account_id : String, *, audience_insight_type : OpenAPIClient::AudienceInsightType? = nil) : Response(OpenAPIClient::AudienceInsights)
      @conn.request(OpenAPIClient::AudienceInsights,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/audience_insights".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "audience_insight_type" => audience_insight_type },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get bid floors List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
    def bid_floor(ad_account_id : String, bid_floor_create : OpenAPIClient::BidFloorCreate) : Response(OpenAPIClient::BidFloor)
      @conn.request(OpenAPIClient::BidFloor,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/bid_floor".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: bid_floor_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get billing invoices Get billing invoices in the advertiser account.
    def billing_invoices(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, sort : OpenAPIClient::BillingInvoiceSortField? = nil, status : OpenAPIClient::BillingInvoiceStatus? = nil, document_type : OpenAPIClient::BillingInvoiceDocumentType? = nil, start_due_date : Time? = nil, end_due_date : Time? = nil) : Response(OpenAPIClient::BillingInvoicesGet200Response)
      @conn.request(OpenAPIClient::BillingInvoicesGet200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/billing_invoices".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "sort" => sort, "status" => status, "document_type" => document_type, "start_due_date" => start_due_date, "end_due_date" => end_due_date },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get billing profiles Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    def billing_profiles(ad_account_id : String, *, is_active : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BillingProfilesGet200Response)
      @conn.request(OpenAPIClient::BillingProfilesGet200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/billing_profiles".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "is_active" => is_active, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Fetch ad preview records for one or more ad groups Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
    def campaign_ad_preview(ad_account_id : String, *, ad_group_ids : Array(String)? = nil) : Response(Array(OpenAPIClient::CampaignAdPreview))
      @conn.request(Array(OpenAPIClient::CampaignAdPreview),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/campaign_ad_preview".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "ad_group_ids" => ad_group_ids },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete ad preview records for one or more ad groups Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
    def campaign_ad_preview_delete(ad_account_id : String, *, ad_group_ids : Array(String)? = nil) : Response(Array(OpenAPIClient::CampaignAdPreviewDelete200ResponseInner))
      @conn.request(Array(OpenAPIClient::CampaignAdPreviewDelete200ResponseInner),
        method: :DELETE,
        path: "/ad_accounts/{ad_account_id}/campaign_ad_preview".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "ad_group_ids" => ad_group_ids },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create ad preview records for one or more ad groups Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
    def campaign_ad_preview_post(ad_account_id : String, campaign_ad_preview_create : Array(OpenAPIClient::CampaignAdPreviewCreate)) : Response(Array(OpenAPIClient::CampaignAdPreviewCreate200ResponseInner))
      @conn.request(Array(OpenAPIClient::CampaignAdPreviewCreate200ResponseInner),
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/campaign_ad_preview".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: campaign_ad_preview_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get event quality score (EQS) Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
    def conversion_eqs(ad_account_id : String, *, lookback_period : OpenAPIClient::LookbackPeriodOptions? = nil, source_platform : OpenAPIClient::SourcePlatformOptions? = nil, ingestion_source : OpenAPIClient::IngestionSourceOptions? = nil) : Response(Array(OpenAPIClient::EventQualityScore))
      @conn.request(Array(OpenAPIClient::EventQualityScore),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/conversion_eqs".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "lookback_period" => lookback_period, "source_platform" => source_platform, "ingestion_source" => ingestion_source },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Create ad account Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
    def create(ad_account_create : OpenAPIClient::AdAccountCreate) : Response(OpenAPIClient::AdAccount)
      @conn.request(OpenAPIClient::AdAccount,
        method: :POST,
        path: "/ad_accounts",
        body: ad_account_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List customer segments Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
    def customer_segments(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, include_sizing : Bool? = nil, search_query : String? = nil) : Response(OpenAPIClient::CustomerSegmentList200Response)
      @conn.request(OpenAPIClient::CustomerSegmentList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/customer_segments".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "include_sizing" => include_sizing, "search_query" => search_query },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update customer segments Update the customer segment given advertiser ID and customer segment ID
    def customer_segments_patch(ad_account_id : String, customer_segment_update_request_update_with_required_body : OpenAPIClient::CustomerSegmentUpdateRequestUpdateWithRequiredBody) : Response(Nil)
      @conn.request(Nil,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/customer_segments".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: customer_segment_update_request_update_with_required_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create customer segments Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
    def customer_segments_post(ad_account_id : String, customer_segment_create : OpenAPIClient::CustomerSegmentCreate) : Response(OpenAPIClient::CustomerSegment)
      @conn.request(OpenAPIClient::CustomerSegment,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/customer_segments".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: customer_segment_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Send conversions The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object. - This endpoint requires an &#x60;access_token&#x60; be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is &#x60;Authorization: Bearer &lt;access_token&gt;&#x60;). - The token&#39;s &#x60;user_account&#x60; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
    def events(ad_account_id : String, conversion_events_create : OpenAPIClient::ConversionEventsCreate, *, test : Bool? = nil) : Response(OpenAPIClient::ConversionEvents)
      @conn.request(OpenAPIClient::ConversionEvents,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/events".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: conversion_events_create,
        query: { "test" => test },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 conversion_token])
    end

    # Get ad account Get an ad account
    def get(ad_account_id : String) : Response(OpenAPIClient::AdAccount)
      @conn.request(OpenAPIClient::AdAccount,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get audience insights scope and type Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
    def insights_audiences(ad_account_id : String) : Response(OpenAPIClient::AudienceInsightsScopeAndTypeGet200Response)
      @conn.request(OpenAPIClient::AudienceInsightsScopeAndTypeGet200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/insights/audiences".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List ad accounts Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
    def list(*, include_shared_accounts : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::AdAccountsList200Response)
      @conn.request(OpenAPIClient::AdAccountsList200Response,
        method: :GET,
        path: "/ad_accounts",
        query: { "include_shared_accounts" => include_shared_accounts, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get advertiser Marketing Mix Modeling (MMM) report.     Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.
    def mmm_reports(ad_account_id : String, *, token : String? = nil) : Response(OpenAPIClient::MMMReport)
      @conn.request(OpenAPIClient::MMMReport,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/mmm_reports".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "token" => token },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create a request for a Marketing Mix Modeling (MMM) report     This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.
    def mmm_reports_post(ad_account_id : String, mmm_report_create : OpenAPIClient::MMMReportCreate) : Response(OpenAPIClient::MMMReport)
      @conn.request(OpenAPIClient::MMMReport,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/mmm_reports".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: mmm_report_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Send Measurement Source Of Truth (MSOT) attributed conversion events **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.
    def msot_events(ad_account_id : String, conversion_msot_events_create : OpenAPIClient::ConversionMSOTEventsCreate) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/msot/events".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: conversion_msot_events_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List of ad groups using promotions IDs.   Get a list of ad groups that are associated with those promotion ids
    def promotion_applied_entities(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, promotion_ids : Array(String)? = nil) : Response(OpenAPIClient::AdGroupsList200Response)
      @conn.request(OpenAPIClient::AdGroupsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/promotion_applied_entities".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "promotion_ids" => promotion_ids },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get the account analytics report created by the async call   This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
    def reports(ad_account_id : String, *, token : String? = nil) : Response(OpenAPIClient::AdsAnalyticsGetAsyncResponse)
      @conn.request(OpenAPIClient::AdsAnalyticsGetAsyncResponse,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/reports".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "token" => token },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get advertiser brand, category, SKU report   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
    def reports_brand_category_sku(ad_account_id : String, *, token : String? = nil) : Response(OpenAPIClient::ConversionProductReport)
      @conn.request(OpenAPIClient::ConversionProductReport,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/reports/brand_category_sku".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "token" => token },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create a request for a brand, category, SKU report   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
    def reports_brand_category_sku_post(ad_account_id : String, conversion_product_report_create : OpenAPIClient::ConversionProductReportCreate) : Response(OpenAPIClient::ConversionProductReport)
      @conn.request(OpenAPIClient::ConversionProductReport,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/reports/brand_category_sku".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: conversion_product_report_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create async request for an account analytics report   This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
    def reports_post(ad_account_id : String, ads_analytics_create_async_request : OpenAPIClient::AdsAnalyticsCreateAsyncRequest) : Response(OpenAPIClient::AdsAnalyticsCreateAsyncResponse)
      @conn.request(OpenAPIClient::AdsAnalyticsCreateAsyncResponse,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/reports".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ads_analytics_create_async_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete ads data for ad account in API Sandbox Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
    def sandbox(ad_account_id : String) : Response(String)
      @conn.request(String,
        method: :DELETE,
        path: "/ad_accounts/{ad_account_id}/sandbox".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get Schedules Get schedules for a specific advertiser
    def schedules(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, schedule_statuses : Array(OpenAPIClient::ScheduleStatus)? = nil, schedule_type : OpenAPIClient::ScheduleType? = nil, entity_ids : Array(String)? = nil) : Response(OpenAPIClient::SchedulesList200Response)
      @conn.request(OpenAPIClient::SchedulesList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/schedules".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "schedule_statuses" => schedule_statuses, "schedule_type" => schedule_type, "entity_ids" => entity_ids },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update schedules Update one or more schedules
    def schedules_patch(ad_account_id : String, schedule_batch_update : Array(OpenAPIClient::ScheduleBatchUpdate)) : Response(Array(OpenAPIClient::SchedulesCreate200ResponseInner))
      @conn.request(Array(OpenAPIClient::SchedulesCreate200ResponseInner),
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/schedules".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: schedule_batch_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create schedules Batch create schedules
    def schedules_post(ad_account_id : String, schedule_create : Array(OpenAPIClient::ScheduleCreate)) : Response(Array(OpenAPIClient::SchedulesCreate200ResponseInner))
      @conn.request(Array(OpenAPIClient::SchedulesCreate200ResponseInner),
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/schedules".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: schedule_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get Salesforce account details including bill-to information.   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    def ssio_accounts(ad_account_id : String) : Response(OpenAPIClient::SSIOAccount)
      @conn.request(OpenAPIClient::SSIOAccount,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ssio/accounts".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create insertion order through SSIO.   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    def ssio_insertion_orders(ad_account_id : String, ssio_insertion_order_create : OpenAPIClient::SSIOInsertionOrderCreate) : Response(OpenAPIClient::SSIOInsertionOrder)
      @conn.request(OpenAPIClient::SSIOInsertionOrder,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/ssio/insertion_orders".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ssio_insertion_order_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Edit insertion order through SSIO.   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    def ssio_insertion_orders_patch(ad_account_id : String, ssio_insertion_order_update : OpenAPIClient::SSIOInsertionOrderUpdate) : Response(OpenAPIClient::SSIOInsertionOrder)
      @conn.request(OpenAPIClient::SSIOInsertionOrder,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/ssio/insertion_orders".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ssio_insertion_order_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get insertion order status by ad account id.   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    def ssio_insertion_orders_status(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::SsioInsertionOrdersStatusGetByAdAccount200Response)
      @conn.request(OpenAPIClient::SsioInsertionOrdersStatusGetByAdAccount200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get insertion order status by pin order id.   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    def ssio_insertion_orders_status_get(ad_account_id : String, pin_order_id : String) : Response(OpenAPIClient::SSIOInsertionOrderStatusResponse)
      @conn.request(OpenAPIClient::SSIOInsertionOrderStatusResponse,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{pin_order_id}", OpenAPIClient.enc(pin_order_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get Salesforce order lines by ad account id.   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    def ssio_order_lines(ad_account_id : String, *, pin_order_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::SsioOrderLinesGetByAdAccount200Response)
      @conn.request(OpenAPIClient::SsioOrderLinesGetByAdAccount200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ssio/order_lines".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "pin_order_id" => pin_order_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete lead ads subscription Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
    def subscriptions_del_by_id(ad_account_id : String, subscription_id : String) : Response(OpenAPIClient::LeadSubscription)
      @conn.request(OpenAPIClient::LeadSubscription,
        method: :DELETE,
        path: "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{subscription_id}", OpenAPIClient.enc(subscription_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get lead ads subscription by ID Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
    def subscriptions_get_by_id(ad_account_id : String, subscription_id : String) : Response(OpenAPIClient::LeadSubscription)
      @conn.request(OpenAPIClient::LeadSubscription,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{subscription_id}", OpenAPIClient.enc(subscription_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get lead ads subscriptions Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
    def subscriptions_get_list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::AdAccountsSubscriptionsGetList200Response)
      @conn.request(OpenAPIClient::AdAccountsSubscriptionsGetList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/leads/subscriptions".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create lead ads subscription Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
    def subscriptions_post(ad_account_id : String, lead_subscription_post_params_create : OpenAPIClient::LeadSubscriptionPostParamsCreate) : Response(OpenAPIClient::LeadSubscription)
      @conn.request(OpenAPIClient::LeadSubscription,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/leads/subscriptions".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: lead_subscription_post_params_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get targeting analytics for an ad account Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    def targeting_analytics(ad_account_id : String, *, start_date : Time? = nil, end_date : Time? = nil, targeting_types : Array(OpenAPIClient::AdsAnalyticsAccountTargetingType)? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil, attribution_types : Array(OpenAPIClient::ConversionReportAttributionType)? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil) : Response(OpenAPIClient::MetricsResponse)
      @conn.request(OpenAPIClient::MetricsResponse,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/targeting_analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "start_date" => start_date, "end_date" => end_date, "targeting_types" => targeting_types.try(&.map(&.to_s).join(",")), "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "attribution_types" => attribution_types.try(&.map(&.to_s).join(",")), "reporting_timezone" => reporting_timezone },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List targeting templates Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
    def targeting_templates(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, include_sizing : Bool? = nil, search_query : String? = nil) : Response(OpenAPIClient::TargetingTemplateList200Response)
      @conn.request(OpenAPIClient::TargetingTemplateList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/targeting_templates".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "include_sizing" => include_sizing, "search_query" => search_query },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update targeting templates Update the targeting template given advertiser ID and targeting template ID
    def targeting_templates_patch(ad_account_id : String, targeting_template_update_request_read_or_update : OpenAPIClient::TargetingTemplateUpdateRequestReadOrUpdate) : Response(Nil)
      @conn.request(Nil,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/targeting_templates".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: targeting_template_update_request_read_or_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create targeting templates Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
    def targeting_templates_post(ad_account_id : String, targeting_template_create : OpenAPIClient::TargetingTemplateCreate) : Response(OpenAPIClient::TargetingTemplate)
      @conn.request(OpenAPIClient::TargetingTemplate,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/targeting_templates".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: targeting_template_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get terms of service Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
    def terms_of_service(ad_account_id : String, *, include_html : Bool? = nil, tos_type : String? = nil) : Response(OpenAPIClient::TermsOfService)
      @conn.request(OpenAPIClient::TermsOfService,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/terms_of_service".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "include_html" => include_html, "tos_type" => tos_type },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
