package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.ProductTagsBulkAddRequest
import model.ProductTagsBulkDeleteRequest
import model.ProductTagsError
import model.ProductTagsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class ProductTagsApiController @Inject()(cc: ControllerComponents, api: ProductTagsApi) extends AbstractController(cc) {
  /**
    * POST /v5/pins/:pinId/product_tags
    * @param pinId Unique identifier of the hero pin that will receive product tags.
    */
  def productTagsBulkAdd(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProductTagsResponse = {
      val productTagsBulkAddRequest = request.body.asJson.map(_.as[ProductTagsBulkAddRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "productTagsBulkAddRequest")
      }
      api.productTagsBulkAdd(pinId, productTagsBulkAddRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/pins/:pinId/product_tags/bulk-delete
    * @param pinId Unique identifier of the hero pin that will receive product tags.
    */
  def productTagsBulkDelete(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val productTagsBulkDeleteRequest = request.body.asJson.map(_.as[ProductTagsBulkDeleteRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "productTagsBulkDeleteRequest")
      }
      api.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/pins/:pinId/product_tags
    * @param pinId Unique identifier of the hero pin that will receive product tags.
    */
  def productTagsList(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProductTagsResponse = {
      api.productTagsList(pinId)
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
