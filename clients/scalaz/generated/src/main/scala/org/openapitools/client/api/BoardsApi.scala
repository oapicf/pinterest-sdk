package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.Board
import org.openapitools.client.api.BoardSection
import org.openapitools.client.api.BoardUpdate
import org.openapitools.client.api.Error
import org.openapitools.client.api.Paginated

object BoardsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def boardSectionsCreate(host: String, boardId: String, boardSection: BoardSection): Task[BoardSection] = {
    implicit val returnTypeDecoder: EntityDecoder[BoardSection] = jsonOf[BoardSection]

    val path = "/boards/{board_id}/sections".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(boardSection)
      resp          <- client.expect[BoardSection](req)

    } yield resp
  }

  def boardSectionsDelete(host: String, boardId: String, sectionId: String): Task[Unit] = {
    val path = "/boards/{board_id}/sections/{section_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def boardSectionsList(host: String, boardId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/boards/{board_id}/sections".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def boardSectionsListPins(host: String, boardId: String, sectionId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/boards/{board_id}/sections/{section_id}/pins".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def boardSectionsUpdate(host: String, boardId: String, sectionId: String, boardSection: BoardSection): Task[BoardSection] = {
    implicit val returnTypeDecoder: EntityDecoder[BoardSection] = jsonOf[BoardSection]

    val path = "/boards/{board_id}/sections/{section_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(boardSection)
      resp          <- client.expect[BoardSection](req)

    } yield resp
  }

  def boardsCreate(host: String, board: Board): Task[Board] = {
    implicit val returnTypeDecoder: EntityDecoder[Board] = jsonOf[Board]

    val path = "/boards"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(board)
      resp          <- client.expect[Board](req)

    } yield resp
  }

  def boardsDelete(host: String, boardId: String): Task[Unit] = {
    val path = "/boards/{board_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def boardsGet(host: String, boardId: String): Task[Board] = {
    implicit val returnTypeDecoder: EntityDecoder[Board] = jsonOf[Board]

    val path = "/boards/{board_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Board](req)

    } yield resp
  }

  def boardsList(host: String, bookmark: String, pageSize: Integer = 25, privacy: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], privacyQuery: QueryParam[String]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/boards"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("privacy", Some(privacyQuery.toParamString(privacy))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def boardsListPins(host: String, boardId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/boards/{board_id}/pins".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def boardsUpdate(host: String, boardId: String, boardUpdate: BoardUpdate): Task[Board] = {
    implicit val returnTypeDecoder: EntityDecoder[Board] = jsonOf[Board]

    val path = "/boards/{board_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(boardUpdate)
      resp          <- client.expect[Board](req)

    } yield resp
  }

}

class HttpServiceBoardsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def boardSectionsCreate(boardId: String, boardSection: BoardSection): Task[BoardSection] = {
    implicit val returnTypeDecoder: EntityDecoder[BoardSection] = jsonOf[BoardSection]

    val path = "/boards/{board_id}/sections".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(boardSection)
      resp          <- client.expect[BoardSection](req)

    } yield resp
  }

  def boardSectionsDelete(boardId: String, sectionId: String): Task[Unit] = {
    val path = "/boards/{board_id}/sections/{section_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def boardSectionsList(boardId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/boards/{board_id}/sections".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def boardSectionsListPins(boardId: String, sectionId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/boards/{board_id}/sections/{section_id}/pins".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def boardSectionsUpdate(boardId: String, sectionId: String, boardSection: BoardSection): Task[BoardSection] = {
    implicit val returnTypeDecoder: EntityDecoder[BoardSection] = jsonOf[BoardSection]

    val path = "/boards/{board_id}/sections/{section_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(boardSection)
      resp          <- client.expect[BoardSection](req)

    } yield resp
  }

  def boardsCreate(board: Board): Task[Board] = {
    implicit val returnTypeDecoder: EntityDecoder[Board] = jsonOf[Board]

    val path = "/boards"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(board)
      resp          <- client.expect[Board](req)

    } yield resp
  }

  def boardsDelete(boardId: String): Task[Unit] = {
    val path = "/boards/{board_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def boardsGet(boardId: String): Task[Board] = {
    implicit val returnTypeDecoder: EntityDecoder[Board] = jsonOf[Board]

    val path = "/boards/{board_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Board](req)

    } yield resp
  }

  def boardsList(bookmark: String, pageSize: Integer = 25, privacy: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], privacyQuery: QueryParam[String]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/boards"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("privacy", Some(privacyQuery.toParamString(privacy))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def boardsListPins(boardId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/boards/{board_id}/pins".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def boardsUpdate(boardId: String, boardUpdate: BoardUpdate): Task[Board] = {
    implicit val returnTypeDecoder: EntityDecoder[Board] = jsonOf[Board]

    val path = "/boards/{board_id}".replaceAll("\\{" + "board_id" + "\\}",escape(boardId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(boardUpdate)
      resp          <- client.expect[Board](req)

    } yield resp
  }

}
