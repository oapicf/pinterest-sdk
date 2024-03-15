package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdAccount
import org.openapitools.models.AdAccountAnalyticsResponseInner
import org.openapitools.models.AdAccountCreateRequest
import org.openapitools.models.AdAccountsList200Response
import org.openapitools.models.AdsAnalyticsCreateAsyncRequest
import org.openapitools.models.AdsAnalyticsCreateAsyncResponse
import org.openapitools.models.AdsAnalyticsGetAsyncResponse
import org.openapitools.models.AdsAnalyticsTargetingType
import org.openapitools.models.ConversionReportAttributionType
import org.openapitools.models.CreateMMMReportRequest
import org.openapitools.models.CreateMMMReportResponse
import org.openapitools.models.Error
import org.openapitools.models.GetMMMReportResponse
import org.openapitools.models.Granularity
import java.time.LocalDateTime
import org.openapitools.models.MetricsResponse
import scala.collection.immutable.Seq
import org.openapitools.models.TemplatesList200Response
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

object AdAccountsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        adAccount/analytics(da) :+:
        adAccountTargetingAnalytics/get(da) :+:
        adAccounts/create(da) :+:
        adAccounts/get(da) :+:
        adAccounts/list(da) :+:
        analytics/createMmmReport(da) :+:
        analytics/createReport(da) :+:
        analytics/createTemplateReport(da) :+:
        analytics/getMmmReport(da) :+:
        analytics/getReport(da) :+:
        sandbox/delete(da) :+:
        templates/list(da)


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
        * @return An endpoint representing a Seq[AdAccountAnalyticsResponseInner]
        */
        private def adAccount/analytics(da: DataAccessor): Endpoint[Seq[AdAccountAnalyticsResponseInner]] =
        get("ad_accounts" :: string :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.AdAccounts_adAccount/analytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MetricsResponse
        */
        private def adAccountTargetingAnalytics/get(da: DataAccessor): Endpoint[MetricsResponse] =
        get("ad_accounts" :: string :: "targeting_analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("targeting_types") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time") :: paramOption("attribution_types").map(_.map(_.toConversionReportAttributionType))) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, targetingTypes: Seq[AdsAnalyticsTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]) =>
          da.AdAccounts_adAccountTargetingAnalytics/get(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdAccount
        */
        private def adAccounts/create(da: DataAccessor): Endpoint[AdAccount] =
        post("ad_accounts" :: jsonBody[AdAccountCreateRequest]) { (adAccountCreateRequest: AdAccountCreateRequest) =>
          da.AdAccounts_adAccounts/create(adAccountCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdAccount
        */
        private def adAccounts/get(da: DataAccessor): Endpoint[AdAccount] =
        get("ad_accounts" :: string) { (adAccountId: String) =>
          da.AdAccounts_adAccounts/get(adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdAccountsList200Response
        */
        private def adAccounts/list(da: DataAccessor): Endpoint[AdAccountsList200Response] =
        get("ad_accounts" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("include_shared_accounts").map(_.map(_.toBoolean))) { (bookmark: Option[String], pageSize: Option[Int], includeSharedAccounts: Option[Boolean]) =>
          da.AdAccounts_adAccounts/list(bookmark, pageSize, includeSharedAccounts) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateMMMReportResponse
        */
        private def analytics/createMmmReport(da: DataAccessor): Endpoint[CreateMMMReportResponse] =
        post("ad_accounts" :: string :: "mmm_reports" :: jsonBody[CreateMMMReportRequest]) { (adAccountId: String, createMMMReportRequest: CreateMMMReportRequest) =>
          da.AdAccounts_analytics/createMmmReport(adAccountId, createMMMReportRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdsAnalyticsCreateAsyncResponse
        */
        private def analytics/createReport(da: DataAccessor): Endpoint[AdsAnalyticsCreateAsyncResponse] =
        post("ad_accounts" :: string :: "reports" :: jsonBody[AdsAnalyticsCreateAsyncRequest]) { (adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest) =>
          da.AdAccounts_analytics/createReport(adAccountId, adsAnalyticsCreateAsyncRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdsAnalyticsCreateAsyncResponse
        */
        private def analytics/createTemplateReport(da: DataAccessor): Endpoint[AdsAnalyticsCreateAsyncResponse] =
        post("ad_accounts" :: string :: "templates" :: string :: "reports" :: paramOption("start_date").map(_.map(_.toLocalDateTime)) :: paramOption("end_date").map(_.map(_.toLocalDateTime)) :: paramOption("granularity").map(_.map(_.toGranularity))) { (adAccountId: String, templateId: String, startDate: Option[LocalDateTime], endDate: Option[LocalDateTime], granularity: Option[Granularity]) =>
          da.AdAccounts_analytics/createTemplateReport(adAccountId, templateId, startDate, endDate, granularity) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetMMMReportResponse
        */
        private def analytics/getMmmReport(da: DataAccessor): Endpoint[GetMMMReportResponse] =
        get("ad_accounts" :: string :: "mmm_reports" :: param("token")) { (adAccountId: String, token: String) =>
          da.AdAccounts_analytics/getMmmReport(adAccountId, token) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdsAnalyticsGetAsyncResponse
        */
        private def analytics/getReport(da: DataAccessor): Endpoint[AdsAnalyticsGetAsyncResponse] =
        get("ad_accounts" :: string :: "reports" :: param("token")) { (adAccountId: String, token: String) =>
          da.AdAccounts_analytics/getReport(adAccountId, token) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a String
        */
        private def sandbox/delete(da: DataAccessor): Endpoint[String] =
        delete("ad_accounts" :: string :: "sandbox") { (adAccountId: String) =>
          da.AdAccounts_sandbox/delete(adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TemplatesList200Response
        */
        private def templates/list(da: DataAccessor): Endpoint[TemplatesList200Response] =
        get("ad_accounts" :: string :: "templates" :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.AdAccounts_templates/list(adAccountId, pageSize, order, bookmark) match {
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
      val file = Files.createTempFile("tmpAdAccountsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
