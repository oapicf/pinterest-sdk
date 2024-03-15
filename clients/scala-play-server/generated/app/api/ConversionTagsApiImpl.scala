package api

import model.ConversionEventResponse
import model.ConversionTagCreate
import model.ConversionTagListResponse
import model.ConversionTagResponse
import model.Error
import model.PageVisitConversionTagsGet200Response

/**
  * Provides a default implementation for [[ConversionTagsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class ConversionTagsApiImpl extends ConversionTagsApi {
  /**
    * @inheritdoc
    */
  override def conversionTagsCreate(adAccountId: String, conversionTagCreate: ConversionTagCreate): ConversionTagResponse = {
    // TODO: Implement better logic

    ConversionTagResponse(None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def conversionTagsGet(adAccountId: String, conversionTagId: String): ConversionTagResponse = {
    // TODO: Implement better logic

    ConversionTagResponse(None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def conversionTagsList(adAccountId: String, filterDeleted: Option[Boolean]): ConversionTagListResponse = {
    // TODO: Implement better logic

    ConversionTagListResponse(None)
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
  override def pageVisitConversionTagsGet(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): PageVisitConversionTagsGet200Response = {
    // TODO: Implement better logic

    PageVisitConversionTagsGet200Response(List.empty[ConversionEventResponse], None)
  }
}
