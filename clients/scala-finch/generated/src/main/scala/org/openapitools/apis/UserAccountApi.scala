package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Account
import org.openapitools.models.AnalyticsMetricsResponse
import org.openapitools.models.Error
import java.time.LocalDateTime
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

object UserAccountApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        userAccount/analytics(da) :+:
        userAccount/get(da)


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
        private def userAccount/analytics(da: DataAccessor): Endpoint[Map[String, AnalyticsMetricsResponse]] =
        get("user_account" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: paramOption("from_claimed_content") :: paramOption("pin_format") :: paramOption("app_types") :: params("metric_types") :: paramOption("split_field") :: paramOption("ad_account_id")) { (startDate: LocalDateTime, endDate: LocalDateTime, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], metricTypes: Seq[String], splitField: Option[String], adAccountId: Option[String]) =>
          da.UserAccount_userAccount/analytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Account
        */
        private def userAccount/get(da: DataAccessor): Endpoint[Account] =
        get("user_account" :: paramOption("ad_account_id")) { (adAccountId: Option[String]) =>
          da.UserAccount_userAccount/get(adAccountId) match {
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
      val file = Files.createTempFile("tmpUserAccountApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
