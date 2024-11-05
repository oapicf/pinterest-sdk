package api

import model.AdAccount
import model.AdAccountAnalyticsResponseInner
import model.AdAccountCreateRequest
import model.AdAccountsList200Response
import model.AdsAnalyticsCreateAsyncRequest
import model.AdsAnalyticsCreateAsyncResponse
import model.AdsAnalyticsGetAsyncResponse
import model.AdsAnalyticsTargetingType
import model.ConversionReportAttributionType
import model.CreateMMMReportRequest
import model.CreateMMMReportResponse
import model.Error
import model.GetMMMReportResponse
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse
import model.TemplatesList200Response

/**
  * Provides a default implementation for [[AdAccountsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class AdAccountsApiImpl extends AdAccountsApi {
  /**
    * @inheritdoc
    */
  override def adAccountAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[AdAccountAnalyticsResponseInner] = {
    // TODO: Implement better logic

    List.empty[AdAccountAnalyticsResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def adAccountTargetingAnalyticsGet(adAccountId: String, startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsCreate(adAccountCreateRequest: AdAccountCreateRequest): AdAccount = {
    // TODO: Implement better logic

    AdAccount(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsGet(adAccountId: String): AdAccount = {
    // TODO: Implement better logic

    AdAccount(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsList(bookmark: Option[String], pageSize: Option[Int], includeSharedAccounts: Option[Boolean]): AdAccountsList200Response = {
    // TODO: Implement better logic

    AdAccountsList200Response(List.empty[AdAccount], None)
  }

  /**
    * @inheritdoc
    */
  override def analyticsCreateMmmReport(adAccountId: String, createMMMReportRequest: CreateMMMReportRequest): CreateMMMReportResponse = {
    // TODO: Implement better logic

    CreateMMMReportResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def analyticsCreateReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest): AdsAnalyticsCreateAsyncResponse = {
    // TODO: Implement better logic

    AdsAnalyticsCreateAsyncResponse(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def analyticsCreateTemplateReport(adAccountId: String, templateId: String, startDate: Option[LocalDate], endDate: Option[LocalDate], granularity: Option[Granularity]): AdsAnalyticsCreateAsyncResponse = {
    // TODO: Implement better logic

    AdsAnalyticsCreateAsyncResponse(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def analyticsGetMmmReport(adAccountId: String, token: String): GetMMMReportResponse = {
    // TODO: Implement better logic

    GetMMMReportResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def analyticsGetReport(adAccountId: String, token: String): AdsAnalyticsGetAsyncResponse = {
    // TODO: Implement better logic

    AdsAnalyticsGetAsyncResponse(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def sandboxDelete(adAccountId: String): String = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def templatesList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): TemplatesList200Response = {
    // TODO: Implement better logic

    TemplatesList200Response(List.empty[TemplateResponse], None)
  }
}
