package api

import model.Error
import model.Granularity
import java.time.LocalDate
import model.ProductGroupAnalyticsResponseInner
import model.ProductGroupPromotion
import model.ProductGroupPromotionCreateRequest
import model.ProductGroupPromotionResponse
import model.ProductGroupPromotionUpdateRequest
import model.ProductGroupPromotionsList200Response
import model.ReportingTimeZone

/**
  * Provides a default implementation for [[ProductGroupPromotionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ProductGroupPromotionsApiImpl extends ProductGroupPromotionsApi {
  /**
    * @inheritdoc
    */
  override def productGroupPromotionsCreate(adAccountId: String, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest): ProductGroupPromotionResponse = {
    // TODO: Implement better logic

    ProductGroupPromotionResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String): ProductGroupPromotion = {
    // TODO: Implement better logic

    ProductGroupPromotion(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def productGroupPromotionsList(adAccountId: String, productGroupPromotionIds: Option[List[String]], entityStatuses: Option[List[String]], adGroupId: Option[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): ProductGroupPromotionsList200Response = {
    // TODO: Implement better logic

    ProductGroupPromotionsList200Response(None, List.empty[ProductGroupPromotion])
  }

  /**
    * @inheritdoc
    */
  override def productGroupPromotionsUpdate(adAccountId: String, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest): ProductGroupPromotionResponse = {
    // TODO: Implement better logic

    ProductGroupPromotionResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def productGroupsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String], columns: List[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], reportingTimezone: Option[ReportingTimeZone]): List[ProductGroupAnalyticsResponseInner] = {
    // TODO: Implement better logic

    List.empty[ProductGroupAnalyticsResponseInner]
  }
}
