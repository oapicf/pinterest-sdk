package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.MediaList200Response
import model.MediaUpload
import model.MediaUploadDetails
import model.MediaUploadRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
    def executeApi(): MediaList200Response = {
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
