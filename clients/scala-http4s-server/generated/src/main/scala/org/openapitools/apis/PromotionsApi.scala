package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder
import org.openapitools.models.Promotion
import org.openapitools.models.PromotionBatchUpdate
import org.openapitools.models.PromotionCreate
import org.openapitools.models.PromotionsList200Response
import org.openapitools.models.PromotionsResponse

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
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

final case class PromotionsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: PromotionsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object promotions/create {
    import PromotionsApiDelegate.promotions/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "promotions") as auth =>
          delegate.promotions/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[PromotionCreate]] , ad_account_id, responses)

    }

    val responses: promotions/createResponses[F] = new promotions/createResponses[F] {
      def resp200(value: PromotionsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object promotions/delete {
    import PromotionsApiDelegate.promotions/deleteResponses

    object promotion_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "ad_accounts" / promotion_idVarr(promotion_id) / "promotions" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.promotions/delete.handle_pinterest_oauth2(auth, req, promotion_id, ad_account_id, responses)

    }

    val responses: promotions/deleteResponses[F] = new promotions/deleteResponses[F] {
      def resp200(value: Promotion): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object promotions/get {
    import PromotionsApiDelegate.promotions/getResponses

    object promotion_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / promotion_idVarr(promotion_id) / "promotions" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.promotions/get.handle_pinterest_oauth2(auth, req, promotion_id, ad_account_id, responses)

    }

    val responses: promotions/getResponses[F] = new promotions/getResponses[F] {
      def resp200(value: Promotion): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object promotions/list {
    import PromotionsApiDelegate.promotions/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "promotions" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order)) as auth =>
        delegate.promotions/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, responses)

    }

    val responses: promotions/listResponses[F] = new promotions/listResponses[F] {
      def resp200(value: PromotionsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object promotions/update {
    import PromotionsApiDelegate.promotions/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "promotions") as auth =>
          delegate.promotions/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[PromotionBatchUpdate]] , ad_account_id, responses)

    }

    val responses: promotions/updateResponses[F] = new promotions/updateResponses[F] {
      def resp200(value: PromotionsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    promotions/create.routepinterest_oauth2 <+>
    promotions/delete.routepinterest_oauth2 <+>
    promotions/get.routepinterest_oauth2 <+>
    promotions/list.routepinterest_oauth2 <+>
    promotions/update.routepinterest_oauth2
}

object PromotionsApiDelegate {
  trait promotions/createResponses[F[_]] {
    def resp200(value: PromotionsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait promotions/deleteResponses[F[_]] {
    def resp200(value: Promotion): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait promotions/getResponses[F[_]] {
    def resp200(value: Promotion): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait promotions/listResponses[F[_]] {
    def resp200(value: PromotionsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait promotions/updateResponses[F[_]] {
    def resp200(value: PromotionsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait PromotionsApiDelegate[F[_], pinterest_oauth2] {

  trait promotions/create {
    import PromotionsApiDelegate.promotions/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      promotions/create: F[List[PromotionCreate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: promotions/createResponses[F]
    ): F[Response[F]]


  }
  def promotions/create: promotions/create


  trait promotions/delete {
    import PromotionsApiDelegate.promotions/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      promotionId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: promotions/deleteResponses[F]
    ): F[Response[F]]

  }
  def promotions/delete: promotions/delete


  trait promotions/get {
    import PromotionsApiDelegate.promotions/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      promotionId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: promotions/getResponses[F]
    ): F[Response[F]]

  }
  def promotions/get: promotions/get


  trait promotions/list {
    import PromotionsApiDelegate.promotions/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      responses: promotions/listResponses[F]
    ): F[Response[F]]

  }
  def promotions/list: promotions/list


  trait promotions/update {
    import PromotionsApiDelegate.promotions/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      promotions/update: F[List[PromotionBatchUpdate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: promotions/updateResponses[F]
    ): F[Response[F]]


  }
  def promotions/update: promotions/update

}