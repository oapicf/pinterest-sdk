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
import org.openapitools.server.model.PromotionCreateRequest
import org.openapitools.server.model.PromotionResponse
import org.openapitools.server.model.PromotionUpdateRequest
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
            entity(as[Seq[PromotionCreateRequest]]){ promotionCreateRequest =>
              promotionsService.promotionsCreate(adAccountId = adAccountId, promotionCreateRequest = promotionCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotions" / promotionIdPattern) { (adAccountId, promotionId) => 
      delete {  
            promotionsService.promotionsDelete(adAccountId = adAccountId, promotionId = promotionId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotions" / promotionIdPattern) { (adAccountId, promotionId) => 
      get {  
            promotionsService.promotionsGet(adAccountId = adAccountId, promotionId = promotionId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotions") { (adAccountId) => 
      get { 
        parameters("page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (pageSize, order, bookmark) => 
            promotionsService.promotionsList(adAccountId = adAccountId, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotions") { (adAccountId) => 
      patch {  
            entity(as[Seq[PromotionUpdateRequest]]){ promotionUpdateRequest =>
              promotionsService.promotionsUpdate(adAccountId = adAccountId, promotionUpdateRequest = promotionUpdateRequest)
            }
      }
    }
}

object PromotionsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val promotionIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait PromotionsApiService {

  def promotionsCreate200(responsePromotionsResponse: PromotionsResponse)(implicit toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse]): Route =
    complete((200, responsePromotionsResponse))
  def promotionsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def promotionsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: PromotionsResponse
   * Code: 400, Message: Invalid create promotions request parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def promotionsCreate(adAccountId: String, promotionCreateRequest: Seq[PromotionCreateRequest])
      (implicit toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def promotionsDelete204: Route =
    complete((204, "Promotion deleted successfully"))
  def promotionsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Promotion deleted successfully
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def promotionsDelete(adAccountId: String, promotionId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def promotionsGet200(responsePromotionResponse: PromotionResponse)(implicit toEntityMarshallerPromotionResponse: ToEntityMarshaller[PromotionResponse]): Route =
    complete((200, responsePromotionResponse))
  def promotionsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def promotionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: PromotionResponse
   * Code: 404, Message: The promotion ID for the given ad account ID was not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def promotionsGet(adAccountId: String, promotionId: String)
      (implicit toEntityMarshallerPromotionResponse: ToEntityMarshaller[PromotionResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def promotionsList200(responsePromotionsList200Response: PromotionsList200Response)(implicit toEntityMarshallerPromotionsList200Response: ToEntityMarshaller[PromotionsList200Response]): Route =
    complete((200, responsePromotionsList200Response))
  def promotionsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def promotionsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: PromotionsList200Response
   * Code: 400, Message: Invalid ad account promotions parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def promotionsList(adAccountId: String, pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerPromotionsList200Response: ToEntityMarshaller[PromotionsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def promotionsUpdate200(responsePromotionsResponse: PromotionsResponse)(implicit toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse]): Route =
    complete((200, responsePromotionsResponse))
  def promotionsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def promotionsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: PromotionsResponse
   * Code: 400, Message: Invalid create promotions request parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def promotionsUpdate(adAccountId: String, promotionUpdateRequest: Seq[PromotionUpdateRequest])
      (implicit toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait PromotionsApiMarshaller {
  implicit def fromEntityUnmarshallerPromotionUpdateRequestList: FromEntityUnmarshaller[Seq[PromotionUpdateRequest]]

  implicit def fromEntityUnmarshallerPromotionCreateRequestList: FromEntityUnmarshaller[Seq[PromotionCreateRequest]]



  implicit def toEntityMarshallerPromotionsResponse: ToEntityMarshaller[PromotionsResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerPromotionResponse: ToEntityMarshaller[PromotionResponse]

  implicit def toEntityMarshallerPromotionsList200Response: ToEntityMarshaller[PromotionsList200Response]

}

