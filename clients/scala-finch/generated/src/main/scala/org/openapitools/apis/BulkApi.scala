package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.BulkDownloadRequest
import org.openapitools.models.BulkDownloadResponse
import org.openapitools.models.BulkUpsertRequest
import org.openapitools.models.BulkUpsertResponse
import org.openapitools.models.BulkUpsertStatusResponse
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

object BulkApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        bulkDownload/create(da) :+:
        bulkRequest/get(da) :+:
        bulkUpsert/create(da)


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
        * @return An endpoint representing a BulkDownloadResponse
        */
        private def bulkDownload/create(da: DataAccessor): Endpoint[BulkDownloadResponse] =
        post("ad_accounts" :: string :: "bulk" :: "download" :: jsonBody[BulkDownloadRequest]) { (adAccountId: String, bulkDownloadRequest: BulkDownloadRequest) =>
          da.Bulk_bulkDownload/create(adAccountId, bulkDownloadRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BulkUpsertStatusResponse
        */
        private def bulkRequest/get(da: DataAccessor): Endpoint[BulkUpsertStatusResponse] =
        get("ad_accounts" :: string :: "bulk" :: string :: paramOption("include_details").map(_.map(_.toBoolean))) { (adAccountId: String, bulkRequestId: String, includeDetails: Option[Boolean]) =>
          da.Bulk_bulkRequest/get(adAccountId, bulkRequestId, includeDetails) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BulkUpsertResponse
        */
        private def bulkUpsert/create(da: DataAccessor): Endpoint[BulkUpsertResponse] =
        post("ad_accounts" :: string :: "bulk" :: "upsert" :: jsonBody[BulkUpsertRequest]) { (adAccountId: String, bulkUpsertRequest: BulkUpsertRequest) =>
          da.Bulk_bulkUpsert/create(adAccountId, bulkUpsertRequest) match {
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
      val file = Files.createTempFile("tmpBulkApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
