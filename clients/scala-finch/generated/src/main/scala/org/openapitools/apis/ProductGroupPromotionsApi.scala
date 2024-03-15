package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Error
import org.openapitools.models.Granularity
import java.time.LocalDateTime
import org.openapitools.models.ProductGroupAnalyticsResponseInner
import org.openapitools.models.ProductGroupPromotionCreateRequest
import org.openapitools.models.ProductGroupPromotionResponse
import org.openapitools.models.ProductGroupPromotionUpdateRequest
import org.openapitools.models.ProductGroupPromotionsList200Response
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

object ProductGroupPromotionsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        productGroupPromotions/create(da) :+:
        productGroupPromotions/get(da) :+:
        productGroupPromotions/list(da) :+:
        productGroupPromotions/update(da) :+:
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
        * @return An endpoint representing a ProductGroupPromotionResponse
        */
        private def productGroupPromotions/create(da: DataAccessor): Endpoint[ProductGroupPromotionResponse] =
        post("ad_accounts" :: string :: "product_group_promotions" :: jsonBody[ProductGroupPromotionCreateRequest]) { (adAccountId: String, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest) =>
          da.ProductGroupPromotions_productGroupPromotions/create(adAccountId, productGroupPromotionCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProductGroupPromotionResponse
        */
        private def productGroupPromotions/get(da: DataAccessor): Endpoint[ProductGroupPromotionResponse] =
        get("ad_accounts" :: string :: "product_group_promotions" :: string) { (adAccountId: String, productGroupPromotionId: String) =>
          da.ProductGroupPromotions_productGroupPromotions/get(adAccountId, productGroupPromotionId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProductGroupPromotionsList200Response
        */
        private def productGroupPromotions/list(da: DataAccessor): Endpoint[ProductGroupPromotionsList200Response] =
        get("ad_accounts" :: string :: "product_group_promotions" :: params("product_group_promotion_ids") :: params("entity_statuses") :: paramOption("ad_group_id") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("bookmark")) { (adAccountId: String, productGroupPromotionIds: Seq[String], entityStatuses: Seq[String], adGroupId: Option[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]) =>
          da.ProductGroupPromotions_productGroupPromotions/list(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProductGroupPromotionResponse
        */
        private def productGroupPromotions/update(da: DataAccessor): Endpoint[ProductGroupPromotionResponse] =
        patch("ad_accounts" :: string :: "product_group_promotions" :: jsonBody[ProductGroupPromotionUpdateRequest]) { (adAccountId: String, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest) =>
          da.ProductGroupPromotions_productGroupPromotions/update(adAccountId, productGroupPromotionUpdateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[ProductGroupAnalyticsResponseInner]
        */
        private def productGroups/analytics(da: DataAccessor): Endpoint[Seq[ProductGroupAnalyticsResponseInner]] =
        get("ad_accounts" :: string :: "product_groups" :: "analytics" :: param("start_date").map(_.toLocalDateTime) :: param("end_date").map(_.toLocalDateTime) :: params("product_group_ids") :: params("columns") :: param("granularity").map(_.toGranularity) :: paramOption("click_window_days").map(_.map(_.toInt)) :: paramOption("engagement_window_days").map(_.map(_.toInt)) :: paramOption("view_window_days").map(_.map(_.toInt)) :: paramOption("conversion_report_time")) { (adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, productGroupIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]) =>
          da.ProductGroupPromotions_productGroups/analytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) match {
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
      val file = Files.createTempFile("tmpProductGroupPromotionsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
