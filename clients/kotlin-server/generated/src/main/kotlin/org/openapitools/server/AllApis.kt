package org.openapitools.server

import io.ktor.server.routing.*
import org.openapitools.server.apis.AdAccountsApi
import org.openapitools.server.apis.AdGroupsApi
import org.openapitools.server.apis.AdsApi
import org.openapitools.server.apis.AdvancedAuctionApi
import org.openapitools.server.apis.AudienceInsightsApi
import org.openapitools.server.apis.AudienceSharingApi
import org.openapitools.server.apis.AudiencesApi
import org.openapitools.server.apis.BillingApi
import org.openapitools.server.apis.BoardsApi
import org.openapitools.server.apis.BulkApi
import org.openapitools.server.apis.BusinessAccessAssetsApi
import org.openapitools.server.apis.BusinessAccessInviteApi
import org.openapitools.server.apis.BusinessAccessRelationshipsApi
import org.openapitools.server.apis.CampaignsApi
import org.openapitools.server.apis.CatalogFeedsApi
import org.openapitools.server.apis.CatalogItemsApi
import org.openapitools.server.apis.CatalogProductGroupsApi
import org.openapitools.server.apis.CatalogReportsApi
import org.openapitools.server.apis.CatalogSupplementalApi
import org.openapitools.server.apis.CatalogsApi
import org.openapitools.server.apis.ConversionDeletionRequestsApi
import org.openapitools.server.apis.ConversionEqsApi
import org.openapitools.server.apis.ConversionEventsApi
import org.openapitools.server.apis.ConversionTagsApi
import org.openapitools.server.apis.ConversionsApi
import org.openapitools.server.apis.CustomerListUploadsApi
import org.openapitools.server.apis.CustomerListsApi
import org.openapitools.server.apis.CustomerSegmentApi
import org.openapitools.server.apis.IntegrationsApi
import org.openapitools.server.apis.KeywordsApi
import org.openapitools.server.apis.LabelsApi
import org.openapitools.server.apis.LeadAdsApi
import org.openapitools.server.apis.LeadFormsApi
import org.openapitools.server.apis.LeadsExportApi
import org.openapitools.server.apis.MediaApi
import org.openapitools.server.apis.MsotEventsApi
import org.openapitools.server.apis.NotificationApi
import org.openapitools.server.apis.OauthApi
import org.openapitools.server.apis.OrderLinesApi
import org.openapitools.server.apis.PinsApi
import org.openapitools.server.apis.ProductGroupPromotionsApi
import org.openapitools.server.apis.ProductTagsApi
import org.openapitools.server.apis.PromotionsApi
import org.openapitools.server.apis.ResourcesApi
import org.openapitools.server.apis.SchedulesApi
import org.openapitools.server.apis.SearchApi
import org.openapitools.server.apis.TargetingTemplateApi
import org.openapitools.server.apis.TermsApi
import org.openapitools.server.apis.TermsOfServiceApi
import org.openapitools.server.apis.TrendsApi
import org.openapitools.server.apis.UserAccountApi



fun Route.AllApis() {
    AdAccountsApi()
    AdGroupsApi()
    AdsApi()
    AdvancedAuctionApi()
    AudienceInsightsApi()
    AudienceSharingApi()
    AudiencesApi()
    BillingApi()
    BoardsApi()
    BulkApi()
    BusinessAccessAssetsApi()
    BusinessAccessInviteApi()
    BusinessAccessRelationshipsApi()
    CampaignsApi()
    CatalogFeedsApi()
    CatalogItemsApi()
    CatalogProductGroupsApi()
    CatalogReportsApi()
    CatalogSupplementalApi()
    CatalogsApi()
    ConversionDeletionRequestsApi()
    ConversionEqsApi()
    ConversionEventsApi()
    ConversionTagsApi()
    ConversionsApi()
    CustomerListUploadsApi()
    CustomerListsApi()
    CustomerSegmentApi()
    IntegrationsApi()
    KeywordsApi()
    LabelsApi()
    LeadAdsApi()
    LeadFormsApi()
    LeadsExportApi()
    MediaApi()
    MsotEventsApi()
    NotificationApi()
    OauthApi()
    OrderLinesApi()
    PinsApi()
    ProductGroupPromotionsApi()
    ProductTagsApi()
    PromotionsApi()
    ResourcesApi()
    SchedulesApi()
    SearchApi()
    TargetingTemplateApi()
    TermsApi()
    TermsOfServiceApi()
    TrendsApi()
    UserAccountApi()
}
