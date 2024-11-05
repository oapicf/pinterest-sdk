package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.server.model.AudienceAccountType
import org.openapitools.server.model.AudiencesList200Response
import org.openapitools.server.model.BusinessSharedAudience
import org.openapitools.server.model.BusinessSharedAudienceResponse
import org.openapitools.server.model.Error
import org.openapitools.server.model.SharedAudience
import org.openapitools.server.model.SharedAudienceResponse


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
        parameters("audience_id".as[String], "account_type".as[String], "page_size".as[Int].?(25), "bookmark".as[String].?) { (audienceId, accountType, pageSize, bookmark) => 
            audienceSharingService.adAccountsAudiencesSharedAccountsList(adAccountId = adAccountId, audienceId = audienceId, accountType = accountType, pageSize = pageSize, bookmark = bookmark)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "audiences" / "shared" / "accounts") { (businessId) => 
      get { 
        parameters("audience_id".as[String], "account_type".as[String], "page_size".as[Int].?(25), "bookmark".as[String].?) { (audienceId, accountType, pageSize, bookmark) => 
            audienceSharingService.businessAccountAudiencesSharedAccountsList(businessId = businessId, audienceId = audienceId, accountType = accountType, pageSize = pageSize, bookmark = bookmark)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "audiences") { (businessId) => 
      get { 
        parameters("bookmark".as[String].?, "order".as[String].?, "page_size".as[Int].?(25)) { (bookmark, order, pageSize) => 
            audienceSharingService.sharedAudiencesForBusinessList(businessId = businessId, bookmark = bookmark, order = order, pageSize = pageSize)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / "ad_accounts" / "shared") { (adAccountId) => 
      patch {  
            entity(as[SharedAudience]){ sharedAudience =>
              audienceSharingService.updateAdAccountToAdAccountSharedAudience(adAccountId = adAccountId, sharedAudience = sharedAudience)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / "businesses" / "shared") { (adAccountId) => 
      patch {  
            entity(as[BusinessSharedAudience]){ businessSharedAudience =>
              audienceSharingService.updateAdAccountToBusinessSharedAudience(adAccountId = adAccountId, businessSharedAudience = businessSharedAudience)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "audiences" / "ad_accounts" / "shared") { (businessId) => 
      patch {  
            entity(as[SharedAudience]){ sharedAudience =>
              audienceSharingService.updateBusinessToAdAccountSharedAudience(businessId = businessId, sharedAudience = sharedAudience)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "audiences" / "businesses" / "shared") { (businessId) => 
      patch {  
            entity(as[BusinessSharedAudience]){ businessSharedAudience =>
              audienceSharingService.updateBusinessToBusinessSharedAudience(businessId = businessId, businessSharedAudience = businessSharedAudience)
            }
      }
    }
}

object AudienceSharingApiPatterns {

    val businessIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait AudienceSharingApiService {

  def adAccountsAudiencesSharedAccountsList200(responseAdAccountsAudiencesSharedAccountsList200Response: AdAccountsAudiencesSharedAccountsList200Response)(implicit toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response]): Route =
    complete((200, responseAdAccountsAudiencesSharedAccountsList200Response))
  def adAccountsAudiencesSharedAccountsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsAudiencesSharedAccountsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountsAudiencesSharedAccountsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccountsAudiencesSharedAccountsList200Response
   * Code: 400, Message: Invalid ad account audiences shared accounts parameters., DataType: Error
   * Code: 404, Message: Shared accounts not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def adAccountsAudiencesSharedAccountsList(adAccountId: String, audienceId: String, accountType: String, pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessAccountAudiencesSharedAccountsList200(responseAdAccountsAudiencesSharedAccountsList200Response: AdAccountsAudiencesSharedAccountsList200Response)(implicit toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response]): Route =
    complete((200, responseAdAccountsAudiencesSharedAccountsList200Response))
  def businessAccountAudiencesSharedAccountsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def businessAccountAudiencesSharedAccountsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def businessAccountAudiencesSharedAccountsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccountsAudiencesSharedAccountsList200Response
   * Code: 400, Message: Invalid business audiences shared accounts parameters., DataType: Error
   * Code: 404, Message: Shared accounts not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: String, pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def sharedAudiencesForBusinessList200(responseAudiencesList200Response: AudiencesList200Response)(implicit toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response]): Route =
    complete((200, responseAudiencesList200Response))
  def sharedAudiencesForBusinessList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def sharedAudiencesForBusinessListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AudiencesList200Response
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def sharedAudiencesForBusinessList(businessId: String, bookmark: Option[String], order: Option[String], pageSize: Int)
      (implicit toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateAdAccountToAdAccountSharedAudience200(responseSharedAudienceResponse: SharedAudienceResponse)(implicit toEntityMarshallerSharedAudienceResponse: ToEntityMarshaller[SharedAudienceResponse]): Route =
    complete((200, responseSharedAudienceResponse))
  def updateAdAccountToAdAccountSharedAudience400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateAdAccountToAdAccountSharedAudienceDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SharedAudienceResponse
   * Code: 400, Message: Invalid ad account id., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def updateAdAccountToAdAccountSharedAudience(adAccountId: String, sharedAudience: SharedAudience)
      (implicit toEntityMarshallerSharedAudienceResponse: ToEntityMarshaller[SharedAudienceResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateAdAccountToBusinessSharedAudience200(responseBusinessSharedAudienceResponse: BusinessSharedAudienceResponse)(implicit toEntityMarshallerBusinessSharedAudienceResponse: ToEntityMarshaller[BusinessSharedAudienceResponse]): Route =
    complete((200, responseBusinessSharedAudienceResponse))
  def updateAdAccountToBusinessSharedAudience400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateAdAccountToBusinessSharedAudienceDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BusinessSharedAudienceResponse
   * Code: 400, Message: Invalid ad account id., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def updateAdAccountToBusinessSharedAudience(adAccountId: String, businessSharedAudience: BusinessSharedAudience)
      (implicit toEntityMarshallerBusinessSharedAudienceResponse: ToEntityMarshaller[BusinessSharedAudienceResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateBusinessToAdAccountSharedAudience200(responseSharedAudienceResponse: SharedAudienceResponse)(implicit toEntityMarshallerSharedAudienceResponse: ToEntityMarshaller[SharedAudienceResponse]): Route =
    complete((200, responseSharedAudienceResponse))
  def updateBusinessToAdAccountSharedAudience400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateBusinessToAdAccountSharedAudienceDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SharedAudienceResponse
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def updateBusinessToAdAccountSharedAudience(businessId: String, sharedAudience: SharedAudience)
      (implicit toEntityMarshallerSharedAudienceResponse: ToEntityMarshaller[SharedAudienceResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateBusinessToBusinessSharedAudience200(responseBusinessSharedAudienceResponse: BusinessSharedAudienceResponse)(implicit toEntityMarshallerBusinessSharedAudienceResponse: ToEntityMarshaller[BusinessSharedAudienceResponse]): Route =
    complete((200, responseBusinessSharedAudienceResponse))
  def updateBusinessToBusinessSharedAudience400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateBusinessToBusinessSharedAudienceDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BusinessSharedAudienceResponse
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def updateBusinessToBusinessSharedAudience(businessId: String, businessSharedAudience: BusinessSharedAudience)
      (implicit toEntityMarshallerBusinessSharedAudienceResponse: ToEntityMarshaller[BusinessSharedAudienceResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AudienceSharingApiMarshaller {
  implicit def fromEntityUnmarshallerSharedAudience: FromEntityUnmarshaller[SharedAudience]

  implicit def fromEntityUnmarshallerBusinessSharedAudience: FromEntityUnmarshaller[BusinessSharedAudience]



  implicit def toEntityMarshallerAdAccountsAudiencesSharedAccountsList200Response: ToEntityMarshaller[AdAccountsAudiencesSharedAccountsList200Response]

  implicit def toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response]

  implicit def toEntityMarshallerBusinessSharedAudienceResponse: ToEntityMarshaller[BusinessSharedAudienceResponse]

  implicit def toEntityMarshallerSharedAudienceResponse: ToEntityMarshaller[SharedAudienceResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

