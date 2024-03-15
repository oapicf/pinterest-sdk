package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Audience
import org.openapitools.models.AudienceCreateCustomRequest
import org.openapitools.models.AudienceCreateRequest
import org.openapitools.models.AudienceUpdateRequest
import org.openapitools.models.AudiencesList200Response
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

object AudiencesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        audiences/create(da) :+:
        audiences/createCustom(da) :+:
        audiences/get(da) :+:
        audiences/list(da) :+:
        audiences/update(da)


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
        * @return An endpoint representing a Audience
        */
        private def audiences/create(da: DataAccessor): Endpoint[Audience] =
        post("ad_accounts" :: string :: "audiences" :: jsonBody[AudienceCreateRequest]) { (adAccountId: String, audienceCreateRequest: AudienceCreateRequest) =>
          da.Audiences_audiences/create(adAccountId, audienceCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Audience
        */
        private def audiences/createCustom(da: DataAccessor): Endpoint[Audience] =
        post("ad_accounts" :: string :: "audiences" :: "custom" :: jsonBody[AudienceCreateCustomRequest]) { (adAccountId: String, audienceCreateCustomRequest: AudienceCreateCustomRequest) =>
          da.Audiences_audiences/createCustom(adAccountId, audienceCreateCustomRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Audience
        */
        private def audiences/get(da: DataAccessor): Endpoint[Audience] =
        get("ad_accounts" :: string :: "audiences" :: string) { (adAccountId: String, audienceId: String) =>
          da.Audiences_audiences/get(adAccountId, audienceId) match {
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
        private def audiences/list(da: DataAccessor): Endpoint[AudiencesList200Response] =
        get("ad_accounts" :: string :: "audiences" :: paramOption("bookmark") :: paramOption("order") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ownership_type")) { (adAccountId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int], ownershipType: Option[String]) =>
          da.Audiences_audiences/list(adAccountId, bookmark, order, pageSize, ownershipType) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Audience
        */
        private def audiences/update(da: DataAccessor): Endpoint[Audience] =
        patch("ad_accounts" :: string :: "audiences" :: string :: jsonBody[AudienceUpdateRequest]) { (adAccountId: String, audienceId: String, audienceUpdateRequest: AudienceUpdateRequest) =>
          da.Audiences_audiences/update(adAccountId, audienceId, audienceUpdateRequest) match {
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
      val file = Files.createTempFile("tmpAudiencesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
