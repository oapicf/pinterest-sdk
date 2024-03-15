package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdAccountCreateSubscriptionRequest
import org.openapitools.models.AdAccountCreateSubscriptionResponse
import org.openapitools.models.AdAccountGetSubscriptionResponse
import org.openapitools.models.AdAccountsSubscriptionsGetList200Response
import org.openapitools.models.Error
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

object LeadAdsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        adAccountsSubscriptions/delById(da) :+:
        adAccountsSubscriptions/getById(da) :+:
        adAccountsSubscriptions/getList(da) :+:
        adAccountsSubscriptions/post(da)


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
        * @return An endpoint representing a Unit
        */
        private def adAccountsSubscriptions/delById(da: DataAccessor): Endpoint[Unit] =
        delete("ad_accounts" :: string :: "leads" :: "subscriptions" :: string) { (adAccountId: String, subscriptionId: String) =>
          da.LeadAds_adAccountsSubscriptions/delById(adAccountId, subscriptionId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdAccountGetSubscriptionResponse
        */
        private def adAccountsSubscriptions/getById(da: DataAccessor): Endpoint[AdAccountGetSubscriptionResponse] =
        get("ad_accounts" :: string :: "leads" :: "subscriptions" :: string) { (adAccountId: String, subscriptionId: String) =>
          da.LeadAds_adAccountsSubscriptions/getById(adAccountId, subscriptionId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdAccountsSubscriptionsGetList200Response
        */
        private def adAccountsSubscriptions/getList(da: DataAccessor): Endpoint[AdAccountsSubscriptionsGetList200Response] =
        get("ad_accounts" :: string :: "leads" :: "subscriptions" :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (adAccountId: String, pageSize: Option[Int], bookmark: Option[String]) =>
          da.LeadAds_adAccountsSubscriptions/getList(adAccountId, pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdAccountCreateSubscriptionResponse
        */
        private def adAccountsSubscriptions/post(da: DataAccessor): Endpoint[AdAccountCreateSubscriptionResponse] =
        post("ad_accounts" :: string :: "leads" :: "subscriptions" :: jsonBody[AdAccountCreateSubscriptionRequest]) { (adAccountId: String, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest) =>
          da.LeadAds_adAccountsSubscriptions/post(adAccountId, adAccountCreateSubscriptionRequest) match {
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
      val file = Files.createTempFile("tmpLeadAdsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
