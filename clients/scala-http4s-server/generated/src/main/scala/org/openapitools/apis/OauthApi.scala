package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.ConversionAccessToken
import org.openapitools.models.OauthAccessToken
import org.openapitools.models.PinterestLibError
import org.openapitools.models.TokenGrantType
import org.openapitools.models.TokenTypeHint


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class OauthApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, basic
](delegate: OauthApiDelegate[F, pinterest_oauth2, basic]) extends Http4sDsl[F] {
  object oauth/conversionToken {
    import OauthApiDelegate.oauth/conversionTokenResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "oauth" / "conversion_token") as auth =>
        delegate.oauth/conversionToken.handle_pinterest_oauth2(auth, req, responses)

    }

    val responses: oauth/conversionTokenResponses[F] = new oauth/conversionTokenResponses[F] {
      def resp200(value: ConversionAccessToken): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object oauth/token {
    import OauthApiDelegate.oauth/tokenResponses


    val routebasic = AuthedRoutes.of[basic, F] {
      case (req @ POST -> Root / "oauth" / "token") as auth =>
        delegate.oauth/token.handle_basic(auth, req, responses)

    }

    val responses: oauth/tokenResponses[F] = new oauth/tokenResponses[F] {
      def resp200(value: OauthAccessToken): F[Response[F]] = Ok(value)
      def resp201(value: OauthAccessToken): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object token/revoke {
    import OauthApiDelegate.token/revokeResponses


    val routebasic = AuthedRoutes.of[basic, F] {
      case (req @ POST -> Root / "oauth" / "token" / "revoke") as auth =>
        delegate.token/revoke.handle_basic(auth, req, responses)

    }

    val responses: token/revokeResponses[F] = new token/revokeResponses[F] {
      def resp200(): F[Response[F]] = Ok()
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    oauth/conversionToken.routepinterest_oauth2
  val routesbasic =
    oauth/token.routebasic <+>
    token/revoke.routebasic
}

object OauthApiDelegate {
  trait oauth/conversionTokenResponses[F[_]] {
    def resp200(value: ConversionAccessToken): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait oauth/tokenResponses[F[_]] {
    def resp200(value: OauthAccessToken): F[Response[F]]
    def resp201(value: OauthAccessToken): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait token/revokeResponses[F[_]] {
    def resp200(): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait OauthApiDelegate[F[_], pinterest_oauth2, basic] {

  trait oauth/conversionToken {
    import OauthApiDelegate.oauth/conversionTokenResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      responses: oauth/conversionTokenResponses[F]
    ): F[Response[F]]

  }
  def oauth/conversionToken: oauth/conversionToken


  trait oauth/token {
    import OauthApiDelegate.oauth/tokenResponses


    def handle_basic(
      auth: basic,
      req: Request[F],
      responses: oauth/tokenResponses[F]
    ): F[Response[F]]

  }
  def oauth/token: oauth/token


  trait token/revoke {
    import OauthApiDelegate.token/revokeResponses


    def handle_basic(
      auth: basic,
      req: Request[F],
      responses: token/revokeResponses[F]
    ): F[Response[F]]

  }
  def token/revoke: token/revoke

}