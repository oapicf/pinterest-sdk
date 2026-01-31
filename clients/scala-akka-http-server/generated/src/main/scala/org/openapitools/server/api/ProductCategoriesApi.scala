package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AgeTrendsBucket
import org.openapitools.server.model.Error
import org.openapitools.server.model.FeaturedTrend
import org.openapitools.server.model.GenderBucket
import org.openapitools.server.model.InterestsEnum
import org.openapitools.server.model.ProductCategoriesEngagementType
import org.openapitools.server.model.ProductCategoryDetailLookbackWindow
import org.openapitools.server.model.ProductCategoryDetails
import org.openapitools.server.model.ProductCategoryEnum
import org.openapitools.server.model.ProductCategoryRegion
import org.openapitools.server.model.TrendingProductCategory
import org.openapitools.server.model.VerticalProductCategory


class ProductCategoriesApi(
    productCategoriesService: ProductCategoriesApiService,
    productCategoriesMarshaller: ProductCategoriesApiMarshaller
) {

  
  import productCategoriesMarshaller._

  lazy val route: Route =
    path("trends" / "topics" / "featured") { 
      get { 
        parameters("interest".as[String].?, "region".as[String]) { (interest, region) => 
            productCategoriesService.trendsFeaturedTopicsList(region = region, interest = interest)
        }
      }
    } ~
    path("trends" / "product_categories" / "details") { 
      get { 
        parameters("product_categories".as[String], "region".as[String], "lookback_window".as[String].?, "engagement_type".as[String].?) { (productCategories, region, lookbackWindow, engagementType) => 
            productCategoriesService.trendsProductCategoriesDetailsList(productCategories = productCategories, region = region, lookbackWindow = lookbackWindow, engagementType = engagementType)
        }
      }
    } ~
    path("trends" / "product_categories" / "trending") { 
      get { 
        parameters("region".as[String], "verticals".as[String].?, "ages".as[String].?, "genders".as[String].?, "engagement_type".as[String].?) { (region, verticals, ages, genders, engagementType) => 
            productCategoriesService.trendsProductCategoriesTrendingList(region = region, verticals = verticals, ages = ages, genders = genders, engagementType = engagementType)
        }
      }
    }
}


trait ProductCategoriesApiService {

  def trendsFeaturedTopicsList200(responseFeaturedTrendarray: Seq[FeaturedTrend])(implicit toEntityMarshallerFeaturedTrendarray: ToEntityMarshaller[Seq[FeaturedTrend]]): Route =
    complete((200, responseFeaturedTrendarray))
  def trendsFeaturedTopicsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def trendsFeaturedTopicsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def trendsFeaturedTopicsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def trendsFeaturedTopicsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def trendsFeaturedTopicsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def trendsFeaturedTopicsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[FeaturedTrend]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def trendsFeaturedTopicsList(region: String, interest: Option[String])
      (implicit toEntityMarshallerFeaturedTrendarray: ToEntityMarshaller[Seq[FeaturedTrend]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def trendsProductCategoriesDetailsList200(responseProductCategoryDetailsarray: Seq[ProductCategoryDetails])(implicit toEntityMarshallerProductCategoryDetailsarray: ToEntityMarshaller[Seq[ProductCategoryDetails]]): Route =
    complete((200, responseProductCategoryDetailsarray))
  def trendsProductCategoriesDetailsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def trendsProductCategoriesDetailsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def trendsProductCategoriesDetailsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def trendsProductCategoriesDetailsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def trendsProductCategoriesDetailsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def trendsProductCategoriesDetailsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[ProductCategoryDetails]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def trendsProductCategoriesDetailsList(productCategories: String, region: String, lookbackWindow: Option[String], engagementType: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerProductCategoryDetailsarray: ToEntityMarshaller[Seq[ProductCategoryDetails]]): Route

  def trendsProductCategoriesTrendingList200(responseTrendingProductCategoryarray: Seq[TrendingProductCategory])(implicit toEntityMarshallerTrendingProductCategoryarray: ToEntityMarshaller[Seq[TrendingProductCategory]]): Route =
    complete((200, responseTrendingProductCategoryarray))
  def trendsProductCategoriesTrendingList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def trendsProductCategoriesTrendingList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def trendsProductCategoriesTrendingList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def trendsProductCategoriesTrendingList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def trendsProductCategoriesTrendingList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def trendsProductCategoriesTrendingListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[TrendingProductCategory]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def trendsProductCategoriesTrendingList(region: String, verticals: Option[String], ages: Option[String], genders: Option[String], engagementType: Option[String])
      (implicit toEntityMarshallerTrendingProductCategoryarray: ToEntityMarshaller[Seq[TrendingProductCategory]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ProductCategoriesApiMarshaller {


  implicit def toEntityMarshallerFeaturedTrendarray: ToEntityMarshaller[Seq[FeaturedTrend]]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerTrendingProductCategoryarray: ToEntityMarshaller[Seq[TrendingProductCategory]]

  implicit def toEntityMarshallerProductCategoryDetailsarray: ToEntityMarshaller[Seq[ProductCategoryDetails]]

}

