package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Catalog
import org.openapitools.models.CatalogsAvailableFilterValues
import org.openapitools.models.CatalogsCreateRequest
import org.openapitools.models.CatalogsList200Response
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.Country
import org.openapitools.models.Error
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
        catalogs/availableFilterValues(da) :+:
        catalogs/create(da) :+:
        catalogs/list(da)


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
        * @return An endpoint representing a CatalogsAvailableFilterValues
        */
        private def catalogs/availableFilterValues(da: DataAccessor): Endpoint[CatalogsAvailableFilterValues] =
        get("catalogs" :: "available_filter_values" :: param("catalog_id") :: paramOption("feed_id") :: paramOption("country").map(_.map(_.toCountry)) :: paramOption("language").map(_.map(_.toCatalogsLocale)) :: paramOption("ad_account_id")) { (catalogId: String, feedId: Option[String], country: Option[Country], language: Option[CatalogsLocale], adAccountId: Option[String]) =>
          da.Catalogs_catalogs/availableFilterValues(catalogId, feedId, country, language, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
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
