package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdsAnalyticsCreateAsyncRequest
import org.openapitools.models.AdsAnalyticsCreateAsyncResponse
import org.openapitools.models.AdsAnalyticsGetAsyncResponse
import org.openapitools.models.AnyType
import org.openapitools.models.Error
import org.openapitools.models.Granularity
import java.time.LocalDateTime
import org.openapitools.models.Paginated
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
        adAccounts/list(da) :+:
        adGroups/analytics(da) :+:
        adGroups/list(da) :+:
        ads/analytics(da) :+:
        ads/list(da) :+:
        analytics/createReport(da) :+:
        analytics/getReport(da) :+:
        campaigns/analytics(da) :+:
        campaigns/list(da) :+:
        productGroups/analytics(da)


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
        * @return An endpoint representing a Seq[Map[String, Object]]
        */
        private def adAccount/analytics(da: DataAccessor): Endpoint[Seq[Map[String, Object]]] =
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
        * @return An endpoint representing a Paginated
        */
        private def adAccounts/list(da: DataAccessor): Endpoint[Paginated] =
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
        * @return An endpoint representing a Seq[Map[String, Object]]
        */
        private def adGroups/analytics(da: DataAccessor): Endpoint[Seq[Map[String, Object]]] =
        get("ad_accounts" :: string :: "ad_groups" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("ad_group_ids") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, adGroupIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.AdAccounts_adGroups/analytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Paginated
        */
        private def adGroups/list(da: DataAccessor): Endpoint[Paginated] =
        get("ad_accounts" :: string :: "ad_groups" :: params("campaign_ids") :: params("ad_group_ids") :: params("entity_statuses") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark") :: paramOption("translate_interests_to_names").map(_.map(_.toBoolean))) { (adAccountId: String, campaignIds: Seq[String], adGroupIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String], translateInterestsToNames: Option[Boolean]) =>
          da.AdAccounts_adGroups/list(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Map[String, Object]]
        */
        private def ads/analytics(da: DataAccessor): Endpoint[Seq[Map[String, Object]]] =
        get("ad_accounts" :: string :: "ads" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("ad_ids") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, adIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.AdAccounts_ads/analytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Paginated
        */
        private def ads/list(da: DataAccessor): Endpoint[Paginated] =
        get("ad_accounts" :: string :: "ads" :: params("campaign_ids") :: params("ad_group_ids") :: params("ad_ids") :: params("entity_statuses") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, campaignIds: Seq[String], adGroupIds: Seq[String], adIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.AdAccounts_ads/list(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark) match {
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
        * @return An endpoint representing a Seq[Map[String, Object]]
        */
        private def campaigns/analytics(da: DataAccessor): Endpoint[Seq[Map[String, Object]]] =
        get("ad_accounts" :: string :: "campaigns" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("campaign_ids") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, campaignIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.AdAccounts_campaigns/analytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Paginated
        */
        private def campaigns/list(da: DataAccessor): Endpoint[Paginated] =
        get("ad_accounts" :: string :: "campaigns" :: params("campaign_ids") :: params("entity_statuses") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, campaignIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.AdAccounts_campaigns/list(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[Map[String, Object]]
        */
        private def productGroups/analytics(da: DataAccessor): Endpoint[Seq[Map[String, Object]]] =
        get("ad_accounts" :: string :: "product_groups" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("product_group_ids") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, productGroupIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.AdAccounts_productGroups/analytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
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
