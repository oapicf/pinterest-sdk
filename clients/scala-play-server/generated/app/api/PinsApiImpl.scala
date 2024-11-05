package api

import model.Error
import java.time.LocalDate
import model.Pin
import model.PinAnalyticsMetricsResponse
import model.PinCreate
import model.PinUpdate
import model.PinsAnalyticsMetricTypesParameterInner
import model.PinsList200Response
import model.PinsSaveRequest

/**
  * Provides a default implementation for [[PinsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class PinsApiImpl extends PinsApi {
  /**
    * @inheritdoc
    */
  override def multiPinsAnalytics(pinIds: List[String], startDate: LocalDate, endDate: LocalDate, metricTypes: List[PinsAnalyticsMetricTypesParameterInner], appTypes: Option[String], adAccountId: Option[String]): Map[String, Map[String, PinAnalyticsMetricsResponse]] = {
    // TODO: Implement better logic

    Map.empty[String, Map]
  }

  /**
    * @inheritdoc
    */
  override def pinsAnalytics(pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: List[PinsAnalyticsMetricTypesParameterInner], appTypes: Option[String], splitField: Option[String], adAccountId: Option[String]): Map[String, PinAnalyticsMetricsResponse] = {
    // TODO: Implement better logic

    Map.empty[String, PinAnalyticsMetricsResponse]
  }

  /**
    * @inheritdoc
    */
  override def pinsCreate(pinCreate: PinCreate, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
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
  override def pinsGet(pinId: String, pinMetrics: Option[Boolean], adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pinsList(bookmark: Option[String], pageSize: Option[Int], pinFilter: Option[String], includeProtectedPins: Option[Boolean], pinType: Option[String], creativeTypes: Option[List[String]], adAccountId: Option[String], pinMetrics: Option[Boolean]): PinsList200Response = {
    // TODO: Implement better logic

    PinsList200Response(List.empty[Pin], None)
  }

  /**
    * @inheritdoc
    */
  override def pinsSave(pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pinsUpdate(pinId: String, pinUpdate: PinUpdate, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
