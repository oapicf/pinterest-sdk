package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdvancedAuctionItems
import org.openapitools.models.AdvancedAuctionItemsGetRequest
import org.openapitools.models.AdvancedAuctionItemsSubmitRequest
import org.openapitools.models.AdvancedAuctionProcessedItems
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

object AdvancedAuctionApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        advancedAuctionItemsGet/post(da) :+:
        advancedAuctionItemsSubmit/post(da)


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
        * @return An endpoint representing a AdvancedAuctionItems
        */
        private def advancedAuctionItemsGet/post(da: DataAccessor): Endpoint[AdvancedAuctionItems] =
        post("advanced_auction" :: "items" :: "get" :: jsonBody[AdvancedAuctionItemsGetRequest] :: paramOption("ad_account_id")) { (advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: Option[String]) =>
          da.AdvancedAuction_advancedAuctionItemsGet/post(advancedAuctionItemsGetRequest, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdvancedAuctionProcessedItems
        */
        private def advancedAuctionItemsSubmit/post(da: DataAccessor): Endpoint[AdvancedAuctionProcessedItems] =
        post("advanced_auction" :: "items" :: "submit" :: jsonBody[AdvancedAuctionItemsSubmitRequest] :: paramOption("ad_account_id")) { (advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: Option[String]) =>
          da.AdvancedAuction_advancedAuctionItemsSubmit/post(advancedAuctionItemsSubmitRequest, adAccountId) match {
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
      val file = Files.createTempFile("tmpAdvancedAuctionApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
