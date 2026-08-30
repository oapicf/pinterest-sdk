package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.ConversionEvents
import org.openapitools.models.ConversionEventsCreate
import org.openapitools.models.DetailedError
import org.openapitools.models.PinterestLibError

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.string.MatchesRegex

import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ConversionEventsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, conversion_token
](delegate: ConversionEventsApiDelegate[F, pinterest_oauth2, conversion_token]) extends Http4sDsl[F] {
  object events/create {
    import ConversionEventsApiDelegate.events/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object testQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("test")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "events" :? testQueryParam(test)) as auth =>
          delegate.events/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[ConversionEventsCreate] , ad_account_id, test, responses)

    }
    val routeconversion_token = AuthedRoutes.of[conversion_token, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "events" :? testQueryParam(test)) as auth =>
          delegate.events/create.handle_conversion_token(auth, req, req.asJsonDecode[ConversionEventsCreate] , ad_account_id, test, responses)

    }

    val responses: events/createResponses[F] = new events/createResponses[F] {
      def resp200(value: ConversionEvents): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp422(value: DetailedError): F[Response[F]] = UnprocessableEntity(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp503(value: PinterestLibError): F[Response[F]] = ServiceUnavailable(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    events/create.routepinterest_oauth2
  val routesconversion_token =
    events/create.routeconversion_token
}

object ConversionEventsApiDelegate {
  trait events/createResponses[F[_]] {
    def resp200(value: ConversionEvents): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp422(value: DetailedError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp503(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait ConversionEventsApiDelegate[F[_], pinterest_oauth2, conversion_token] {

  trait events/create {
    import ConversionEventsApiDelegate.events/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      events/create: F[ConversionEventsCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      test: Option[Boolean],
      responses: events/createResponses[F]
    ): F[Response[F]]

    def handle_conversion_token(
      auth: conversion_token,
      req: Request[F],
      events/create: F[ConversionEventsCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      test: Option[Boolean],
      responses: events/createResponses[F]
    ): F[Response[F]]


  }
  def events/create: events/create

}