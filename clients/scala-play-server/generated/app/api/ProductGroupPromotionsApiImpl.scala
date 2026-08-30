package api

import model.BigDecimal
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.PaginationOrder
import model.ProductGroupAnalyticsItems
import model.ProductGroupPromotion
import model.ProductGroupPromotions
import model.ProductGroupPromotionsCreate
import model.ProductGroupPromotionsList200Response
import model.ProductGroupPromotionsUpdateWithRequiredBody
import model.ReportingColumnSync
import model.ReportingTimeZone

/**
  * Provides a default implementation for [[ProductGroupPromotionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ProductGroupPromotionsApiImpl extends ProductGroupPromotionsApi {
  /**
    * @inheritdoc
    */
  override def productGroupPromotionsCreate(adAccountId: String, productGroupPromotionsCreate: ProductGroupPromotionsCreate): ProductGroupPromotions = {
    // TODO: Implement better logic

    ProductGroupPromotions(None)
  }

  /**
    * @inheritdoc
    */
  override def productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String): ProductGroupPromotion = {
    // TODO: Implement better logic

    ProductGroupPromotion(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def productGroupPromotionsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], productGroupPromotionIds: Option[List[String]], entityStatuses: Option[List[EntityStatus]], adGroupId: Option[String]): ProductGroupPromotionsList200Response = {
    // TODO: Implement better logic

    ProductGroupPromotionsList200Response(None, List.empty[ProductGroupPromotion])
  }

  /**
    * @inheritdoc
    */
  override def productGroupPromotionsUpdate(adAccountId: String, productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody): ProductGroupPromotions = {
    // TODO: Implement better logic

    ProductGroupPromotions(None)
  }

  /**
    * @inheritdoc
    */
  override def productGroupsAnalytics(startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String], columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], reportingTimezone: Option[ReportingTimeZone]): List[ProductGroupAnalyticsItems] = {
    // TODO: Implement better logic

    List.empty[ProductGroupAnalyticsItems]
  }
}
