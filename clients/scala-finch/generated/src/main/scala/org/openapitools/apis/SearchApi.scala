package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Error
import org.openapitools.models.PinsList200Response
import org.openapitools.models.SearchPartnerPins200Response
import org.openapitools.models.SearchUserBoardsGet200Response
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

object SearchApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        searchPartnerPins(da) :+:
        searchUserBoards/get(da) :+:
        searchUserPins/list(da)


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
        * @return An endpoint representing a SearchPartnerPins200Response
        */
        private def searchPartnerPins(da: DataAccessor): Endpoint[SearchPartnerPins200Response] =
        get("search" :: "partner" :: "pins" :: param("term") :: param("country_code") :: paramOption("bookmark") :: paramOption("locale") :: paramOption("limit").map(_.map(_.toInt))) { (term: String, countryCode: String, bookmark: Option[String], locale: Option[String], limit: Option[Int]) =>
          da.Search_searchPartnerPins(term, countryCode, bookmark, locale, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SearchUserBoardsGet200Response
        */
        private def searchUserBoards/get(da: DataAccessor): Endpoint[SearchUserBoardsGet200Response] =
        get("search" :: "boards" :: paramOption("ad_account_id") :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("query")) { (adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], query: Option[String]) =>
          da.Search_searchUserBoards/get(adAccountId, bookmark, pageSize, query) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PinsList200Response
        */
        private def searchUserPins/list(da: DataAccessor): Endpoint[PinsList200Response] =
        get("search" :: "pins" :: param("query") :: paramOption("ad_account_id") :: paramOption("bookmark")) { (query: String, adAccountId: Option[String], bookmark: Option[String]) =>
          da.Search_searchUserPins/list(query, adAccountId, bookmark) match {
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
      val file = Files.createTempFile("tmpSearchApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
