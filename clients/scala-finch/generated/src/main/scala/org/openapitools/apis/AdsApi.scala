package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdArrayResponse
import org.openapitools.models.AdCreateRequest
import org.openapitools.models.AdPreviewRequest
import org.openapitools.models.AdPreviewURLResponse
import org.openapitools.models.AdResponse
import org.openapitools.models.AdUpdateRequest
import org.openapitools.models.AdsAnalyticsResponseInner
import org.openapitools.models.AdsAnalyticsTargetingType
import org.openapitools.models.AdsList200Response
import org.openapitools.models.ConversionReportAttributionType
import org.openapitools.models.Error
import org.openapitools.models.Granularity
import java.time.LocalDateTime
import org.openapitools.models.MetricsResponse
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

object AdsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        adPreviews/create(da) :+:
        adTargetingAnalytics/get(da) :+:
        ads/analytics(da) :+:
        ads/create(da) :+:
        ads/get(da) :+:
        ads/list(da) :+:
        ads/update(da)


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
        * @return An endpoint representing a AdPreviewURLResponse
        */
        private def adPreviews/create(da: DataAccessor): Endpoint[AdPreviewURLResponse] =
        post("ad_accounts" :: string :: "ad_previews" :: jsonBody[AdPreviewRequest]) { (adAccountId: String, adPreviewRequest: AdPreviewRequest) =>
          da.Ads_adPreviews/create(adAccountId, adPreviewRequest) match {
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
        private def adTargetingAnalytics/get(da: DataAccessor): Endpoint[MetricsResponse] =
        get("ad_accounts" :: string :: "ads" :: "targeting_analytics" :: params("ad_ids") :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("targeting_types") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time") :: paramOption("attribution_types").map(_.map(_.toConversionReportAttributionType))) { (adAccountId: String, adIds: Seq[String], startDate: LocalDateTime, endDate: LocalDateTime, targetingTypes: Seq[AdsAnalyticsTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]) =>
          da.Ads_adTargetingAnalytics/get(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[AdsAnalyticsResponseInner]
        */
        private def ads/analytics(da: DataAccessor): Endpoint[Seq[AdsAnalyticsResponseInner]] =
        get("ad_accounts" :: string :: "ads" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("ad_ids") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, adIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.Ads_ads/analytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdArrayResponse
        */
        private def ads/create(da: DataAccessor): Endpoint[AdArrayResponse] =
        post("ad_accounts" :: string :: "ads" :: jsonBody[Seq[AdCreateRequest]]) { (adAccountId: String, adCreateRequest: Seq[AdCreateRequest]) =>
          da.Ads_ads/create(adAccountId, adCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdResponse
        */
        private def ads/get(da: DataAccessor): Endpoint[AdResponse] =
        get("ad_accounts" :: string :: "ads" :: string) { (adAccountId: String, adId: String) =>
          da.Ads_ads/get(adAccountId, adId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdsList200Response
        */
        private def ads/list(da: DataAccessor): Endpoint[AdsList200Response] =
        get("ad_accounts" :: string :: "ads" :: params("campaign_ids") :: params("ad_group_ids") :: params("ad_ids") :: params("entity_statuses") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, campaignIds: Seq[String], adGroupIds: Seq[String], adIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.Ads_ads/list(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdArrayResponse
        */
        private def ads/update(da: DataAccessor): Endpoint[AdArrayResponse] =
        patch("ad_accounts" :: string :: "ads" :: jsonBody[Seq[AdUpdateRequest]]) { (adAccountId: String, adUpdateRequest: Seq[AdUpdateRequest]) =>
          da.Ads_ads/update(adAccountId, adUpdateRequest) match {
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
      val file = Files.createTempFile("tmpAdsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
