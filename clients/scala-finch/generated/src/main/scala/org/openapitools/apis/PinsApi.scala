package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Error
import java.time.LocalDateTime
import org.openapitools.models.Pin
import org.openapitools.models.PinAnalyticsMetricsResponse
import org.openapitools.models.PinCreate
import org.openapitools.models.PinUpdate
import org.openapitools.models.PinsAnalyticsMetricTypesParameterInner
import org.openapitools.models.PinsList200Response
import org.openapitools.models.PinsSaveRequest
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

object PinsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        multiPins/analytics(da) :+:
        pins/analytics(da) :+:
        pins/create(da) :+:
        pins/delete(da) :+:
        pins/get(da) :+:
        pins/list(da) :+:
        pins/save(da) :+:
        pins/update(da)


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
        * @return An endpoint representing a Map[String, Map]
        */
        private def multiPins/analytics(da: DataAccessor): Endpoint[Map[String, Map]] =
        get("pins" :: "analytics" :: params("pin_ids") :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("metric_types") :: paramOption("app_types") :: paramOption("ad_account_id")) { (pinIds: Seq[String], startDate: LocalDateTime, endDate: LocalDateTime, metricTypes: Seq[PinsAnalyticsMetricTypesParameterInner], appTypes: Option[String], adAccountId: Option[String]) =>
          da.Pins_multiPins/analytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Map[String, PinAnalyticsMetricsResponse]
        */
        private def pins/analytics(da: DataAccessor): Endpoint[Map[String, PinAnalyticsMetricsResponse]] =
        get("pins" :: string :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("metric_types") :: paramOption("app_types") :: paramOption("split_field") :: paramOption("ad_account_id")) { (pinId: String, startDate: LocalDateTime, endDate: LocalDateTime, metricTypes: Seq[PinsAnalyticsMetricTypesParameterInner], appTypes: Option[String], splitField: Option[String], adAccountId: Option[String]) =>
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
        post("pins" :: jsonBody[PinCreate] :: paramOption("ad_account_id")) { (pinCreate: PinCreate, adAccountId: Option[String]) =>
          da.Pins_pins/create(pinCreate, adAccountId) match {
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
        delete("pins" :: string :: paramOption("ad_account_id")) { (pinId: String, adAccountId: Option[String]) =>
          da.Pins_pins/delete(pinId, adAccountId) match {
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
        get("pins" :: string :: paramOption("pin_metrics").map(_.map(_.toBoolean)) :: paramOption("ad_account_id")) { (pinId: String, pinMetrics: Option[Boolean], adAccountId: Option[String]) =>
          da.Pins_pins/get(pinId, pinMetrics, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PinsList200Response
        */
        private def pins/list(da: DataAccessor): Endpoint[PinsList200Response] =
        get("pins" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("pin_filter") :: paramOption("include_protected_pins").map(_.map(_.toBoolean)) :: paramOption("pin_type") :: params("creative_types") :: paramOption("ad_account_id") :: paramOption("pin_metrics").map(_.map(_.toBoolean))) { (bookmark: Option[String], pageSize: Option[Int], pinFilter: Option[String], includeProtectedPins: Option[Boolean], pinType: Option[String], creativeTypes: Seq[String], adAccountId: Option[String], pinMetrics: Option[Boolean]) =>
          da.Pins_pins/list(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics) match {
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
        private def pins/save(da: DataAccessor): Endpoint[Pin] =
        post("pins" :: string :: "save" :: jsonBody[PinsSaveRequest] :: paramOption("ad_account_id")) { (pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: Option[String]) =>
          da.Pins_pins/save(pinId, pinsSaveRequest, adAccountId) match {
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
        private def pins/update(da: DataAccessor): Endpoint[Pin] =
        patch("pins" :: string :: jsonBody[PinUpdate] :: paramOption("ad_account_id")) { (pinId: String, pinUpdate: PinUpdate, adAccountId: Option[String]) =>
          da.Pins_pins/update(pinId, pinUpdate, adAccountId) match {
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
