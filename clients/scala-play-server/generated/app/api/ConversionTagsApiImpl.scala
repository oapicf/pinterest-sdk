package api

import model.ConversionEventResponse
import model.ConversionTag
import model.ConversionTagCreate
import model.ConversionTagsList200Response
import model.Error
import model.PageVisitConversionTagsGet200Response
import model.PaginationOrder

/**
  * Provides a default implementation for [[ConversionTagsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ConversionTagsApiImpl extends ConversionTagsApi {
  /**
    * @inheritdoc
    */
  override def conversionTagsCreate(adAccountId: String, conversionTagCreate: ConversionTagCreate): ConversionTag = {
    // TODO: Implement better logic

    ConversionTag(None, None, None, None, None, "", None, "", None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def conversionTagsGet(adAccountId: String, conversionTagId: String): ConversionTag = {
    // TODO: Implement better logic

    ConversionTag(None, None, None, None, None, "", None, "", None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def conversionTagsList(adAccountId: String, filterDeleted: Option[Boolean]): ConversionTagsList200Response = {
    // TODO: Implement better logic

    ConversionTagsList200Response(List.empty[ConversionTag])
  }

  /**
    * @inheritdoc
    */
  override def ocpmEligibleConversionTagsGet(adAccountId: String): Map[String, List[ConversionEventResponse]] = {
    // TODO: Implement better logic

    Map.empty[String, List]
  }

  /**
    * @inheritdoc
    */
  override def pageVisitConversionTagsGet(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): PageVisitConversionTagsGet200Response = {
    // TODO: Implement better logic

    PageVisitConversionTagsGet200Response(None, List.empty[ConversionEventResponse])
  }
}
