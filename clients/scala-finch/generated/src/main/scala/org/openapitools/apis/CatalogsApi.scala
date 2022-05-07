package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CatalogsFeed
import org.openapitools.models.CatalogsFeedsCreateRequest
import org.openapitools.models.CatalogsFeedsUpdateRequest
import org.openapitools.models.CatalogsItems
import org.openapitools.models.CatalogsItemsBatch
import org.openapitools.models.CatalogsItemsBatchRequest
import org.openapitools.models.CatalogsProductGroup
import org.openapitools.models.CatalogsProductGroupCreateRequest
import org.openapitools.models.CatalogsProductGroupUpdateRequest
import org.openapitools.models.Error
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

object CatalogsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        catalogsProductGroups/create(da) :+:
        catalogsProductGroups/delete(da) :+:
        catalogsProductGroups/list(da) :+:
        catalogsProductGroups/update(da) :+:
        feedProcessingResults/list(da) :+:
        feeds/create(da) :+:
        feeds/delete(da) :+:
        feeds/get(da) :+:
        feeds/list(da) :+:
        feeds/update(da) :+:
        items/get(da) :+:
        itemsBatch/get(da) :+:
        itemsBatch/post(da)


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
        * @return An endpoint representing a Object
        */
        private def catalogsProductGroups/create(da: DataAccessor): Endpoint[Object] =
        post("catalogs" :: "product_groups" :: jsonBody[CatalogsProductGroupCreateRequest]) { (catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest) =>
          da.Catalogs_catalogsProductGroups/create(catalogsProductGroupCreateRequest) match {
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
        private def catalogsProductGroups/delete(da: DataAccessor): Endpoint[Unit] =
        delete("catalogs" :: "product_groups" :: string) { (productGroupId: String) =>
          da.Catalogs_catalogsProductGroups/delete(productGroupId) match {
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
        private def catalogsProductGroups/list(da: DataAccessor): Endpoint[Paginated] =
        get("catalogs" :: "product_groups" :: param("feed_id") :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (feedId: String, bookmark: Option[String], pageSize: Option[Int]) =>
          da.Catalogs_catalogsProductGroups/list(feedId, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroup
        */
        private def catalogsProductGroups/update(da: DataAccessor): Endpoint[CatalogsProductGroup] =
        patch("catalogs" :: "product_groups" :: string :: jsonBody[CatalogsProductGroupUpdateRequest]) { (productGroupId: String, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest) =>
          da.Catalogs_catalogsProductGroups/update(productGroupId, catalogsProductGroupUpdateRequest) match {
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
        private def feedProcessingResults/list(da: DataAccessor): Endpoint[Paginated] =
        get("catalogs" :: "feeds" :: string :: "processing_results" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (feedId: String, bookmark: Option[String], pageSize: Option[Int]) =>
          da.Catalogs_feedProcessingResults/list(feedId, bookmark, pageSize) match {
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
        post("catalogs" :: "feeds" :: jsonBody[CatalogsFeedsCreateRequest]) { (catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest) =>
          da.Catalogs_feeds/create(catalogsFeedsCreateRequest) match {
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
        delete("catalogs" :: "feeds" :: string) { (feedId: String) =>
          da.Catalogs_feeds/delete(feedId) match {
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
        get("catalogs" :: "feeds" :: string) { (feedId: String) =>
          da.Catalogs_feeds/get(feedId) match {
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
        private def feeds/list(da: DataAccessor): Endpoint[Paginated] =
        get("catalogs" :: "feeds" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (bookmark: Option[String], pageSize: Option[Int]) =>
          da.Catalogs_feeds/list(bookmark, pageSize) match {
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
        patch("catalogs" :: "feeds" :: string :: jsonBody[CatalogsFeedsUpdateRequest]) { (feedId: String, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest) =>
          da.Catalogs_feeds/update(feedId, catalogsFeedsUpdateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsItems
        */
        private def items/get(da: DataAccessor): Endpoint[CatalogsItems] =
        get("catalogs" :: "items" :: param("country") :: params("item_ids") :: param("language")) { (country: String, itemIds: Seq[String], language: String) =>
          da.Catalogs_items/get(country, itemIds, language) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsItemsBatch
        */
        private def itemsBatch/get(da: DataAccessor): Endpoint[CatalogsItemsBatch] =
        get("catalogs" :: "items" :: "batch" :: string) { (batchId: String) =>
          da.Catalogs_itemsBatch/get(batchId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsItemsBatch
        */
        private def itemsBatch/post(da: DataAccessor): Endpoint[CatalogsItemsBatch] =
        post("catalogs" :: "items" :: "batch" :: jsonBody[CatalogsItemsBatchRequest]) { (catalogsItemsBatchRequest: CatalogsItemsBatchRequest) =>
          da.Catalogs_itemsBatch/post(catalogsItemsBatchRequest) match {
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
      val file = Files.createTempFile("tmpCatalogsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
