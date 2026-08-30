package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[AdAccountsApi].to[AdAccountsApiImpl],
    bind[AdGroupsApi].to[AdGroupsApiImpl],
    bind[AdsApi].to[AdsApiImpl],
    bind[AdvancedAuctionApi].to[AdvancedAuctionApiImpl],
    bind[AudienceInsightsApi].to[AudienceInsightsApiImpl],
    bind[AudienceSharingApi].to[AudienceSharingApiImpl],
    bind[AudiencesApi].to[AudiencesApiImpl],
    bind[BillingApi].to[BillingApiImpl],
    bind[BoardsApi].to[BoardsApiImpl],
    bind[BulkApi].to[BulkApiImpl],
    bind[BusinessAccessAssetsApi].to[BusinessAccessAssetsApiImpl],
    bind[BusinessAccessInviteApi].to[BusinessAccessInviteApiImpl],
    bind[BusinessAccessRelationshipsApi].to[BusinessAccessRelationshipsApiImpl],
    bind[CampaignsApi].to[CampaignsApiImpl],
    bind[CatalogFeedsApi].to[CatalogFeedsApiImpl],
    bind[CatalogItemsApi].to[CatalogItemsApiImpl],
    bind[CatalogProductGroupsApi].to[CatalogProductGroupsApiImpl],
    bind[CatalogReportsApi].to[CatalogReportsApiImpl],
    bind[CatalogSupplementalApi].to[CatalogSupplementalApiImpl],
    bind[CatalogsApi].to[CatalogsApiImpl],
    bind[ConversionDeletionRequestsApi].to[ConversionDeletionRequestsApiImpl],
    bind[ConversionEqsApi].to[ConversionEqsApiImpl],
    bind[ConversionEventsApi].to[ConversionEventsApiImpl],
    bind[ConversionTagsApi].to[ConversionTagsApiImpl],
    bind[ConversionsApi].to[ConversionsApiImpl],
    bind[CustomerListUploadsApi].to[CustomerListUploadsApiImpl],
    bind[CustomerListsApi].to[CustomerListsApiImpl],
    bind[CustomerSegmentApi].to[CustomerSegmentApiImpl],
    bind[IntegrationsApi].to[IntegrationsApiImpl],
    bind[KeywordsApi].to[KeywordsApiImpl],
    bind[LabelsApi].to[LabelsApiImpl],
    bind[LeadAdsApi].to[LeadAdsApiImpl],
    bind[LeadFormsApi].to[LeadFormsApiImpl],
    bind[LeadsExportApi].to[LeadsExportApiImpl],
    bind[MediaApi].to[MediaApiImpl],
    bind[MsotEventsApi].to[MsotEventsApiImpl],
    bind[NotificationApi].to[NotificationApiImpl],
    bind[OauthApi].to[OauthApiImpl],
    bind[OrderLinesApi].to[OrderLinesApiImpl],
    bind[PinsApi].to[PinsApiImpl],
    bind[ProductGroupPromotionsApi].to[ProductGroupPromotionsApiImpl],
    bind[ProductTagsApi].to[ProductTagsApiImpl],
    bind[PromotionsApi].to[PromotionsApiImpl],
    bind[ResourcesApi].to[ResourcesApiImpl],
    bind[SchedulesApi].to[SchedulesApiImpl],
    bind[SearchApi].to[SearchApiImpl],
    bind[TargetingTemplateApi].to[TargetingTemplateApiImpl],
    bind[TermsApi].to[TermsApiImpl],
    bind[TermsOfServiceApi].to[TermsOfServiceApiImpl],
    bind[TrendsApi].to[TrendsApiImpl],
    bind[UserAccountApi].to[UserAccountApiImpl]
  )
}
