package api

import model.AdPinAnalytics
import model.AdsAnalyticsCampaignTargetingType
import model.BigDecimal
import model.Campaign
import model.CampaignBatchUpdateItem
import model.CampaignBatchWriteResponseModel
import model.CampaignCreateItem
import model.CampaignDeliveryEstimatesCampaign
import model.CampaignDeliveryEstimatesResponse
import model.CampaignsAnalyticsMetrics
import model.CampaignsList200Response
import model.ConversionReportAttributionType
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse
import model.PaginationOrder
import model.ReportingColumnSync
import model.ReportingTimeZone

/**
  * Provides a default implementation for [[CampaignsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class CampaignsApiImpl extends CampaignsApi {
  /**
    * @inheritdoc
    */
  override def adPinsAnalytics(campaignId: String, pinIds: List[String], startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String]): List[AdPinAnalytics] = {
    // TODO: Implement better logic

    List.empty[AdPinAnalytics]
  }

  /**
    * @inheritdoc
    */
  override def campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsCampaignTargetingType], columns: List[ReportingColumnSync], granularity: Granularity, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], attributionTypes: Option[List[ConversionReportAttributionType]], reportingTimezone: Option[ReportingTimeZone]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def campaignsAnalytics(startDate: LocalDate, endDate: LocalDate, campaignIds: List[String], columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], aggregateReportRows: Option[Boolean], reportingTimezone: Option[ReportingTimeZone]): List[CampaignsAnalyticsMetrics] = {
    // TODO: Implement better logic

    List.empty[CampaignsAnalyticsMetrics]
  }

  /**
    * @inheritdoc
    */
  override def campaignsCreate(adAccountId: String, campaignCreateItem: List[CampaignCreateItem]): CampaignBatchWriteResponseModel = {
    // TODO: Implement better logic

    CampaignBatchWriteResponseModel(List.empty[CampaignBatchItem])
  }

  /**
    * @inheritdoc
    */
  override def campaignsGet(campaignId: String, adAccountId: String): Campaign = {
    // TODO: Implement better logic

    Campaign(None, None, None, None, None, None, "", None, None, None, None, None, None, None, None, None, None, CampaignObjectiveType(), None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def campaignsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], campaignIds: Option[List[String]], entityStatuses: Option[List[EntityStatus]]): CampaignsList200Response = {
    // TODO: Implement better logic

    CampaignsList200Response(None, List.empty[Campaign])
  }

  /**
    * @inheritdoc
    */
  override def campaignsUpdate(adAccountId: String, campaignBatchUpdateItem: List[CampaignBatchUpdateItem]): CampaignBatchWriteResponseModel = {
    // TODO: Implement better logic

    CampaignBatchWriteResponseModel(List.empty[CampaignBatchItem])
  }

  /**
    * @inheritdoc
    */
  override def getCampaignDeliveryEstimates(adAccountId: String, campaignDeliveryEstimatesCampaign: List[CampaignDeliveryEstimatesCampaign]): CampaignDeliveryEstimatesResponse = {
    // TODO: Implement better logic

    CampaignDeliveryEstimatesResponse(None, None, None)
  }
}
