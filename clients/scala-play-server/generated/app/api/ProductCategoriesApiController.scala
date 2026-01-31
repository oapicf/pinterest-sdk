package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AgeTrendsBucket
import model.Error
import model.FeaturedTrend
import model.GenderBucket
import model.InterestsEnum
import model.ProductCategoriesEngagementType
import model.ProductCategoryDetailLookbackWindow
import model.ProductCategoryDetails
import model.ProductCategoryEnum
import model.ProductCategoryRegion
import model.TrendingProductCategory
import model.VerticalProductCategory

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ProductCategoriesApiController @Inject()(cc: ControllerComponents, api: ProductCategoriesApi) extends AbstractController(cc) {
  /**
    * GET /v5/trends/topics/featured?interest=[value]&region=[value]
    */
  def trendsFeaturedTopicsList(): Action[AnyContent] = Action { request =>
    def executeApi(): List[FeaturedTrend] = {
      val interest = request.getQueryString("interest")
        .map(value => )
        
      val region = request.getQueryString("region")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("region", "query string")
        }
        
      api.trendsFeaturedTopicsList(region, interest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/trends/product_categories/details?productCategories=[value]&region=[value]&lookbackWindow=[value]&engagementType=[value]
    */
  def trendsProductCategoriesDetailsList(): Action[AnyContent] = Action { request =>
    def executeApi(): List[ProductCategoryDetails] = {
      val productCategories = request.queryString.get("product_categories")
        .map(_.toList)
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("product_categories", "query string")
        }
        
      val region = request.getQueryString("region")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("region", "query string")
        }
        
      val lookbackWindow = request.getQueryString("lookback_window")
        .map(value => )
        
      val engagementType = request.getQueryString("engagement_type")
        .map(value => )
        
      api.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/trends/product_categories/trending?region=[value]&verticals=[value]&ages=[value]&genders=[value]&engagementType=[value]
    */
  def trendsProductCategoriesTrendingList(): Action[AnyContent] = Action { request =>
    def executeApi(): List[TrendingProductCategory] = {
      val region = request.getQueryString("region")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("region", "query string")
        }
        
      val verticals = request.queryString.get("verticals")
        .map(_.toList)
        .map(_.map(value => )
        
      val ages = request.queryString.get("ages")
        .map(_.toList)
        .map(_.map(value => )
        
      val genders = request.queryString.get("genders")
        .map(_.toList)
        .map(_.map(value => )
        
      val engagementType = request.getQueryString("engagement_type")
        .map(value => )
        
      api.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)
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
