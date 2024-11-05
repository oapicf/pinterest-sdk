package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdAccountsCountryResponse
import org.openapitools.models.BookClosedResponse
import org.openapitools.models.DeliveryMetricsResponse
import org.openapitools.models.Error
import scala.collection.immutable.Seq
import org.openapitools.models.SingleInterestTargetingOptionResponse
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

object ResourcesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        adAccountCountries/get(da) :+:
        deliveryMetrics/get(da) :+:
        interestTargetingOptions/get(da) :+:
        leadFormQuestions/get(da) :+:
        metricsReadyState/get(da) :+:
        targetingOptions/get(da)


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
        * @return An endpoint representing a AdAccountsCountryResponse
        */
        private def adAccountCountries/get(da: DataAccessor): Endpoint[AdAccountsCountryResponse] =
        get("resources" :: "ad_account_countries") { () =>
          da.Resources_adAccountCountries/get() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeliveryMetricsResponse
        */
        private def deliveryMetrics/get(da: DataAccessor): Endpoint[DeliveryMetricsResponse] =
        get("resources" :: "delivery_metrics" :: paramOption("report_type")) { (reportType: Option[String]) =>
          da.Resources_deliveryMetrics/get(reportType) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SingleInterestTargetingOptionResponse
        */
        private def interestTargetingOptions/get(da: DataAccessor): Endpoint[SingleInterestTargetingOptionResponse] =
        get("resources" :: "targeting" :: "interests" :: string) { (interestId: String) =>
          da.Resources_interestTargetingOptions/get(interestId) match {
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
        private def leadFormQuestions/get(da: DataAccessor): Endpoint[Unit] =
        get("resources" :: "lead_form_questions") { () =>
          da.Resources_leadFormQuestions/get() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BookClosedResponse
        */
        private def metricsReadyState/get(da: DataAccessor): Endpoint[BookClosedResponse] =
        get("resources" :: "metrics_ready_state" :: param("date")) { (date: String) =>
          da.Resources_metricsReadyState/get(date) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Object]
        */
        private def targetingOptions/get(da: DataAccessor): Endpoint[Seq[Object]] =
        get("resources" :: "targeting" :: string :: paramOption("client_id") :: paramOption("oauth_signature") :: paramOption("timestamp") :: paramOption("ad_account_id")) { (targetingType: String, clientId: Option[String], oauthSignature: Option[String], timestamp: Option[String], adAccountId: Option[String]) =>
          da.Resources_targetingOptions/get(targetingType, clientId, oauthSignature, timestamp, adAccountId) match {
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
      val file = Files.createTempFile("tmpResourcesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
