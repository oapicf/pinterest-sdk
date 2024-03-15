package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdAccountsCatalogsProductGroupsList200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class ProductGroupsApiController @Inject()(cc: ControllerComponents, api: ProductGroupsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/product_groups/catalogs?feedProfileId=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountsCatalogsProductGroupsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsCatalogsProductGroupsList200Response = {
      val feedProfileId = request.getQueryString("feed_profile_id")
        
      api.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId)
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
