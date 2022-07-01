package api

import model.AdsAnalyticsCreateAsyncRequest
import model.AdsAnalyticsCreateAsyncResponse
import model.AdsAnalyticsGetAsyncResponse
import model.Error
import model.Granularity
import model.JsObject
import java.time.LocalDate
import model.OasAnyTypeNotMapped
import model.Paginated

/**
  * Provides a default implementation for [[AdAccountsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
class AdAccountsApiImpl extends AdAccountsApi {
  /**
    * @inheritdoc
    */
  override def adAccountAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[Map[String, JsObject]] = {
    // TODO: Implement better logic

    List.empty[Map]
  }

  /**
    * @inheritdoc
    */
  override def adAccountsList(bookmark: Option[String], pageSize: Option[Int], includeSharedAccounts: Option[Boolean]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[Map[String, JsObject]] = {
    // TODO: Implement better logic

    List.empty[Map]
  }

  /**
    * @inheritdoc
    */
  override def adGroupsList(adAccountId: String, campaignIds: Option[List[String]], adGroupIds: Option[List[String]], entityStatuses: Option[List[String]], pageSize: Option[Int], order: Option[String], bookmark: Option[String], translateInterestsToNames: Option[Boolean]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def adsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, adIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[Map[String, JsObject]] = {
    // TODO: Implement better logic

    List.empty[Map]
  }

  /**
    * @inheritdoc
    */
  override def adsList(adAccountId: String, campaignIds: Option[List[String]], adGroupIds: Option[List[String]], adIds: Option[List[String]], entityStatuses: Option[List[String]], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def analyticsCreateReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest): AdsAnalyticsCreateAsyncResponse = {
    // TODO: Implement better logic

    AdsAnalyticsCreateAsyncResponse(None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def analyticsGetReport(adAccountId: String, token: String): AdsAnalyticsGetAsyncResponse = {
    // TODO: Implement better logic

    AdsAnalyticsGetAsyncResponse(None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def campaignsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, campaignIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[Map[String, JsObject]] = {
    // TODO: Implement better logic

    List.empty[Map]
  }

  /**
    * @inheritdoc
    */
  override def campaignsList(adAccountId: String, campaignIds: Option[List[String]], entityStatuses: Option[List[String]], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def productGroupsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[Map[String, JsObject]] = {
    // TODO: Implement better logic

    List.empty[Map]
  }
}
