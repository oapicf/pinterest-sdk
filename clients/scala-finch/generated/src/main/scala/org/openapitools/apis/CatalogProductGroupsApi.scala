package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CatalogsListProductsByFilterRequest
import org.openapitools.models.CatalogsProductGroupPinsList200Response
import org.openapitools.models.CatalogsProductGroupProductCountsVertical
import org.openapitools.models.CatalogsProductGroupsList200Response
import org.openapitools.models.CatalogsProductGroupsUpdateRequest
import org.openapitools.models.CatalogsVerticalProductGroup
import org.openapitools.models.Error
import org.openapitools.models.MultipleProductGroupsInner
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

object CatalogProductGroupsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        catalogsProductGroupPins/list(da) :+:
        catalogsProductGroups/create(da) :+:
        catalogsProductGroups/createMany(da) :+:
        catalogsProductGroups/delete(da) :+:
        catalogsProductGroups/deleteMany(da) :+:
        catalogsProductGroups/get(da) :+:
        catalogsProductGroups/list(da) :+:
        catalogsProductGroups/productCountsGet(da) :+:
        catalogsProductGroups/update(da) :+:
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
        * @return An endpoint representing a CatalogsProductGroupPinsList200Response
        */
        private def catalogsProductGroupPins/list(da: DataAccessor): Endpoint[CatalogsProductGroupPinsList200Response] =
        get("catalogs" :: "product_groups" :: string :: "products" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("ad_account_id") :: paramOption("pin_metrics").map(_.map(_.toBoolean))) { (productGroupId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]) =>
          da.CatalogProductGroups_catalogsProductGroupPins/list(productGroupId, bookmark, pageSize, adAccountId, pinMetrics) match {
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
          da.CatalogProductGroups_catalogsProductGroups/create(multipleProductGroupsInner, adAccountId) match {
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
          da.CatalogProductGroups_catalogsProductGroups/createMany(multipleProductGroupsInner, adAccountId) match {
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
          da.CatalogProductGroups_catalogsProductGroups/delete(productGroupId, adAccountId) match {
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
          da.CatalogProductGroups_catalogsProductGroups/deleteMany(id, adAccountId) match {
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
          da.CatalogProductGroups_catalogsProductGroups/get(productGroupId, adAccountId) match {
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
          da.CatalogProductGroups_catalogsProductGroups/list(id, feedId, catalogId, bookmark, pageSize, adAccountId) match {
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
          da.CatalogProductGroups_catalogsProductGroups/productCountsGet(productGroupId, adAccountId) match {
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
          da.CatalogProductGroups_catalogsProductGroups/update(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId) match {
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
          da.CatalogProductGroups_productsByProductGroupFilter/list(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics) match {
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
      val file = Files.createTempFile("tmpCatalogProductGroupsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
