package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Error
import org.openapitools.models.LeadFormArrayResponse
import org.openapitools.models.LeadFormCreateRequest
import org.openapitools.models.LeadFormResponse
import org.openapitools.models.LeadFormTestRequest
import org.openapitools.models.LeadFormTestResponse
import org.openapitools.models.LeadFormUpdateRequest
import org.openapitools.models.LeadFormsList200Response
import scala.collection.immutable.Seq
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

object LeadFormsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        leadForm/get(da) :+:
        leadFormTest/create(da) :+:
        leadForms/create(da) :+:
        leadForms/list(da) :+:
        leadForms/update(da)


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
        * @return An endpoint representing a LeadFormResponse
        */
        private def leadForm/get(da: DataAccessor): Endpoint[LeadFormResponse] =
        get("ad_accounts" :: string :: "lead_forms" :: string) { (adAccountId: String, leadFormId: String) =>
          da.LeadForms_leadForm/get(adAccountId, leadFormId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a LeadFormTestResponse
        */
        private def leadFormTest/create(da: DataAccessor): Endpoint[LeadFormTestResponse] =
        post("ad_accounts" :: string :: "lead_forms" :: string :: "test" :: jsonBody[LeadFormTestRequest]) { (adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest) =>
          da.LeadForms_leadFormTest/create(adAccountId, leadFormId, leadFormTestRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a LeadFormArrayResponse
        */
        private def leadForms/create(da: DataAccessor): Endpoint[LeadFormArrayResponse] =
        post("ad_accounts" :: string :: "lead_forms" :: jsonBody[Seq[LeadFormCreateRequest]]) { (adAccountId: String, leadFormCreateRequest: Seq[LeadFormCreateRequest]) =>
          da.LeadForms_leadForms/create(adAccountId, leadFormCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a LeadFormsList200Response
        */
        private def leadForms/list(da: DataAccessor): Endpoint[LeadFormsList200Response] =
        get("ad_accounts" :: string :: "lead_forms" :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.LeadForms_leadForms/list(adAccountId, pageSize, order, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a LeadFormArrayResponse
        */
        private def leadForms/update(da: DataAccessor): Endpoint[LeadFormArrayResponse] =
        patch("ad_accounts" :: string :: "lead_forms" :: jsonBody[Seq[LeadFormUpdateRequest]]) { (adAccountId: String, leadFormUpdateRequest: Seq[LeadFormUpdateRequest]) =>
          da.LeadForms_leadForms/update(adAccountId, leadFormUpdateRequest) match {
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
      val file = Files.createTempFile("tmpLeadFormsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
