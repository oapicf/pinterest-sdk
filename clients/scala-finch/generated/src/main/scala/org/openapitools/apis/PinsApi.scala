package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AnalyticsMetricsResponse
import org.openapitools.models.Error
import java.time.LocalDateTime
import org.openapitools.models.Pin
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

object PinsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        pins/analytics(da) :+:
        pins/create(da) :+:
        pins/delete(da) :+:
        pins/get(da)


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
        * @return An endpoint representing a Map[String, AnalyticsMetricsResponse]
        */
        private def pins/analytics(da: DataAccessor): Endpoint[Map[String, AnalyticsMetricsResponse]] =
        get("pins" :: string :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("metric_types") :: paramOption("app_types") :: paramOption("split_field") :: paramOption("ad_account_id")) { (pinId: String, startDate: LocalDateTime, endDate: LocalDateTime, metricTypes: Seq[String], appTypes: Option[String], splitField: Option[String], adAccountId: Option[String]) =>
          da.Pins_pins/analytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Pin
        */
        private def pins/create(da: DataAccessor): Endpoint[Pin] =
        post("pins" :: jsonBody[Pin]) { (pin: Pin) =>
          da.Pins_pins/create(pin) match {
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
        private def pins/delete(da: DataAccessor): Endpoint[Unit] =
        delete("pins" :: string) { (pinId: String) =>
          da.Pins_pins/delete(pinId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Pin
        */
        private def pins/get(da: DataAccessor): Endpoint[Pin] =
        get("pins" :: string :: paramOption("ad_account_id")) { (pinId: String, adAccountId: Option[String]) =>
          da.Pins_pins/get(pinId, adAccountId) match {
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
      val file = Files.createTempFile("tmpPinsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
