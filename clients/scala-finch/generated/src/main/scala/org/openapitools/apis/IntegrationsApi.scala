package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.DetailedError
import org.openapitools.models.Error
import org.openapitools.models.IntegrationLogsRequest
import org.openapitools.models.IntegrationLogsSuccessResponse
import org.openapitools.models.IntegrationMetadata
import org.openapitools.models.IntegrationRecord
import org.openapitools.models.IntegrationRequest
import org.openapitools.models.IntegrationRequestPatch
import org.openapitools.models.IntegrationsGetList200Response
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

object IntegrationsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        integrations/getById(da) :+:
        integrations/getList(da) :+:
        integrationsCommerce/del(da) :+:
        integrationsCommerce/get(da) :+:
        integrationsCommerce/patch(da) :+:
        integrationsCommerce/post(da) :+:
        integrationsLogs/post(da)


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
        * @return An endpoint representing a IntegrationRecord
        */
        private def integrations/getById(da: DataAccessor): Endpoint[IntegrationRecord] =
        get("integrations" :: string) { (id: String) =>
          da.Integrations_integrations/getById(id) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a IntegrationsGetList200Response
        */
        private def integrations/getList(da: DataAccessor): Endpoint[IntegrationsGetList200Response] =
        get("integrations" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (bookmark: Option[String], pageSize: Option[Int]) =>
          da.Integrations_integrations/getList(bookmark, pageSize) match {
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
        private def integrationsCommerce/del(da: DataAccessor): Endpoint[Unit] =
        delete("integrations" :: "commerce" :: string) { (externalBusinessId: String) =>
          da.Integrations_integrationsCommerce/del(externalBusinessId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a IntegrationMetadata
        */
        private def integrationsCommerce/get(da: DataAccessor): Endpoint[IntegrationMetadata] =
        get("integrations" :: "commerce" :: string) { (externalBusinessId: String) =>
          da.Integrations_integrationsCommerce/get(externalBusinessId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a IntegrationMetadata
        */
        private def integrationsCommerce/patch(da: DataAccessor): Endpoint[IntegrationMetadata] =
        patch("integrations" :: "commerce" :: string :: jsonBody[IntegrationRequestPatch]) { (externalBusinessId: String, integrationRequestPatch: IntegrationRequestPatch) =>
          da.Integrations_integrationsCommerce/patch(externalBusinessId, integrationRequestPatch) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a IntegrationMetadata
        */
        private def integrationsCommerce/post(da: DataAccessor): Endpoint[IntegrationMetadata] =
        post("integrations" :: "commerce" :: jsonBody[IntegrationRequest]) { (integrationRequest: IntegrationRequest) =>
          da.Integrations_integrationsCommerce/post(integrationRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a IntegrationLogsSuccessResponse
        */
        private def integrationsLogs/post(da: DataAccessor): Endpoint[IntegrationLogsSuccessResponse] =
        post("integrations" :: "logs" :: jsonBody[IntegrationLogsRequest]) { (integrationLogsRequest: IntegrationLogsRequest) =>
          da.Integrations_integrationsLogs/post(integrationLogsRequest) match {
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
      val file = Files.createTempFile("tmpIntegrationsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
