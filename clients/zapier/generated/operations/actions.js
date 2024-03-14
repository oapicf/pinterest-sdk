const AdAccountsApi = require('../apis/AdAccountsApi');
const AdGroupsApi = require('../apis/AdGroupsApi');
const AdsApi = require('../apis/AdsApi');
const AudiencesApi = require('../apis/AudiencesApi');
const BoardsApi = require('../apis/BoardsApi');
const BulkApi = require('../apis/BulkApi');
const CampaignsApi = require('../apis/CampaignsApi');
const CatalogsApi = require('../apis/CatalogsApi');
const ConversionEventsApi = require('../apis/ConversionEventsApi');
const CustomerListsApi = require('../apis/CustomerListsApi');
const KeywordsApi = require('../apis/KeywordsApi');
const MediaApi = require('../apis/MediaApi');
const OauthApi = require('../apis/OauthApi');
const PinsApi = require('../apis/PinsApi');
const ProductGroupPromotionsApi = require('../apis/ProductGroupPromotionsApi');
const ResourcesApi = require('../apis/ResourcesApi');
const TermsApi = require('../apis/TermsApi');
const TermsOfServiceApi = require('../apis/TermsOfServiceApi');
const UserAccountApi = require('../apis/UserAccountApi');
const { searchMiddleware, hasSearchRequisites, isSearchAction } = require('../utils/utils');

const actions = {
    [AdAccountsApi.adAccount/analytics.key]: AdAccountsApi.adAccount/analytics,
    [AdAccountsApi.adAccountTargetingAnalytics/get.key]: AdAccountsApi.adAccountTargetingAnalytics/get,
    [AdAccountsApi.adAccounts/create.key]: AdAccountsApi.adAccounts/create,
    [AdAccountsApi.adAccounts/get.key]: AdAccountsApi.adAccounts/get,
    [AdAccountsApi.adAccounts/list.key]: AdAccountsApi.adAccounts/list,
    [AdAccountsApi.analytics/createReport.key]: AdAccountsApi.analytics/createReport,
    [AdAccountsApi.analytics/getReport.key]: AdAccountsApi.analytics/getReport,
    [AdGroupsApi.adGroups/analytics.key]: AdGroupsApi.adGroups/analytics,
    [AdGroupsApi.adGroups/create.key]: AdGroupsApi.adGroups/create,
    [AdGroupsApi.adGroups/get.key]: AdGroupsApi.adGroups/get,
    [AdGroupsApi.adGroups/list.key]: AdGroupsApi.adGroups/list,
    [AdGroupsApi.adGroups/update.key]: AdGroupsApi.adGroups/update,
    [AdGroupsApi.adGroupsBidFloor/get.key]: AdGroupsApi.adGroupsBidFloor/get,
    [AdGroupsApi.adGroupsTargetingAnalytics/get.key]: AdGroupsApi.adGroupsTargetingAnalytics/get,
    [AdsApi.adPreviews/create.key]: AdsApi.adPreviews/create,
    [AdsApi.adTargetingAnalytics/get.key]: AdsApi.adTargetingAnalytics/get,
    [AdsApi.ads/analytics.key]: AdsApi.ads/analytics,
    [AdsApi.ads/create.key]: AdsApi.ads/create,
    [AdsApi.ads/get.key]: AdsApi.ads/get,
    [AdsApi.ads/list.key]: AdsApi.ads/list,
    [AdsApi.ads/update.key]: AdsApi.ads/update,
    [AudiencesApi.audiences/create.key]: AudiencesApi.audiences/create,
    [AudiencesApi.audiences/get.key]: AudiencesApi.audiences/get,
    [AudiencesApi.audiences/list.key]: AudiencesApi.audiences/list,
    [AudiencesApi.audiences/update.key]: AudiencesApi.audiences/update,
    [BoardsApi.boardSections/create.key]: BoardsApi.boardSections/create,
    [BoardsApi.boardSections/delete.key]: BoardsApi.boardSections/delete,
    [BoardsApi.boardSections/list.key]: BoardsApi.boardSections/list,
    [BoardsApi.boardSections/listPins.key]: BoardsApi.boardSections/listPins,
    [BoardsApi.boardSections/update.key]: BoardsApi.boardSections/update,
    [BoardsApi.boards/create.key]: BoardsApi.boards/create,
    [BoardsApi.boards/delete.key]: BoardsApi.boards/delete,
    [BoardsApi.boards/get.key]: BoardsApi.boards/get,
    [BoardsApi.boards/list.key]: BoardsApi.boards/list,
    [BoardsApi.boards/listPins.key]: BoardsApi.boards/listPins,
    [BoardsApi.boards/update.key]: BoardsApi.boards/update,
    [BulkApi.bulkDownload/create.key]: BulkApi.bulkDownload/create,
    [BulkApi.bulkRequest/get.key]: BulkApi.bulkRequest/get,
    [BulkApi.bulkUpsert/create.key]: BulkApi.bulkUpsert/create,
    [CampaignsApi.campaignTargetingAnalytics/get.key]: CampaignsApi.campaignTargetingAnalytics/get,
    [CampaignsApi.campaigns/analytics.key]: CampaignsApi.campaigns/analytics,
    [CampaignsApi.campaigns/create.key]: CampaignsApi.campaigns/create,
    [CampaignsApi.campaigns/get.key]: CampaignsApi.campaigns/get,
    [CampaignsApi.campaigns/list.key]: CampaignsApi.campaigns/list,
    [CampaignsApi.campaigns/update.key]: CampaignsApi.campaigns/update,
    [CatalogsApi.catalogsProductGroupPins/list.key]: CatalogsApi.catalogsProductGroupPins/list,
    [CatalogsApi.catalogsProductGroups/create.key]: CatalogsApi.catalogsProductGroups/create,
    [CatalogsApi.catalogsProductGroups/delete.key]: CatalogsApi.catalogsProductGroups/delete,
    [CatalogsApi.catalogsProductGroups/get.key]: CatalogsApi.catalogsProductGroups/get,
    [CatalogsApi.catalogsProductGroups/list.key]: CatalogsApi.catalogsProductGroups/list,
    [CatalogsApi.catalogsProductGroups/productCountsGet.key]: CatalogsApi.catalogsProductGroups/productCountsGet,
    [CatalogsApi.catalogsProductGroups/update.key]: CatalogsApi.catalogsProductGroups/update,
    [CatalogsApi.feedProcessingResults/list.key]: CatalogsApi.feedProcessingResults/list,
    [CatalogsApi.feeds/create.key]: CatalogsApi.feeds/create,
    [CatalogsApi.feeds/delete.key]: CatalogsApi.feeds/delete,
    [CatalogsApi.feeds/get.key]: CatalogsApi.feeds/get,
    [CatalogsApi.feeds/list.key]: CatalogsApi.feeds/list,
    [CatalogsApi.feeds/update.key]: CatalogsApi.feeds/update,
    [CatalogsApi.items/get.key]: CatalogsApi.items/get,
    [CatalogsApi.itemsBatch/get.key]: CatalogsApi.itemsBatch/get,
    [CatalogsApi.itemsBatch/post.key]: CatalogsApi.itemsBatch/post,
    [CatalogsApi.itemsIssues/list.key]: CatalogsApi.itemsIssues/list,
    [CatalogsApi.productsByProductGroupFilter/list.key]: CatalogsApi.productsByProductGroupFilter/list,
    [ConversionEventsApi.events/create.key]: ConversionEventsApi.events/create,
    [CustomerListsApi.customerLists/create.key]: CustomerListsApi.customerLists/create,
    [CustomerListsApi.customerLists/get.key]: CustomerListsApi.customerLists/get,
    [CustomerListsApi.customerLists/list.key]: CustomerListsApi.customerLists/list,
    [CustomerListsApi.customerLists/update.key]: CustomerListsApi.customerLists/update,
    [KeywordsApi.countryKeywordsMetrics/get.key]: KeywordsApi.countryKeywordsMetrics/get,
    [KeywordsApi.keywords/create.key]: KeywordsApi.keywords/create,
    [KeywordsApi.keywords/get.key]: KeywordsApi.keywords/get,
    [KeywordsApi.keywords/update.key]: KeywordsApi.keywords/update,
    [MediaApi.media/create.key]: MediaApi.media/create,
    [MediaApi.media/get.key]: MediaApi.media/get,
    [MediaApi.media/list.key]: MediaApi.media/list,
    [OauthApi.oauth/token.key]: OauthApi.oauth/token,
    [PinsApi.pins/analytics.key]: PinsApi.pins/analytics,
    [PinsApi.pins/create.key]: PinsApi.pins/create,
    [PinsApi.pins/delete.key]: PinsApi.pins/delete,
    [PinsApi.pins/get.key]: PinsApi.pins/get,
    [PinsApi.pins/save.key]: PinsApi.pins/save,
    [ProductGroupPromotionsApi.productGroupPromotion/get.key]: ProductGroupPromotionsApi.productGroupPromotion/get,
    [ProductGroupPromotionsApi.productGroupPromotions/create.key]: ProductGroupPromotionsApi.productGroupPromotions/create,
    [ProductGroupPromotionsApi.productGroupPromotions/update.key]: ProductGroupPromotionsApi.productGroupPromotions/update,
    [ProductGroupPromotionsApi.productGroups/analytics.key]: ProductGroupPromotionsApi.productGroups/analytics,
    [ResourcesApi.adAccountCountries/get.key]: ResourcesApi.adAccountCountries/get,
    [ResourcesApi.deliveryMetrics/get.key]: ResourcesApi.deliveryMetrics/get,
    [ResourcesApi.interestTargetingOptions/get.key]: ResourcesApi.interestTargetingOptions/get,
    [ResourcesApi.metricsReadyState/get.key]: ResourcesApi.metricsReadyState/get,
    [ResourcesApi.targetingOptions/get.key]: ResourcesApi.targetingOptions/get,
    [TermsApi.termsRelated/list.key]: TermsApi.termsRelated/list,
    [TermsApi.termsSuggested/list.key]: TermsApi.termsSuggested/list,
    [TermsOfServiceApi.termsOfService/get.key]: TermsOfServiceApi.termsOfService/get,
    [UserAccountApi.userAccount/analytics.key]: UserAccountApi.userAccount/analytics,
    [UserAccountApi.userAccount/analytics/topPins.key]: UserAccountApi.userAccount/analytics/topPins,
    [UserAccountApi.userAccount/analytics/topVideoPins.key]: UserAccountApi.userAccount/analytics/topVideoPins,
    [UserAccountApi.userAccount/get.key]: UserAccountApi.userAccount/get,
}

module.exports = {
    searchActions: () => Object.entries(actions).reduce((actions, [key, value]) => isSearchAction(key) && hasSearchRequisites(value) ? {...actions, [key]: searchMiddleware(value)} : actions, {}),
    createActions: () => Object.entries(actions).reduce((actions, [key, value]) => !isSearchAction(key) ? {...actions, [key]: value} : actions, {}),
}