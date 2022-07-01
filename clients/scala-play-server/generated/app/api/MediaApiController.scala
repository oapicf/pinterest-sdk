package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.JsObject
import model.MediaUpload
import model.MediaUploadDetails
import model.MediaUploadRequest
import model.Paginated

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
@Singleton
class MediaApiController @Inject()(cc: ControllerComponents, api: MediaApi) extends AbstractController(cc) {
  /**
    * POST /v5/media
    */
  def mediaCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): MediaUpload = {
      val mediaUploadRequest = request.body.asJson.map(_.as[MediaUploadRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "mediaUploadRequest")
      }
      api.mediaCreate(mediaUploadRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/media/:mediaId
    * @param mediaId Media identifier
    */
  def mediaGet(mediaId: String): Action[AnyContent] = Action { request =>
    def executeApi(): MediaUploadDetails = {
      api.mediaGet(mediaId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/media?bookmark=[value]&pageSize=[value]
    */
  def mediaList(): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      api.mediaList(bookmark, pageSize)
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
