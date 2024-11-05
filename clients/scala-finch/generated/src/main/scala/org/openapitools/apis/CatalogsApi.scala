package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Catalog
import org.openapitools.models.CatalogsCreateReportResponse
import org.openapitools.models.CatalogsCreateRequest
import org.openapitools.models.CatalogsFeed
import org.openapitools.models.CatalogsFeedIngestion
import org.openapitools.models.CatalogsItemValidationIssue
import org.openapitools.models.CatalogsItems
import org.openapitools.models.CatalogsItemsBatch
import org.openapitools.models.CatalogsItemsFilters
import org.openapitools.models.CatalogsItemsRequest
import org.openapitools.models.CatalogsList200Response
import org.openapitools.models.CatalogsListProductsByFilterRequest
import org.openapitools.models.CatalogsProductGroupPinsList200Response
import org.openapitools.models.CatalogsProductGroupProductCountsVertical
import org.openapitools.models.CatalogsProductGroupsList200Response
import org.openapitools.models.CatalogsProductGroupsUpdateRequest
import org.openapitools.models.CatalogsReport
import org.openapitools.models.CatalogsReportParameters
import org.openapitools.models.CatalogsVerticalProductGroup
import org.openapitools.models.Error
import org.openapitools.models.FeedProcessingResultsList200Response
import org.openapitools.models.FeedsCreateRequest
import org.openapitools.models.FeedsList200Response
import org.openapitools.models.FeedsUpdateRequest
import org.openapitools.models.ItemsBatchPostRequest
import org.openapitools.models.ItemsIssuesList200Response
import org.openapitools.models.MultipleProductGroupsInner
import org.openapitools.models.ReportsStats200Response
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
        catalogs/create(da) :+:
        catalogs/list(da) :+:
        catalogsProductGroupPins/list(da) :+:
        catalogsProductGroups/create(da) :+:
        catalogsProductGroups/createMany(da) :+:
        catalogsProductGroups/delete(da) :+:
        catalogsProductGroups/deleteMany(da) :+:
        catalogsProductGroups/get(da) :+:
        catalogsProductGroups/list(da) :+:
        catalogsProductGroups/productCountsGet(da) :+:
        catalogsProductGroups/update(da) :+:
        feedProcessingResults/list(da) :+:
        feeds/create(da) :+:
        feeds/delete(da) :+:
        feeds/get(da) :+:
        feeds/ingest(da) :+:
        feeds/list(da) :+:
        feeds/update(da) :+:
        items/get(da) :+:
        items/post(da) :+:
        itemsBatch/get(da) :+:
        itemsBatch/post(da) :+:
        itemsIssues/list(da) :+:
        productsByProductGroupFilter/list(da) :+:
        reports/create(da) :+:
        reports/get(da) :+:
        reports/stats(da)


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
        * @return An endpoint representing a Catalog
        */
        private def catalogs/create(da: DataAccessor): Endpoint[Catalog] =
        post("catalogs" :: jsonBody[CatalogsCreateRequest] :: paramOption("ad_account_id")) { (catalogsCreateRequest: CatalogsCreateRequest, adAccountId: Option[String]) =>
          da.Catalogs_catalogs/create(catalogsCreateRequest, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
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
        get("catalogs" :: "product_groups" :: string :: "products" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id") :: paramOption("pin_metrics").map(_.map(_.toBoolean))) { (productGroupId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]) =>
          da.Catalogs_catalogsProductGroupPins/list(productGroupId, bookmark, pageSize, adAccountId, pinMetrics) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsVerticalProductGroup
        */
        private def catalogsProductGroups/create(da: DataAccessor): Endpoint[CatalogsVerticalProductGroup] =
        post("catalogs" :: "product_groups" :: jsonBody[MultipleProductGroupsInner] :: paramOption("ad_account_id")) { (multipleProductGroupsInner: MultipleProductGroupsInner, adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/create(multipleProductGroupsInner, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[String]
        */
        private def catalogsProductGroups/createMany(da: DataAccessor): Endpoint[Seq[String]] =
        post("catalogs" :: "product_groups" :: "multiple" :: jsonBody[Seq[MultipleProductGroupsInner]] :: paramOption("ad_account_id")) { (multipleProductGroupsInner: Seq[MultipleProductGroupsInner], adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/createMany(multipleProductGroupsInner, adAccountId) match {
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
        * @return An endpoint representing a Unit
        */
        private def catalogsProductGroups/deleteMany(da: DataAccessor): Endpoint[Unit] =
        delete("catalogs" :: "product_groups" :: "multiple" :: params("id") :: paramOption("ad_account_id")) { (id: Seq[Int], adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/deleteMany(id, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsVerticalProductGroup
        */
        private def catalogsProductGroups/get(da: DataAccessor): Endpoint[CatalogsVerticalProductGroup] =
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
        get("catalogs" :: "product_groups" :: params("id") :: paramOption("feed_id") :: paramOption("catalog_id") :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id")) { (id: Seq[Int], feedId: Option[String], catalogId: Option[String], bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]) =>
          da.Catalogs_catalogsProductGroups/list(id, feedId, catalogId, bookmark, pageSize, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsProductGroupProductCountsVertical
        */
        private def catalogsProductGroups/productCountsGet(da: DataAccessor): Endpoint[CatalogsProductGroupProductCountsVertical] =
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
        * @return An endpoint representing a CatalogsVerticalProductGroup
        */
        private def catalogsProductGroups/update(da: DataAccessor): Endpoint[CatalogsVerticalProductGroup] =
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
        * @return An endpoint representing a CatalogsFeedIngestion
        */
        private def feeds/ingest(da: DataAccessor): Endpoint[CatalogsFeedIngestion] =
        post("catalogs" :: "feeds" :: string :: "ingest" :: paramOption("ad_account_id")) { (feedId: String, adAccountId: Option[String]) =>
          da.Catalogs_feeds/ingest(feedId, adAccountId) match {
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
        * @return An endpoint representing a CatalogsItems
        */
        private def items/post(da: DataAccessor): Endpoint[CatalogsItems] =
        post("catalogs" :: "items" :: jsonBody[CatalogsItemsRequest] :: paramOption("ad_account_id")) { (catalogsItemsRequest: CatalogsItemsRequest, adAccountId: Option[String]) =>
          da.Catalogs_items/post(catalogsItemsRequest, adAccountId) match {
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
        post("catalogs" :: "products" :: "get_by_product_group_filters" :: jsonBody[CatalogsListProductsByFilterRequest] :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id") :: paramOption("pin_metrics").map(_.map(_.toBoolean))) { (catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]) =>
          da.Catalogs_productsByProductGroupFilter/list(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsCreateReportResponse
        */
        private def reports/create(da: DataAccessor): Endpoint[CatalogsCreateReportResponse] =
        post("catalogs" :: "reports" :: jsonBody[CatalogsReportParameters] :: paramOption("ad_account_id")) { (catalogsReportParameters: CatalogsReportParameters, adAccountId: Option[String]) =>
          da.Catalogs_reports/create(catalogsReportParameters, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CatalogsReport
        */
        private def reports/get(da: DataAccessor): Endpoint[CatalogsReport] =
        get("catalogs" :: "reports" :: param("token") :: paramOption("ad_account_id")) { (token: String, adAccountId: Option[String]) =>
          da.Catalogs_reports/get(token, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ReportsStats200Response
        */
        private def reports/stats(da: DataAccessor): Endpoint[ReportsStats200Response] =
        get("catalogs" :: "reports" :: "stats" :: param("parameters").map(_.toCatalogsReportParameters) :: paramOption("ad_account_id") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (parameters: CatalogsReportParameters, adAccountId: Option[String], pageSize: Option[Int], bookmark: Option[String]) =>
          da.Catalogs_reports/stats(parameters, adAccountId, pageSize, bookmark) match {
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
