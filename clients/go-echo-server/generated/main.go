package main

import (
	"github.com/oapicf/pinterest-sdk/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// AdAccountAnalytics - Get ad account analytics
	e.GET("/v5/ad_accounts/:ad_account_id/analytics", c.AdAccountAnalytics)

	// AdAccountTargetingAnalyticsGet - Get targeting analytics for an ad account
	e.GET("/v5/ad_accounts/:ad_account_id/targeting_analytics", c.AdAccountTargetingAnalyticsGet)

	// AdAccountsCreate - Create ad account
	e.POST("/v5/ad_accounts", c.AdAccountsCreate)

	// AdAccountsGet - Get ad account
	e.GET("/v5/ad_accounts/:ad_account_id", c.AdAccountsGet)

	// AdAccountsList - List ad accounts
	e.GET("/v5/ad_accounts", c.AdAccountsList)

	// AnalyticsCreateMmmReport - Create a request for a Marketing Mix Modeling (MMM) report
	e.POST("/v5/ad_accounts/:ad_account_id/mmm_reports", c.AnalyticsCreateMmmReport)

	// AnalyticsCreateReport - Create async request for an account analytics report
	e.POST("/v5/ad_accounts/:ad_account_id/reports", c.AnalyticsCreateReport)

	// AnalyticsCreateTemplateReport - Create async request for an analytics report using a template
	e.POST("/v5/ad_accounts/:ad_account_id/templates/:template_id/reports", c.AnalyticsCreateTemplateReport)

	// AnalyticsGetMmmReport - Get advertiser Marketing Mix Modeling (MMM) report.
	e.GET("/v5/ad_accounts/:ad_account_id/mmm_reports", c.AnalyticsGetMmmReport)

	// AnalyticsGetReport - Get the account analytics report created by the async call
	e.GET("/v5/ad_accounts/:ad_account_id/reports", c.AnalyticsGetReport)

	// SandboxDelete - Delete ads data for ad account in API Sandbox
	e.DELETE("/v5/ad_accounts/:ad_account_id/sandbox", c.SandboxDelete)

	// TemplatesList - List templates
	e.GET("/v5/ad_accounts/:ad_account_id/templates", c.TemplatesList)

	// AdGroupsAnalytics - Get ad group analytics
	e.GET("/v5/ad_accounts/:ad_account_id/ad_groups/analytics", c.AdGroupsAnalytics)

	// AdGroupsAudienceSizing - Get audience sizing
	e.GET("/v5/ad_accounts/:ad_account_id/ad_groups/audience_sizing", c.AdGroupsAudienceSizing)

	// AdGroupsBidFloorGet - Get bid floors
	e.POST("/v5/ad_accounts/:ad_account_id/bid_floor", c.AdGroupsBidFloorGet)

	// AdGroupsCreate - Create ad groups
	e.POST("/v5/ad_accounts/:ad_account_id/ad_groups", c.AdGroupsCreate)

	// AdGroupsGet - Get ad group
	e.GET("/v5/ad_accounts/:ad_account_id/ad_groups/:ad_group_id", c.AdGroupsGet)

	// AdGroupsList - List ad groups
	e.GET("/v5/ad_accounts/:ad_account_id/ad_groups", c.AdGroupsList)

	// AdGroupsTargetingAnalyticsGet - Get targeting analytics for ad groups
	e.GET("/v5/ad_accounts/:ad_account_id/ad_groups/targeting_analytics", c.AdGroupsTargetingAnalyticsGet)

	// AdGroupsUpdate - Update ad groups
	e.PATCH("/v5/ad_accounts/:ad_account_id/ad_groups", c.AdGroupsUpdate)

	// AdPreviewsCreate - Create ad preview with pin or image
	e.POST("/v5/ad_accounts/:ad_account_id/ad_previews", c.AdPreviewsCreate)

	// AdTargetingAnalyticsGet - Get targeting analytics for ads
	e.GET("/v5/ad_accounts/:ad_account_id/ads/targeting_analytics", c.AdTargetingAnalyticsGet)

	// AdsAnalytics - Get ad analytics
	e.GET("/v5/ad_accounts/:ad_account_id/ads/analytics", c.AdsAnalytics)

	// AdsCreate - Create ads
	e.POST("/v5/ad_accounts/:ad_account_id/ads", c.AdsCreate)

	// AdsGet - Get ad
	e.GET("/v5/ad_accounts/:ad_account_id/ads/:ad_id", c.AdsGet)

	// AdsList - List ads
	e.GET("/v5/ad_accounts/:ad_account_id/ads", c.AdsList)

	// AdsUpdate - Update ads
	e.PATCH("/v5/ad_accounts/:ad_account_id/ads", c.AdsUpdate)

	// AudienceInsightsGet - Get audience insights
	e.GET("/v5/ad_accounts/:ad_account_id/audience_insights", c.AudienceInsightsGet)

	// AudienceInsightsScopeAndTypeGet - Get audience insights scope and type
	e.GET("/v5/ad_accounts/:ad_account_id/insights/audiences", c.AudienceInsightsScopeAndTypeGet)

	// AudiencesCreate - Create audience
	e.POST("/v5/ad_accounts/:ad_account_id/audiences", c.AudiencesCreate)

	// AudiencesCreateCustom - Create custom audience
	e.POST("/v5/ad_accounts/:ad_account_id/audiences/custom", c.AudiencesCreateCustom)

	// AudiencesGet - Get audience
	e.GET("/v5/ad_accounts/:ad_account_id/audiences/:audience_id", c.AudiencesGet)

	// AudiencesList - List audiences
	e.GET("/v5/ad_accounts/:ad_account_id/audiences", c.AudiencesList)

	// AudiencesUpdate - Update audience
	e.PATCH("/v5/ad_accounts/:ad_account_id/audiences/:audience_id", c.AudiencesUpdate)

	// AdsCreditRedeem - Redeem ad credits
	e.POST("/v5/ad_accounts/:ad_account_id/ads_credit/redeem", c.AdsCreditRedeem)

	// AdsCreditsDiscountsGet - Get ads credit discounts
	e.GET("/v5/ad_accounts/:ad_account_id/ads_credit/discounts", c.AdsCreditsDiscountsGet)

	// BillingProfilesGet - Get billing profiles
	e.GET("/v5/ad_accounts/:ad_account_id/billing_profiles", c.BillingProfilesGet)

	// SsioAccountsGet - Get Salesforce account details including bill-to information.
	e.GET("/v5/ad_accounts/:ad_account_id/ssio/accounts", c.SsioAccountsGet)

	// SsioInsertionOrderCreate - Create insertion order through SSIO.
	e.POST("/v5/ad_accounts/:ad_account_id/ssio/insertion_orders", c.SsioInsertionOrderCreate)

	// SsioInsertionOrderEdit - Edit insertion order through SSIO.
	e.PATCH("/v5/ad_accounts/:ad_account_id/ssio/insertion_orders", c.SsioInsertionOrderEdit)

	// SsioInsertionOrdersStatusGetByAdAccount - Get insertion order status by ad account id.
	e.GET("/v5/ad_accounts/:ad_account_id/ssio/insertion_orders/status", c.SsioInsertionOrdersStatusGetByAdAccount)

	// SsioInsertionOrdersStatusGetByPinOrderId - Get insertion order status by pin order id.
	e.GET("/v5/ad_accounts/:ad_account_id/ssio/insertion_orders/:pin_order_id/status", c.SsioInsertionOrdersStatusGetByPinOrderId)

	// SsioOrderLinesGetByAdAccount - Get Salesforce order lines by ad account id.
	e.GET("/v5/ad_accounts/:ad_account_id/ssio/order_lines", c.SsioOrderLinesGetByAdAccount)

	// BoardSectionsCreate - Create board section
	e.POST("/v5/boards/:board_id/sections", c.BoardSectionsCreate)

	// BoardSectionsDelete - Delete board section
	e.DELETE("/v5/boards/:board_id/sections/:section_id", c.BoardSectionsDelete)

	// BoardSectionsList - List board sections
	e.GET("/v5/boards/:board_id/sections", c.BoardSectionsList)

	// BoardSectionsListPins - List Pins on board section
	e.GET("/v5/boards/:board_id/sections/:section_id/pins", c.BoardSectionsListPins)

	// BoardSectionsUpdate - Update board section
	e.PATCH("/v5/boards/:board_id/sections/:section_id", c.BoardSectionsUpdate)

	// BoardsCreate - Create board
	e.POST("/v5/boards", c.BoardsCreate)

	// BoardsDelete - Delete board
	e.DELETE("/v5/boards/:board_id", c.BoardsDelete)

	// BoardsGet - Get board
	e.GET("/v5/boards/:board_id", c.BoardsGet)

	// BoardsList - List boards
	e.GET("/v5/boards", c.BoardsList)

	// BoardsListPins - List Pins on board
	e.GET("/v5/boards/:board_id/pins", c.BoardsListPins)

	// BoardsUpdate - Update board
	e.PATCH("/v5/boards/:board_id", c.BoardsUpdate)

	// BulkDownloadCreate - Get advertiser entities in bulk
	e.POST("/v5/ad_accounts/:ad_account_id/bulk/download", c.BulkDownloadCreate)

	// BulkRequestGet - Download advertiser entities in bulk
	e.GET("/v5/ad_accounts/:ad_account_id/bulk/:bulk_request_id", c.BulkRequestGet)

	// BulkUpsertCreate - Create/update ad entities in bulk
	e.POST("/v5/ad_accounts/:ad_account_id/bulk/upsert", c.BulkUpsertCreate)

	// CampaignTargetingAnalyticsGet - Get targeting analytics for campaigns
	e.GET("/v5/ad_accounts/:ad_account_id/campaigns/targeting_analytics", c.CampaignTargetingAnalyticsGet)

	// CampaignsAnalytics - Get campaign analytics
	e.GET("/v5/ad_accounts/:ad_account_id/campaigns/analytics", c.CampaignsAnalytics)

	// CampaignsCreate - Create campaigns
	e.POST("/v5/ad_accounts/:ad_account_id/campaigns", c.CampaignsCreate)

	// CampaignsGet - Get campaign
	e.GET("/v5/ad_accounts/:ad_account_id/campaigns/:campaign_id", c.CampaignsGet)

	// CampaignsList - List campaigns
	e.GET("/v5/ad_accounts/:ad_account_id/campaigns", c.CampaignsList)

	// CampaignsUpdate - Update campaigns
	e.PATCH("/v5/ad_accounts/:ad_account_id/campaigns", c.CampaignsUpdate)

	// CatalogsList - List catalogs
	e.GET("/v5/catalogs", c.CatalogsList)

	// CatalogsProductGroupPinsList - List products for a Product Group
	e.GET("/v5/catalogs/product_groups/:product_group_id/products", c.CatalogsProductGroupPinsList)

	// CatalogsProductGroupsCreate - Create product group
	e.POST("/v5/catalogs/product_groups", c.CatalogsProductGroupsCreate)

	// CatalogsProductGroupsDelete - Delete product group
	e.DELETE("/v5/catalogs/product_groups/:product_group_id", c.CatalogsProductGroupsDelete)

	// CatalogsProductGroupsGet - Get product group
	e.GET("/v5/catalogs/product_groups/:product_group_id", c.CatalogsProductGroupsGet)

	// CatalogsProductGroupsList - List product groups
	e.GET("/v5/catalogs/product_groups", c.CatalogsProductGroupsList)

	// CatalogsProductGroupsProductCountsGet - Get product counts for a Product Group
	e.GET("/v5/catalogs/product_groups/:product_group_id/product_counts", c.CatalogsProductGroupsProductCountsGet)

	// CatalogsProductGroupsUpdate - Update product group
	e.PATCH("/v5/catalogs/product_groups/:product_group_id", c.CatalogsProductGroupsUpdate)

	// FeedProcessingResultsList - List processing results for a given feed
	e.GET("/v5/catalogs/feeds/:feed_id/processing_results", c.FeedProcessingResultsList)

	// FeedsCreate - Create feed
	e.POST("/v5/catalogs/feeds", c.FeedsCreate)

	// FeedsDelete - Delete feed
	e.DELETE("/v5/catalogs/feeds/:feed_id", c.FeedsDelete)

	// FeedsGet - Get feed
	e.GET("/v5/catalogs/feeds/:feed_id", c.FeedsGet)

	// FeedsList - List feeds
	e.GET("/v5/catalogs/feeds", c.FeedsList)

	// FeedsUpdate - Update feed
	e.PATCH("/v5/catalogs/feeds/:feed_id", c.FeedsUpdate)

	// ItemsBatchGet - Get catalogs item batch status
	e.GET("/v5/catalogs/items/batch/:batch_id", c.ItemsBatchGet)

	// ItemsBatchPost - Operate on item batch
	e.POST("/v5/catalogs/items/batch", c.ItemsBatchPost)

	// ItemsGet - Get catalogs items
	e.GET("/v5/catalogs/items", c.ItemsGet)

	// ItemsIssuesList - List item issues for a given processing result
	e.GET("/v5/catalogs/processing_results/:processing_result_id/item_issues", c.ItemsIssuesList)

	// ProductsByProductGroupFilterList - List filtered products
	e.POST("/v5/catalogs/products/get_by_product_group_filters", c.ProductsByProductGroupFilterList)

	// EventsCreate - Send conversions
	e.POST("/v5/ad_accounts/:ad_account_id/events", c.EventsCreate)

	// ConversionTagsCreate - Create conversion tag
	e.POST("/v5/ad_accounts/:ad_account_id/conversion_tags", c.ConversionTagsCreate)

	// ConversionTagsGet - Get conversion tag
	e.GET("/v5/ad_accounts/:ad_account_id/conversion_tags/:conversion_tag_id", c.ConversionTagsGet)

	// ConversionTagsList - Get conversion tags
	e.GET("/v5/ad_accounts/:ad_account_id/conversion_tags", c.ConversionTagsList)

	// OcpmEligibleConversionTagsGet - Get Ocpm eligible conversion tags
	e.GET("/v5/ad_accounts/:ad_account_id/conversion_tags/ocpm_eligible", c.OcpmEligibleConversionTagsGet)

	// PageVisitConversionTagsGet - Get page visit conversion tags
	e.GET("/v5/ad_accounts/:ad_account_id/conversion_tags/page_visit", c.PageVisitConversionTagsGet)

	// CustomerListsCreate - Create customer lists
	e.POST("/v5/ad_accounts/:ad_account_id/customer_lists", c.CustomerListsCreate)

	// CustomerListsGet - Get customer list
	e.GET("/v5/ad_accounts/:ad_account_id/customer_lists/:customer_list_id", c.CustomerListsGet)

	// CustomerListsList - Get customer lists
	e.GET("/v5/ad_accounts/:ad_account_id/customer_lists", c.CustomerListsList)

	// CustomerListsUpdate - Update customer list
	e.PATCH("/v5/ad_accounts/:ad_account_id/customer_lists/:customer_list_id", c.CustomerListsUpdate)

	// IntegrationsCommerceDel - Delete commerce integration
	e.DELETE("/v5/integrations/commerce/:external_business_id", c.IntegrationsCommerceDel)

	// IntegrationsCommerceGet - Get commerce integration
	e.GET("/v5/integrations/commerce/:external_business_id", c.IntegrationsCommerceGet)

	// IntegrationsCommercePatch - Update commerce integration
	e.PATCH("/v5/integrations/commerce/:external_business_id", c.IntegrationsCommercePatch)

	// IntegrationsCommercePost - Create commerce integration
	e.POST("/v5/integrations/commerce", c.IntegrationsCommercePost)

	// IntegrationsGetById - Get integration metadata
	e.GET("/v5/integrations/:id", c.IntegrationsGetById)

	// IntegrationsGetList - Get integration metadata list
	e.GET("/v5/integrations", c.IntegrationsGetList)

	// IntegrationsLogsPost - Receives batched logs from integration applications.
	e.POST("/v5/integrations/logs", c.IntegrationsLogsPost)

	// CountryKeywordsMetricsGet - Get country's keyword metrics
	e.GET("/v5/ad_accounts/:ad_account_id/keywords/metrics", c.CountryKeywordsMetricsGet)

	// KeywordsCreate - Create keywords
	e.POST("/v5/ad_accounts/:ad_account_id/keywords", c.KeywordsCreate)

	// KeywordsGet - Get keywords
	e.GET("/v5/ad_accounts/:ad_account_id/keywords", c.KeywordsGet)

	// KeywordsUpdate - Update keywords
	e.PATCH("/v5/ad_accounts/:ad_account_id/keywords", c.KeywordsUpdate)

	// TrendingKeywordsList - List trending keywords
	e.GET("/v5/trends/keywords/:region/top/:trend_type", c.TrendingKeywordsList)

	// AdAccountsSubscriptionsDelById - Delete lead ads subscription
	e.DELETE("/v5/ad_accounts/:ad_account_id/leads/subscriptions/:subscription_id", c.AdAccountsSubscriptionsDelById)

	// AdAccountsSubscriptionsGetById - Get lead ads subscription
	e.GET("/v5/ad_accounts/:ad_account_id/leads/subscriptions/:subscription_id", c.AdAccountsSubscriptionsGetById)

	// AdAccountsSubscriptionsGetList - Get lead ads subscriptions
	e.GET("/v5/ad_accounts/:ad_account_id/leads/subscriptions", c.AdAccountsSubscriptionsGetList)

	// AdAccountsSubscriptionsPost - Create lead ads subscription
	e.POST("/v5/ad_accounts/:ad_account_id/leads/subscriptions", c.AdAccountsSubscriptionsPost)

	// LeadFormGet - Get lead form by id
	e.GET("/v5/ad_accounts/:ad_account_id/lead_forms/:lead_form_id", c.LeadFormGet)

	// LeadFormTestCreate - Create lead form test data
	e.POST("/v5/ad_accounts/:ad_account_id/lead_forms/:lead_form_id/test", c.LeadFormTestCreate)

	// LeadFormsList - Get lead forms
	e.GET("/v5/ad_accounts/:ad_account_id/lead_forms", c.LeadFormsList)

	// MediaCreate - Register media upload
	e.POST("/v5/media", c.MediaCreate)

	// MediaGet - Get media upload details
	e.GET("/v5/media/:media_id", c.MediaGet)

	// MediaList - List media uploads
	e.GET("/v5/media", c.MediaList)

	// OauthToken - Generate OAuth access token
	e.POST("/v5/oauth/token", c.OauthToken)

	// OrderLinesGet - Get order line
	e.GET("/v5/ad_accounts/:ad_account_id/order_lines/:order_line_id", c.OrderLinesGet)

	// OrderLinesList - Get order lines
	e.GET("/v5/ad_accounts/:ad_account_id/order_lines", c.OrderLinesList)

	// PinsAnalytics - Get Pin analytics
	e.GET("/v5/pins/:pin_id/analytics", c.PinsAnalytics)

	// PinsCreate - Create Pin
	e.POST("/v5/pins", c.PinsCreate)

	// PinsDelete - Delete Pin
	e.DELETE("/v5/pins/:pin_id", c.PinsDelete)

	// PinsGet - Get Pin
	e.GET("/v5/pins/:pin_id", c.PinsGet)

	// PinsList - List Pins
	e.GET("/v5/pins", c.PinsList)

	// PinsSave - Save Pin
	e.POST("/v5/pins/:pin_id/save", c.PinsSave)

	// PinsUpdate - Update Pin
	e.PATCH("/v5/pins/:pin_id", c.PinsUpdate)

	// ProductGroupPromotionsCreate - Create product group promotions
	e.POST("/v5/ad_accounts/:ad_account_id/product_group_promotions", c.ProductGroupPromotionsCreate)

	// ProductGroupPromotionsGet - Get a product group promotion by id
	e.GET("/v5/ad_accounts/:ad_account_id/product_group_promotions/:product_group_promotion_id", c.ProductGroupPromotionsGet)

	// ProductGroupPromotionsList - Get product group promotions
	e.GET("/v5/ad_accounts/:ad_account_id/product_group_promotions", c.ProductGroupPromotionsList)

	// ProductGroupPromotionsUpdate - Update product group promotions
	e.PATCH("/v5/ad_accounts/:ad_account_id/product_group_promotions", c.ProductGroupPromotionsUpdate)

	// ProductGroupsAnalytics - Get product group analytics
	e.GET("/v5/ad_accounts/:ad_account_id/product_groups/analytics", c.ProductGroupsAnalytics)

	// AdAccountsCatalogsProductGroupsList - Get catalog product groups (deprecated)
	e.GET("/v5/ad_accounts/:ad_account_id/product_groups/catalogs", c.AdAccountsCatalogsProductGroupsList)

	// AdAccountCountriesGet - Get ad accounts countries
	e.GET("/v5/resources/ad_account_countries", c.AdAccountCountriesGet)

	// DeliveryMetricsGet - Get available metrics' definitions
	e.GET("/v5/resources/delivery_metrics", c.DeliveryMetricsGet)

	// InterestTargetingOptionsGet - Get interest details
	e.GET("/v5/resources/targeting/interests/:interest_id", c.InterestTargetingOptionsGet)

	// LeadFormQuestionsGet - Get lead form questions
	e.GET("/v5/resources/lead_form_questions", c.LeadFormQuestionsGet)

	// MetricsReadyStateGet - Get metrics ready state
	e.GET("/v5/resources/metrics_ready_state", c.MetricsReadyStateGet)

	// TargetingOptionsGet - Get targeting options
	e.GET("/v5/resources/targeting/:targeting_type", c.TargetingOptionsGet)

	// SearchPartnerPins - Search pins by a given search term
	e.GET("/v5/search/partner/pins", c.SearchPartnerPins)

	// SearchUserBoardsGet - Search user's boards
	e.GET("/v5/search/boards", c.SearchUserBoardsGet)

	// SearchUserPinsList - Search user's Pins
	e.GET("/v5/search/pins", c.SearchUserPinsList)

	// TermsRelatedList - List related terms
	e.GET("/v5/terms/related", c.TermsRelatedList)

	// TermsSuggestedList - List suggested terms
	e.GET("/v5/terms/suggested", c.TermsSuggestedList)

	// TermsOfServiceGet - Get terms of service
	e.GET("/v5/ad_accounts/:ad_account_id/terms_of_service", c.TermsOfServiceGet)

	// BoardsUserFollowsList - List following boards
	e.GET("/v5/user_account/following/boards", c.BoardsUserFollowsList)

	// FollowUserUpdate - Follow user
	e.POST("/v5/user_account/following/:username", c.FollowUserUpdate)

	// FollowersList - List followers
	e.GET("/v5/user_account/followers", c.FollowersList)

	// LinkedBusinessAccountsGet - List linked businesses
	e.GET("/v5/user_account/businesses", c.LinkedBusinessAccountsGet)

	// UnverifyWebsiteDelete - Unverify website
	e.DELETE("/v5/user_account/websites", c.UnverifyWebsiteDelete)

	// UserAccountAnalytics - Get user account analytics
	e.GET("/v5/user_account/analytics", c.UserAccountAnalytics)

	// UserAccountAnalyticsTopPins - Get user account top pins analytics
	e.GET("/v5/user_account/analytics/top_pins", c.UserAccountAnalyticsTopPins)

	// UserAccountAnalyticsTopVideoPins - Get user account top video pins analytics
	e.GET("/v5/user_account/analytics/top_video_pins", c.UserAccountAnalyticsTopVideoPins)

	// UserAccountFollowedInterests - List following interests
	e.GET("/v5/users/:username/interests/follow", c.UserAccountFollowedInterests)

	// UserAccountGet - Get user account
	e.GET("/v5/user_account", c.UserAccountGet)

	// UserFollowingGet - List following
	e.GET("/v5/user_account/following", c.UserFollowingGet)

	// UserWebsitesGet - Get user websites
	e.GET("/v5/user_account/websites", c.UserWebsitesGet)

	// VerifyWebsiteUpdate - Verify website
	e.POST("/v5/user_account/websites", c.VerifyWebsiteUpdate)

	// WebsiteVerificationGet - Get user verification code for website claiming
	e.GET("/v5/user_account/websites/verification", c.WebsiteVerificationGet)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
