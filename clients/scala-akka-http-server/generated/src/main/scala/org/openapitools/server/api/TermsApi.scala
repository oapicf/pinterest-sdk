package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.RelatedTerms


class TermsApi(
    termsService: TermsApiService,
    termsMarshaller: TermsApiMarshaller
) {

  
  import termsMarshaller._

  lazy val route: Route =
    path("terms" / "related") { 
      get { 
        parameters("terms".as[String]) { (terms) => 
            termsService.termsRelatedList(terms = terms)
        }
      }
    } ~
    path("terms" / "suggested") { 
      get { 
        parameters("term".as[String], "limit".as[Int].?(4)) { (term, limit) => 
            termsService.termsSuggestedList(term = term, limit = limit)
        }
      }
    }
}


trait TermsApiService {

  def termsRelatedList200(responseRelatedTerms: RelatedTerms)(implicit toEntityMarshallerRelatedTerms: ToEntityMarshaller[RelatedTerms]): Route =
    complete((200, responseRelatedTerms))
  def termsRelatedList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def termsRelatedList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def termsRelatedList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def termsRelatedList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def termsRelatedList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def termsRelatedListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: RelatedTerms
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def termsRelatedList(terms: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerRelatedTerms: ToEntityMarshaller[RelatedTerms]): Route

  def termsSuggestedList200(responseStringarray: Seq[String])(implicit toEntityMarshallerStringarray: ToEntityMarshaller[Seq[String]]): Route =
    complete((200, responseStringarray))
  def termsSuggestedList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def termsSuggestedList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def termsSuggestedList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def termsSuggestedList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def termsSuggestedList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def termsSuggestedListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[String]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def termsSuggestedList(term: String, limit: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait TermsApiMarshaller {


  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerRelatedTerms: ToEntityMarshaller[RelatedTerms]

}

