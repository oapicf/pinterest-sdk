package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.DetailedError
import model.Error
import model.IntegrationLogsRequest
import model.IntegrationLogsSuccessResponse
import model.IntegrationMetadata
import model.IntegrationRecord
import model.IntegrationRequest
import model.IntegrationRequestPatch
import model.IntegrationsGetList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class IntegrationsApiController @Inject()(cc: ControllerComponents, api: IntegrationsApi) extends AbstractController(cc) {
  /**
    * DELETE /v5/integrations/commerce/:externalBusinessId
    * @param externalBusinessId External business ID for the integration.
    */
  def integrationsCommerceDel(externalBusinessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.integrationsCommerceDel(externalBusinessId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/integrations/commerce/:externalBusinessId
    * @param externalBusinessId External business ID for the integration.
    */
  def integrationsCommerceGet(externalBusinessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): IntegrationMetadata = {
      api.integrationsCommerceGet(externalBusinessId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/integrations/commerce/:externalBusinessId
    * @param externalBusinessId External business ID for the integration.
    */
  def integrationsCommercePatch(externalBusinessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): IntegrationMetadata = {
      val integrationRequestPatch = request.body.asJson.map(_.as[IntegrationRequestPatch])
      api.integrationsCommercePatch(externalBusinessId, integrationRequestPatch)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/integrations/commerce
    */
  def integrationsCommercePost(): Action[AnyContent] = Action { request =>
    def executeApi(): IntegrationMetadata = {
      val integrationRequest = request.body.asJson.map(_.as[IntegrationRequest])
      api.integrationsCommercePost(integrationRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/integrations/:id
    * @param id Integration ID.
    */
  def integrationsGetById(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): IntegrationRecord = {
      api.integrationsGetById(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/integrations?bookmark=[value]&pageSize=[value]
    */
  def integrationsGetList(): Action[AnyContent] = Action { request =>
    def executeApi(): IntegrationsGetList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.integrationsGetList(bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/integrations/logs
    */
  def integrationsLogsPost(): Action[AnyContent] = Action { request =>
    def executeApi(): IntegrationLogsSuccessResponse = {
      val integrationLogsRequest = request.body.asJson.map(_.as[IntegrationLogsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "integrationLogsRequest")
      }
      api.integrationsLogsPost(integrationLogsRequest)
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
