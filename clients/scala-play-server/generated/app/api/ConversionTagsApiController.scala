package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConversionEventResponse
import model.ConversionTagCreate
import model.ConversionTagListResponse
import model.ConversionTagResponse
import model.Error
import model.PageVisitConversionTagsGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class ConversionTagsApiController @Inject()(cc: ControllerComponents, api: ConversionTagsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/conversion_tags
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionTagsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionTagResponse = {
      val conversionTagCreate = request.body.asJson.map(_.as[ConversionTagCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "conversionTagCreate")
      }
      api.conversionTagsCreate(adAccountId, conversionTagCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/conversion_tags/:conversionTagId
    * @param adAccountId Unique identifier of an ad account.
    * @param conversionTagId Id of the conversion tag.
    */
  def conversionTagsGet(adAccountId: String, conversionTagId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionTagResponse = {
      api.conversionTagsGet(adAccountId, conversionTagId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/conversion_tags?filterDeleted=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionTagsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionTagListResponse = {
      val filterDeleted = request.getQueryString("filter_deleted")
        .map(value => value.toBoolean)
        
      api.conversionTagsList(adAccountId, filterDeleted)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/conversion_tags/ocpm_eligible
    * @param adAccountId Unique identifier of an ad account.
    */
  def ocpmEligibleConversionTagsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Map[String, List[ConversionEventResponse]] = {
      api.ocpmEligibleConversionTagsGet(adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/conversion_tags/page_visit?pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def pageVisitConversionTagsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): PageVisitConversionTagsGet200Response = {
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark)
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
