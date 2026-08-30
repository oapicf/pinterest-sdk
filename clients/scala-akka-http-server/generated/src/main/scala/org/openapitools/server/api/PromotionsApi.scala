package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.PaginationOrder
import org.openapitools.server.model.Promotion
import org.openapitools.server.model.PromotionBatchUpdate
import org.openapitools.server.model.PromotionCreate
import org.openapitools.server.model.PromotionsList200Response
import org.openapitools.server.model.PromotionsResponse


class PromotionsApi(
    promotionsService: PromotionsApiService,
    promotionsMarshaller: PromotionsApiMarshaller
) {

  import PromotionsApiPatterns.adAccountIdPattern
import PromotionsApiPatterns.promotionIdPattern

  import promotionsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "promotions") { (adAccountId) => 
      post {  
            entity(as[Seq[PromotionCreate]]){ promotionCreate =>
              promotionsService.promotionsCreate(adAccountId = adAccountId, promotionCreate = promotionCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotions" / promotionIdPattern) { (promotionId, adAccountId) => 
      delete {  
            promotionsService.promotionsDelete(promotionId = promotionId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotions" / promotionIdPattern) { (promotionId, adAccountId) => 
      get {  
            promotionsService.promotionsGet(promotionId = promotionId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotions") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?) { (bookmark, pageSize, order) => 
            promotionsService.promotionsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotions") { (adAccountId) => 
      patch {  
            entity(as[Seq[PromotionBatchUpdate]]){ promotionBatchUpdate =>
              promotionsService.promotionsUpdate(adAccountId = adAccountId, promotionBatchUpdate = promotionBatchUpdate)
            }
      }
    }
}

object PromotionsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val promotionIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait PromotionsApiService {

  def promotionsCreate200(responsePromotionsResponse: PromotionsResponse)(implicit toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse]): Route =
    complete((200, responsePromotionsResponse))
  def promotionsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def promotionsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def promotionsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def promotionsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def promotionsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def promotionsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: PromotionsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def promotionsCreate(adAccountId: String, promotionCreate: Seq[PromotionCreate])
      (implicit toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def promotionsDelete200(responsePromotion: Promotion)(implicit toEntityMarshallerPromotion: ToEntityMarshaller[Promotion]): Route =
    complete((200, responsePromotion))
  def promotionsDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def promotionsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def promotionsDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def promotionsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def promotionsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def promotionsDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def promotionsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Promotion
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def promotionsDelete(promotionId: String, adAccountId: String)
      (implicit toEntityMarshallerPromotion: ToEntityMarshaller[Promotion], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def promotionsGet200(responsePromotion: Promotion)(implicit toEntityMarshallerPromotion: ToEntityMarshaller[Promotion]): Route =
    complete((200, responsePromotion))
  def promotionsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def promotionsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def promotionsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def promotionsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def promotionsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def promotionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Promotion
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def promotionsGet(promotionId: String, adAccountId: String)
      (implicit toEntityMarshallerPromotion: ToEntityMarshaller[Promotion], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def promotionsList200(responsePromotionsList200Response: PromotionsList200Response)(implicit toEntityMarshallerPromotionsList200Response: ToEntityMarshaller[PromotionsList200Response]): Route =
    complete((200, responsePromotionsList200Response))
  def promotionsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def promotionsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def promotionsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def promotionsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def promotionsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def promotionsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: PromotionsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def promotionsList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String])
      (implicit toEntityMarshallerPromotionsList200Response: ToEntityMarshaller[PromotionsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def promotionsUpdate200(responsePromotionsResponse: PromotionsResponse)(implicit toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse]): Route =
    complete((200, responsePromotionsResponse))
  def promotionsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def promotionsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def promotionsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def promotionsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def promotionsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def promotionsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: PromotionsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def promotionsUpdate(adAccountId: String, promotionBatchUpdate: Seq[PromotionBatchUpdate])
      (implicit toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait PromotionsApiMarshaller {
  implicit def fromEntityUnmarshallerPromotionCreateList: FromEntityUnmarshaller[Seq[PromotionCreate]]

  implicit def fromEntityUnmarshallerPromotionBatchUpdateList: FromEntityUnmarshaller[Seq[PromotionBatchUpdate]]



  implicit def toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse]

  implicit def toEntityMarshallerPromotion: ToEntityMarshaller[Promotion]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerPromotionsList200Response: ToEntityMarshaller[PromotionsList200Response]

}

