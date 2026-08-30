package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.IntegrationLogsInvalidLogResponse
import org.openapitools.models.IntegrationLogsRequestCreate
import org.openapitools.models.IntegrationLogsSuccessResponse
import org.openapitools.models.IntegrationMetadata
import org.openapitools.models.IntegrationMetadataCreate
import org.openapitools.models.IntegrationMetadataUpdate
import org.openapitools.models.IntegrationRecord
import org.openapitools.models.IntegrationsGetList200Response
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

final case class IntegrationsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: IntegrationsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object integrations/getById {
    import IntegrationsApiDelegate.integrations/getByIdResponses

    object idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "integrations" / idVarr(id)) as auth =>
        delegate.integrations/getById.handle_pinterest_oauth2(auth, req, id, responses)

    }

    val responses: integrations/getByIdResponses[F] = new integrations/getByIdResponses[F] {
      def resp200(value: IntegrationRecord): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object integrations/getList {
    import IntegrationsApiDelegate.integrations/getListResponses

    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "integrations" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.integrations/getList.handle_pinterest_oauth2(auth, req, bookmark, page_size, responses)

    }

    val responses: integrations/getListResponses[F] = new integrations/getListResponses[F] {
      def resp200(value: IntegrationsGetList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object integrationsCommerce/del {
    import IntegrationsApiDelegate.integrationsCommerce/delResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "integrations" / "commerce" / external_business_id) as auth =>
        delegate.integrationsCommerce/del.handle_pinterest_oauth2(auth, req, external_business_id, responses)

    }

    val responses: integrationsCommerce/delResponses[F] = new integrationsCommerce/delResponses[F] {
      def resp200(value: IntegrationMetadata): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object integrationsCommerce/get {
    import IntegrationsApiDelegate.integrationsCommerce/getResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "integrations" / "commerce" / external_business_id) as auth =>
        delegate.integrationsCommerce/get.handle_pinterest_oauth2(auth, req, external_business_id, responses)

    }

    val responses: integrationsCommerce/getResponses[F] = new integrationsCommerce/getResponses[F] {
      def resp200(value: IntegrationMetadata): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object integrationsCommerce/patch {
    import IntegrationsApiDelegate.integrationsCommerce/patchResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "integrations" / "commerce" / external_business_id) as auth =>
          delegate.integrationsCommerce/patch.handle_pinterest_oauth2(auth, req, req.asJsonDecode[IntegrationMetadataUpdate] , external_business_id, responses)

    }

    val responses: integrationsCommerce/patchResponses[F] = new integrationsCommerce/patchResponses[F] {
      def resp200(value: IntegrationMetadata): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object integrationsCommerce/post {
    import IntegrationsApiDelegate.integrationsCommerce/postResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "integrations" / "commerce") as auth =>
          delegate.integrationsCommerce/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[IntegrationMetadataCreate] , responses)

    }

    val responses: integrationsCommerce/postResponses[F] = new integrationsCommerce/postResponses[F] {
      def resp200(value: IntegrationMetadata): F[Response[F]] = Ok(value)
      def resp201(value: IntegrationMetadata): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object integrationsLogs/post {
    import IntegrationsApiDelegate.integrationsLogs/postResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "integrations" / "logs") as auth =>
          delegate.integrationsLogs/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[IntegrationLogsRequestCreate] , responses)

    }

    val responses: integrationsLogs/postResponses[F] = new integrationsLogs/postResponses[F] {
      def resp200(value: IntegrationLogsSuccessResponse): F[Response[F]] = Ok(value)
      def resp400(value: IntegrationLogsInvalidLogResponse): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    integrations/getById.routepinterest_oauth2 <+>
    integrations/getList.routepinterest_oauth2 <+>
    integrationsCommerce/del.routepinterest_oauth2 <+>
    integrationsCommerce/get.routepinterest_oauth2 <+>
    integrationsCommerce/patch.routepinterest_oauth2 <+>
    integrationsCommerce/post.routepinterest_oauth2 <+>
    integrationsLogs/post.routepinterest_oauth2
}

object IntegrationsApiDelegate {
  trait integrations/getByIdResponses[F[_]] {
    def resp200(value: IntegrationRecord): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait integrations/getListResponses[F[_]] {
    def resp200(value: IntegrationsGetList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait integrationsCommerce/delResponses[F[_]] {
    def resp200(value: IntegrationMetadata): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait integrationsCommerce/getResponses[F[_]] {
    def resp200(value: IntegrationMetadata): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait integrationsCommerce/patchResponses[F[_]] {
    def resp200(value: IntegrationMetadata): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait integrationsCommerce/postResponses[F[_]] {
    def resp200(value: IntegrationMetadata): F[Response[F]]
    def resp201(value: IntegrationMetadata): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait integrationsLogs/postResponses[F[_]] {
    def resp200(value: IntegrationLogsSuccessResponse): F[Response[F]]
    def resp400(value: IntegrationLogsInvalidLogResponse): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait IntegrationsApiDelegate[F[_], pinterest_oauth2] {

  trait integrations/getById {
    import IntegrationsApiDelegate.integrations/getByIdResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      id: Refined[String, MatchesRegex["^\\d+$"]],
      responses: integrations/getByIdResponses[F]
    ): F[Response[F]]

  }
  def integrations/getById: integrations/getById


  trait integrations/getList {
    import IntegrationsApiDelegate.integrations/getListResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: integrations/getListResponses[F]
    ): F[Response[F]]

  }
  def integrations/getList: integrations/getList


  trait integrationsCommerce/del {
    import IntegrationsApiDelegate.integrationsCommerce/delResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      externalBusinessId: String,
      responses: integrationsCommerce/delResponses[F]
    ): F[Response[F]]

  }
  def integrationsCommerce/del: integrationsCommerce/del


  trait integrationsCommerce/get {
    import IntegrationsApiDelegate.integrationsCommerce/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      externalBusinessId: String,
      responses: integrationsCommerce/getResponses[F]
    ): F[Response[F]]

  }
  def integrationsCommerce/get: integrationsCommerce/get


  trait integrationsCommerce/patch {
    import IntegrationsApiDelegate.integrationsCommerce/patchResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      integrationsCommerce/patch: F[IntegrationMetadataUpdate],
      externalBusinessId: String,
      responses: integrationsCommerce/patchResponses[F]
    ): F[Response[F]]


  }
  def integrationsCommerce/patch: integrationsCommerce/patch


  trait integrationsCommerce/post {
    import IntegrationsApiDelegate.integrationsCommerce/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      integrationsCommerce/post: F[IntegrationMetadataCreate],
      responses: integrationsCommerce/postResponses[F]
    ): F[Response[F]]


  }
  def integrationsCommerce/post: integrationsCommerce/post


  trait integrationsLogs/post {
    import IntegrationsApiDelegate.integrationsLogs/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      integrationsLogs/post: F[IntegrationLogsRequestCreate],
      responses: integrationsLogs/postResponses[F]
    ): F[Response[F]]


  }
  def integrationsLogs/post: integrationsLogs/post

}