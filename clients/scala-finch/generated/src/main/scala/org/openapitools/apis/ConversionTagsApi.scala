package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.ConversionEventResponse
import org.openapitools.models.ConversionTagCreate
import org.openapitools.models.ConversionTagListResponse
import org.openapitools.models.ConversionTagResponse
import org.openapitools.models.Error
import org.openapitools.models.PageVisitConversionTagsGet200Response
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

object ConversionTagsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        conversionTags/create(da) :+:
        conversionTags/get(da) :+:
        conversionTags/list(da) :+:
        ocpmEligibleConversionTags/get(da) :+:
        pageVisitConversionTags/get(da)


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
        * @return An endpoint representing a ConversionTagResponse
        */
        private def conversionTags/create(da: DataAccessor): Endpoint[ConversionTagResponse] =
        post("ad_accounts" :: string :: "conversion_tags" :: jsonBody[ConversionTagCreate]) { (adAccountId: String, conversionTagCreate: ConversionTagCreate) =>
          da.ConversionTags_conversionTags/create(adAccountId, conversionTagCreate) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ConversionTagResponse
        */
        private def conversionTags/get(da: DataAccessor): Endpoint[ConversionTagResponse] =
        get("ad_accounts" :: string :: "conversion_tags" :: string) { (adAccountId: String, conversionTagId: String) =>
          da.ConversionTags_conversionTags/get(adAccountId, conversionTagId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ConversionTagListResponse
        */
        private def conversionTags/list(da: DataAccessor): Endpoint[ConversionTagListResponse] =
        get("ad_accounts" :: string :: "conversion_tags" :: paramOption("filter_deleted").map(_.map(_.toBoolean))) { (adAccountId: String, filterDeleted: Option[Boolean]) =>
          da.ConversionTags_conversionTags/list(adAccountId, filterDeleted) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Map[String, Seq[ConversionEventResponse]]
        */
        private def ocpmEligibleConversionTags/get(da: DataAccessor): Endpoint[Map[String, Seq[ConversionEventResponse]]] =
        get("ad_accounts" :: string :: "conversion_tags" :: "ocpm_eligible") { (adAccountId: String) =>
          da.ConversionTags_ocpmEligibleConversionTags/get(adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PageVisitConversionTagsGet200Response
        */
        private def pageVisitConversionTags/get(da: DataAccessor): Endpoint[PageVisitConversionTagsGet200Response] =
        get("ad_accounts" :: string :: "conversion_tags" :: "page_visit" :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.ConversionTags_pageVisitConversionTags/get(adAccountId, pageSize, order, bookmark) match {
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
      val file = Files.createTempFile("tmpConversionTagsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
