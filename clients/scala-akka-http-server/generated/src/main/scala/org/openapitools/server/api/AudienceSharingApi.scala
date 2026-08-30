package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccountToAdAccountSharedAudience
import org.openapitools.server.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.model.AdAccountToBusinessSharedAudience
import org.openapitools.server.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.server.model.AudienceAccountType
import org.openapitools.server.model.BusinessToAdAccountSharedAudience
import org.openapitools.server.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.model.BusinessToBusinessSharedAudience
import org.openapitools.server.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.model.Error
import org.openapitools.server.model.Order
import org.openapitools.server.model.SharedAudiencesForBusinessList200Response


class AudienceSharingApi(
    audienceSharingService: AudienceSharingApiService,
    audienceSharingMarshaller: AudienceSharingApiMarshaller
) {

  import AudienceSharingApiPatterns.businessIdPattern
import AudienceSharingApiPatterns.adAccountIdPattern

  import audienceSharingMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "audiences" / "shared" / "accounts") { (adAccountId) => 
      get { 
        parameters("audience_id".as[String], "account_type".as[String], "bookmark".as[String].?, "page_size".as[Int].?(25)) { (audienceId, accountType, bookmark, pageSize) => 
            audienceSharingService.adAccountsAudiencesSharedAccountsList(audienceId = audienceId, accountType = accountType, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "audiences" / "shared" / "accounts") { (businessId) => 
      get { 
        parameters("audience_id".as[String], "account_type".as[String], "bookmark".as[String].?, "page_size".as[Int].?(25)) { (audienceId, accountType, bookmark, pageSize) => 
            audienceSharingService.businessAccountAudiencesSharedAccountsList(businessId = businessId, audienceId = audienceId, accountType = accountType, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "audiences") { (businessId) => 
      get { 
        parameters("order".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (order, bookmark, pageSize) => 
            audienceSharingService.sharedAudiencesForBusinessList(businessId = businessId, order = order, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / "ad_accounts" / "shared") { (adAccountId) => 
      patch {  
            entity(as[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody]){ adAccountToAdAccountSharedAudienceUpdateWithRequiredBody =>
              audienceSharingService.updateAdAccountToAdAccountSharedAudience(adAccountId = adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody = adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / "businesses" / "shared") { (adAccountId) => 
      patch {  
            entity(as[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody]){ adAccountToBusinessSharedAudienceUpdateWithRequiredBody =>
              audienceSharingService.updateAdAccountToBusinessSharedAudience(adAccountId = adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody = adAccountToBusinessSharedAudienceUpdateWithRequiredBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "audiences" / "ad_accounts" / "shared") { (businessId) => 
      patch {  
            entity(as[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody]){ businessToAdAccountSharedAudienceUpdateWithRequiredBody =>
              audienceSharingService.updateBusinessToAdAccountSharedAudience(businessId = businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody = businessToAdAccountSharedAudienceUpdateWithRequiredBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "audiences" / "businesses" / "shared") { (businessId) => 
      patch {  
            entity(as[BusinessToBusinessSharedAudienceUpdateWithRequiredBody]){ businessToBusinessSharedAudienceUpdateWithRequiredBody =>
              audienceSharingService.updateBusinessToBusinessSharedAudience(businessId = businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody = businessToBusinessSharedAudienceUpdateWithRequiredBody)
            }
      }
    }
}

object AudienceSharingApiPatterns {

    val businessIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait AudienceSharingApiService {

  def adAccountsAudiencesSharedAccountsList200(responseAdAccountsAudiencesSharedAccountsList200Response: AdAccountsAudiencesSharedAccountsList200Response)(implicit toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response]): Route =
    complete((200, responseAdAccountsAudiencesSharedAccountsList200Response))
  def adAccountsAudiencesSharedAccountsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsAudiencesSharedAccountsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adAccountsAudiencesSharedAccountsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsAudiencesSharedAccountsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountsAudiencesSharedAccountsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adAccountsAudiencesSharedAccountsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountsAudiencesSharedAccountsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adAccountsAudiencesSharedAccountsList(audienceId: String, accountType: String, adAccountId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessAccountAudiencesSharedAccountsList200(responseAdAccountsAudiencesSharedAccountsList200Response: AdAccountsAudiencesSharedAccountsList200Response)(implicit toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response]): Route =
    complete((200, responseAdAccountsAudiencesSharedAccountsList200Response))
  def businessAccountAudiencesSharedAccountsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def businessAccountAudiencesSharedAccountsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def businessAccountAudiencesSharedAccountsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def businessAccountAudiencesSharedAccountsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def businessAccountAudiencesSharedAccountsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def businessAccountAudiencesSharedAccountsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountsAudiencesSharedAccountsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def sharedAudiencesForBusinessList200(responseSharedAudiencesForBusinessList200Response: SharedAudiencesForBusinessList200Response)(implicit toEntityMarshallerSharedAudiencesForBusinessList200Response: ToEntityMarshaller[SharedAudiencesForBusinessList200Response]): Route =
    complete((200, responseSharedAudiencesForBusinessList200Response))
  def sharedAudiencesForBusinessList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def sharedAudiencesForBusinessList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def sharedAudiencesForBusinessList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def sharedAudiencesForBusinessList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def sharedAudiencesForBusinessList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def sharedAudiencesForBusinessListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SharedAudiencesForBusinessList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def sharedAudiencesForBusinessList(businessId: String, order: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerSharedAudiencesForBusinessList200Response: ToEntityMarshaller[SharedAudiencesForBusinessList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateAdAccountToAdAccountSharedAudience200(responseAdAccountToAdAccountSharedAudience: AdAccountToAdAccountSharedAudience)(implicit toEntityMarshallerAdAccountToAdAccountSharedAudience: ToEntityMarshaller[AdAccountToAdAccountSharedAudience]): Route =
    complete((200, responseAdAccountToAdAccountSharedAudience))
  def updateAdAccountToAdAccountSharedAudience400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateAdAccountToAdAccountSharedAudience401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def updateAdAccountToAdAccountSharedAudience403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def updateAdAccountToAdAccountSharedAudience404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def updateAdAccountToAdAccountSharedAudience429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def updateAdAccountToAdAccountSharedAudienceDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountToAdAccountSharedAudience
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def updateAdAccountToAdAccountSharedAudience(adAccountId: String, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody)
      (implicit toEntityMarshallerAdAccountToAdAccountSharedAudience: ToEntityMarshaller[AdAccountToAdAccountSharedAudience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateAdAccountToBusinessSharedAudience200(responseAdAccountToBusinessSharedAudience: AdAccountToBusinessSharedAudience)(implicit toEntityMarshallerAdAccountToBusinessSharedAudience: ToEntityMarshaller[AdAccountToBusinessSharedAudience]): Route =
    complete((200, responseAdAccountToBusinessSharedAudience))
  def updateAdAccountToBusinessSharedAudience400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateAdAccountToBusinessSharedAudience401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def updateAdAccountToBusinessSharedAudience403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def updateAdAccountToBusinessSharedAudience404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def updateAdAccountToBusinessSharedAudience429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def updateAdAccountToBusinessSharedAudienceDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountToBusinessSharedAudience
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def updateAdAccountToBusinessSharedAudience(adAccountId: String, adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAdAccountToBusinessSharedAudience: ToEntityMarshaller[AdAccountToBusinessSharedAudience]): Route

  def updateBusinessToAdAccountSharedAudience200(responseBusinessToAdAccountSharedAudience: BusinessToAdAccountSharedAudience)(implicit toEntityMarshallerBusinessToAdAccountSharedAudience: ToEntityMarshaller[BusinessToAdAccountSharedAudience]): Route =
    complete((200, responseBusinessToAdAccountSharedAudience))
  def updateBusinessToAdAccountSharedAudience400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateBusinessToAdAccountSharedAudience401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def updateBusinessToAdAccountSharedAudience403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def updateBusinessToAdAccountSharedAudience404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def updateBusinessToAdAccountSharedAudience429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def updateBusinessToAdAccountSharedAudienceDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BusinessToAdAccountSharedAudience
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def updateBusinessToAdAccountSharedAudience(businessId: String, businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody)
      (implicit toEntityMarshallerBusinessToAdAccountSharedAudience: ToEntityMarshaller[BusinessToAdAccountSharedAudience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateBusinessToBusinessSharedAudience200(responseBusinessToBusinessSharedAudience: BusinessToBusinessSharedAudience)(implicit toEntityMarshallerBusinessToBusinessSharedAudience: ToEntityMarshaller[BusinessToBusinessSharedAudience]): Route =
    complete((200, responseBusinessToBusinessSharedAudience))
  def updateBusinessToBusinessSharedAudience400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateBusinessToBusinessSharedAudience401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def updateBusinessToBusinessSharedAudience403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def updateBusinessToBusinessSharedAudience404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def updateBusinessToBusinessSharedAudience429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def updateBusinessToBusinessSharedAudienceDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BusinessToBusinessSharedAudience
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def updateBusinessToBusinessSharedAudience(businessId: String, businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody)
      (implicit toEntityMarshallerBusinessToBusinessSharedAudience: ToEntityMarshaller[BusinessToBusinessSharedAudience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AudienceSharingApiMarshaller {
  implicit def fromEntityUnmarshallerAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody: FromEntityUnmarshaller[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody]

  implicit def fromEntityUnmarshallerAdAccountToBusinessSharedAudienceUpdateWithRequiredBody: FromEntityUnmarshaller[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody]

  implicit def fromEntityUnmarshallerBusinessToBusinessSharedAudienceUpdateWithRequiredBody: FromEntityUnmarshaller[BusinessToBusinessSharedAudienceUpdateWithRequiredBody]

  implicit def fromEntityUnmarshallerBusinessToAdAccountSharedAudienceUpdateWithRequiredBody: FromEntityUnmarshaller[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody]



  implicit def toEntityMarshallerSharedAudiencesForBusinessList200Response: ToEntityMarshaller[SharedAudiencesForBusinessList200Response]

  implicit def toEntityMarshallerBusinessToAdAccountSharedAudience: ToEntityMarshaller[BusinessToAdAccountSharedAudience]

  implicit def toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response]

  implicit def toEntityMarshallerAdAccountToAdAccountSharedAudience: ToEntityMarshaller[AdAccountToAdAccountSharedAudience]

  implicit def toEntityMarshallerBusinessToBusinessSharedAudience: ToEntityMarshaller[BusinessToBusinessSharedAudience]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerAdAccountToBusinessSharedAudience: ToEntityMarshaller[AdAccountToBusinessSharedAudience]

}

