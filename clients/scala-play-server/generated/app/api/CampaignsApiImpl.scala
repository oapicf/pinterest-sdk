package api

import model.AdsAnalyticsTargetingType
import model.CampaignCreateRequest
import model.CampaignCreateResponse
import model.CampaignResponse
import model.CampaignUpdateRequest
import model.CampaignUpdateResponse
import model.CampaignsAnalyticsResponseInner
import model.CampaignsList200Response
import model.ConversionReportAttributionType
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse

/**
  * Provides a default implementation for [[CampaignsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class CampaignsApiImpl extends CampaignsApi {
  /**
    * @inheritdoc
    */
  override def campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def campaignsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, campaignIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[CampaignsAnalyticsResponseInner] = {
    // TODO: Implement better logic

    List.empty[CampaignsAnalyticsResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def campaignsCreate(adAccountId: String, campaignCreateRequest: List[CampaignCreateRequest]): CampaignCreateResponse = {
    // TODO: Implement better logic

    CampaignCreateResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def campaignsGet(adAccountId: String, campaignId: String): CampaignResponse = {
    // TODO: Implement better logic

    CampaignResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def campaignsList(adAccountId: String, campaignIds: Option[List[String]], entityStatuses: Option[List[String]], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): CampaignsList200Response = {
    // TODO: Implement better logic

    CampaignsList200Response(List.empty[CampaignResponse], None)
  }

  /**
    * @inheritdoc
    */
  override def campaignsUpdate(adAccountId: String, campaignUpdateRequest: List[CampaignUpdateRequest]): CampaignUpdateResponse = {
    // TODO: Implement better logic

    CampaignUpdateResponse(None)
  }
}
