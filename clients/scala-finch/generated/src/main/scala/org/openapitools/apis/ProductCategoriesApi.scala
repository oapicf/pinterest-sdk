package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AgeTrendsBucket
import org.openapitools.models.FeaturedTrend
import org.openapitools.models.GenderBucket
import org.openapitools.models.InterestsEnum
import org.openapitools.models.PinterestLibError
import org.openapitools.models.ProductCategoriesEngagementType
import org.openapitools.models.ProductCategoryDetailLookbackWindow
import org.openapitools.models.ProductCategoryDetails
import org.openapitools.models.ProductCategoryEnum
import org.openapitools.models.ProductCategoryRegion
import scala.collection.immutable.Seq
import org.openapitools.models.TrendingProductCategory
import org.openapitools.models.VerticalProductCategory
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

object ProductCategoriesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        trendsFeaturedTopics/list(da) :+:
        trendsProductCategoriesDetails/list(da) :+:
        trendsProductCategoriesTrending/list(da)


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
        * @return An endpoint representing a Seq[FeaturedTrend]
        */
        private def trendsFeaturedTopics/list(da: DataAccessor): Endpoint[Seq[FeaturedTrend]] =
        get("trends" :: "topics" :: "featured" :: param("region").map(_.toProductCategoryRegion) :: paramOption("interest").map(_.map(_.toInterestsEnum))) { (region: ProductCategoryRegion, interest: Option[InterestsEnum]) =>
          da.ProductCategories_trendsFeaturedTopics/list(region, interest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[ProductCategoryDetails]
        */
        private def trendsProductCategoriesDetails/list(da: DataAccessor): Endpoint[Seq[ProductCategoryDetails]] =
        get("trends" :: "product_categories" :: "details" :: params("product_categories") :: param("region").map(_.toProductCategoryRegion) :: paramOption("lookback_window").map(_.map(_.toProductCategoryDetailLookbackWindow)) :: paramOption("engagement_type").map(_.map(_.toProductCategoriesEngagementType))) { (productCategories: Seq[ProductCategoryEnum], region: ProductCategoryRegion, lookbackWindow: Option[ProductCategoryDetailLookbackWindow], engagementType: Option[ProductCategoriesEngagementType]) =>
          da.ProductCategories_trendsProductCategoriesDetails/list(productCategories, region, lookbackWindow, engagementType) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[TrendingProductCategory]
        */
        private def trendsProductCategoriesTrending/list(da: DataAccessor): Endpoint[Seq[TrendingProductCategory]] =
        get("trends" :: "product_categories" :: "trending" :: param("region").map(_.toProductCategoryRegion) :: params("verticals") :: params("ages") :: params("genders") :: paramOption("engagement_type").map(_.map(_.toProductCategoriesEngagementType))) { (region: ProductCategoryRegion, verticals: Seq[VerticalProductCategory], ages: Seq[AgeTrendsBucket], genders: Seq[GenderBucket], engagementType: Option[ProductCategoriesEngagementType]) =>
          da.ProductCategories_trendsProductCategoriesTrending/list(region, verticals, ages, genders, engagementType) match {
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
      val file = Files.createTempFile("tmpProductCategoriesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
