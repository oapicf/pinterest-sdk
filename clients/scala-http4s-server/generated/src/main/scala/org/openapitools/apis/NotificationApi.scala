package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.NotificationPostRequest
import org.openapitools.models.NotificationResponse
import org.openapitools.models.PinterestLibError


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class NotificationApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: NotificationApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object notification/post {
    import NotificationApiDelegate.notification/postResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "notifications") as auth =>
          delegate.notification/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[NotificationPostRequest] , responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "notifications") as auth =>
          delegate.notification/post.handle_client_credentials(auth, req, req.asJsonDecode[NotificationPostRequest] , responses)

    }

    val responses: notification/postResponses[F] = new notification/postResponses[F] {
      def resp200(value: NotificationResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    notification/post.routepinterest_oauth2
  val routesclient_credentials =
    notification/post.routeclient_credentials
}

object NotificationApiDelegate {
  trait notification/postResponses[F[_]] {
    def resp200(value: NotificationResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait NotificationApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait notification/post {
    import NotificationApiDelegate.notification/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      notification/post: F[NotificationPostRequest],
      responses: notification/postResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      notification/post: F[NotificationPostRequest],
      responses: notification/postResponses[F]
    ): F[Response[F]]


  }
  def notification/post: notification/post

}