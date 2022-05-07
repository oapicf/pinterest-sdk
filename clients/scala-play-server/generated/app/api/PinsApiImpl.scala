package api

import model.AnalyticsMetricsResponse
import model.Error
import java.time.LocalDate
import model.Pin

/**
  * Provides a default implementation for [[PinsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
class PinsApiImpl extends PinsApi {
  /**
    * @inheritdoc
    */
  override def pinsAnalytics(pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: List[String], appTypes: Option[String], splitField: Option[String], adAccountId: Option[String]): Map[String, AnalyticsMetricsResponse] = {
    // TODO: Implement better logic

    Map.empty[String, AnalyticsMetricsResponse]
  }

  /**
    * @inheritdoc
    */
  override def pinsCreate(pin: Pin): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def pinsDelete(pinId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def pinsGet(pinId: String, adAccountId: Option[String]): Pin = {
    // TODO: Implement better logic

    Pin(None, None, None, None, None, None, None, None, None, None, None, Map.empty)
  }
}
