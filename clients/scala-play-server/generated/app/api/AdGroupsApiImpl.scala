package api

import model.AdGroupArrayResponse
import model.AdGroupAudienceSizingRequest
import model.AdGroupAudienceSizingResponse
import model.AdGroupCreateRequest
import model.AdGroupResponse
import model.AdGroupUpdateRequest
import model.AdGroupsAnalyticsResponseInner
import model.AdGroupsList200Response
import model.AdsAnalyticsTargetingType
import model.BidFloor
import model.BidFloorRequest
import model.ConversionReportAttributionType
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse

/**
  * Provides a default implementation for [[AdGroupsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class AdGroupsApiImpl extends AdGroupsApi {
  /**
    * @inheritdoc
    */
  override def adGroupsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): List[AdGroupsAnalyticsResponseInner] = {
    // TODO: Implement better logic

    List.empty[AdGroupsAnalyticsResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingRequest: Option[AdGroupAudienceSizingRequest]): AdGroupAudienceSizingResponse = {
    // TODO: Implement better logic

    AdGroupAudienceSizingResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsBidFloorGet(adAccountId: String, bidFloorRequest: BidFloorRequest): BidFloor = {
    // TODO: Implement better logic

    BidFloor(None, None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsCreate(adAccountId: String, adGroupCreateRequest: List[AdGroupCreateRequest]): AdGroupArrayResponse = {
    // TODO: Implement better logic

    AdGroupArrayResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsGet(adAccountId: String, adGroupId: String): AdGroupResponse = {
    // TODO: Implement better logic

    AdGroupResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsList(adAccountId: String, campaignIds: Option[List[String]], adGroupIds: Option[List[String]], entityStatuses: Option[List[String]], pageSize: Option[Int], order: Option[String], bookmark: Option[String], translateInterestsToNames: Option[Boolean]): AdGroupsList200Response = {
    // TODO: Implement better logic

    AdGroupsList200Response(List.empty[AdGroupResponse], None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]): MetricsResponse = {
    // TODO: Implement better logic

    MetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def adGroupsUpdate(adAccountId: String, adGroupUpdateRequest: List[AdGroupUpdateRequest]): AdGroupArrayResponse = {
    // TODO: Implement better logic

    AdGroupArrayResponse(None)
  }
}
