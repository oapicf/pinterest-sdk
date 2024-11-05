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
import org.openapitools.server.api.CatalogsApi
import org.openapitools.server.api.ConversionEventsApi
import org.openapitools.server.api.ConversionTagsApi
import org.openapitools.server.api.CustomerListsApi
import org.openapitools.server.api.IntegrationsApi
import org.openapitools.server.api.KeywordsApi
import org.openapitools.server.api.LeadAdsApi
import org.openapitools.server.api.LeadFormsApi
import org.openapitools.server.api.LeadsExportApi
import org.openapitools.server.api.MediaApi
import org.openapitools.server.api.OauthApi
import org.openapitools.server.api.OrderLinesApi
import org.openapitools.server.api.PinsApi
import org.openapitools.server.api.ProductGroupPromotionsApi
import org.openapitools.server.api.ResourcesApi
import org.openapitools.server.api.SearchApi
import org.openapitools.server.api.TargetingTemplateApi
import org.openapitools.server.api.TermsApi
import org.openapitools.server.api.TermsOfServiceApi
import org.openapitools.server.api.UserAccountApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(adAccounts: AdAccountsApi, adGroups: AdGroupsApi, ads: AdsApi, advancedAuction: AdvancedAuctionApi, audienceInsights: AudienceInsightsApi, audienceSharing: AudienceSharingApi, audiences: AudiencesApi, billing: BillingApi, boards: BoardsApi, bulk: BulkApi, businessAccessAssets: BusinessAccessAssetsApi, businessAccessInvite: BusinessAccessInviteApi, businessAccessRelationships: BusinessAccessRelationshipsApi, campaigns: CampaignsApi, catalogs: CatalogsApi, conversionEvents: ConversionEventsApi, conversionTags: ConversionTagsApi, customerLists: CustomerListsApi, integrations: IntegrationsApi, keywords: KeywordsApi, leadAds: LeadAdsApi, leadForms: LeadFormsApi, leadsExport: LeadsExportApi, media: MediaApi, oauth: OauthApi, orderLines: OrderLinesApi, pins: PinsApi, productGroupPromotions: ProductGroupPromotionsApi, resources: ResourcesApi, search: SearchApi, targetingTemplate: TargetingTemplateApi, terms: TermsApi, termsOfService: TermsOfServiceApi, userAccount: UserAccountApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = adAccounts.route ~ adGroups.route ~ ads.route ~ advancedAuction.route ~ audienceInsights.route ~ audienceSharing.route ~ audiences.route ~ billing.route ~ boards.route ~ bulk.route ~ businessAccessAssets.route ~ businessAccessInvite.route ~ businessAccessRelationships.route ~ campaigns.route ~ catalogs.route ~ conversionEvents.route ~ conversionTags.route ~ customerLists.route ~ integrations.route ~ keywords.route ~ leadAds.route ~ leadForms.route ~ leadsExport.route ~ media.route ~ oauth.route ~ orderLines.route ~ pins.route ~ productGroupPromotions.route ~ resources.route ~ search.route ~ targetingTemplate.route ~ terms.route ~ termsOfService.route ~ userAccount.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}