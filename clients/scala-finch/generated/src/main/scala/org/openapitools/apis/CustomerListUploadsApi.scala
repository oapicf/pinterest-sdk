package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CustomerListUploadCreateRequest
import org.openapitools.models.CustomerListUploadCreateResponse
import org.openapitools.models.CustomerListUploadResponse
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

object CustomerListUploadsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        customerListUploads/create(da) :+:
        customerListUploads/get(da) :+:
        customerListUploads/run(da)


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
        * @return An endpoint representing a CustomerListUploadCreateResponse
        */
        private def customerListUploads/create(da: DataAccessor): Endpoint[CustomerListUploadCreateResponse] =
        post("ad_accounts" :: string :: "customer_lists" :: string :: "uploads" :: jsonBody[CustomerListUploadCreateRequest]) { (adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest) =>
          da.CustomerListUploads_customerListUploads/create(adAccountId, customerListId, customerListUploadCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CustomerListUploadResponse
        */
        private def customerListUploads/get(da: DataAccessor): Endpoint[CustomerListUploadResponse] =
        get("ad_accounts" :: string :: "customer_lists" :: string :: "uploads" :: string) { (adAccountId: String, customerListId: String, customerListUploadId: String) =>
          da.CustomerListUploads_customerListUploads/get(adAccountId, customerListId, customerListUploadId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CustomerListUploadResponse
        */
        private def customerListUploads/run(da: DataAccessor): Endpoint[CustomerListUploadResponse] =
        post("ad_accounts" :: string :: "customer_lists" :: string :: "uploads" :: string :: "run") { (adAccountId: String, customerListId: String, customerListUploadId: String) =>
          da.CustomerListUploads_customerListUploads/run(adAccountId, customerListId, customerListUploadId) match {
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
      val file = Files.createTempFile("tmpCustomerListUploadsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
