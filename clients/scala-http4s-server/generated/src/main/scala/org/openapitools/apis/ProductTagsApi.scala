package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.PinterestLibError
import org.openapitools.models.ProductTagsBulkAddRequest
import org.openapitools.models.ProductTagsBulkDeleteRequest
import org.openapitools.models.ProductTagsError
import org.openapitools.models.ProductTagsResponse

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.string.MatchesRegex

import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ProductTagsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: ProductTagsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object productTags/bulkAdd {
    import ProductTagsApiDelegate.productTags/bulkAddResponses

    object pin_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "pins" / pin_idVarr(pin_id) / "product_tags") as auth =>
          delegate.productTags/bulkAdd.handle_pinterest_oauth2(auth, req, req.asJsonDecode[ProductTagsBulkAddRequest] , pin_id, responses)

    }

    val responses: productTags/bulkAddResponses[F] = new productTags/bulkAddResponses[F] {
      def resp200(value: ProductTagsResponse): F[Response[F]] = Ok(value)
      def resp400(value: ProductTagsError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object productTags/bulkDelete {
    import ProductTagsApiDelegate.productTags/bulkDeleteResponses

    object pin_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "pins" / pin_idVarr(pin_id) / "product_tags" / "bulk-delete") as auth =>
          delegate.productTags/bulkDelete.handle_pinterest_oauth2(auth, req, req.asJsonDecode[ProductTagsBulkDeleteRequest] , pin_id, responses)

    }

    val responses: productTags/bulkDeleteResponses[F] = new productTags/bulkDeleteResponses[F] {
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object productTags/list {
    import ProductTagsApiDelegate.productTags/listResponses

    object pin_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "pins" / pin_idVarr(pin_id) / "product_tags") as auth =>
        delegate.productTags/list.handle_pinterest_oauth2(auth, req, pin_id, responses)

    }

    val responses: productTags/listResponses[F] = new productTags/listResponses[F] {
      def resp200(value: ProductTagsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    productTags/bulkAdd.routepinterest_oauth2 <+>
    productTags/bulkDelete.routepinterest_oauth2 <+>
    productTags/list.routepinterest_oauth2
}

object ProductTagsApiDelegate {
  trait productTags/bulkAddResponses[F[_]] {
    def resp200(value: ProductTagsResponse): F[Response[F]]
    def resp400(value: ProductTagsError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait productTags/bulkDeleteResponses[F[_]] {
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait productTags/listResponses[F[_]] {
    def resp200(value: ProductTagsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait ProductTagsApiDelegate[F[_], pinterest_oauth2] {

  trait productTags/bulkAdd {
    import ProductTagsApiDelegate.productTags/bulkAddResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productTags/bulkAdd: F[ProductTagsBulkAddRequest],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: productTags/bulkAddResponses[F]
    ): F[Response[F]]


  }
  def productTags/bulkAdd: productTags/bulkAdd


  trait productTags/bulkDelete {
    import ProductTagsApiDelegate.productTags/bulkDeleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productTags/bulkDelete: F[ProductTagsBulkDeleteRequest],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: productTags/bulkDeleteResponses[F]
    ): F[Response[F]]


  }
  def productTags/bulkDelete: productTags/bulkDelete


  trait productTags/list {
    import ProductTagsApiDelegate.productTags/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: productTags/listResponses[F]
    ): F[Response[F]]

  }
  def productTags/list: productTags/list

}