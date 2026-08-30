package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Media
import org.openapitools.models.MediaList200Response
import org.openapitools.models.MediaUpload
import org.openapitools.models.MediaUploadCreate
import org.openapitools.models.PinterestLibError

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.numeric.GreaterEqual
import eu.timepit.refined.numeric.LessEqual
import eu.timepit.refined.string.MatchesRegex

import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class MediaApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: MediaApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object media/create {
    import MediaApiDelegate.media/createResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "media") as auth =>
          delegate.media/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[MediaUploadCreate] , responses)

    }

    val responses: media/createResponses[F] = new media/createResponses[F] {
      def resp200(value: MediaUpload): F[Response[F]] = Ok(value)
      def resp201(value: MediaUpload): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object media/get {
    import MediaApiDelegate.media/getResponses

    object media_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "media" / media_idVarr(media_id)) as auth =>
        delegate.media/get.handle_pinterest_oauth2(auth, req, media_id, responses)

    }

    val responses: media/getResponses[F] = new media/getResponses[F] {
      def resp200(value: Media): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object media/list {
    import MediaApiDelegate.media/listResponses

    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "media" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.media/list.handle_pinterest_oauth2(auth, req, bookmark, page_size, responses)

    }

    val responses: media/listResponses[F] = new media/listResponses[F] {
      def resp200(value: MediaList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    media/create.routepinterest_oauth2 <+>
    media/get.routepinterest_oauth2 <+>
    media/list.routepinterest_oauth2
}

object MediaApiDelegate {
  trait media/createResponses[F[_]] {
    def resp200(value: MediaUpload): F[Response[F]]
    def resp201(value: MediaUpload): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait media/getResponses[F[_]] {
    def resp200(value: Media): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait media/listResponses[F[_]] {
    def resp200(value: MediaList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait MediaApiDelegate[F[_], pinterest_oauth2] {

  trait media/create {
    import MediaApiDelegate.media/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      media/create: F[MediaUploadCreate],
      responses: media/createResponses[F]
    ): F[Response[F]]


  }
  def media/create: media/create


  trait media/get {
    import MediaApiDelegate.media/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      mediaId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: media/getResponses[F]
    ): F[Response[F]]

  }
  def media/get: media/get


  trait media/list {
    import MediaApiDelegate.media/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: media/listResponses[F]
    ): F[Response[F]]

  }
  def media/list: media/list

}