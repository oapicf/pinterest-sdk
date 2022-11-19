import typing_extensions

from pinterestsdk.paths import PathValues
from pinterestsdk.apis.paths.oauth_token import OauthToken
from pinterestsdk.apis.paths.user_account import UserAccount
from pinterestsdk.apis.paths.user_account_analytics import UserAccountAnalytics
from pinterestsdk.apis.paths.user_account_analytics_top_pins import UserAccountAnalyticsTopPins
from pinterestsdk.apis.paths.user_account_analytics_top_video_pins import UserAccountAnalyticsTopVideoPins
from pinterestsdk.apis.paths.pins import Pins
from pinterestsdk.apis.paths.pins_pin_id import PinsPinId
from pinterestsdk.apis.paths.pins_pin_id_save import PinsPinIdSave
from pinterestsdk.apis.paths.pins_pin_id_analytics import PinsPinIdAnalytics
from pinterestsdk.apis.paths.boards import Boards
from pinterestsdk.apis.paths.boards_board_id import BoardsBoardId
from pinterestsdk.apis.paths.boards_board_id_sections import BoardsBoardIdSections
from pinterestsdk.apis.paths.boards_board_id_sections_section_id import BoardsBoardIdSectionsSectionId
from pinterestsdk.apis.paths.boards_board_id_sections_section_id_pins import BoardsBoardIdSectionsSectionIdPins
from pinterestsdk.apis.paths.boards_board_id_pins import BoardsBoardIdPins
from pinterestsdk.apis.paths.media import Media
from pinterestsdk.apis.paths.media_media_id import MediaMediaId
from pinterestsdk.apis.paths.ad_accounts import AdAccounts
from pinterestsdk.apis.paths.ad_accounts_ad_account_id import AdAccountsAdAccountId
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_analytics import AdAccountsAdAccountIdAnalytics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ads_targeting_analytics import AdAccountsAdAccountIdAdsTargetingAnalytics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_campaigns import AdAccountsAdAccountIdCampaigns
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_campaigns_campaign_id import AdAccountsAdAccountIdCampaignsCampaignId
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_campaigns_analytics import AdAccountsAdAccountIdCampaignsAnalytics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_campaigns_targeting_analytics import AdAccountsAdAccountIdCampaignsTargetingAnalytics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ad_groups_targeting_analytics import AdAccountsAdAccountIdAdGroupsTargetingAnalytics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ad_groups import AdAccountsAdAccountIdAdGroups
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ad_groups_ad_group_id import AdAccountsAdAccountIdAdGroupsAdGroupId
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ad_groups_analytics import AdAccountsAdAccountIdAdGroupsAnalytics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ads import AdAccountsAdAccountIdAds
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ads_ad_id import AdAccountsAdAccountIdAdsAdId
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ads_analytics import AdAccountsAdAccountIdAdsAnalytics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_ad_previews import AdAccountsAdAccountIdAdPreviews
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_bid_floor import AdAccountsAdAccountIdBidFloor
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_events import AdAccountsAdAccountIdEvents
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_product_groups_analytics import AdAccountsAdAccountIdProductGroupsAnalytics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_reports import AdAccountsAdAccountIdReports
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_audiences import AdAccountsAdAccountIdAudiences
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_audiences_audience_id import AdAccountsAdAccountIdAudiencesAudienceId
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_customer_lists import AdAccountsAdAccountIdCustomerLists
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_customer_lists_customer_list_id import AdAccountsAdAccountIdCustomerListsCustomerListId
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_keywords import AdAccountsAdAccountIdKeywords
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_keywords_metrics import AdAccountsAdAccountIdKeywordsMetrics
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_product_group_promotions import AdAccountsAdAccountIdProductGroupPromotions
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_product_group_promotions_product_group_promotion_id import AdAccountsAdAccountIdProductGroupPromotionsProductGroupPromotionId
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_targeting_analytics import AdAccountsAdAccountIdTargetingAnalytics
from pinterestsdk.apis.paths.terms_suggested import TermsSuggested
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_terms_of_service import AdAccountsAdAccountIdTermsOfService
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_bulk_download import AdAccountsAdAccountIdBulkDownload
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_bulk_upsert import AdAccountsAdAccountIdBulkUpsert
from pinterestsdk.apis.paths.ad_accounts_ad_account_id_bulk_bulk_request_id import AdAccountsAdAccountIdBulkBulkRequestId
from pinterestsdk.apis.paths.catalogs_feeds import CatalogsFeeds
from pinterestsdk.apis.paths.catalogs_feeds_feed_id import CatalogsFeedsFeedId
from pinterestsdk.apis.paths.catalogs_feeds_feed_id_processing_results import CatalogsFeedsFeedIdProcessingResults
from pinterestsdk.apis.paths.catalogs_processing_results_processing_result_id_item_issues import CatalogsProcessingResultsProcessingResultIdItemIssues
from pinterestsdk.apis.paths.catalogs_items import CatalogsItems
from pinterestsdk.apis.paths.catalogs_items_batch_batch_id import CatalogsItemsBatchBatchId
from pinterestsdk.apis.paths.catalogs_items_batch import CatalogsItemsBatch
from pinterestsdk.apis.paths.catalogs_products_get_by_product_group_filters import CatalogsProductsGetByProductGroupFilters
from pinterestsdk.apis.paths.catalogs_product_groups_product_group_id import CatalogsProductGroupsProductGroupId
from pinterestsdk.apis.paths.catalogs_product_groups_product_group_id_products import CatalogsProductGroupsProductGroupIdProducts
from pinterestsdk.apis.paths.catalogs_product_groups_product_group_id_product_counts import CatalogsProductGroupsProductGroupIdProductCounts
from pinterestsdk.apis.paths.catalogs_product_groups import CatalogsProductGroups
from pinterestsdk.apis.paths.resources_ad_account_countries import ResourcesAdAccountCountries
from pinterestsdk.apis.paths.resources_delivery_metrics import ResourcesDeliveryMetrics
from pinterestsdk.apis.paths.resources_metrics_ready_state import ResourcesMetricsReadyState
from pinterestsdk.apis.paths.resources_targeting_interests_interest_id import ResourcesTargetingInterestsInterestId
from pinterestsdk.apis.paths.resources_targeting_targeting_type import ResourcesTargetingTargetingType
from pinterestsdk.apis.paths.terms_related import TermsRelated

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.OAUTH_TOKEN: OauthToken,
        PathValues.USER_ACCOUNT: UserAccount,
        PathValues.USER_ACCOUNT_ANALYTICS: UserAccountAnalytics,
        PathValues.USER_ACCOUNT_ANALYTICS_TOP_PINS: UserAccountAnalyticsTopPins,
        PathValues.USER_ACCOUNT_ANALYTICS_TOP_VIDEO_PINS: UserAccountAnalyticsTopVideoPins,
        PathValues.PINS: Pins,
        PathValues.PINS_PIN_ID: PinsPinId,
        PathValues.PINS_PIN_ID_SAVE: PinsPinIdSave,
        PathValues.PINS_PIN_ID_ANALYTICS: PinsPinIdAnalytics,
        PathValues.BOARDS: Boards,
        PathValues.BOARDS_BOARD_ID: BoardsBoardId,
        PathValues.BOARDS_BOARD_ID_SECTIONS: BoardsBoardIdSections,
        PathValues.BOARDS_BOARD_ID_SECTIONS_SECTION_ID: BoardsBoardIdSectionsSectionId,
        PathValues.BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS: BoardsBoardIdSectionsSectionIdPins,
        PathValues.BOARDS_BOARD_ID_PINS: BoardsBoardIdPins,
        PathValues.MEDIA: Media,
        PathValues.MEDIA_MEDIA_ID: MediaMediaId,
        PathValues.AD_ACCOUNTS: AdAccounts,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID: AdAccountsAdAccountId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS: AdAccountsAdAccountIdAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_TARGETING_ANALYTICS: AdAccountsAdAccountIdAdsTargetingAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS: AdAccountsAdAccountIdCampaigns,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_CAMPAIGN_ID: AdAccountsAdAccountIdCampaignsCampaignId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS: AdAccountsAdAccountIdCampaignsAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_TARGETING_ANALYTICS: AdAccountsAdAccountIdCampaignsTargetingAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_TARGETING_ANALYTICS: AdAccountsAdAccountIdAdGroupsTargetingAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS: AdAccountsAdAccountIdAdGroups,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_AD_GROUP_ID: AdAccountsAdAccountIdAdGroupsAdGroupId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS: AdAccountsAdAccountIdAdGroupsAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ADS: AdAccountsAdAccountIdAds,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_AD_ID: AdAccountsAdAccountIdAdsAdId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS: AdAccountsAdAccountIdAdsAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_PREVIEWS: AdAccountsAdAccountIdAdPreviews,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_BID_FLOOR: AdAccountsAdAccountIdBidFloor,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_EVENTS: AdAccountsAdAccountIdEvents,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS: AdAccountsAdAccountIdProductGroupsAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS: AdAccountsAdAccountIdReports,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AUDIENCES: AdAccountsAdAccountIdAudiences,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AUDIENCES_AUDIENCE_ID: AdAccountsAdAccountIdAudiencesAudienceId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CUSTOMER_LISTS: AdAccountsAdAccountIdCustomerLists,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CUSTOMER_LISTS_CUSTOMER_LIST_ID: AdAccountsAdAccountIdCustomerListsCustomerListId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_KEYWORDS: AdAccountsAdAccountIdKeywords,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_KEYWORDS_METRICS: AdAccountsAdAccountIdKeywordsMetrics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUP_PROMOTIONS: AdAccountsAdAccountIdProductGroupPromotions,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUP_PROMOTIONS_PRODUCT_GROUP_PROMOTION_ID: AdAccountsAdAccountIdProductGroupPromotionsProductGroupPromotionId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_TARGETING_ANALYTICS: AdAccountsAdAccountIdTargetingAnalytics,
        PathValues.TERMS_SUGGESTED: TermsSuggested,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_TERMS_OF_SERVICE: AdAccountsAdAccountIdTermsOfService,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_BULK_DOWNLOAD: AdAccountsAdAccountIdBulkDownload,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_BULK_UPSERT: AdAccountsAdAccountIdBulkUpsert,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_BULK_BULK_REQUEST_ID: AdAccountsAdAccountIdBulkBulkRequestId,
        PathValues.CATALOGS_FEEDS: CatalogsFeeds,
        PathValues.CATALOGS_FEEDS_FEED_ID: CatalogsFeedsFeedId,
        PathValues.CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS: CatalogsFeedsFeedIdProcessingResults,
        PathValues.CATALOGS_PROCESSING_RESULTS_PROCESSING_RESULT_ID_ITEM_ISSUES: CatalogsProcessingResultsProcessingResultIdItemIssues,
        PathValues.CATALOGS_ITEMS: CatalogsItems,
        PathValues.CATALOGS_ITEMS_BATCH_BATCH_ID: CatalogsItemsBatchBatchId,
        PathValues.CATALOGS_ITEMS_BATCH: CatalogsItemsBatch,
        PathValues.CATALOGS_PRODUCTS_GET_BY_PRODUCT_GROUP_FILTERS: CatalogsProductsGetByProductGroupFilters,
        PathValues.CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID: CatalogsProductGroupsProductGroupId,
        PathValues.CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID_PRODUCTS: CatalogsProductGroupsProductGroupIdProducts,
        PathValues.CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID_PRODUCT_COUNTS: CatalogsProductGroupsProductGroupIdProductCounts,
        PathValues.CATALOGS_PRODUCT_GROUPS: CatalogsProductGroups,
        PathValues.RESOURCES_AD_ACCOUNT_COUNTRIES: ResourcesAdAccountCountries,
        PathValues.RESOURCES_DELIVERY_METRICS: ResourcesDeliveryMetrics,
        PathValues.RESOURCES_METRICS_READY_STATE: ResourcesMetricsReadyState,
        PathValues.RESOURCES_TARGETING_INTERESTS_INTEREST_ID: ResourcesTargetingInterestsInterestId,
        PathValues.RESOURCES_TARGETING_TARGETING_TYPE: ResourcesTargetingTargetingType,
        PathValues.TERMS_RELATED: TermsRelated,
    }
)

path_to_api = PathToApi(
    {
        PathValues.OAUTH_TOKEN: OauthToken,
        PathValues.USER_ACCOUNT: UserAccount,
        PathValues.USER_ACCOUNT_ANALYTICS: UserAccountAnalytics,
        PathValues.USER_ACCOUNT_ANALYTICS_TOP_PINS: UserAccountAnalyticsTopPins,
        PathValues.USER_ACCOUNT_ANALYTICS_TOP_VIDEO_PINS: UserAccountAnalyticsTopVideoPins,
        PathValues.PINS: Pins,
        PathValues.PINS_PIN_ID: PinsPinId,
        PathValues.PINS_PIN_ID_SAVE: PinsPinIdSave,
        PathValues.PINS_PIN_ID_ANALYTICS: PinsPinIdAnalytics,
        PathValues.BOARDS: Boards,
        PathValues.BOARDS_BOARD_ID: BoardsBoardId,
        PathValues.BOARDS_BOARD_ID_SECTIONS: BoardsBoardIdSections,
        PathValues.BOARDS_BOARD_ID_SECTIONS_SECTION_ID: BoardsBoardIdSectionsSectionId,
        PathValues.BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS: BoardsBoardIdSectionsSectionIdPins,
        PathValues.BOARDS_BOARD_ID_PINS: BoardsBoardIdPins,
        PathValues.MEDIA: Media,
        PathValues.MEDIA_MEDIA_ID: MediaMediaId,
        PathValues.AD_ACCOUNTS: AdAccounts,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID: AdAccountsAdAccountId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS: AdAccountsAdAccountIdAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_TARGETING_ANALYTICS: AdAccountsAdAccountIdAdsTargetingAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS: AdAccountsAdAccountIdCampaigns,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_CAMPAIGN_ID: AdAccountsAdAccountIdCampaignsCampaignId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS: AdAccountsAdAccountIdCampaignsAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_TARGETING_ANALYTICS: AdAccountsAdAccountIdCampaignsTargetingAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_TARGETING_ANALYTICS: AdAccountsAdAccountIdAdGroupsTargetingAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS: AdAccountsAdAccountIdAdGroups,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_AD_GROUP_ID: AdAccountsAdAccountIdAdGroupsAdGroupId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS: AdAccountsAdAccountIdAdGroupsAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ADS: AdAccountsAdAccountIdAds,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_AD_ID: AdAccountsAdAccountIdAdsAdId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS: AdAccountsAdAccountIdAdsAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AD_PREVIEWS: AdAccountsAdAccountIdAdPreviews,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_BID_FLOOR: AdAccountsAdAccountIdBidFloor,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_EVENTS: AdAccountsAdAccountIdEvents,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS: AdAccountsAdAccountIdProductGroupsAnalytics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS: AdAccountsAdAccountIdReports,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AUDIENCES: AdAccountsAdAccountIdAudiences,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_AUDIENCES_AUDIENCE_ID: AdAccountsAdAccountIdAudiencesAudienceId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CUSTOMER_LISTS: AdAccountsAdAccountIdCustomerLists,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_CUSTOMER_LISTS_CUSTOMER_LIST_ID: AdAccountsAdAccountIdCustomerListsCustomerListId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_KEYWORDS: AdAccountsAdAccountIdKeywords,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_KEYWORDS_METRICS: AdAccountsAdAccountIdKeywordsMetrics,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUP_PROMOTIONS: AdAccountsAdAccountIdProductGroupPromotions,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUP_PROMOTIONS_PRODUCT_GROUP_PROMOTION_ID: AdAccountsAdAccountIdProductGroupPromotionsProductGroupPromotionId,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_TARGETING_ANALYTICS: AdAccountsAdAccountIdTargetingAnalytics,
        PathValues.TERMS_SUGGESTED: TermsSuggested,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_TERMS_OF_SERVICE: AdAccountsAdAccountIdTermsOfService,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_BULK_DOWNLOAD: AdAccountsAdAccountIdBulkDownload,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_BULK_UPSERT: AdAccountsAdAccountIdBulkUpsert,
        PathValues.AD_ACCOUNTS_AD_ACCOUNT_ID_BULK_BULK_REQUEST_ID: AdAccountsAdAccountIdBulkBulkRequestId,
        PathValues.CATALOGS_FEEDS: CatalogsFeeds,
        PathValues.CATALOGS_FEEDS_FEED_ID: CatalogsFeedsFeedId,
        PathValues.CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS: CatalogsFeedsFeedIdProcessingResults,
        PathValues.CATALOGS_PROCESSING_RESULTS_PROCESSING_RESULT_ID_ITEM_ISSUES: CatalogsProcessingResultsProcessingResultIdItemIssues,
        PathValues.CATALOGS_ITEMS: CatalogsItems,
        PathValues.CATALOGS_ITEMS_BATCH_BATCH_ID: CatalogsItemsBatchBatchId,
        PathValues.CATALOGS_ITEMS_BATCH: CatalogsItemsBatch,
        PathValues.CATALOGS_PRODUCTS_GET_BY_PRODUCT_GROUP_FILTERS: CatalogsProductsGetByProductGroupFilters,
        PathValues.CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID: CatalogsProductGroupsProductGroupId,
        PathValues.CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID_PRODUCTS: CatalogsProductGroupsProductGroupIdProducts,
        PathValues.CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID_PRODUCT_COUNTS: CatalogsProductGroupsProductGroupIdProductCounts,
        PathValues.CATALOGS_PRODUCT_GROUPS: CatalogsProductGroups,
        PathValues.RESOURCES_AD_ACCOUNT_COUNTRIES: ResourcesAdAccountCountries,
        PathValues.RESOURCES_DELIVERY_METRICS: ResourcesDeliveryMetrics,
        PathValues.RESOURCES_METRICS_READY_STATE: ResourcesMetricsReadyState,
        PathValues.RESOURCES_TARGETING_INTERESTS_INTEREST_ID: ResourcesTargetingInterestsInterestId,
        PathValues.RESOURCES_TARGETING_TARGETING_TYPE: ResourcesTargetingTargetingType,
        PathValues.TERMS_RELATED: TermsRelated,
    }
)
