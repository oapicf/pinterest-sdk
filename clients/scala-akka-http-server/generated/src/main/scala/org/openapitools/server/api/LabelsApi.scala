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
import org.openapitools.server.model.LabelCreateRequest
import org.openapitools.server.model.LabelUpdateRequest
import org.openapitools.server.model.LabelsList200Response
import org.openapitools.server.model.LabelsResponse


class LabelsApi(
    labelsService: LabelsApiService,
    labelsMarshaller: LabelsApiMarshaller
) {

  import LabelsApiPatterns.adAccountIdPattern

  import labelsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "labels") { (adAccountId) => 
      post {  
            entity(as[LabelCreateRequest]){ labelCreateRequest =>
              labelsService.labelsCreate(adAccountId = adAccountId, labelCreateRequest = labelCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "labels") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String].?, "label_ids".as[String].?, "entity_statuses".as[String].?, "label_types".as[String].?, "page_size".as[Int].?(25), "bookmark".as[String].?) { (campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark) => 
            labelsService.labelsList(adAccountId = adAccountId, campaignIds = campaignIds, labelIds = labelIds, entityStatuses = entityStatuses, labelTypes = labelTypes, pageSize = pageSize, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "labels") { (adAccountId) => 
      patch {  
            entity(as[LabelUpdateRequest]){ labelUpdateRequest =>
              labelsService.labelsUpdate(adAccountId = adAccountId, labelUpdateRequest = labelUpdateRequest)
            }
      }
    }
}

object LabelsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait LabelsApiService {

  def labelsCreate200(responseLabelsResponse: LabelsResponse)(implicit toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse]): Route =
    complete((200, responseLabelsResponse))
  def labelsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: LabelsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def labelsCreate(adAccountId: String, labelCreateRequest: LabelCreateRequest)
      (implicit toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def labelsList200(responseLabelsList200Response: LabelsList200Response)(implicit toEntityMarshallerLabelsList200Response: ToEntityMarshaller[LabelsList200Response]): Route =
    complete((200, responseLabelsList200Response))
  def labelsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def labelsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: LabelsList200Response
   * Code: 400, Message: Invalid ad account ads parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def labelsList(adAccountId: String, campaignIds: Option[String], labelIds: Option[String], entityStatuses: Option[String], labelTypes: Option[String], pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerLabelsList200Response: ToEntityMarshaller[LabelsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def labelsUpdate200(responseLabelsResponse: LabelsResponse)(implicit toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse]): Route =
    complete((200, responseLabelsResponse))
  def labelsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: LabelsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest)
      (implicit toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait LabelsApiMarshaller {
  implicit def fromEntityUnmarshallerLabelCreateRequest: FromEntityUnmarshaller[LabelCreateRequest]

  implicit def fromEntityUnmarshallerLabelUpdateRequest: FromEntityUnmarshaller[LabelUpdateRequest]



  implicit def toEntityMarshallerLabelsList200Response: ToEntityMarshaller[LabelsList200Response]

  implicit def toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

