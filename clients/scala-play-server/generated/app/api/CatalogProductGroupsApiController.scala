package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CatalogsListProductsByFilterRequest
import model.CatalogsProductGroupPinsList200Response
import model.CatalogsProductGroupProductCountsVertical
import model.CatalogsProductGroupsCreateManyRequestItems
import model.CatalogsProductGroupsCreateRequestSchema
import model.CatalogsProductGroupsList200Response
import model.CatalogsProductGroupsUpdateRequestSchema
import model.CatalogsVerticalProductGroup
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CatalogProductGroupsApiController @Inject()(cc: ControllerComponents, api: CatalogProductGroupsApi) extends AbstractController(cc) {
  /**
    * GET /v5/catalogs/product_groups/:productGroupId/products?adAccountId=[value]&pinMetrics=[value]&bookmark=[value]&pageSize=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupPinsList(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupPinsList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val pinMetrics = request.getQueryString("pin_metrics")
        .map(value => value.toBoolean)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/product_groups?adAccountId=[value]
    */
  def catalogsProductGroupsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsVerticalProductGroup = {
      val catalogsProductGroupsCreateRequestSchema = request.body.asJson.map(_.as[CatalogsProductGroupsCreateRequestSchema]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsProductGroupsCreateRequestSchema")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/product_groups/multiple?adAccountId=[value]
    */
  def catalogsProductGroupsCreateMany(): Action[AnyContent] = Action { request =>
    def executeApi(): List[String] = {
      val catalogsProductGroupsCreateManyRequestItems = request.body.asJson.map(_.as[List[CatalogsProductGroupsCreateManyRequestItems]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsProductGroupsCreateManyRequestItems")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/catalogs/product_groups/:productGroupId?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsDelete(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsVerticalProductGroup = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsDelete(productGroupId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/catalogs/product_groups/multiple?id=[value]&adAccountId=[value]
    */
  def catalogsProductGroupsDeleteMany(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val id = request.getQueryString("id")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("id", "query string")
        }
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsDeleteMany(id, adAccountId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/catalogs/product_groups/:productGroupId?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsGet(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsVerticalProductGroup = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsGet(productGroupId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/product_groups?id=[value]&feedId=[value]&catalogId=[value]&adAccountId=[value]&bookmark=[value]&pageSize=[value]
    */
  def catalogsProductGroupsList(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupsList200Response = {
      val id = request.getQueryString("id")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toInt)
        
      val feedId = request.getQueryString("feed_id")
        
      val catalogId = request.getQueryString("catalog_id")
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/product_groups/:productGroupId/product_counts?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsProductCountsGet(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupProductCountsVertical = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/catalogs/product_groups/:productGroupId?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsUpdate(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsVerticalProductGroup = {
      val catalogsProductGroupsUpdateRequestSchema = request.body.asJson.map(_.as[CatalogsProductGroupsUpdateRequestSchema]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsProductGroupsUpdateRequestSchema")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/products/get_by_product_group_filters?bookmark=[value]&pageSize=[value]&adAccountId=[value]&pinMetrics=[value]
    */
  def productsByProductGroupFilterList(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupPinsList200Response = {
      val catalogsListProductsByFilterRequest = request.body.asJson.map(_.as[CatalogsListProductsByFilterRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsListProductsByFilterRequest")
      }
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      val pinMetrics = request.getQueryString("pin_metrics")
        .map(value => value.toBoolean)
        
      api.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
