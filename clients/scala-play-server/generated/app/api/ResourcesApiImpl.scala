package api

import model.AdAccountCountriesGet200Response
import model.BookClosed
import model.DeliveryMetricsGet200Response
import model.Error
import model.JsObject
import model.PublicTargetingType
import model.ReportType
import model.SingleInterestTargetingOption

/**
  * Provides a default implementation for [[ResourcesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ResourcesApiImpl extends ResourcesApi {
  /**
    * @inheritdoc
    */
  override def adAccountCountriesGet(): AdAccountCountriesGet200Response = {
    // TODO: Implement better logic

    AdAccountCountriesGet200Response(List.empty[AdAccountsCountry])
  }

  /**
    * @inheritdoc
    */
  override def deliveryMetricsGet(reportType: Option[ReportType]): DeliveryMetricsGet200Response = {
    // TODO: Implement better logic

    DeliveryMetricsGet200Response(List.empty[DeliveryMetricsResponseItemsItems])
  }

  /**
    * @inheritdoc
    */
  override def interestTargetingOptionsGet(interestId: String): SingleInterestTargetingOption = {
    // TODO: Implement better logic

    SingleInterestTargetingOption(List.empty[String], "", 0, "")
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
  override def metricsReadyStateGet(date: String): BookClosed = {
    // TODO: Implement better logic

    BookClosed(false, false)
  }

  /**
    * @inheritdoc
    */
  override def targetingOptionsGet(targetingType: PublicTargetingType, adAccountId: Option[String], clientId: Option[String], oauthSignature: Option[String], timestamp: Option[String]): List[JsObject] = {
    // TODO: Implement better logic

    List.empty[JsObject]
  }
}
