package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Error
import org.openapitools.models.TargetingTemplateCreate
import org.openapitools.models.TargetingTemplateGetResponseData
import org.openapitools.models.TargetingTemplateList200Response
import org.openapitools.models.TargetingTemplateUpdateRequest
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

object TargetingTemplateApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        targetingTemplate/create(da) :+:
        targetingTemplate/list(da) :+:
        targetingTemplate/update(da)


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
        * @return An endpoint representing a TargetingTemplateGetResponseData
        */
        private def targetingTemplate/create(da: DataAccessor): Endpoint[TargetingTemplateGetResponseData] =
        post("ad_accounts" :: string :: "targeting_templates" :: jsonBody[TargetingTemplateCreate]) { (adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate) =>
          da.TargetingTemplate_targetingTemplate/create(adAccountId, targetingTemplateCreate) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TargetingTemplateList200Response
        */
        private def targetingTemplate/list(da: DataAccessor): Endpoint[TargetingTemplateList200Response] =
        get("ad_accounts" :: string :: "targeting_templates" :: paramOption("order") :: paramOption("include_sizing").map(_.map(_.toBoolean)) :: paramOption("search_query") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (adAccountId: String, order: Option[String], includeSizing: Option[Boolean], searchQuery: Option[String], pageSize: Option[Int], bookmark: Option[String]) =>
          da.TargetingTemplate_targetingTemplate/list(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def targetingTemplate/update(da: DataAccessor): Endpoint[Unit] =
        patch("ad_accounts" :: string :: "targeting_templates" :: jsonBody[TargetingTemplateUpdateRequest]) { (adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest) =>
          da.TargetingTemplate_targetingTemplate/update(adAccountId, targetingTemplateUpdateRequest) match {
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
      val file = Files.createTempFile("tmpTargetingTemplateApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
