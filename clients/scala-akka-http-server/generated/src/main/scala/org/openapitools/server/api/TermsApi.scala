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
  def termsRelatedListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: RelatedTerms
   * Code: 400, Message: Invalid terms related parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def termsRelatedList(terms: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerRelatedTerms: ToEntityMarshaller[RelatedTerms]): Route

  def termsSuggestedList200(responseStringarray: Seq[String])(implicit toEntityMarshallerStringarray: ToEntityMarshaller[Seq[String]]): Route =
    complete((200, responseStringarray))
  def termsSuggestedList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def termsSuggestedListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[String]
   * Code: 400, Message: Invalid terms suggested parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def termsSuggestedList(term: String, limit: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait TermsApiMarshaller {


  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerRelatedTerms: ToEntityMarshaller[RelatedTerms]

}

