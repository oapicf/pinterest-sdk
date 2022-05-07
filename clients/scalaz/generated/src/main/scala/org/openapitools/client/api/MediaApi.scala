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

import org.openapitools.client.api.Error
import org.openapitools.client.api.MediaUpload
import org.openapitools.client.api.MediaUploadDetails
import org.openapitools.client.api.MediaUploadRequest
import org.openapitools.client.api.Paginated

object MediaApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def mediaCreate(host: String, mediaUploadRequest: MediaUploadRequest): Task[MediaUpload] = {
    implicit val returnTypeDecoder: EntityDecoder[MediaUpload] = jsonOf[MediaUpload]

    val path = "/media"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(mediaUploadRequest)
      resp          <- client.expect[MediaUpload](req)

    } yield resp
  }

  def mediaGet(host: String, mediaId: String): Task[MediaUploadDetails] = {
    implicit val returnTypeDecoder: EntityDecoder[MediaUploadDetails] = jsonOf[MediaUploadDetails]

    val path = "/media/{media_id}".replaceAll("\\{" + "media_id" + "\\}",escape(mediaId.toString))

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
      resp          <- client.expect[MediaUploadDetails](req)

    } yield resp
  }

  def mediaList(host: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/media"

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

}

class HttpServiceMediaApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def mediaCreate(mediaUploadRequest: MediaUploadRequest): Task[MediaUpload] = {
    implicit val returnTypeDecoder: EntityDecoder[MediaUpload] = jsonOf[MediaUpload]

    val path = "/media"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(mediaUploadRequest)
      resp          <- client.expect[MediaUpload](req)

    } yield resp
  }

  def mediaGet(mediaId: String): Task[MediaUploadDetails] = {
    implicit val returnTypeDecoder: EntityDecoder[MediaUploadDetails] = jsonOf[MediaUploadDetails]

    val path = "/media/{media_id}".replaceAll("\\{" + "media_id" + "\\}",escape(mediaId.toString))

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
      resp          <- client.expect[MediaUploadDetails](req)

    } yield resp
  }

  def mediaList(bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/media"

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

}
