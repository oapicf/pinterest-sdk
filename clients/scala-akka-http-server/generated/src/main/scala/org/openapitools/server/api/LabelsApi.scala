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
import org.openapitools.server.model.LabeledEntities
import org.openapitools.server.model.LabeledEntitiesCreate
import org.openapitools.server.model.LabelsList200Response
import org.openapitools.server.model.LabelsResponse
import org.openapitools.server.model.QueryLabelEntityStatusesItems
import org.openapitools.server.model.QueryLabelTypesItems


class LabelsApi(
    labelsService: LabelsApiService,
    labelsMarshaller: LabelsApiMarshaller
) {

  import LabelsApiPatterns.adAccountIdPattern

  import labelsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "labels" / Segment / "apply") { (adAccountId, labelId) => 
      post {  
            entity(as[LabeledEntitiesCreate]){ labeledEntitiesCreate =>
              labelsService.labelsApply(adAccountId = adAccountId, labelId = labelId, labeledEntitiesCreate = labeledEntitiesCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "labels") { (adAccountId) => 
      post {  
            entity(as[LabelCreateRequest]){ labelCreateRequest =>
              labelsService.labelsCreate(adAccountId = adAccountId, labelCreateRequest = labelCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "labels") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String].?, "label_ids".as[String].?, "entity_statuses".as[String].?, "label_types".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize) => 
            labelsService.labelsList(adAccountId = adAccountId, campaignIds = campaignIds, labelIds = labelIds, entityStatuses = entityStatuses, labelTypes = labelTypes, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "labels" / Segment / "remove") { (adAccountId, labelId) => 
      post {  
            entity(as[LabeledEntitiesCreate]){ labeledEntitiesCreate =>
              labelsService.labelsRemove(adAccountId = adAccountId, labelId = labelId, labeledEntitiesCreate = labeledEntitiesCreate)
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

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait LabelsApiService {

  def labelsApply200(responseLabeledEntities: LabeledEntities)(implicit toEntityMarshallerLabeledEntities: ToEntityMarshaller[LabeledEntities]): Route =
    complete((200, responseLabeledEntities))
  def labelsApply201(responseLabeledEntities: LabeledEntities)(implicit toEntityMarshallerLabeledEntities: ToEntityMarshaller[LabeledEntities]): Route =
    complete((201, responseLabeledEntities))
  def labelsApply400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def labelsApply401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def labelsApply403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def labelsApply404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def labelsApply429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def labelsApplyDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LabeledEntities
   * Code: 201, Message: Resource create operation completed successfully., DataType: LabeledEntities
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def labelsApply(adAccountId: String, labelId: String, labeledEntitiesCreate: LabeledEntitiesCreate)
      (implicit toEntityMarshallerLabeledEntities: ToEntityMarshaller[LabeledEntities], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def labelsCreate200(responseLabelsResponse: LabelsResponse)(implicit toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse]): Route =
    complete((200, responseLabelsResponse))
  def labelsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def labelsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def labelsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def labelsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def labelsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def labelsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LabelsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def labelsCreate(adAccountId: String, labelCreateRequest: LabelCreateRequest)
      (implicit toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def labelsList200(responseLabelsList200Response: LabelsList200Response)(implicit toEntityMarshallerLabelsList200Response: ToEntityMarshaller[LabelsList200Response]): Route =
    complete((200, responseLabelsList200Response))
  def labelsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def labelsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def labelsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def labelsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def labelsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def labelsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LabelsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def labelsList(adAccountId: String, campaignIds: Option[String], labelIds: Option[String], entityStatuses: Option[String], labelTypes: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerLabelsList200Response: ToEntityMarshaller[LabelsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def labelsRemove200(responseLabeledEntities: LabeledEntities)(implicit toEntityMarshallerLabeledEntities: ToEntityMarshaller[LabeledEntities]): Route =
    complete((200, responseLabeledEntities))
  def labelsRemove201(responseLabeledEntities: LabeledEntities)(implicit toEntityMarshallerLabeledEntities: ToEntityMarshaller[LabeledEntities]): Route =
    complete((201, responseLabeledEntities))
  def labelsRemove400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def labelsRemove401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def labelsRemove403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def labelsRemove404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def labelsRemove429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def labelsRemoveDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LabeledEntities
   * Code: 201, Message: Resource create operation completed successfully., DataType: LabeledEntities
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def labelsRemove(adAccountId: String, labelId: String, labeledEntitiesCreate: LabeledEntitiesCreate)
      (implicit toEntityMarshallerLabeledEntities: ToEntityMarshaller[LabeledEntities], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def labelsUpdate200(responseLabelsResponse: LabelsResponse)(implicit toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse]): Route =
    complete((200, responseLabelsResponse))
  def labelsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def labelsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def labelsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def labelsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def labelsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def labelsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LabelsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest)
      (implicit toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait LabelsApiMarshaller {
  implicit def fromEntityUnmarshallerLabelCreateRequest: FromEntityUnmarshaller[LabelCreateRequest]

  implicit def fromEntityUnmarshallerLabelUpdateRequest: FromEntityUnmarshaller[LabelUpdateRequest]

  implicit def fromEntityUnmarshallerLabeledEntitiesCreate: FromEntityUnmarshaller[LabeledEntitiesCreate]



  implicit def toEntityMarshallerLabelsList200Response: ToEntityMarshaller[LabelsList200Response]

  implicit def toEntityMarshallerLabeledEntities: ToEntityMarshaller[LabeledEntities]

  implicit def toEntityMarshallerLabelsResponse: ToEntityMarshaller[LabelsResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

