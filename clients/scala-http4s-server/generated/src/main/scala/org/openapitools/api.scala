package org.openapitools

import org.http4s.circe._
import cats.Monad
import cats.syntax.all._
import cats.data.OptionT
import cats.data.Kleisli
import org.http4s._
import org.http4s.server._

import org.openapitools.apis._

final case class API [
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials, conversion_token, basic
](
  pinterestOauth2: Kleisli[OptionT[F, *], Request[F], pinterest_oauth2],
  clientCredentials: Kleisli[OptionT[F, *], Request[F], client_credentials],
  conversionToken: Kleisli[OptionT[F, *], Request[F], conversion_token],
  basic: Kleisli[OptionT[F, *], Request[F], basic],
)(
  delegateAdAccountsApi: AdAccountsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateAdGroupsApi: AdGroupsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateAdsApi: AdsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateAdvancedAuctionApi: AdvancedAuctionApiDelegate[F, pinterest_oauth2],
  delegateAudienceInsightsApi: AudienceInsightsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateAudienceSharingApi: AudienceSharingApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateAudiencesApi: AudiencesApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateBillingApi: BillingApiDelegate[F, pinterest_oauth2],
  delegateBoardsApi: BoardsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateBulkApi: BulkApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateBusinessAccessAssetsApi: BusinessAccessAssetsApiDelegate[F, pinterest_oauth2],
  delegateBusinessAccessInviteApi: BusinessAccessInviteApiDelegate[F, pinterest_oauth2],
  delegateBusinessAccessRelationshipsApi: BusinessAccessRelationshipsApiDelegate[F, pinterest_oauth2],
  delegateCampaignsApi: CampaignsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateCatalogFeedsApi: CatalogFeedsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateCatalogItemsApi: CatalogItemsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateCatalogProductGroupsApi: CatalogProductGroupsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateCatalogReportsApi: CatalogReportsApiDelegate[F, pinterest_oauth2],
  delegateCatalogSupplementalApi: CatalogSupplementalApiDelegate[F, pinterest_oauth2],
  delegateCatalogsApi: CatalogsApiDelegate[F, pinterest_oauth2],
  delegateConversionDeletionRequestsApi: ConversionDeletionRequestsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateConversionEqsApi: ConversionEqsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateConversionEventsApi: ConversionEventsApiDelegate[F, pinterest_oauth2, conversion_token],
  delegateConversionTagsApi: ConversionTagsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateConversionsApi: ConversionsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateCustomerListUploadsApi: CustomerListUploadsApiDelegate[F, pinterest_oauth2],
  delegateCustomerListsApi: CustomerListsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateCustomerSegmentApi: CustomerSegmentApiDelegate[F, pinterest_oauth2],
  delegateIntegrationsApi: IntegrationsApiDelegate[F, pinterest_oauth2],
  delegateKeywordsApi: KeywordsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateLabelsApi: LabelsApiDelegate[F, pinterest_oauth2],
  delegateLeadAdsApi: LeadAdsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateLeadFormsApi: LeadFormsApiDelegate[F, pinterest_oauth2],
  delegateLeadsExportApi: LeadsExportApiDelegate[F, pinterest_oauth2],
  delegateMediaApi: MediaApiDelegate[F, pinterest_oauth2],
  delegateMsotEventsApi: MsotEventsApiDelegate[F, pinterest_oauth2],
  delegateNotificationApi: NotificationApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateOauthApi: OauthApiDelegate[F, pinterest_oauth2, basic],
  delegateOrderLinesApi: OrderLinesApiDelegate[F, pinterest_oauth2],
  delegatePinsApi: PinsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateProductGroupPromotionsApi: ProductGroupPromotionsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateProductTagsApi: ProductTagsApiDelegate[F, pinterest_oauth2],
  delegatePromotionsApi: PromotionsApiDelegate[F, pinterest_oauth2],
  delegateResourcesApi: ResourcesApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateSchedulesApi: SchedulesApiDelegate[F, pinterest_oauth2],
  delegateSearchApi: SearchApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateTargetingTemplateApi: TargetingTemplateApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateTermsApi: TermsApiDelegate[F, pinterest_oauth2],
  delegateTermsOfServiceApi: TermsOfServiceApiDelegate[F, pinterest_oauth2],
  delegateTrendsApi: TrendsApiDelegate[F, pinterest_oauth2, client_credentials],
  delegateUserAccountApi: UserAccountApiDelegate[F, pinterest_oauth2, client_credentials],
){
  val basicMiddleware = AuthMiddleware.withFallThrough(basic)
  val clientCredentialsMiddleware = AuthMiddleware.withFallThrough(clientCredentials)
  val conversionTokenMiddleware = AuthMiddleware.withFallThrough(conversionToken)
  val pinterestOauth2Middleware = AuthMiddleware(pinterestOauth2)

  val adAccountsApiRoutes = new AdAccountsApiRoutes(delegateAdAccountsApi)
  val adGroupsApiRoutes = new AdGroupsApiRoutes(delegateAdGroupsApi)
  val adsApiRoutes = new AdsApiRoutes(delegateAdsApi)
  val advancedAuctionApiRoutes = new AdvancedAuctionApiRoutes(delegateAdvancedAuctionApi)
  val audienceInsightsApiRoutes = new AudienceInsightsApiRoutes(delegateAudienceInsightsApi)
  val audienceSharingApiRoutes = new AudienceSharingApiRoutes(delegateAudienceSharingApi)
  val audiencesApiRoutes = new AudiencesApiRoutes(delegateAudiencesApi)
  val billingApiRoutes = new BillingApiRoutes(delegateBillingApi)
  val boardsApiRoutes = new BoardsApiRoutes(delegateBoardsApi)
  val bulkApiRoutes = new BulkApiRoutes(delegateBulkApi)
  val businessAccessAssetsApiRoutes = new BusinessAccessAssetsApiRoutes(delegateBusinessAccessAssetsApi)
  val businessAccessInviteApiRoutes = new BusinessAccessInviteApiRoutes(delegateBusinessAccessInviteApi)
  val businessAccessRelationshipsApiRoutes = new BusinessAccessRelationshipsApiRoutes(delegateBusinessAccessRelationshipsApi)
  val campaignsApiRoutes = new CampaignsApiRoutes(delegateCampaignsApi)
  val catalogFeedsApiRoutes = new CatalogFeedsApiRoutes(delegateCatalogFeedsApi)
  val catalogItemsApiRoutes = new CatalogItemsApiRoutes(delegateCatalogItemsApi)
  val catalogProductGroupsApiRoutes = new CatalogProductGroupsApiRoutes(delegateCatalogProductGroupsApi)
  val catalogReportsApiRoutes = new CatalogReportsApiRoutes(delegateCatalogReportsApi)
  val catalogSupplementalApiRoutes = new CatalogSupplementalApiRoutes(delegateCatalogSupplementalApi)
  val catalogsApiRoutes = new CatalogsApiRoutes(delegateCatalogsApi)
  val conversionDeletionRequestsApiRoutes = new ConversionDeletionRequestsApiRoutes(delegateConversionDeletionRequestsApi)
  val conversionEqsApiRoutes = new ConversionEqsApiRoutes(delegateConversionEqsApi)
  val conversionEventsApiRoutes = new ConversionEventsApiRoutes(delegateConversionEventsApi)
  val conversionTagsApiRoutes = new ConversionTagsApiRoutes(delegateConversionTagsApi)
  val conversionsApiRoutes = new ConversionsApiRoutes(delegateConversionsApi)
  val customerListUploadsApiRoutes = new CustomerListUploadsApiRoutes(delegateCustomerListUploadsApi)
  val customerListsApiRoutes = new CustomerListsApiRoutes(delegateCustomerListsApi)
  val customerSegmentApiRoutes = new CustomerSegmentApiRoutes(delegateCustomerSegmentApi)
  val integrationsApiRoutes = new IntegrationsApiRoutes(delegateIntegrationsApi)
  val keywordsApiRoutes = new KeywordsApiRoutes(delegateKeywordsApi)
  val labelsApiRoutes = new LabelsApiRoutes(delegateLabelsApi)
  val leadAdsApiRoutes = new LeadAdsApiRoutes(delegateLeadAdsApi)
  val leadFormsApiRoutes = new LeadFormsApiRoutes(delegateLeadFormsApi)
  val leadsExportApiRoutes = new LeadsExportApiRoutes(delegateLeadsExportApi)
  val mediaApiRoutes = new MediaApiRoutes(delegateMediaApi)
  val msotEventsApiRoutes = new MsotEventsApiRoutes(delegateMsotEventsApi)
  val notificationApiRoutes = new NotificationApiRoutes(delegateNotificationApi)
  val oauthApiRoutes = new OauthApiRoutes(delegateOauthApi)
  val orderLinesApiRoutes = new OrderLinesApiRoutes(delegateOrderLinesApi)
  val pinsApiRoutes = new PinsApiRoutes(delegatePinsApi)
  val productGroupPromotionsApiRoutes = new ProductGroupPromotionsApiRoutes(delegateProductGroupPromotionsApi)
  val productTagsApiRoutes = new ProductTagsApiRoutes(delegateProductTagsApi)
  val promotionsApiRoutes = new PromotionsApiRoutes(delegatePromotionsApi)
  val resourcesApiRoutes = new ResourcesApiRoutes(delegateResourcesApi)
  val schedulesApiRoutes = new SchedulesApiRoutes(delegateSchedulesApi)
  val searchApiRoutes = new SearchApiRoutes(delegateSearchApi)
  val targetingTemplateApiRoutes = new TargetingTemplateApiRoutes(delegateTargetingTemplateApi)
  val termsApiRoutes = new TermsApiRoutes(delegateTermsApi)
  val termsOfServiceApiRoutes = new TermsOfServiceApiRoutes(delegateTermsOfServiceApi)
  val trendsApiRoutes = new TrendsApiRoutes(delegateTrendsApi)
  val userAccountApiRoutes = new UserAccountApiRoutes(delegateUserAccountApi)

  val routesbasic = basicMiddleware(
    oauthApiRoutes.routesbasic
  )
  val routesclient_credentials = clientCredentialsMiddleware(
    adAccountsApiRoutes.routesclient_credentials <+>
      adGroupsApiRoutes.routesclient_credentials <+>
      adsApiRoutes.routesclient_credentials <+>
      audienceInsightsApiRoutes.routesclient_credentials <+>
      audienceSharingApiRoutes.routesclient_credentials <+>
      audiencesApiRoutes.routesclient_credentials <+>
      boardsApiRoutes.routesclient_credentials <+>
      bulkApiRoutes.routesclient_credentials <+>
      campaignsApiRoutes.routesclient_credentials <+>
      catalogFeedsApiRoutes.routesclient_credentials <+>
      catalogItemsApiRoutes.routesclient_credentials <+>
      catalogProductGroupsApiRoutes.routesclient_credentials <+>
      conversionDeletionRequestsApiRoutes.routesclient_credentials <+>
      conversionEqsApiRoutes.routesclient_credentials <+>
      conversionTagsApiRoutes.routesclient_credentials <+>
      conversionsApiRoutes.routesclient_credentials <+>
      customerListsApiRoutes.routesclient_credentials <+>
      keywordsApiRoutes.routesclient_credentials <+>
      leadAdsApiRoutes.routesclient_credentials <+>
      notificationApiRoutes.routesclient_credentials <+>
      pinsApiRoutes.routesclient_credentials <+>
      productGroupPromotionsApiRoutes.routesclient_credentials <+>
      resourcesApiRoutes.routesclient_credentials <+>
      searchApiRoutes.routesclient_credentials <+>
      targetingTemplateApiRoutes.routesclient_credentials <+>
      trendsApiRoutes.routesclient_credentials <+>
      userAccountApiRoutes.routesclient_credentials
  )
  val routesconversion_token = conversionTokenMiddleware(
    conversionEventsApiRoutes.routesconversion_token
  )
  val routespinterest_oauth2 = pinterestOauth2Middleware(
    adAccountsApiRoutes.routespinterest_oauth2 <+>
      adGroupsApiRoutes.routespinterest_oauth2 <+>
      adsApiRoutes.routespinterest_oauth2 <+>
      advancedAuctionApiRoutes.routespinterest_oauth2 <+>
      audienceInsightsApiRoutes.routespinterest_oauth2 <+>
      audienceSharingApiRoutes.routespinterest_oauth2 <+>
      audiencesApiRoutes.routespinterest_oauth2 <+>
      billingApiRoutes.routespinterest_oauth2 <+>
      boardsApiRoutes.routespinterest_oauth2 <+>
      bulkApiRoutes.routespinterest_oauth2 <+>
      businessAccessAssetsApiRoutes.routespinterest_oauth2 <+>
      businessAccessInviteApiRoutes.routespinterest_oauth2 <+>
      businessAccessRelationshipsApiRoutes.routespinterest_oauth2 <+>
      campaignsApiRoutes.routespinterest_oauth2 <+>
      catalogFeedsApiRoutes.routespinterest_oauth2 <+>
      catalogItemsApiRoutes.routespinterest_oauth2 <+>
      catalogProductGroupsApiRoutes.routespinterest_oauth2 <+>
      catalogReportsApiRoutes.routespinterest_oauth2 <+>
      catalogSupplementalApiRoutes.routespinterest_oauth2 <+>
      catalogsApiRoutes.routespinterest_oauth2 <+>
      conversionDeletionRequestsApiRoutes.routespinterest_oauth2 <+>
      conversionEqsApiRoutes.routespinterest_oauth2 <+>
      conversionEventsApiRoutes.routespinterest_oauth2 <+>
      conversionTagsApiRoutes.routespinterest_oauth2 <+>
      conversionsApiRoutes.routespinterest_oauth2 <+>
      customerListUploadsApiRoutes.routespinterest_oauth2 <+>
      customerListsApiRoutes.routespinterest_oauth2 <+>
      customerSegmentApiRoutes.routespinterest_oauth2 <+>
      integrationsApiRoutes.routespinterest_oauth2 <+>
      keywordsApiRoutes.routespinterest_oauth2 <+>
      labelsApiRoutes.routespinterest_oauth2 <+>
      leadAdsApiRoutes.routespinterest_oauth2 <+>
      leadFormsApiRoutes.routespinterest_oauth2 <+>
      leadsExportApiRoutes.routespinterest_oauth2 <+>
      mediaApiRoutes.routespinterest_oauth2 <+>
      msotEventsApiRoutes.routespinterest_oauth2 <+>
      notificationApiRoutes.routespinterest_oauth2 <+>
      oauthApiRoutes.routespinterest_oauth2 <+>
      orderLinesApiRoutes.routespinterest_oauth2 <+>
      pinsApiRoutes.routespinterest_oauth2 <+>
      productGroupPromotionsApiRoutes.routespinterest_oauth2 <+>
      productTagsApiRoutes.routespinterest_oauth2 <+>
      promotionsApiRoutes.routespinterest_oauth2 <+>
      resourcesApiRoutes.routespinterest_oauth2 <+>
      schedulesApiRoutes.routespinterest_oauth2 <+>
      searchApiRoutes.routespinterest_oauth2 <+>
      targetingTemplateApiRoutes.routespinterest_oauth2 <+>
      termsApiRoutes.routespinterest_oauth2 <+>
      termsOfServiceApiRoutes.routespinterest_oauth2 <+>
      trendsApiRoutes.routespinterest_oauth2 <+>
      userAccountApiRoutes.routespinterest_oauth2
  )

  val routesAll =
    routesbasic <+>
    routesclient_credentials <+>
    routesconversion_token <+>
    routespinterest_oauth2
}
