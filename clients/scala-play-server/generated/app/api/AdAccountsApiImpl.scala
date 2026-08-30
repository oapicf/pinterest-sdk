package api

import model.AdAccount
import model.AdAccountAnalyticsItems
import model.AdAccountCreate
import model.AdAccountsList200Response
import model.AdsAnalyticsAccountTargetingType
import model.AdsAnalyticsCreateAsyncRequest
import model.AdsAnalyticsCreateAsyncResponse
import model.AdsAnalyticsGetAsyncResponse
import model.BigDecimal
import model.ConversionProductReport
import model.ConversionProductReportCreate
import model.ConversionReportAttributionType
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MMMReport
import model.MMMReportCreate
import model.MetricsResponse
import model.PaginationOrder
import model.ReportingColumnSync
import model.ReportingTimeZone
import model.TemplateBasedReport
import model.TemplatesList200Response

/**
  * Provides a default implementation for [[AdAccountsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class AdAccountsApiImpl extends AdAccountsApi {
  /**
    * @inheritdoc
    */
  override def adAccountAnalytics(startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], reportingTimezone: Option[ReportingTimeZone]): List[AdAccountAnalyticsItems] = {
    // TODO: Implement better logic

    List.empty[AdAccountAnalyticsItems]
  }

  /**
    * @inheritdoc
    */
  override def adAccountTargetingAnalyticsGet(adAccountId: String, startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAccountTargetingType], columns: List[ReportingColumnSync], granularity: Granularity, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], attributionTypes: Option[List[ConversionReportAttributionType]], reportingTimezone: Option[ReportingTimeZone]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsCreate(adAccountCreate: AdAccountCreate): AdAccount = {
    // TODO: Implement better logic

    AdAccount(None, None, None, "", None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsGet(adAccountId: String): AdAccount = {
    // TODO: Implement better logic

    AdAccount(None, None, None, "", None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsList(includeSharedAccounts: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): AdAccountsList200Response = {
    // TODO: Implement better logic

    AdAccountsList200Response(None, List.empty[AdAccount])
  }

  /**
    * @inheritdoc
    */
  override def analyticsCreateConversionProductReport(adAccountId: String, conversionProductReportCreate: ConversionProductReportCreate): ConversionProductReport = {
    // TODO: Implement better logic

    ConversionProductReport(None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def analyticsCreateMmmReport(adAccountId: String, mMMReportCreate: MMMReportCreate): MMMReport = {
    // TODO: Implement better logic

    MMMReport(None, None, None, None, None, None)
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
  override def analyticsCreateTemplateReport(adAccountId: String, templateId: String, startDate: Option[LocalDate], endDate: Option[LocalDate], granularity: Option[Granularity]): TemplateBasedReport = {
    // TODO: Implement better logic

    TemplateBasedReport(None, BulkReportingJobStatus(), "", None)
  }

  /**
    * @inheritdoc
    */
  override def analyticsGetConversionProductReport(adAccountId: String, token: String): ConversionProductReport = {
    // TODO: Implement better logic

    ConversionProductReport(None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def analyticsGetMmmReport(adAccountId: String, token: String): MMMReport = {
    // TODO: Implement better logic

    MMMReport(None, None, None, None, None, None)
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
  override def templatesList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): TemplatesList200Response = {
    // TODO: Implement better logic

    TemplatesList200Response(None, List.empty[AccountTemplate])
  }
}
