package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CatalogsFeed
import org.openapitools.models.CatalogsFeedIngestion
import org.openapitools.models.CatalogsItemValidationIssue
import org.openapitools.models.Error
import org.openapitools.models.FeedProcessingResultsList200Response
import org.openapitools.models.FeedsCreateRequest
import org.openapitools.models.FeedsList200Response
import org.openapitools.models.FeedsUpdateRequest
import org.openapitools.models.ItemsIssuesList200Response
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

object CatalogFeedsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        feedProcessingResults/list(da) :+:
        feeds/create(da) :+:
        feeds/delete(da) :+:
        feeds/get(da) :+:
        feeds/ingest(da) :+:
        feeds/list(da) :+:
        feeds/update(da) :+:
        itemsIssues/list(da)


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
        * @return An endpoint representing a FeedProcessingResultsList200Response
        */
        private def feedProcessingResults/list(da: DataAccessor): Endpoint[FeedProcessingResultsList200Response] =
        get("catalogs" :: "feeds" :: string :: "processing_results" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (feedId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]) =>
          da.CatalogFeeds_feedProcessingResults/list(feedId, bookmark, pageSize, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsFeed
        */
        private def feeds/create(da: DataAccessor): Endpoint[CatalogsFeed] =
        post("catalogs" :: "feeds" :: jsonBody[FeedsCreateRequest] :: paramOption("ad_account_id")) { (feedsCreateRequest: FeedsCreateRequest, adAccountId: Option[String]) =>
          da.CatalogFeeds_feeds/create(feedsCreateRequest, adAccountId) match {
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
        private def feeds/delete(da: DataAccessor): Endpoint[Unit] =
        delete("catalogs" :: "feeds" :: string :: paramOption("ad_account_id")) { (feedId: String, adAccountId: Option[String]) =>
          da.CatalogFeeds_feeds/delete(feedId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsFeed
        */
        private def feeds/get(da: DataAccessor): Endpoint[CatalogsFeed] =
        get("catalogs" :: "feeds" :: string :: paramOption("ad_account_id")) { (feedId: String, adAccountId: Option[String]) =>
          da.CatalogFeeds_feeds/get(feedId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsFeedIngestion
        */
        private def feeds/ingest(da: DataAccessor): Endpoint[CatalogsFeedIngestion] =
        post("catalogs" :: "feeds" :: string :: "ingest" :: paramOption("ad_account_id")) { (feedId: String, adAccountId: Option[String]) =>
          da.CatalogFeeds_feeds/ingest(feedId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FeedsList200Response
        */
        private def feeds/list(da: DataAccessor): Endpoint[FeedsList200Response] =
        get("catalogs" :: "feeds" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("catalog_id") :: paramOption("ad_account_id")) { (bookmark: Option[String], pageSize: Option[Int], catalogId: Option[String], adAccountId: Option[String]) =>
          da.CatalogFeeds_feeds/list(bookmark, pageSize, catalogId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsFeed
        */
        private def feeds/update(da: DataAccessor): Endpoint[CatalogsFeed] =
        patch("catalogs" :: "feeds" :: string :: jsonBody[FeedsUpdateRequest] :: paramOption("ad_account_id")) { (feedId: String, feedsUpdateRequest: FeedsUpdateRequest, adAccountId: Option[String]) =>
          da.CatalogFeeds_feeds/update(feedId, feedsUpdateRequest, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ItemsIssuesList200Response
        */
        private def itemsIssues/list(da: DataAccessor): Endpoint[ItemsIssuesList200Response] =
        get("catalogs" :: "processing_results" :: string :: "item_issues" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: params("item_numbers") :: paramOption("item_validation_issue").map(_.map(_.toCatalogsItemValidationIssue)) :: paramOption("ad_account_id")) { (processingResultId: String, bookmark: Option[String], pageSize: Option[Int], itemNumbers: Seq[Int], itemValidationIssue: Option[CatalogsItemValidationIssue], adAccountId: Option[String]) =>
          da.CatalogFeeds_itemsIssues/list(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId) match {
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
      val file = Files.createTempFile("tmpCatalogFeedsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
