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

import org.openapitools.client.api.ConversionAccessToken
import org.openapitools.client.api.Error
import org.openapitools.client.api.OauthAccessToken
import org.openapitools.client.api.TokenGrantType
import org.openapitools.client.api.TokenTypeHint

object OauthApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def oauthConversionToken(host: String): Task[ConversionAccessToken] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionAccessToken] = jsonOf[ConversionAccessToken]

    val path = "/oauth/conversion_token"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ConversionAccessToken](req)

    } yield resp
  }

  def oauthToken(host: String, grantType: TokenGrantType, code: String, continuousRefresh: String, redirectUri: String, refreshToken: String, scope: String): Task[OauthAccessToken] = {
    implicit val returnTypeDecoder: EntityDecoder[OauthAccessToken] = jsonOf[OauthAccessToken]

    val path = "/oauth/token"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[OauthAccessToken](req)

    } yield resp
  }

  def tokenRevoke(host: String, token: String, tokenTypeHint: TokenTypeHint): Task[Unit] = {
    val path = "/oauth/token/revoke"

    val httpMethod = Method.POST
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

}

class HttpServiceOauthApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def oauthConversionToken(): Task[ConversionAccessToken] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionAccessToken] = jsonOf[ConversionAccessToken]

    val path = "/oauth/conversion_token"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ConversionAccessToken](req)

    } yield resp
  }

  def oauthToken(grantType: TokenGrantType, code: String, continuousRefresh: String, redirectUri: String, refreshToken: String, scope: String): Task[OauthAccessToken] = {
    implicit val returnTypeDecoder: EntityDecoder[OauthAccessToken] = jsonOf[OauthAccessToken]

    val path = "/oauth/token"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[OauthAccessToken](req)

    } yield resp
  }

  def tokenRevoke(token: String, tokenTypeHint: TokenTypeHint): Task[Unit] = {
    val path = "/oauth/token/revoke"

    val httpMethod = Method.POST
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

}
