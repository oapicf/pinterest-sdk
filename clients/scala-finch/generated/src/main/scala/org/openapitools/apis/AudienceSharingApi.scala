package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.models.AudienceAccountType
import org.openapitools.models.AudiencesList200Response
import org.openapitools.models.BusinessSharedAudience
import org.openapitools.models.BusinessSharedAudienceResponse
import org.openapitools.models.Error
import org.openapitools.models.SharedAudience
import org.openapitools.models.SharedAudienceResponse
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object AudienceSharingApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        adAccountsAudiencesSharedAccounts/list(da) :+:
        businessAccountAudiencesSharedAccounts/list(da) :+:
        sharedAudiencesForBusiness/list(da) :+:
        updateAdAccountToAdAccountSharedAudience(da) :+:
        updateAdAccountToBusinessSharedAudience(da) :+:
        updateBusinessToAdAccountSharedAudience(da) :+:
        updateBusinessToBusinessSharedAudience(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a AdAccountsAudiencesSharedAccountsList200Response
        */
        private def adAccountsAudiencesSharedAccounts/list(da: DataAccessor): Endpoint[AdAccountsAudiencesSharedAccountsList200Response] =
        get("ad_accounts" :: string :: "audiences" :: "shared" :: "accounts" :: param("audience_id") :: param("account_type").map(_.toAudienceAccountType) :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (adAccountId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Option[Int], bookmark: Option[String]) =>
          da.AudienceSharing_adAccountsAudiencesSharedAccounts/list(adAccountId, audienceId, accountType, pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdAccountsAudiencesSharedAccountsList200Response
        */
        private def businessAccountAudiencesSharedAccounts/list(da: DataAccessor): Endpoint[AdAccountsAudiencesSharedAccountsList200Response] =
        get("businesses" :: string :: "audiences" :: "shared" :: "accounts" :: param("audience_id") :: param("account_type").map(_.toAudienceAccountType) :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (businessId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Option[Int], bookmark: Option[String]) =>
          da.AudienceSharing_businessAccountAudiencesSharedAccounts/list(businessId, audienceId, accountType, pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AudiencesList200Response
        */
        private def sharedAudiencesForBusiness/list(da: DataAccessor): Endpoint[AudiencesList200Response] =
        get("businesses" :: string :: "audiences" :: paramOption("bookmark") :: paramOption("order") :: paramOption("page_size").map(_.map(_.toInt))) { (businessId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int]) =>
          da.AudienceSharing_sharedAudiencesForBusiness/list(businessId, bookmark, order, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SharedAudienceResponse
        */
        private def updateAdAccountToAdAccountSharedAudience(da: DataAccessor): Endpoint[SharedAudienceResponse] =
        patch("ad_accounts" :: string :: "audiences" :: "ad_accounts" :: "shared" :: jsonBody[SharedAudience]) { (adAccountId: String, sharedAudience: SharedAudience) =>
          da.AudienceSharing_updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BusinessSharedAudienceResponse
        */
        private def updateAdAccountToBusinessSharedAudience(da: DataAccessor): Endpoint[BusinessSharedAudienceResponse] =
        patch("ad_accounts" :: string :: "audiences" :: "businesses" :: "shared" :: jsonBody[BusinessSharedAudience]) { (adAccountId: String, businessSharedAudience: BusinessSharedAudience) =>
          da.AudienceSharing_updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SharedAudienceResponse
        */
        private def updateBusinessToAdAccountSharedAudience(da: DataAccessor): Endpoint[SharedAudienceResponse] =
        patch("businesses" :: string :: "audiences" :: "ad_accounts" :: "shared" :: jsonBody[SharedAudience]) { (businessId: String, sharedAudience: SharedAudience) =>
          da.AudienceSharing_updateBusinessToAdAccountSharedAudience(businessId, sharedAudience) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BusinessSharedAudienceResponse
        */
        private def updateBusinessToBusinessSharedAudience(da: DataAccessor): Endpoint[BusinessSharedAudienceResponse] =
        patch("businesses" :: string :: "audiences" :: "businesses" :: "shared" :: jsonBody[BusinessSharedAudience]) { (businessId: String, businessSharedAudience: BusinessSharedAudience) =>
          da.AudienceSharing_updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpAudienceSharingApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
