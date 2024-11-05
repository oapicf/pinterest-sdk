package api

import model.AdAccountsCountryResponse
import model.BookClosedResponse
import model.DeliveryMetricsResponse
import model.Error
import model.JsObject
import model.SingleInterestTargetingOptionResponse

/**
  * Provides a default implementation for [[ResourcesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class ResourcesApiImpl extends ResourcesApi {
  /**
    * @inheritdoc
    */
  override def adAccountCountriesGet(): AdAccountsCountryResponse = {
    // TODO: Implement better logic

    AdAccountsCountryResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def deliveryMetricsGet(reportType: Option[String]): DeliveryMetricsResponse = {
    // TODO: Implement better logic

    DeliveryMetricsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def interestTargetingOptionsGet(interestId: String): SingleInterestTargetingOptionResponse = {
    // TODO: Implement better logic

    SingleInterestTargetingOptionResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def leadFormQuestionsGet(): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def metricsReadyStateGet(date: String): BookClosedResponse = {
    // TODO: Implement better logic

    BookClosedResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def targetingOptionsGet(targetingType: String, clientId: Option[String], oauthSignature: Option[String], timestamp: Option[String], adAccountId: Option[String]): List[JsObject] = {
    // TODO: Implement better logic

    List.empty[JsObject]
  }
}
