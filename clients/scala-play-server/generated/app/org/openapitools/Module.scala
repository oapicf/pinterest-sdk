package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[AdAccountsApi].to[AdAccountsApiImpl],
    bind[AdGroupsApi].to[AdGroupsApiImpl],
    bind[AdsApi].to[AdsApiImpl],
    bind[AudienceInsightsApi].to[AudienceInsightsApiImpl],
    bind[AudiencesApi].to[AudiencesApiImpl],
    bind[BillingApi].to[BillingApiImpl],
    bind[BoardsApi].to[BoardsApiImpl],
    bind[BulkApi].to[BulkApiImpl],
    bind[CampaignsApi].to[CampaignsApiImpl],
    bind[CatalogsApi].to[CatalogsApiImpl],
    bind[ConversionEventsApi].to[ConversionEventsApiImpl],
    bind[ConversionTagsApi].to[ConversionTagsApiImpl],
    bind[CustomerListsApi].to[CustomerListsApiImpl],
    bind[IntegrationsApi].to[IntegrationsApiImpl],
    bind[KeywordsApi].to[KeywordsApiImpl],
    bind[LeadAdsApi].to[LeadAdsApiImpl],
    bind[LeadFormsApi].to[LeadFormsApiImpl],
    bind[MediaApi].to[MediaApiImpl],
    bind[OauthApi].to[OauthApiImpl],
    bind[OrderLinesApi].to[OrderLinesApiImpl],
    bind[PinsApi].to[PinsApiImpl],
    bind[ProductGroupPromotionsApi].to[ProductGroupPromotionsApiImpl],
    bind[ProductGroupsApi].to[ProductGroupsApiImpl],
    bind[ResourcesApi].to[ResourcesApiImpl],
    bind[SearchApi].to[SearchApiImpl],
    bind[TermsApi].to[TermsApiImpl],
    bind[TermsOfServiceApi].to[TermsOfServiceApiImpl],
    bind[UserAccountApi].to[UserAccountApiImpl]
  )
}
