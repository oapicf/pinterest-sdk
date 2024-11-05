package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdGroupArrayResponse
import org.openapitools.models.AdGroupAudienceSizingRequest
import org.openapitools.models.AdGroupAudienceSizingResponse
import org.openapitools.models.AdGroupCreateRequest
import org.openapitools.models.AdGroupResponse
import org.openapitools.models.AdGroupUpdateRequest
import org.openapitools.models.AdGroupsAnalyticsResponseInner
import org.openapitools.models.AdGroupsList200Response
import org.openapitools.models.AdsAnalyticsTargetingType
import org.openapitools.models.BidFloor
import org.openapitools.models.BidFloorRequest
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

object AdGroupsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        adGroups/analytics(da) :+:
        adGroups/audienceSizing(da) :+:
        adGroups/create(da) :+:
        adGroups/get(da) :+:
        adGroups/list(da) :+:
        adGroups/update(da) :+:
        adGroupsBidFloor/get(da) :+:
        adGroupsTargetingAnalytics/get(da)


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
        * @return An endpoint representing a Seq[AdGroupsAnalyticsResponseInner]
        */
        private def adGroups/analytics(da: DataAccessor): Endpoint[Seq[AdGroupsAnalyticsResponseInner]] =
        get("ad_accounts" :: string :: "ad_groups" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("ad_group_ids") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, adGroupIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.AdGroups_adGroups/analytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdGroupAudienceSizingResponse
        */
        private def adGroups/audienceSizing(da: DataAccessor): Endpoint[AdGroupAudienceSizingResponse] =
        post("ad_accounts" :: string :: "ad_groups" :: "audience_sizing" :: jsonBody[AdGroupAudienceSizingRequest]) { (adAccountId: String, adGroupAudienceSizingRequest: AdGroupAudienceSizingRequest) =>
          da.AdGroups_adGroups/audienceSizing(adAccountId, adGroupAudienceSizingRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdGroupArrayResponse
        */
        private def adGroups/create(da: DataAccessor): Endpoint[AdGroupArrayResponse] =
        post("ad_accounts" :: string :: "ad_groups" :: jsonBody[Seq[AdGroupCreateRequest]]) { (adAccountId: String, adGroupCreateRequest: Seq[AdGroupCreateRequest]) =>
          da.AdGroups_adGroups/create(adAccountId, adGroupCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdGroupResponse
        */
        private def adGroups/get(da: DataAccessor): Endpoint[AdGroupResponse] =
        get("ad_accounts" :: string :: "ad_groups" :: string) { (adAccountId: String, adGroupId: String) =>
          da.AdGroups_adGroups/get(adAccountId, adGroupId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdGroupsList200Response
        */
        private def adGroups/list(da: DataAccessor): Endpoint[AdGroupsList200Response] =
        get("ad_accounts" :: string :: "ad_groups" :: params("campaign_ids") :: params("ad_group_ids") :: params("entity_statuses") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark") :: paramOption("translate_interests_to_names").map(_.map(_.toBoolean))) { (adAccountId: String, campaignIds: Seq[String], adGroupIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String], translateInterestsToNames: Option[Boolean]) =>
          da.AdGroups_adGroups/list(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdGroupArrayResponse
        */
        private def adGroups/update(da: DataAccessor): Endpoint[AdGroupArrayResponse] =
        patch("ad_accounts" :: string :: "ad_groups" :: jsonBody[Seq[AdGroupUpdateRequest]]) { (adAccountId: String, adGroupUpdateRequest: Seq[AdGroupUpdateRequest]) =>
          da.AdGroups_adGroups/update(adAccountId, adGroupUpdateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BidFloor
        */
        private def adGroupsBidFloor/get(da: DataAccessor): Endpoint[BidFloor] =
        post("ad_accounts" :: string :: "bid_floor" :: jsonBody[BidFloorRequest]) { (adAccountId: String, bidFloorRequest: BidFloorRequest) =>
          da.AdGroups_adGroupsBidFloor/get(adAccountId, bidFloorRequest) match {
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
        private def adGroupsTargetingAnalytics/get(da: DataAccessor): Endpoint[MetricsResponse] =
        get("ad_accounts" :: string :: "ad_groups" :: "targeting_analytics" :: params("ad_group_ids") :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("targeting_types") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time") :: paramOption("attribution_types").map(_.map(_.toConversionReportAttributionType))) { (adAccountId: String, adGroupIds: Seq[String], startDate: LocalDateTime, endDate: LocalDateTime, targetingTypes: Seq[AdsAnalyticsTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]) =>
          da.AdGroups_adGroupsTargetingAnalytics/get(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes) match {
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
      val file = Files.createTempFile("tmpAdGroupsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
