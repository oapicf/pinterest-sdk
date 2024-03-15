package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CatalogsFeed
import org.openapitools.models.CatalogsItemValidationIssue
import org.openapitools.models.CatalogsItems
import org.openapitools.models.CatalogsItemsBatch
import org.openapitools.models.CatalogsItemsFilters
import org.openapitools.models.CatalogsList200Response
import org.openapitools.models.CatalogsListProductsByFilterRequest
import org.openapitools.models.CatalogsProductGroupPinsList200Response
import org.openapitools.models.CatalogsProductGroupProductCounts
import org.openapitools.models.CatalogsProductGroupsCreate201Response
import org.openapitools.models.CatalogsProductGroupsCreateRequest
import org.openapitools.models.CatalogsProductGroupsList200Response
import org.openapitools.models.CatalogsProductGroupsUpdateRequest
import org.openapitools.models.Error
import org.openapitools.models.FeedProcessingResultsList200Response
import org.openapitools.models.FeedsCreateRequest
import org.openapitools.models.FeedsList200Response
import org.openapitools.models.FeedsUpdateRequest
import org.openapitools.models.ItemsBatchPostRequest
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

object CatalogsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        catalogs/list(da) :+:
        catalogsProductGroupPins/list(da) :+:
        catalogsProductGroups/create(da) :+:
        catalogsProductGroups/delete(da) :+:
        catalogsProductGroups/get(da) :+:
        catalogsProductGroups/list(da) :+:
        catalogsProductGroups/productCountsGet(da) :+:
        catalogsProductGroups/update(da) :+:
        feedProcessingResults/list(da) :+:
        feeds/create(da) :+:
        feeds/delete(da) :+:
        feeds/get(da) :+:
        feeds/list(da) :+:
        feeds/update(da) :+:
        items/get(da) :+:
        itemsBatch/get(da) :+:
        itemsBatch/post(da) :+:
        itemsIssues/list(da) :+:
        productsByProductGroupFilter/list(da)


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
        * @return An endpoint representing a CatalogsList200Response
        */
        private def catalogs/list(da: DataAccessor): Endpoint[CatalogsList200Response] =
        get("catalogs" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]) =>
          da.Catalogs_catalogs/list(bookmark, pageSize, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroupPinsList200Response
        */
        private def catalogsProductGroupPins/list(da: DataAccessor): Endpoint[CatalogsProductGroupPinsList200Response] =
        get("catalogs" :: "product_groups" :: string :: "products" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (productGroupId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroupPins/list(productGroupId, bookmark, pageSize, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroupsCreate201Response
        */
        private def catalogsProductGroups/create(da: DataAccessor): Endpoint[CatalogsProductGroupsCreate201Response] =
        post("catalogs" :: "product_groups" :: jsonBody[CatalogsProductGroupsCreateRequest] :: paramOption("ad_account_id")) { (catalogsProductGroupsCreateRequest: CatalogsProductGroupsCreateRequest, adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/create(catalogsProductGroupsCreateRequest, adAccountId) match {
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
        delete("catalogs" :: "product_groups" :: string :: paramOption("ad_account_id")) { (productGroupId: String, adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/delete(productGroupId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroupsCreate201Response
        */
        private def catalogsProductGroups/get(da: DataAccessor): Endpoint[CatalogsProductGroupsCreate201Response] =
        get("catalogs" :: "product_groups" :: string :: paramOption("ad_account_id")) { (productGroupId: String, adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/get(productGroupId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroupsList200Response
        */
        private def catalogsProductGroups/list(da: DataAccessor): Endpoint[CatalogsProductGroupsList200Response] =
        get("catalogs" :: "product_groups" :: paramOption("feed_id") :: paramOption("catalog_id") :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (feedId: Option[String], catalogId: Option[String], bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/list(feedId, catalogId, bookmark, pageSize, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroupProductCounts
        */
        private def catalogsProductGroups/productCountsGet(da: DataAccessor): Endpoint[CatalogsProductGroupProductCounts] =
        get("catalogs" :: "product_groups" :: string :: "product_counts" :: paramOption("ad_account_id")) { (productGroupId: String, adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/productCountsGet(productGroupId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroupsCreate201Response
        */
        private def catalogsProductGroups/update(da: DataAccessor): Endpoint[CatalogsProductGroupsCreate201Response] =
        patch("catalogs" :: "product_groups" :: string :: jsonBody[CatalogsProductGroupsUpdateRequest] :: paramOption("ad_account_id")) { (productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/update(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FeedProcessingResultsList200Response
        */
        private def feedProcessingResults/list(da: DataAccessor): Endpoint[FeedProcessingResultsList200Response] =
        get("catalogs" :: "feeds" :: string :: "processing_results" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (feedId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]) =>
          da.Catalogs_feedProcessingResults/list(feedId, bookmark, pageSize, adAccountId) match {
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
          da.Catalogs_feeds/create(feedsCreateRequest, adAccountId) match {
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
          da.Catalogs_feeds/delete(feedId, adAccountId) match {
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
          da.Catalogs_feeds/get(feedId, adAccountId) match {
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
          da.Catalogs_feeds/list(bookmark, pageSize, catalogId, adAccountId) match {
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
          da.Catalogs_feeds/update(feedId, feedsUpdateRequest, adAccountId) match {
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
        get("catalogs" :: "items" :: param("country") :: param("language") :: paramOption("ad_account_id") :: params("item_ids") :: paramOption("filters").map(_.map(_.toCatalogsItemsFilters))) { (country: String, language: String, adAccountId: Option[String], itemIds: Seq[String], filters: Option[CatalogsItemsFilters]) =>
          da.Catalogs_items/get(country, language, adAccountId, itemIds, filters) match {
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
        get("catalogs" :: "items" :: "batch" :: string :: paramOption("ad_account_id")) { (batchId: String, adAccountId: Option[String]) =>
          da.Catalogs_itemsBatch/get(batchId, adAccountId) match {
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
        post("catalogs" :: "items" :: "batch" :: jsonBody[ItemsBatchPostRequest] :: paramOption("ad_account_id")) { (itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId: Option[String]) =>
          da.Catalogs_itemsBatch/post(itemsBatchPostRequest, adAccountId) match {
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
          da.Catalogs_itemsIssues/list(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroupPinsList200Response
        */
        private def productsByProductGroupFilter/list(da: DataAccessor): Endpoint[CatalogsProductGroupPinsList200Response] =
        post("catalogs" :: "products" :: "get_by_product_group_filters" :: jsonBody[CatalogsListProductsByFilterRequest] :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]) =>
          da.Catalogs_productsByProductGroupFilter/list(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId) match {
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
