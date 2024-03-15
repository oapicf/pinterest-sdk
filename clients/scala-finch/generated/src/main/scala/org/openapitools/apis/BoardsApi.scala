package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Board
import org.openapitools.models.BoardSection
import org.openapitools.models.BoardSectionsList200Response
import org.openapitools.models.BoardUpdate
import org.openapitools.models.BoardsList200Response
import org.openapitools.models.BoardsListPins200Response
import org.openapitools.models.Error
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

object BoardsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        boardSections/create(da) :+:
        boardSections/delete(da) :+:
        boardSections/list(da) :+:
        boardSections/listPins(da) :+:
        boardSections/update(da) :+:
        boards/create(da) :+:
        boards/delete(da) :+:
        boards/get(da) :+:
        boards/list(da) :+:
        boards/listPins(da) :+:
        boards/update(da)


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
        * @return An endpoint representing a BoardSection
        */
        private def boardSections/create(da: DataAccessor): Endpoint[BoardSection] =
        post("boards" :: string :: "sections" :: jsonBody[BoardSection] :: paramOption("ad_account_id")) { (boardId: String, boardSection: BoardSection, adAccountId: Option[String]) =>
          da.Boards_boardSections/create(boardId, boardSection, adAccountId) match {
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
        private def boardSections/delete(da: DataAccessor): Endpoint[Unit] =
        delete("boards" :: string :: "sections" :: string :: paramOption("ad_account_id")) { (boardId: String, sectionId: String, adAccountId: Option[String]) =>
          da.Boards_boardSections/delete(boardId, sectionId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BoardSectionsList200Response
        */
        private def boardSections/list(da: DataAccessor): Endpoint[BoardSectionsList200Response] =
        get("boards" :: string :: "sections" :: paramOption("ad_account_id") :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (boardId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]) =>
          da.Boards_boardSections/list(boardId, adAccountId, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BoardsListPins200Response
        */
        private def boardSections/listPins(da: DataAccessor): Endpoint[BoardsListPins200Response] =
        get("boards" :: string :: "sections" :: string :: "pins" :: paramOption("ad_account_id") :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (boardId: String, sectionId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]) =>
          da.Boards_boardSections/listPins(boardId, sectionId, adAccountId, bookmark, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BoardSection
        */
        private def boardSections/update(da: DataAccessor): Endpoint[BoardSection] =
        patch("boards" :: string :: "sections" :: string :: jsonBody[BoardSection] :: paramOption("ad_account_id")) { (boardId: String, sectionId: String, boardSection: BoardSection, adAccountId: Option[String]) =>
          da.Boards_boardSections/update(boardId, sectionId, boardSection, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Board
        */
        private def boards/create(da: DataAccessor): Endpoint[Board] =
        post("boards" :: jsonBody[Board] :: paramOption("ad_account_id")) { (board: Board, adAccountId: Option[String]) =>
          da.Boards_boards/create(board, adAccountId) match {
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
        private def boards/delete(da: DataAccessor): Endpoint[Unit] =
        delete("boards" :: string :: paramOption("ad_account_id")) { (boardId: String, adAccountId: Option[String]) =>
          da.Boards_boards/delete(boardId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Board
        */
        private def boards/get(da: DataAccessor): Endpoint[Board] =
        get("boards" :: string :: paramOption("ad_account_id")) { (boardId: String, adAccountId: Option[String]) =>
          da.Boards_boards/get(boardId, adAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BoardsList200Response
        */
        private def boards/list(da: DataAccessor): Endpoint[BoardsList200Response] =
        get("boards" :: paramOption("ad_account_id") :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("privacy")) { (adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], privacy: Option[String]) =>
          da.Boards_boards/list(adAccountId, bookmark, pageSize, privacy) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BoardsListPins200Response
        */
        private def boards/listPins(da: DataAccessor): Endpoint[BoardsListPins200Response] =
        get("boards" :: string :: "pins" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: params("creative_types") :: paramOption("ad_account_id") :: paramOption("pin_metrics").map(_.map(_.toBoolean))) { (boardId: String, bookmark: Option[String], pageSize: Option[Int], creativeTypes: Seq[String], adAccountId: Option[String], pinMetrics: Option[Boolean]) =>
          da.Boards_boards/listPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Board
        */
        private def boards/update(da: DataAccessor): Endpoint[Board] =
        patch("boards" :: string :: jsonBody[BoardUpdate] :: paramOption("ad_account_id")) { (boardId: String, boardUpdate: BoardUpdate, adAccountId: Option[String]) =>
          da.Boards_boards/update(boardId, boardUpdate, adAccountId) match {
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
      val file = Files.createTempFile("tmpBoardsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
