package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Error
import org.openapitools.models.LabelCreateRequest
import org.openapitools.models.LabelUpdateRequest
import org.openapitools.models.LabelsList200Response
import org.openapitools.models.LabelsResponse
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

object LabelsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        labels/create(da) :+:
        labels/list(da) :+:
        labels/update(da)


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
        * @return An endpoint representing a LabelsResponse
        */
        private def labels/create(da: DataAccessor): Endpoint[LabelsResponse] =
        post("ad_accounts" :: string :: "labels" :: jsonBody[LabelCreateRequest]) { (adAccountId: String, labelCreateRequest: LabelCreateRequest) =>
          da.Labels_labels/create(adAccountId, labelCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a LabelsList200Response
        */
        private def labels/list(da: DataAccessor): Endpoint[LabelsList200Response] =
        get("ad_accounts" :: string :: "labels" :: params("campaign_ids") :: params("label_ids") :: params("entity_statuses") :: params("label_types") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (adAccountId: String, campaignIds: Seq[String], labelIds: Seq[String], entityStatuses: Seq[String], labelTypes: Seq[String], pageSize: Option[Int], bookmark: Option[String]) =>
          da.Labels_labels/list(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a LabelsResponse
        */
        private def labels/update(da: DataAccessor): Endpoint[LabelsResponse] =
        patch("ad_accounts" :: string :: "labels" :: jsonBody[LabelUpdateRequest]) { (adAccountId: String, labelUpdateRequest: LabelUpdateRequest) =>
          da.Labels_labels/update(adAccountId, labelUpdateRequest) match {
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
      val file = Files.createTempFile("tmpLabelsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
