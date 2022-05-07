package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Board
import org.openapitools.models.BoardSection
import org.openapitools.models.BoardUpdate
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
        post("boards" :: string :: "sections" :: jsonBody[BoardSection]) { (boardId: String, boardSection: BoardSection) =>
          da.Boards_boardSections/create(boardId, boardSection) match {
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
        delete("boards" :: string :: "sections" :: string) { (boardId: String, sectionId: String) =>
          da.Boards_boardSections/delete(boardId, sectionId) match {
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
        private def boardSections/list(da: DataAccessor): Endpoint[Paginated] =
        get("boards" :: string :: "sections" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (boardId: String, bookmark: Option[String], pageSize: Option[Int]) =>
          da.Boards_boardSections/list(boardId, bookmark, pageSize) match {
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
        private def boardSections/listPins(da: DataAccessor): Endpoint[Paginated] =
        get("boards" :: string :: "sections" :: string :: "pins" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (boardId: String, sectionId: String, bookmark: Option[String], pageSize: Option[Int]) =>
          da.Boards_boardSections/listPins(boardId, sectionId, bookmark, pageSize) match {
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
        patch("boards" :: string :: "sections" :: string :: jsonBody[BoardSection]) { (boardId: String, sectionId: String, boardSection: BoardSection) =>
          da.Boards_boardSections/update(boardId, sectionId, boardSection) match {
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
        post("boards" :: jsonBody[Board]) { (board: Board) =>
          da.Boards_boards/create(board) match {
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
        delete("boards" :: string) { (boardId: String) =>
          da.Boards_boards/delete(boardId) match {
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
        get("boards" :: string) { (boardId: String) =>
          da.Boards_boards/get(boardId) match {
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
        private def boards/list(da: DataAccessor): Endpoint[Paginated] =
        get("boards" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt)) :: paramOption("privacy")) { (bookmark: Option[String], pageSize: Option[Int], privacy: Option[String]) =>
          da.Boards_boards/list(bookmark, pageSize, privacy) match {
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
        private def boards/listPins(da: DataAccessor): Endpoint[Paginated] =
        get("boards" :: string :: "pins" :: paramOption("bookmark") :: paramOption("page_size").map(_.map(_.toInt))) { (boardId: String, bookmark: Option[String], pageSize: Option[Int]) =>
          da.Boards_boards/listPins(boardId, bookmark, pageSize) match {
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
        patch("boards" :: string :: jsonBody[BoardUpdate]) { (boardId: String, boardUpdate: BoardUpdate) =>
          da.Boards_boards/update(boardId, boardUpdate) match {
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
