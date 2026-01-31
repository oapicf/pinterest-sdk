package api

import model.CreativeType
import model.Error
import java.time.LocalDate
import model.Pin
import model.PinAnalyticsMetricsResponse
import model.PinCreate
import model.PinUpdate
import model.PinsList200Response
import model.PinsSaveRequest

/**
  * Provides a default implementation for [[PinsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class PinsApiImpl extends PinsApi {
  /**
    * @inheritdoc
    */
  override def multiPinsAnalytics(pinIds: List[String], startDate: LocalDate, endDate: LocalDate, metricTypes: List[String], appTypes: Option[String], adAccountId: Option[String]): Map[String, Map[String, PinAnalyticsMetricsResponse]] = {
    // TODO: Implement better logic

    Map.empty[String, Map]
  }

  /**
    * @inheritdoc
    */
  override def pinsAnalytics(pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: List[String], appTypes: Option[String], splitField: Option[String], adAccountId: Option[String]): Map[String, PinAnalyticsMetricsResponse] = {
    // TODO: Implement better logic

    Map.empty[String, PinAnalyticsMetricsResponse]
  }

  /**
    * @inheritdoc
    */
  override def pinsCreate(pinCreate: PinCreate, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pinsDelete(pinId: String, adAccountId: Option[String]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def pinsGet(pinId: String, adAccountId: Option[String], pinMetrics: Option[Boolean]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pinsList(pinFilter: Option[String], pinMetrics: Option[Boolean], includeProtectedPins: Option[Boolean], pinType: Option[String], creativeTypes: Option[List[CreativeType]], adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): PinsList200Response = {
    // TODO: Implement better logic

    PinsList200Response(None, List.empty[Pin])
  }

  /**
    * @inheritdoc
    */
  override def pinsSave(pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pinsUpdate(pinId: String, pinUpdate: PinUpdate, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, "", None, None, None, None, None, None, None)
  }
}
