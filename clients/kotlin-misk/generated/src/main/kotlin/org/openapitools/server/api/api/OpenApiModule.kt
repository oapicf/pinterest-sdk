package org.openapitools.server.api.api

import misk.inject.KAbstractModule
import misk.web.WebActionModule
import jakarta.inject.Singleton
import org.openapitools.server.api.api.AdAccountsApiAction
import org.openapitools.server.api.api.AdGroupsApiAction
import org.openapitools.server.api.api.AdsApiAction
import org.openapitools.server.api.api.AdvancedAuctionApiAction
import org.openapitools.server.api.api.AudienceInsightsApiAction
import org.openapitools.server.api.api.AudienceSharingApiAction
import org.openapitools.server.api.api.AudiencesApiAction
import org.openapitools.server.api.api.BillingApiAction
import org.openapitools.server.api.api.BoardsApiAction
import org.openapitools.server.api.api.BulkApiAction
import org.openapitools.server.api.api.BusinessAccessAssetsApiAction
import org.openapitools.server.api.api.BusinessAccessInviteApiAction
import org.openapitools.server.api.api.BusinessAccessRelationshipsApiAction
import org.openapitools.server.api.api.CampaignsApiAction
import org.openapitools.server.api.api.CatalogFeedsApiAction
import org.openapitools.server.api.api.CatalogItemsApiAction
import org.openapitools.server.api.api.CatalogProductGroupsApiAction
import org.openapitools.server.api.api.CatalogReportsApiAction
import org.openapitools.server.api.api.CatalogSupplementalApiAction
import org.openapitools.server.api.api.CatalogsApiAction
import org.openapitools.server.api.api.ConversionDeletionRequestsApiAction
import org.openapitools.server.api.api.ConversionEqsApiAction
import org.openapitools.server.api.api.ConversionEventsApiAction
import org.openapitools.server.api.api.ConversionTagsApiAction
import org.openapitools.server.api.api.ConversionsApiAction
import org.openapitools.server.api.api.CustomerListUploadsApiAction
import org.openapitools.server.api.api.CustomerListsApiAction
import org.openapitools.server.api.api.CustomerSegmentApiAction
import org.openapitools.server.api.api.IntegrationsApiAction
import org.openapitools.server.api.api.KeywordsApiAction
import org.openapitools.server.api.api.LabelsApiAction
import org.openapitools.server.api.api.LeadAdsApiAction
import org.openapitools.server.api.api.LeadFormsApiAction
import org.openapitools.server.api.api.LeadsExportApiAction
import org.openapitools.server.api.api.MediaApiAction
import org.openapitools.server.api.api.MsotEventsApiAction
import org.openapitools.server.api.api.NotificationApiAction
import org.openapitools.server.api.api.OauthApiAction
import org.openapitools.server.api.api.OrderLinesApiAction
import org.openapitools.server.api.api.PinsApiAction
import org.openapitools.server.api.api.ProductGroupPromotionsApiAction
import org.openapitools.server.api.api.ProductTagsApiAction
import org.openapitools.server.api.api.PromotionsApiAction
import org.openapitools.server.api.api.ResourcesApiAction
import org.openapitools.server.api.api.SchedulesApiAction
import org.openapitools.server.api.api.SearchApiAction
import org.openapitools.server.api.api.TargetingTemplateApiAction
import org.openapitools.server.api.api.TermsApiAction
import org.openapitools.server.api.api.TermsOfServiceApiAction
import org.openapitools.server.api.api.TrendsApiAction
import org.openapitools.server.api.api.UserAccountApiAction

@Singleton
class OpenApiModule : KAbstractModule() {
    override fun configure() {
        install(WebActionModule.create<AdAccountsApiAction>())
        install(WebActionModule.create<AdGroupsApiAction>())
        install(WebActionModule.create<AdsApiAction>())
        install(WebActionModule.create<AdvancedAuctionApiAction>())
        install(WebActionModule.create<AudienceInsightsApiAction>())
        install(WebActionModule.create<AudienceSharingApiAction>())
        install(WebActionModule.create<AudiencesApiAction>())
        install(WebActionModule.create<BillingApiAction>())
        install(WebActionModule.create<BoardsApiAction>())
        install(WebActionModule.create<BulkApiAction>())
        install(WebActionModule.create<BusinessAccessAssetsApiAction>())
        install(WebActionModule.create<BusinessAccessInviteApiAction>())
        install(WebActionModule.create<BusinessAccessRelationshipsApiAction>())
        install(WebActionModule.create<CampaignsApiAction>())
        install(WebActionModule.create<CatalogFeedsApiAction>())
        install(WebActionModule.create<CatalogItemsApiAction>())
        install(WebActionModule.create<CatalogProductGroupsApiAction>())
        install(WebActionModule.create<CatalogReportsApiAction>())
        install(WebActionModule.create<CatalogSupplementalApiAction>())
        install(WebActionModule.create<CatalogsApiAction>())
        install(WebActionModule.create<ConversionDeletionRequestsApiAction>())
        install(WebActionModule.create<ConversionEqsApiAction>())
        install(WebActionModule.create<ConversionEventsApiAction>())
        install(WebActionModule.create<ConversionTagsApiAction>())
        install(WebActionModule.create<ConversionsApiAction>())
        install(WebActionModule.create<CustomerListUploadsApiAction>())
        install(WebActionModule.create<CustomerListsApiAction>())
        install(WebActionModule.create<CustomerSegmentApiAction>())
        install(WebActionModule.create<IntegrationsApiAction>())
        install(WebActionModule.create<KeywordsApiAction>())
        install(WebActionModule.create<LabelsApiAction>())
        install(WebActionModule.create<LeadAdsApiAction>())
        install(WebActionModule.create<LeadFormsApiAction>())
        install(WebActionModule.create<LeadsExportApiAction>())
        install(WebActionModule.create<MediaApiAction>())
        install(WebActionModule.create<MsotEventsApiAction>())
        install(WebActionModule.create<NotificationApiAction>())
        install(WebActionModule.create<OauthApiAction>())
        install(WebActionModule.create<OrderLinesApiAction>())
        install(WebActionModule.create<PinsApiAction>())
        install(WebActionModule.create<ProductGroupPromotionsApiAction>())
        install(WebActionModule.create<ProductTagsApiAction>())
        install(WebActionModule.create<PromotionsApiAction>())
        install(WebActionModule.create<ResourcesApiAction>())
        install(WebActionModule.create<SchedulesApiAction>())
        install(WebActionModule.create<SearchApiAction>())
        install(WebActionModule.create<TargetingTemplateApiAction>())
        install(WebActionModule.create<TermsApiAction>())
        install(WebActionModule.create<TermsOfServiceApiAction>())
        install(WebActionModule.create<TrendsApiAction>())
        install(WebActionModule.create<UserAccountApiAction>())
    }
}