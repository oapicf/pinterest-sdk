package api

import model.AdPinAnalytics
import model.AdsAnalyticsCampaignTargetingType
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
import model.ReportingTimeZone

/**
  * Provides a default implementation for [[CampaignsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class CampaignsApiImpl extends CampaignsApi {
  /**
    * @inheritdoc
    */
  override def adPinsAnalytics(adAccountId: String, campaignId: String, pinIds: List[String], startDate: LocalDate, endDate: LocalDate, columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[AdPinAnalytics] = {
    // TODO: Implement better logic

    List.empty[AdPinAnalytics]
  }

  /**
    * @inheritdoc
    */
  override def campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsCampaignTargetingType], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[List[ConversionReportAttributionType]], reportingTimezone: Option[ReportingTimeZone]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def campaignsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, campaignIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], aggregateReportRows: Option[Boolean], reportingTimezone: Option[ReportingTimeZone]): List[CampaignsAnalyticsResponseInner] = {
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

    CampaignResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def campaignsList(adAccountId: String, campaignIds: Option[List[String]], entityStatuses: Option[List[String]], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): CampaignsList200Response = {
    // TODO: Implement better logic

    CampaignsList200Response(None, List.empty[CampaignResponse])
  }

  /**
    * @inheritdoc
    */
  override def campaignsUpdate(adAccountId: String, campaignUpdateRequest: List[CampaignUpdateRequest]): CampaignUpdateResponse = {
    // TODO: Implement better logic

    CampaignUpdateResponse(None, Map.empty)
  }
}
