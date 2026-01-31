package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.NotificationPostRequest
import model.NotificationResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class NotificationApiController @Inject()(cc: ControllerComponents, api: NotificationApi) extends AbstractController(cc) {
  /**
    * POST /v5/notifications
    */
  def notificationPost(): Action[AnyContent] = Action { request =>
    def executeApi(): NotificationResponse = {
      val notificationPostRequest = request.body.asJson.map(_.as[NotificationPostRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "notificationPostRequest")
      }
      api.notificationPost(notificationPostRequest)
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
