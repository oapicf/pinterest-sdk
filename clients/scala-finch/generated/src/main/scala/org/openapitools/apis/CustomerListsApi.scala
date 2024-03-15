package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CustomerList
import org.openapitools.models.CustomerListRequest
import org.openapitools.models.CustomerListUpdateRequest
import org.openapitools.models.CustomerListsList200Response
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

object CustomerListsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        customerLists/create(da) :+:
        customerLists/get(da) :+:
        customerLists/list(da) :+:
        customerLists/update(da)


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
        * @return An endpoint representing a CustomerList
        */
        private def customerLists/create(da: DataAccessor): Endpoint[CustomerList] =
        post("ad_accounts" :: string :: "customer_lists" :: jsonBody[CustomerListRequest]) { (adAccountId: String, customerListRequest: CustomerListRequest) =>
          da.CustomerLists_customerLists/create(adAccountId, customerListRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CustomerList
        */
        private def customerLists/get(da: DataAccessor): Endpoint[CustomerList] =
        get("ad_accounts" :: string :: "customer_lists" :: string) { (adAccountId: String, customerListId: String) =>
          da.CustomerLists_customerLists/get(adAccountId, customerListId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CustomerListsList200Response
        */
        private def customerLists/list(da: DataAccessor): Endpoint[CustomerListsList200Response] =
        get("ad_accounts" :: string :: "customer_lists" :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.CustomerLists_customerLists/list(adAccountId, pageSize, order, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CustomerList
        */
        private def customerLists/update(da: DataAccessor): Endpoint[CustomerList] =
        patch("ad_accounts" :: string :: "customer_lists" :: string :: jsonBody[CustomerListUpdateRequest]) { (adAccountId: String, customerListId: String, customerListUpdateRequest: CustomerListUpdateRequest) =>
          da.CustomerLists_customerLists/update(adAccountId, customerListId, customerListUpdateRequest) match {
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
      val file = Files.createTempFile("tmpCustomerListsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
