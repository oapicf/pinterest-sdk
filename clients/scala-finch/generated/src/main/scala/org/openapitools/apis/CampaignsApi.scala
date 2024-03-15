package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdsAnalyticsTargetingType
import org.openapitools.models.CampaignCreateRequest
import org.openapitools.models.CampaignCreateResponse
import org.openapitools.models.CampaignResponse
import org.openapitools.models.CampaignUpdateRequest
import org.openapitools.models.CampaignUpdateResponse
import org.openapitools.models.CampaignsAnalyticsResponseInner
import org.openapitools.models.CampaignsList200Response
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

object CampaignsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        campaignTargetingAnalytics/get(da) :+:
        campaigns/analytics(da) :+:
        campaigns/create(da) :+:
        campaigns/get(da) :+:
        campaigns/list(da) :+:
        campaigns/update(da)


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
        * @return An endpoint representing a MetricsResponse
        */
        private def campaignTargetingAnalytics/get(da: DataAccessor): Endpoint[MetricsResponse] =
        get("ad_accounts" :: string :: "campaigns" :: "targeting_analytics" :: params("campaign_ids") :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("targeting_types") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time") :: paramOption("attribution_types").map(_.map(_.toConversionReportAttributionType))) { (adAccountId: String, campaignIds: Seq[String], startDate: LocalDateTime, endDate: LocalDateTime, targetingTypes: Seq[AdsAnalyticsTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]) =>
          da.Campaigns_campaignTargetingAnalytics/get(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[CampaignsAnalyticsResponseInner]
        */
        private def campaigns/analytics(da: DataAccessor): Endpoint[Seq[CampaignsAnalyticsResponseInner]] =
        get("ad_accounts" :: string :: "campaigns" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("campaign_ids") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, campaignIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.Campaigns_campaigns/analytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CampaignCreateResponse
        */
        private def campaigns/create(da: DataAccessor): Endpoint[CampaignCreateResponse] =
        post("ad_accounts" :: string :: "campaigns" :: jsonBody[Seq[CampaignCreateRequest]]) { (adAccountId: String, campaignCreateRequest: Seq[CampaignCreateRequest]) =>
          da.Campaigns_campaigns/create(adAccountId, campaignCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CampaignResponse
        */
        private def campaigns/get(da: DataAccessor): Endpoint[CampaignResponse] =
        get("ad_accounts" :: string :: "campaigns" :: string) { (adAccountId: String, campaignId: String) =>
          da.Campaigns_campaigns/get(adAccountId, campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CampaignsList200Response
        */
        private def campaigns/list(da: DataAccessor): Endpoint[CampaignsList200Response] =
        get("ad_accounts" :: string :: "campaigns" :: params("campaign_ids") :: params("entity_statuses") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, campaignIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.Campaigns_campaigns/list(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CampaignUpdateResponse
        */
        private def campaigns/update(da: DataAccessor): Endpoint[CampaignUpdateResponse] =
        patch("ad_accounts" :: string :: "campaigns" :: jsonBody[Seq[CampaignUpdateRequest]]) { (adAccountId: String, campaignUpdateRequest: Seq[CampaignUpdateRequest]) =>
          da.Campaigns_campaigns/update(adAccountId, campaignUpdateRequest) match {
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
      val file = Files.createTempFile("tmpCampaignsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
