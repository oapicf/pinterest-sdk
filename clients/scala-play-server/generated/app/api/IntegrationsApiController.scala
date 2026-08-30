package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.IntegrationLogsInvalidLogResponse
import model.IntegrationLogsRequestCreate
import model.IntegrationLogsSuccessResponse
import model.IntegrationMetadata
import model.IntegrationMetadataCreate
import model.IntegrationMetadataUpdate
import model.IntegrationRecord
import model.IntegrationsGetList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class IntegrationsApiController @Inject()(cc: ControllerComponents, api: IntegrationsApi) extends AbstractController(cc) {
  /**
    * DELETE /v5/integrations/commerce/:externalBusinessId
    * @param externalBusinessId External business ID for the integration.
    */
  def integrationsCommerceDel(externalBusinessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): IntegrationMetadata = {
      api.integrationsCommerceDel(externalBusinessId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
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
      val integrationMetadataUpdate = request.body.asJson.map(_.as[IntegrationMetadataUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "integrationMetadataUpdate")
      }
      api.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate)
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
      val integrationMetadataCreate = request.body.asJson.map(_.as[IntegrationMetadataCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "integrationMetadataCreate")
      }
      api.integrationsCommercePost(integrationMetadataCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/integrations/:id
    * @param id Integration record ID.
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
      val integrationLogsRequestCreate = request.body.asJson.map(_.as[IntegrationLogsRequestCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "integrationLogsRequestCreate")
      }
      api.integrationsLogsPost(integrationLogsRequestCreate)
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
