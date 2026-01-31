package api

import model.CatalogsListProductsByFilterRequest
import model.CatalogsProductGroupPinsList200Response
import model.CatalogsProductGroupProductCountsVertical
import model.CatalogsProductGroupsList200Response
import model.CatalogsProductGroupsUpdateRequest
import model.CatalogsVerticalProductGroup
import model.Error
import model.MultipleProductGroupsInner

/**
  * Provides a default implementation for [[CatalogProductGroupsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class CatalogProductGroupsApiImpl extends CatalogProductGroupsApi {
  /**
    * @inheritdoc
    */
  override def catalogsProductGroupPinsList(productGroupId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]): CatalogsProductGroupPinsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupPinsList200Response(None, List.empty[CatalogsProduct])
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsCreate(multipleProductGroupsInner: MultipleProductGroupsInner, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup("", "", None, None, None, "", CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], Map.empty), "", None, None, None, None, CatalogsHotelProductGroupType(), None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsCreateMany(multipleProductGroupsInner: List[MultipleProductGroupsInner], adAccountId: Option[String]): List[String] = {
    // TODO: Implement better logic

    List.empty[String]
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsDelete(productGroupId: String, adAccountId: Option[String]): Unit = {
    // TODO: Implement better logic

    
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

    CatalogsVerticalProductGroup("", "", None, None, None, "", CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], Map.empty), "", None, None, None, None, CatalogsHotelProductGroupType(), None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsList(id: Option[List[Int]], feedId: Option[String], catalogId: Option[String], bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): CatalogsProductGroupsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupsList200Response(None, List.empty[CatalogsVerticalProductGroup])
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsProductCountsGet(productGroupId: String, adAccountId: Option[String]): CatalogsProductGroupProductCountsVertical = {
    // TODO: Implement better logic

    CatalogsProductGroupProductCountsVertical(CatalogsType(), null, null, null, null, null)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup("", "", None, None, None, "", CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], Map.empty), "", None, None, None, None, CatalogsHotelProductGroupType(), None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]): CatalogsProductGroupPinsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupPinsList200Response(None, List.empty[CatalogsProduct])
  }
}
