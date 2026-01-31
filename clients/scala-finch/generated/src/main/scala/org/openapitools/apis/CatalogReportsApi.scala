package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CatalogsCreateReportResponse
import org.openapitools.models.CatalogsReport
import org.openapitools.models.CatalogsReportParameters
import org.openapitools.models.Error
import org.openapitools.models.ReportsStats200Response
import org.openapitools.models.ReportsStatsParametersParameter
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

object CatalogReportsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
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
        * @return An endpoint representing a CatalogsCreateReportResponse
        */
        private def reports/create(da: DataAccessor): Endpoint[CatalogsCreateReportResponse] =
        post("catalogs" :: "reports" :: jsonBody[CatalogsReportParameters] :: paramOption("ad_account_id")) { (catalogsReportParameters: CatalogsReportParameters, adAccountId: Option[String]) =>
          da.CatalogReports_reports/create(catalogsReportParameters, adAccountId) match {
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
          da.CatalogReports_reports/get(token, adAccountId) match {
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
        get("catalogs" :: "reports" :: "stats" :: param("parameters").map(_.toReportsStatsParametersParameter) :: paramOption("ad_account_id") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("bookmark")) { (parameters: ReportsStatsParametersParameter, adAccountId: Option[String], pageSize: Option[Int], bookmark: Option[String]) =>
          da.CatalogReports_reports/stats(parameters, adAccountId, pageSize, bookmark) match {
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
      val file = Files.createTempFile("tmpCatalogReportsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
