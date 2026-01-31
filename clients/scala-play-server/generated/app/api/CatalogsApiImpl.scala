package api

import model.Catalog
import model.CatalogsAvailableFilterValues
import model.CatalogsCreateRequest
import model.CatalogsList200Response
import model.CatalogsLocale
import model.Country
import model.Error

/**
  * Provides a default implementation for [[CatalogsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class CatalogsApiImpl extends CatalogsApi {
  /**
    * @inheritdoc
    */
  override def catalogsAvailableFilterValues(catalogId: String, feedId: Option[String], country: Option[Country], language: Option[CatalogsLocale], adAccountId: Option[String]): CatalogsAvailableFilterValues = {
    // TODO: Implement better logic

    CatalogsAvailableFilterValues("", CatalogsCreativeAssetsFilterValuesMap(None, None, None, None, None, None, None, None, None, None, None, None, None), Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsCreate(catalogsCreateRequest: CatalogsCreateRequest, adAccountId: Option[String]): Catalog = {
    // TODO: Implement better logic

    Catalog(OffsetDateTime.now, "", OffsetDateTime.now, CatalogsType(), "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsList(bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): CatalogsList200Response = {
    // TODO: Implement better logic

    CatalogsList200Response(None, List.empty[Catalog])
  }
}
