package api

import model.CreativeType
import model.Error
import java.time.LocalDate
import model.MultiPinsAnalyticsMetricTypesItem
import model.Pin
import model.PinAnalyticsMetricsResponse
import model.PinCreate
import model.PinFilter
import model.PinType
import model.PinUpdate
import model.PinsList200Response
import model.PinsSaveRequestCreate
import model.QuerypinanalyticsmetrictypesItems

/**
  * Provides a default implementation for [[PinsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class PinsApiImpl extends PinsApi {
  /**
    * @inheritdoc
    */
  override def multiPinsAnalytics(pinIds: List[String], startDate: LocalDate, endDate: LocalDate, metricTypes: List[MultiPinsAnalyticsMetricTypesItem], appTypes: Option[String], adAccountId: Option[String]): Map[String, Map[String, PinAnalyticsMetricsResponse]] = {
    // TODO: Implement better logic

    Map.empty[String, Map]
  }

  /**
    * @inheritdoc
    */
  override def pinsAnalytics(pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: List[QuerypinanalyticsmetrictypesItems], appTypes: Option[String], splitField: Option[String], adAccountId: Option[String]): Map[String, PinAnalyticsMetricsResponse] = {
    // TODO: Implement better logic

    Map.empty[String, PinAnalyticsMetricsResponse]
  }

  /**
    * @inheritdoc
    */
  override def pinsCreate(pinCreate: PinCreate, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def pinsDelete(pinId: String, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def pinsGet(pinId: String, adAccountId: Option[String], pinMetrics: Option[Boolean]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def pinsList(pinFilter: Option[PinFilter], pinMetrics: Option[Boolean], includeProtectedPins: Option[Boolean], pinType: Option[PinType], creativeTypes: Option[List[CreativeType]], adAccountId: Option[String], domain: Option[String], domains: Option[List[String]], includeProductTagObj: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): PinsList200Response = {
    // TODO: Implement better logic

    PinsList200Response(None, List.empty[Pin])
  }

  /**
    * @inheritdoc
    */
  override def pinsSave(pinId: String, pinsSaveRequestCreate: PinsSaveRequestCreate, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def pinsUpdate(pinId: String, pinUpdate: PinUpdate, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None, None, None, None, Map.empty)
  }
}
