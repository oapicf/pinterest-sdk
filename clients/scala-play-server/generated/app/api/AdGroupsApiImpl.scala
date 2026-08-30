package api

import model.AdGroup
import model.AdGroupAudienceSizing
import model.AdGroupAudienceSizingCreate
import model.AdGroupCreateCreate
import model.AdGroupUpdateBatchUpdate
import model.AdGroupsAnalyticsMetrics
import model.AdGroupsCreate200Response
import model.AdGroupsList200Response
import model.AdsAnalyticsAdGroupTargetingType
import model.BidFloor
import model.BidFloorCreate
import model.BigDecimal
import model.ConversionReportAttributionType
import model.DynamicTitlesDownloadCSV
import model.DynamicTitlesGetStatus
import model.DynamicTitlesProcessCSV
import model.DynamicTitlesProcessCSVCreate
import model.DynamicTitlesUploadURL
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse
import model.PaginationOrder
import model.ReportingColumnSync
import model.ReportingTimeZone

/**
  * Provides a default implementation for [[AdGroupsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class AdGroupsApiImpl extends AdGroupsApi {
  /**
    * @inheritdoc
    */
  override def adGroupsAnalytics(startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String], columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], aggregateReportRows: Option[Boolean], reportingTimezone: Option[ReportingTimeZone]): List[AdGroupsAnalyticsMetrics] = {
    // TODO: Implement better logic

    List.empty[AdGroupsAnalyticsMetrics]
  }

  /**
    * @inheritdoc
    */
  override def adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate): AdGroupAudienceSizing = {
    // TODO: Implement better logic

    AdGroupAudienceSizing(None, None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsBidFloorGet(adAccountId: String, bidFloorCreate: BidFloorCreate): BidFloor = {
    // TODO: Implement better logic

    BidFloor(None, None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsCreate(adAccountId: String, adGroupCreateCreate: List[AdGroupCreateCreate]): AdGroupsCreate200Response = {
    // TODO: Implement better logic

    AdGroupsCreate200Response(List.empty[AdGroupsCreate200ResponseItemsInner])
  }

  /**
    * @inheritdoc
    */
  override def adGroupsDynamicTitlesDownloadCsv(adAccountId: String, adGroupId: String): DynamicTitlesDownloadCSV = {
    // TODO: Implement better logic

    DynamicTitlesDownloadCSV(None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsDynamicTitlesGetStatus(adAccountId: String, adGroupId: String): DynamicTitlesGetStatus = {
    // TODO: Implement better logic

    DynamicTitlesGetStatus(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsDynamicTitlesGetUploadUrl(adAccountId: String, adGroupId: String): DynamicTitlesUploadURL = {
    // TODO: Implement better logic

    DynamicTitlesUploadURL(None, "", "")
  }

  /**
    * @inheritdoc
    */
  override def adGroupsDynamicTitlesProcessCsv(adAccountId: String, adGroupId: String, dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate): DynamicTitlesProcessCSV = {
    // TODO: Implement better logic

    DynamicTitlesProcessCSV(None, None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsGet(adGroupId: String, adAccountId: String): AdGroup = {
    // TODO: Implement better logic

    AdGroup(None, None, None, ActionType(), None, "", ConversionLearningModeType(), 0, None, None, None, None, None, "", None, None, None, None, "", None, None, None, None, None, None, None, None, None, SummaryStatus(), None, None, None, adgroup, 0, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], campaignIds: Option[List[String]], adGroupIds: Option[List[String]], entityStatuses: Option[List[EntityStatus]], translateInterestsToNames: Option[Boolean]): AdGroupsList200Response = {
    // TODO: Implement better logic

    AdGroupsList200Response(None, List.empty[AdGroup])
  }

  /**
    * @inheritdoc
    */
  override def adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdGroupTargetingType], columns: List[ReportingColumnSync], granularity: Granularity, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], attributionTypes: Option[List[ConversionReportAttributionType]], reportingTimezone: Option[ReportingTimeZone], sortColumns: Option[List[String]], sortAscending: Option[Boolean]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsUpdate(adAccountId: String, adGroupUpdateBatchUpdate: List[AdGroupUpdateBatchUpdate]): AdGroupsCreate200Response = {
    // TODO: Implement better logic

    AdGroupsCreate200Response(List.empty[AdGroupsCreate200ResponseItemsInner])
  }

  /**
    * @inheritdoc
    */
  override def getAdGroupsByPromotionIdsList(adAccountId: String, promotionIds: List[String], bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): AdGroupsList200Response = {
    // TODO: Implement better logic

    AdGroupsList200Response(None, List.empty[AdGroup])
  }
}
