package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.Media
import model.MediaList200Response
import model.MediaUpload
import model.MediaUploadCreate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class MediaApiController @Inject()(cc: ControllerComponents, api: MediaApi) extends AbstractController(cc) {
  /**
    * POST /v5/media
    */
  def mediaCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): MediaUpload = {
      val mediaUploadCreate = request.body.asJson.map(_.as[MediaUploadCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "mediaUploadCreate")
      }
      api.mediaCreate(mediaUploadCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/media/:mediaId
    * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    */
  def mediaGet(mediaId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Media = {
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
