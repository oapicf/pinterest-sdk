package api

import model.CatalogsListProductsByFilterRequest
import model.CatalogsProductGroupPinsList200Response
import model.CatalogsProductGroupProductCountsVertical
import model.CatalogsProductGroupsCreateManyRequestItems
import model.CatalogsProductGroupsCreateRequestSchema
import model.CatalogsProductGroupsList200Response
import model.CatalogsProductGroupsUpdateRequestSchema
import model.CatalogsVerticalProductGroup
import model.Error

/**
  * Provides a default implementation for [[CatalogProductGroupsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class CatalogProductGroupsApiImpl extends CatalogProductGroupsApi {
  /**
    * @inheritdoc
    */
  override def catalogsProductGroupPinsList(productGroupId: String, adAccountId: Option[String], pinMetrics: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): CatalogsProductGroupPinsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupPinsList200Response(None, List.empty[CatalogsProduct])
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup(null, "", None, None, None, "", CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys]), null, None, None, None, None, CatalogsHotelProductGroupType(), None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems: List[CatalogsProductGroupsCreateManyRequestItems], adAccountId: Option[String]): List[String] = {
    // TODO: Implement better logic

    List.empty[String]
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsDelete(productGroupId: String, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup(null, "", None, None, None, "", CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys]), null, None, None, None, None, CatalogsHotelProductGroupType(), None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsDeleteMany(id: List[Int], adAccountId: Option[String]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsGet(productGroupId: String, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup(null, "", None, None, None, "", CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys]), null, None, None, None, None, CatalogsHotelProductGroupType(), None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsList(id: Option[List[Int]], feedId: Option[String], catalogId: Option[String], adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): CatalogsProductGroupsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupsList200Response(None, List.empty[CatalogsVerticalProductGroup])
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsProductCountsGet(productGroupId: String, adAccountId: Option[String]): CatalogsProductGroupProductCountsVertical = {
    // TODO: Implement better logic

    CatalogsProductGroupProductCountsVertical("", null, null, null, null, null, null, null, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup(null, "", None, None, None, "", CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys]), null, None, None, None, None, CatalogsHotelProductGroupType(), None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]): CatalogsProductGroupPinsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupPinsList200Response(None, List.empty[CatalogsProduct])
  }
}
