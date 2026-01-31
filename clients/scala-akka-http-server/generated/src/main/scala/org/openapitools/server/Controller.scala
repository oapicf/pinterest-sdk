package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.AdAccountsApi
import org.openapitools.server.api.AdGroupsApi
import org.openapitools.server.api.AdsApi
import org.openapitools.server.api.AdvancedAuctionApi
import org.openapitools.server.api.AudienceInsightsApi
import org.openapitools.server.api.AudienceSharingApi
import org.openapitools.server.api.AudiencesApi
import org.openapitools.server.api.BillingApi
import org.openapitools.server.api.BoardsApi
import org.openapitools.server.api.BulkApi
import org.openapitools.server.api.BusinessAccessAssetsApi
import org.openapitools.server.api.BusinessAccessInviteApi
import org.openapitools.server.api.BusinessAccessRelationshipsApi
import org.openapitools.server.api.CampaignsApi
import org.openapitools.server.api.CatalogFeedsApi
import org.openapitools.server.api.CatalogItemsApi
import org.openapitools.server.api.CatalogProductGroupsApi
import org.openapitools.server.api.CatalogReportsApi
import org.openapitools.server.api.CatalogsApi
import org.openapitools.server.api.ConversionEqsApi
import org.openapitools.server.api.ConversionEventsApi
import org.openapitools.server.api.ConversionTagsApi
import org.openapitools.server.api.ConversionsApi
import org.openapitools.server.api.CustomerListUploadsApi
import org.openapitools.server.api.CustomerListsApi
import org.openapitools.server.api.IntegrationsApi
import org.openapitools.server.api.KeywordsApi
import org.openapitools.server.api.LabelsApi
import org.openapitools.server.api.LeadAdsApi
import org.openapitools.server.api.LeadFormsApi
import org.openapitools.server.api.LeadsExportApi
import org.openapitools.server.api.MediaApi
import org.openapitools.server.api.MsotEventsApi
import org.openapitools.server.api.NotificationApi
import org.openapitools.server.api.OauthApi
import org.openapitools.server.api.OrderLinesApi
import org.openapitools.server.api.PinsApi
import org.openapitools.server.api.ProductCategoriesApi
import org.openapitools.server.api.ProductGroupPromotionsApi
import org.openapitools.server.api.PromotionsApi
import org.openapitools.server.api.ResourcesApi
import org.openapitools.server.api.SearchApi
import org.openapitools.server.api.TargetingTemplateApi
import org.openapitools.server.api.TermsApi
import org.openapitools.server.api.TermsOfServiceApi
import org.openapitools.server.api.UserAccountApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.Materializer

class Controller(adAccounts: AdAccountsApi, adGroups: AdGroupsApi, ads: AdsApi, advancedAuction: AdvancedAuctionApi, audienceInsights: AudienceInsightsApi, audienceSharing: AudienceSharingApi, audiences: AudiencesApi, billing: BillingApi, boards: BoardsApi, bulk: BulkApi, businessAccessAssets: BusinessAccessAssetsApi, businessAccessInvite: BusinessAccessInviteApi, businessAccessRelationships: BusinessAccessRelationshipsApi, campaigns: CampaignsApi, catalogFeeds: CatalogFeedsApi, catalogItems: CatalogItemsApi, catalogProductGroups: CatalogProductGroupsApi, catalogReports: CatalogReportsApi, catalogs: CatalogsApi, conversionEqs: ConversionEqsApi, conversionEvents: ConversionEventsApi, conversionTags: ConversionTagsApi, conversions: ConversionsApi, customerListUploads: CustomerListUploadsApi, customerLists: CustomerListsApi, integrations: IntegrationsApi, keywords: KeywordsApi, labels: LabelsApi, leadAds: LeadAdsApi, leadForms: LeadFormsApi, leadsExport: LeadsExportApi, media: MediaApi, msotEvents: MsotEventsApi, notification: NotificationApi, oauth: OauthApi, orderLines: OrderLinesApi, pins: PinsApi, productCategories: ProductCategoriesApi, productGroupPromotions: ProductGroupPromotionsApi, promotions: PromotionsApi, resources: ResourcesApi, search: SearchApi, targetingTemplate: TargetingTemplateApi, terms: TermsApi, termsOfService: TermsOfServiceApi, userAccount: UserAccountApi)(implicit system: ActorSystem, materializer: Materializer) {

    lazy val routes: Route = adAccounts.route ~ adGroups.route ~ ads.route ~ advancedAuction.route ~ audienceInsights.route ~ audienceSharing.route ~ audiences.route ~ billing.route ~ boards.route ~ bulk.route ~ businessAccessAssets.route ~ businessAccessInvite.route ~ businessAccessRelationships.route ~ campaigns.route ~ catalogFeeds.route ~ catalogItems.route ~ catalogProductGroups.route ~ catalogReports.route ~ catalogs.route ~ conversionEqs.route ~ conversionEvents.route ~ conversionTags.route ~ conversions.route ~ customerListUploads.route ~ customerLists.route ~ integrations.route ~ keywords.route ~ labels.route ~ leadAds.route ~ leadForms.route ~ leadsExport.route ~ media.route ~ msotEvents.route ~ notification.route ~ oauth.route ~ orderLines.route ~ pins.route ~ productCategories.route ~ productGroupPromotions.route ~ promotions.route ~ resources.route ~ search.route ~ targetingTemplate.route ~ terms.route ~ termsOfService.route ~ userAccount.route 

    Http().newServerAt("0.0.0.0", 9000).bind(routes)
}
