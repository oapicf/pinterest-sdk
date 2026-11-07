package api

import model.Catalog
import model.CatalogCreate
import model.CatalogsAvailableFilterValues
import model.CatalogsList200Response
import model.CatalogsLocale
import model.Country
import model.Error

/**
  * Provides a default implementation for [[CatalogsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  override def catalogsCreate(catalogCreate: CatalogCreate, adAccountId: Option[String]): Catalog = {
    // TODO: Implement better logic

    Catalog(CatalogsType(), OffsetDateTime.now, "", "", OffsetDateTime.now)
  }

  /**
    * @inheritdoc
    */
  override def catalogsList(adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): CatalogsList200Response = {
    // TODO: Implement better logic

    CatalogsList200Response(None, List.empty[Catalog])
  }
}
