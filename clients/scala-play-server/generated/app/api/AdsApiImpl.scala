package api

import model.Ad
import model.AdBatchUpdate
import model.AdBatchWriteResponseModel
import model.AdCreate
import model.AdPreviewRequest
import model.AdPreviewURLResponse
import model.AdsAnalytics
import model.AdsAnalyticsAdTargetingType
import model.AdsList200Response
import model.BigDecimal
import model.CampaignAdPreview
import model.CampaignAdPreviewCreate
import model.CampaignAdPreviewCreate200ResponseInner
import model.CampaignAdPreviewDelete200ResponseInner
import model.ConversionAttributionWindowDays
import model.ConversionReportAttributionType
import model.ConversionReportTimeType
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse
import model.PaginationOrder
import model.ReportingColumnSync
import model.ReportingTimeZone

/**
  * Provides a default implementation for [[AdsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class AdsApiImpl extends AdsApi {
  /**
    * @inheritdoc
    */
  override def adPreviewsCreate(adAccountId: String, adPreviewRequest: AdPreviewRequest): AdPreviewURLResponse = {
    // TODO: Implement better logic

    AdPreviewURLResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adTargetingAnalyticsGet(adAccountId: String, adIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdTargetingType], columns: List[ReportingColumnSync], granularity: Granularity, clickWindowDays: Option[ConversionAttributionWindowDays], engagementWindowDays: Option[ConversionAttributionWindowDays], viewWindowDays: Option[ConversionAttributionWindowDays], conversionReportTime: Option[ConversionReportTimeType], attributionTypes: Option[List[ConversionReportAttributionType]], reportingTimezone: Option[ReportingTimeZone], sortColumns: Option[List[String]], sortAscending: Option[Boolean]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adsAnalytics(startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, pinIds: Option[List[String]], adIds: Option[List[String]], clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], campaignIds: Option[List[String]], reportingTimezone: Option[ReportingTimeZone]): List[AdsAnalytics] = {
    // TODO: Implement better logic

    List.empty[AdsAnalytics]
  }

  /**
    * @inheritdoc
    */
  override def adsCreate(adAccountId: String, adCreate: List[AdCreate]): AdBatchWriteResponseModel = {
    // TODO: Implement better logic

    AdBatchWriteResponseModel(List.empty[AdBatchItem])
  }

  /**
    * @inheritdoc
    */
  override def adsGet(adId: String, adAccountId: String): Ad = {
    // TODO: Implement better logic

    Ad("", "", None, "", None, None, None, None, None, None, None, None, None, CreativeType(), None, None, None, None, None, "", None, None, None, None, None, None, None, None, "", None, List.empty[AdDisapprovalReasons], List.empty[String], AdReviewStatus(), None, PinPromotionSummaryStatus(), None, "", None, None)
  }

  /**
    * @inheritdoc
    */
  override def adsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], campaignIds: Option[List[String]], adGroupIds: Option[List[String]], adIds: Option[List[String]], entityStatuses: Option[List[EntityStatus]]): AdsList200Response = {
    // TODO: Implement better logic

    AdsList200Response(None, List.empty[Ad])
  }

  /**
    * @inheritdoc
    */
  override def adsUpdate(adAccountId: String, adBatchUpdate: List[AdBatchUpdate]): AdBatchWriteResponseModel = {
    // TODO: Implement better logic

    AdBatchWriteResponseModel(List.empty[AdBatchItem])
  }

  /**
    * @inheritdoc
    */
  override def campaignAdPreviewCreate(adAccountId: String, campaignAdPreviewCreate: List[CampaignAdPreviewCreate]): List[CampaignAdPreviewCreate200ResponseInner] = {
    // TODO: Implement better logic

    List.empty[CampaignAdPreviewCreate200ResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def campaignAdPreviewDelete(adGroupIds: List[String], adAccountId: String): List[CampaignAdPreviewDelete200ResponseInner] = {
    // TODO: Implement better logic

    List.empty[CampaignAdPreviewDelete200ResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def campaignAdPreviewRead(adGroupIds: List[String], adAccountId: String): List[CampaignAdPreview] = {
    // TODO: Implement better logic

    List.empty[CampaignAdPreview]
  }
}
