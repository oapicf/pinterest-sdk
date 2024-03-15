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
import org.openapitools.client.api.RelatedTerms

object TermsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def termsRelatedList(host: String, terms: List[String] = List.empty[String] )(implicit termsQuery: QueryParam[List[String]]): Task[RelatedTerms] = {
    implicit val returnTypeDecoder: EntityDecoder[RelatedTerms] = jsonOf[RelatedTerms]

    val path = "/terms/related"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("terms", Some(termsQuery.toParamString(terms))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[RelatedTerms](req)

    } yield resp
  }

  def termsSuggestedList(host: String, term: String, limit: Integer = 4)(implicit termQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[List[String]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[String]] = jsonOf[List[String]]

    val path = "/terms/suggested"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("term", Some(termQuery.toParamString(term))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[String]](req)

    } yield resp
  }

}

class HttpServiceTermsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def termsRelatedList(terms: List[String] = List.empty[String] )(implicit termsQuery: QueryParam[List[String]]): Task[RelatedTerms] = {
    implicit val returnTypeDecoder: EntityDecoder[RelatedTerms] = jsonOf[RelatedTerms]

    val path = "/terms/related"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("terms", Some(termsQuery.toParamString(terms))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[RelatedTerms](req)

    } yield resp
  }

  def termsSuggestedList(term: String, limit: Integer = 4)(implicit termQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[List[String]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[String]] = jsonOf[List[String]]

    val path = "/terms/suggested"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("term", Some(termQuery.toParamString(term))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[String]](req)

    } yield resp
  }

}
