package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.RelatedTerms

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class TermsApiController @Inject()(cc: ControllerComponents, api: TermsApi) extends AbstractController(cc) {
  /**
    * GET /v5/terms/related?terms=[value]
    */
  def termsRelatedList(): Action[AnyContent] = Action { request =>
    def executeApi(): RelatedTerms = {
      val terms = request.queryString.get("terms")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("terms", "query string")
        }
        
      api.termsRelatedList(terms)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/terms/suggested?term=[value]&limit=[value]
    */
  def termsSuggestedList(): Action[AnyContent] = Action { request =>
    def executeApi(): List[String] = {
      val term = request.getQueryString("term")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("term", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.termsSuggestedList(term, limit)
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
