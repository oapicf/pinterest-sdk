package api

import model.AdArrayResponse
import model.AdCreateRequest
import model.AdPreviewRequest
import model.AdPreviewURLResponse
import model.AdResponse
import model.AdUpdateRequest
import model.AdsAnalyticsResponseInner
import model.AdsAnalyticsTargetingType
import model.AdsList200Response
import model.ConversionReportAttributionType
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse

/**
  * Provides a default implementation for [[AdsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
  override def adTargetingAnalyticsGet(adAccountId: String, adIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, adIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[AdsAnalyticsResponseInner] = {
    // TODO: Implement better logic

    List.empty[AdsAnalyticsResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def adsCreate(adAccountId: String, adCreateRequest: List[AdCreateRequest]): AdArrayResponse = {
    // TODO: Implement better logic

    AdArrayResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adsGet(adAccountId: String, adId: String): AdResponse = {
    // TODO: Implement better logic

    AdResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def adsList(adAccountId: String, campaignIds: Option[List[String]], adGroupIds: Option[List[String]], adIds: Option[List[String]], entityStatuses: Option[List[String]], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): AdsList200Response = {
    // TODO: Implement better logic

    AdsList200Response(List.empty[AdResponse], None)
  }

  /**
    * @inheritdoc
    */
  override def adsUpdate(adAccountId: String, adUpdateRequest: List[AdUpdateRequest]): AdArrayResponse = {
    // TODO: Implement better logic

    AdArrayResponse(None)
  }
}
