# Pinterest REST API

Pinterest's REST API

This Scala akka-http framework project was generated by OpenAPI Generator 7.4.0.

    ## API

          ### AdAccounts

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.AdAccountsController`|akka-http API controller|
          |`org.openapitools.server.api.AdAccountsApi`|Representing trait|
              |`org.openapitools.server.api.AdAccountsApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/analytics?startDate=[value]&endDate=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get ad account analytics
                * `GET /v5/ad_accounts/{ad_account_id}/targeting_analytics?startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]` - Get targeting analytics for an ad account
                * `POST /v5/ad_accounts` - Create ad account
                * `GET /v5/ad_accounts/{ad_account_id}` - Get ad account
                * `GET /v5/ad_accounts?bookmark=[value]&pageSize=[value]&includeSharedAccounts=[value]` - List ad accounts
                * `POST /v5/ad_accounts/{ad_account_id}/mmm_reports` - Create a request for a Marketing Mix Modeling (MMM) report
                * `POST /v5/ad_accounts/{ad_account_id}/reports` - Create async request for an account analytics report
                * `POST /v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports?startDate=[value]&endDate=[value]&granularity=[value]` - Create async request for an analytics report using a template
                * `GET /v5/ad_accounts/{ad_account_id}/mmm_reports?token=[value]` - Get advertiser Marketing Mix Modeling (MMM) report.
                * `GET /v5/ad_accounts/{ad_account_id}/reports?token=[value]` - Get the account analytics report created by the async call
                * `DELETE /v5/ad_accounts/{ad_account_id}/sandbox` - Delete ads data for ad account in API Sandbox
                * `GET /v5/ad_accounts/{ad_account_id}/templates?pageSize=[value]&order=[value]&bookmark=[value]` - List templates

          ### AdGroups

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.AdGroupsController`|akka-http API controller|
          |`org.openapitools.server.api.AdGroupsApi`|Representing trait|
              |`org.openapitools.server.api.AdGroupsApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/ad_groups/analytics?startDate=[value]&endDate=[value]&adGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get ad group analytics
                * `GET /v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing` - Get audience sizing
                * `POST /v5/ad_accounts/{ad_account_id}/bid_floor` - Get bid floors
                * `POST /v5/ad_accounts/{ad_account_id}/ad_groups` - Create ad groups
                * `GET /v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}` - Get ad group
                * `GET /v5/ad_accounts/{ad_account_id}/ad_groups?campaignIds=[value]&adGroupIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]&translateInterestsToNames=[value]` - List ad groups
                * `GET /v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics?adGroupIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]` - Get targeting analytics for ad groups
                * `PATCH /v5/ad_accounts/{ad_account_id}/ad_groups` - Update ad groups

          ### Ads

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.AdsController`|akka-http API controller|
          |`org.openapitools.server.api.AdsApi`|Representing trait|
              |`org.openapitools.server.api.AdsApiImpl`|Default implementation|

                * `POST /v5/ad_accounts/{ad_account_id}/ad_previews` - Create ad preview with pin or image
                * `GET /v5/ad_accounts/{ad_account_id}/ads/targeting_analytics?adIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]` - Get targeting analytics for ads
                * `GET /v5/ad_accounts/{ad_account_id}/ads/analytics?startDate=[value]&endDate=[value]&adIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get ad analytics
                * `POST /v5/ad_accounts/{ad_account_id}/ads` - Create ads
                * `GET /v5/ad_accounts/{ad_account_id}/ads/{ad_id}` - Get ad
                * `GET /v5/ad_accounts/{ad_account_id}/ads?campaignIds=[value]&adGroupIds=[value]&adIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]` - List ads
                * `PATCH /v5/ad_accounts/{ad_account_id}/ads` - Update ads

          ### AudienceInsights

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.AudienceInsightsController`|akka-http API controller|
          |`org.openapitools.server.api.AudienceInsightsApi`|Representing trait|
              |`org.openapitools.server.api.AudienceInsightsApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/audience_insights?audienceInsightType=[value]` - Get audience insights
                * `GET /v5/ad_accounts/{ad_account_id}/insights/audiences` - Get audience insights scope and type

          ### Audiences

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.AudiencesController`|akka-http API controller|
          |`org.openapitools.server.api.AudiencesApi`|Representing trait|
              |`org.openapitools.server.api.AudiencesApiImpl`|Default implementation|

                * `POST /v5/ad_accounts/{ad_account_id}/audiences` - Create audience
                * `POST /v5/ad_accounts/{ad_account_id}/audiences/custom` - Create custom audience
                * `GET /v5/ad_accounts/{ad_account_id}/audiences/{audience_id}` - Get audience
                * `GET /v5/ad_accounts/{ad_account_id}/audiences?bookmark=[value]&order=[value]&pageSize=[value]&ownershipType=[value]` - List audiences
                * `PATCH /v5/ad_accounts/{ad_account_id}/audiences/{audience_id}` - Update audience

          ### Billing

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.BillingController`|akka-http API controller|
          |`org.openapitools.server.api.BillingApi`|Representing trait|
              |`org.openapitools.server.api.BillingApiImpl`|Default implementation|

                * `POST /v5/ad_accounts/{ad_account_id}/ads_credit/redeem` - Redeem ad credits
                * `GET /v5/ad_accounts/{ad_account_id}/ads_credit/discounts?bookmark=[value]&pageSize=[value]` - Get ads credit discounts
                * `GET /v5/ad_accounts/{ad_account_id}/billing_profiles?isActive=[value]&bookmark=[value]&pageSize=[value]` - Get billing profiles
                * `GET /v5/ad_accounts/{ad_account_id}/ssio/accounts` - Get Salesforce account details including bill-to information.
                * `POST /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders` - Create insertion order through SSIO.
                * `PATCH /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders` - Edit insertion order through SSIO.
                * `GET /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status?bookmark=[value]&pageSize=[value]` - Get insertion order status by ad account id.
                * `GET /v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status` - Get insertion order status by pin order id.
                * `GET /v5/ad_accounts/{ad_account_id}/ssio/order_lines?bookmark=[value]&pageSize=[value]&pinOrderId=[value]` - Get Salesforce order lines by ad account id.

          ### Boards

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.BoardsController`|akka-http API controller|
          |`org.openapitools.server.api.BoardsApi`|Representing trait|
              |`org.openapitools.server.api.BoardsApiImpl`|Default implementation|

                * `POST /v5/boards/{board_id}/sections?adAccountId=[value]` - Create board section
                * `DELETE /v5/boards/{board_id}/sections/{section_id}?adAccountId=[value]` - Delete board section
                * `GET /v5/boards/{board_id}/sections?adAccountId=[value]&bookmark=[value]&pageSize=[value]` - List board sections
                * `GET /v5/boards/{board_id}/sections/{section_id}/pins?adAccountId=[value]&bookmark=[value]&pageSize=[value]` - List Pins on board section
                * `PATCH /v5/boards/{board_id}/sections/{section_id}?adAccountId=[value]` - Update board section
                * `POST /v5/boards?adAccountId=[value]` - Create board
                * `DELETE /v5/boards/{board_id}?adAccountId=[value]` - Delete board
                * `GET /v5/boards/{board_id}?adAccountId=[value]` - Get board
                * `GET /v5/boards?adAccountId=[value]&bookmark=[value]&pageSize=[value]&privacy=[value]` - List boards
                * `GET /v5/boards/{board_id}/pins?bookmark=[value]&pageSize=[value]&creativeTypes=[value]&adAccountId=[value]&pinMetrics=[value]` - List Pins on board
                * `PATCH /v5/boards/{board_id}?adAccountId=[value]` - Update board

          ### Bulk

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.BulkController`|akka-http API controller|
          |`org.openapitools.server.api.BulkApi`|Representing trait|
              |`org.openapitools.server.api.BulkApiImpl`|Default implementation|

                * `POST /v5/ad_accounts/{ad_account_id}/bulk/download` - Get advertiser entities in bulk
                * `GET /v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}?includeDetails=[value]` - Download advertiser entities in bulk
                * `POST /v5/ad_accounts/{ad_account_id}/bulk/upsert` - Create/update ad entities in bulk

          ### Campaigns

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.CampaignsController`|akka-http API controller|
          |`org.openapitools.server.api.CampaignsApi`|Representing trait|
              |`org.openapitools.server.api.CampaignsApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics?campaignIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]` - Get targeting analytics for campaigns
                * `GET /v5/ad_accounts/{ad_account_id}/campaigns/analytics?startDate=[value]&endDate=[value]&campaignIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get campaign analytics
                * `POST /v5/ad_accounts/{ad_account_id}/campaigns` - Create campaigns
                * `GET /v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}` - Get campaign
                * `GET /v5/ad_accounts/{ad_account_id}/campaigns?campaignIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]` - List campaigns
                * `PATCH /v5/ad_accounts/{ad_account_id}/campaigns` - Update campaigns

          ### Catalogs

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.CatalogsController`|akka-http API controller|
          |`org.openapitools.server.api.CatalogsApi`|Representing trait|
              |`org.openapitools.server.api.CatalogsApiImpl`|Default implementation|

                * `GET /v5/catalogs?bookmark=[value]&pageSize=[value]&adAccountId=[value]` - List catalogs
                * `GET /v5/catalogs/product_groups/{product_group_id}/products?bookmark=[value]&pageSize=[value]&adAccountId=[value]` - List products for a Product Group
                * `POST /v5/catalogs/product_groups?adAccountId=[value]` - Create product group
                * `DELETE /v5/catalogs/product_groups/{product_group_id}?adAccountId=[value]` - Delete product group
                * `GET /v5/catalogs/product_groups/{product_group_id}?adAccountId=[value]` - Get product group
                * `GET /v5/catalogs/product_groups?feedId=[value]&catalogId=[value]&bookmark=[value]&pageSize=[value]&adAccountId=[value]` - List product groups
                * `GET /v5/catalogs/product_groups/{product_group_id}/product_counts?adAccountId=[value]` - Get product counts for a Product Group
                * `PATCH /v5/catalogs/product_groups/{product_group_id}?adAccountId=[value]` - Update product group
                * `GET /v5/catalogs/feeds/{feed_id}/processing_results?bookmark=[value]&pageSize=[value]&adAccountId=[value]` - List processing results for a given feed
                * `POST /v5/catalogs/feeds?adAccountId=[value]` - Create feed
                * `DELETE /v5/catalogs/feeds/{feed_id}?adAccountId=[value]` - Delete feed
                * `GET /v5/catalogs/feeds/{feed_id}?adAccountId=[value]` - Get feed
                * `GET /v5/catalogs/feeds?bookmark=[value]&pageSize=[value]&catalogId=[value]&adAccountId=[value]` - List feeds
                * `PATCH /v5/catalogs/feeds/{feed_id}?adAccountId=[value]` - Update feed
                * `GET /v5/catalogs/items/batch/{batch_id}?adAccountId=[value]` - Get catalogs item batch status
                * `POST /v5/catalogs/items/batch?adAccountId=[value]` - Operate on item batch
                * `GET /v5/catalogs/items?adAccountId=[value]&country=[value]&language=[value]&itemIds=[value]&filters=[value]` - Get catalogs items
                * `GET /v5/catalogs/processing_results/{processing_result_id}/item_issues?bookmark=[value]&pageSize=[value]&itemNumbers=[value]&itemValidationIssue=[value]&adAccountId=[value]` - List item issues for a given processing result
                * `POST /v5/catalogs/products/get_by_product_group_filters?bookmark=[value]&pageSize=[value]&adAccountId=[value]` - List filtered products

          ### ConversionEvents

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.ConversionEventsController`|akka-http API controller|
          |`org.openapitools.server.api.ConversionEventsApi`|Representing trait|
              |`org.openapitools.server.api.ConversionEventsApiImpl`|Default implementation|

                * `POST /v5/ad_accounts/{ad_account_id}/events?test=[value]` - Send conversions

          ### ConversionTags

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.ConversionTagsController`|akka-http API controller|
          |`org.openapitools.server.api.ConversionTagsApi`|Representing trait|
              |`org.openapitools.server.api.ConversionTagsApiImpl`|Default implementation|

                * `POST /v5/ad_accounts/{ad_account_id}/conversion_tags` - Create conversion tag
                * `GET /v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}` - Get conversion tag
                * `GET /v5/ad_accounts/{ad_account_id}/conversion_tags?filterDeleted=[value]` - Get conversion tags
                * `GET /v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible` - Get Ocpm eligible conversion tags
                * `GET /v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit?pageSize=[value]&order=[value]&bookmark=[value]` - Get page visit conversion tags

          ### CustomerLists

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.CustomerListsController`|akka-http API controller|
          |`org.openapitools.server.api.CustomerListsApi`|Representing trait|
              |`org.openapitools.server.api.CustomerListsApiImpl`|Default implementation|

                * `POST /v5/ad_accounts/{ad_account_id}/customer_lists` - Create customer lists
                * `GET /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}` - Get customer list
                * `GET /v5/ad_accounts/{ad_account_id}/customer_lists?pageSize=[value]&order=[value]&bookmark=[value]` - Get customer lists
                * `PATCH /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}` - Update customer list

          ### Integrations

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.IntegrationsController`|akka-http API controller|
          |`org.openapitools.server.api.IntegrationsApi`|Representing trait|
              |`org.openapitools.server.api.IntegrationsApiImpl`|Default implementation|

                * `DELETE /v5/integrations/commerce/{external_business_id}` - Delete commerce integration
                * `GET /v5/integrations/commerce/{external_business_id}` - Get commerce integration
                * `PATCH /v5/integrations/commerce/{external_business_id}` - Update commerce integration
                * `POST /v5/integrations/commerce` - Create commerce integration
                * `GET /v5/integrations/{id}` - Get integration metadata
                * `GET /v5/integrations?bookmark=[value]&pageSize=[value]` - Get integration metadata list
                * `POST /v5/integrations/logs` - Receives batched logs from integration applications.

          ### Keywords

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.KeywordsController`|akka-http API controller|
          |`org.openapitools.server.api.KeywordsApi`|Representing trait|
              |`org.openapitools.server.api.KeywordsApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/keywords/metrics?countryCode=[value]&keywords=[value]` - Get country&#39;s keyword metrics
                * `POST /v5/ad_accounts/{ad_account_id}/keywords` - Create keywords
                * `GET /v5/ad_accounts/{ad_account_id}/keywords?campaignId=[value]&adGroupId=[value]&matchTypes=[value]&pageSize=[value]&bookmark=[value]` - Get keywords
                * `PATCH /v5/ad_accounts/{ad_account_id}/keywords` - Update keywords
                * `GET /v5/trends/keywords/{region}/top/{trend_type}?interests=[value]&genders=[value]&ages=[value]&normalizeAgainstGroup=[value]&limit=[value]` - List trending keywords

          ### LeadAds

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.LeadAdsController`|akka-http API controller|
          |`org.openapitools.server.api.LeadAdsApi`|Representing trait|
              |`org.openapitools.server.api.LeadAdsApiImpl`|Default implementation|

                * `DELETE /v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}` - Delete lead ads subscription
                * `GET /v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}` - Get lead ads subscription
                * `GET /v5/ad_accounts/{ad_account_id}/leads/subscriptions?pageSize=[value]&bookmark=[value]` - Get lead ads subscriptions
                * `POST /v5/ad_accounts/{ad_account_id}/leads/subscriptions` - Create lead ads subscription

          ### LeadForms

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.LeadFormsController`|akka-http API controller|
          |`org.openapitools.server.api.LeadFormsApi`|Representing trait|
              |`org.openapitools.server.api.LeadFormsApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}` - Get lead form by id
                * `POST /v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test` - Create lead form test data
                * `GET /v5/ad_accounts/{ad_account_id}/lead_forms?pageSize=[value]&order=[value]&bookmark=[value]` - Get lead forms

          ### Media

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.MediaController`|akka-http API controller|
          |`org.openapitools.server.api.MediaApi`|Representing trait|
              |`org.openapitools.server.api.MediaApiImpl`|Default implementation|

                * `POST /v5/media` - Register media upload
                * `GET /v5/media/{media_id}` - Get media upload details
                * `GET /v5/media?bookmark=[value]&pageSize=[value]` - List media uploads

          ### Oauth

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.OauthController`|akka-http API controller|
          |`org.openapitools.server.api.OauthApi`|Representing trait|
              |`org.openapitools.server.api.OauthApiImpl`|Default implementation|

                * `POST /v5/oauth/token` - Generate OAuth access token

          ### OrderLines

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.OrderLinesController`|akka-http API controller|
          |`org.openapitools.server.api.OrderLinesApi`|Representing trait|
              |`org.openapitools.server.api.OrderLinesApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}` - Get order line
                * `GET /v5/ad_accounts/{ad_account_id}/order_lines?pageSize=[value]&order=[value]&bookmark=[value]` - Get order lines

          ### Pins

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.PinsController`|akka-http API controller|
          |`org.openapitools.server.api.PinsApi`|Representing trait|
              |`org.openapitools.server.api.PinsApiImpl`|Default implementation|

                * `GET /v5/pins/{pin_id}/analytics?startDate=[value]&endDate=[value]&appTypes=[value]&metricTypes=[value]&splitField=[value]&adAccountId=[value]` - Get Pin analytics
                * `POST /v5/pins?adAccountId=[value]` - Create Pin
                * `DELETE /v5/pins/{pin_id}?adAccountId=[value]` - Delete Pin
                * `GET /v5/pins/{pin_id}?pinMetrics=[value]&adAccountId=[value]` - Get Pin
                * `GET /v5/pins?bookmark=[value]&pageSize=[value]&pinFilter=[value]&includeProtectedPins=[value]&pinType=[value]&creativeTypes=[value]&adAccountId=[value]&pinMetrics=[value]` - List Pins
                * `POST /v5/pins/{pin_id}/save?adAccountId=[value]` - Save Pin
                * `PATCH /v5/pins/{pin_id}?adAccountId=[value]` - Update Pin

          ### ProductGroupPromotions

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.ProductGroupPromotionsController`|akka-http API controller|
          |`org.openapitools.server.api.ProductGroupPromotionsApi`|Representing trait|
              |`org.openapitools.server.api.ProductGroupPromotionsApiImpl`|Default implementation|

                * `POST /v5/ad_accounts/{ad_account_id}/product_group_promotions` - Create product group promotions
                * `GET /v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}` - Get a product group promotion by id
                * `GET /v5/ad_accounts/{ad_account_id}/product_group_promotions?productGroupPromotionIds=[value]&entityStatuses=[value]&adGroupId=[value]&pageSize=[value]&order=[value]&bookmark=[value]` - Get product group promotions
                * `PATCH /v5/ad_accounts/{ad_account_id}/product_group_promotions` - Update product group promotions
                * `GET /v5/ad_accounts/{ad_account_id}/product_groups/analytics?startDate=[value]&endDate=[value]&productGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]` - Get product group analytics

          ### ProductGroups

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.ProductGroupsController`|akka-http API controller|
          |`org.openapitools.server.api.ProductGroupsApi`|Representing trait|
              |`org.openapitools.server.api.ProductGroupsApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/product_groups/catalogs?feedProfileId=[value]` - Get catalog product groups

          ### Resources

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.ResourcesController`|akka-http API controller|
          |`org.openapitools.server.api.ResourcesApi`|Representing trait|
              |`org.openapitools.server.api.ResourcesApiImpl`|Default implementation|

                * `GET /v5/resources/ad_account_countries` - Get ad accounts countries
                * `GET /v5/resources/delivery_metrics?reportType=[value]` - Get available metrics&#39; definitions
                * `GET /v5/resources/targeting/interests/{interest_id}` - Get interest details
                * `GET /v5/resources/lead_form_questions` - Get lead form questions
                * `GET /v5/resources/metrics_ready_state?date=[value]` - Get metrics ready state
                * `GET /v5/resources/targeting/{targeting_type}?clientId=[value]&oauthSignature=[value]&timestamp=[value]` - Get targeting options

          ### Search

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.SearchController`|akka-http API controller|
          |`org.openapitools.server.api.SearchApi`|Representing trait|
              |`org.openapitools.server.api.SearchApiImpl`|Default implementation|

                * `GET /v5/search/partner/pins?term=[value]&countryCode=[value]&bookmark=[value]&locale=[value]&limit=[value]` - Search pins by a given search term
                * `GET /v5/search/boards?adAccountId=[value]&bookmark=[value]&pageSize=[value]&query=[value]` - Search user&#39;s boards
                * `GET /v5/search/pins?adAccountId=[value]&query=[value]&bookmark=[value]` - Search user&#39;s Pins

          ### Terms

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.TermsController`|akka-http API controller|
          |`org.openapitools.server.api.TermsApi`|Representing trait|
              |`org.openapitools.server.api.TermsApiImpl`|Default implementation|

                * `GET /v5/terms/related?terms=[value]` - List related terms
                * `GET /v5/terms/suggested?term=[value]&limit=[value]` - List suggested terms

          ### TermsOfService

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.TermsOfServiceController`|akka-http API controller|
          |`org.openapitools.server.api.TermsOfServiceApi`|Representing trait|
              |`org.openapitools.server.api.TermsOfServiceApiImpl`|Default implementation|

                * `GET /v5/ad_accounts/{ad_account_id}/terms_of_service?includeHtml=[value]&tosType=[value]` - Get terms of service

          ### UserAccount

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.UserAccountController`|akka-http API controller|
          |`org.openapitools.server.api.UserAccountApi`|Representing trait|
              |`org.openapitools.server.api.UserAccountApiImpl`|Default implementation|

                * `GET /v5/user_account/following/boards?bookmark=[value]&pageSize=[value]&explicitFollowing=[value]&adAccountId=[value]` - List following boards
                * `POST /v5/user_account/following/{username}` - Follow user
                * `GET /v5/user_account/followers?bookmark=[value]&pageSize=[value]` - List followers
                * `GET /v5/user_account/businesses` - List linked businesses
                * `DELETE /v5/user_account/websites?website=[value]` - Unverify website
                * `GET /v5/user_account/analytics?startDate=[value]&endDate=[value]&fromClaimedContent=[value]&pinFormat=[value]&appTypes=[value]&contentType=[value]&source=[value]&metricTypes=[value]&splitField=[value]&adAccountId=[value]` - Get user account analytics
                * `GET /v5/user_account/analytics/top_pins?startDate=[value]&endDate=[value]&sortBy=[value]&fromClaimedContent=[value]&pinFormat=[value]&appTypes=[value]&contentType=[value]&source=[value]&metricTypes=[value]&numOfPins=[value]&createdInLastNDays=[value]&adAccountId=[value]` - Get user account top pins analytics
                * `GET /v5/user_account/analytics/top_video_pins?startDate=[value]&endDate=[value]&sortBy=[value]&fromClaimedContent=[value]&pinFormat=[value]&appTypes=[value]&contentType=[value]&source=[value]&metricTypes=[value]&numOfPins=[value]&createdInLastNDays=[value]&adAccountId=[value]` - Get user account top video pins analytics
                * `GET /v5/users/{username}/interests/follow?bookmark=[value]&pageSize=[value]` - List following interests
                * `GET /v5/user_account?adAccountId=[value]` - Get user account
                * `GET /v5/user_account/following?bookmark=[value]&pageSize=[value]&feedType=[value]&explicitFollowing=[value]&adAccountId=[value]` - List following
                * `GET /v5/user_account/websites?bookmark=[value]&pageSize=[value]` - Get user websites
                * `POST /v5/user_account/websites` - Verify website
                * `GET /v5/user_account/websites/verification` - Get user verification code for website claiming
