package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdvancedAuctionItems
import org.openapitools.models.AdvancedAuctionItemsGetRequest
import org.openapitools.models.AdvancedAuctionItemsSubmitRequest
import org.openapitools.models.AdvancedAuctionProcessedItems
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

final case class AdvancedAuctionApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: AdvancedAuctionApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object advancedAuctionItemsGet/post {
    import AdvancedAuctionApiDelegate.advancedAuctionItemsGet/postResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "advanced_auction" / "items" / "get" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.advancedAuctionItemsGet/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdvancedAuctionItemsGetRequest] , ad_account_id, responses)

    }

    val responses: advancedAuctionItemsGet/postResponses[F] = new advancedAuctionItemsGet/postResponses[F] {
      def resp200(value: AdvancedAuctionItems): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp500(value: PinterestLibError): F[Response[F]] = InternalServerError(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object advancedAuctionItemsSubmit/post {
    import AdvancedAuctionApiDelegate.advancedAuctionItemsSubmit/postResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "advanced_auction" / "items" / "submit" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.advancedAuctionItemsSubmit/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdvancedAuctionItemsSubmitRequest] , ad_account_id, responses)

    }

    val responses: advancedAuctionItemsSubmit/postResponses[F] = new advancedAuctionItemsSubmit/postResponses[F] {
      def resp200(value: AdvancedAuctionProcessedItems): F[Response[F]] = Ok(value)
      def resp206(value: AdvancedAuctionProcessedItems): F[Response[F]] = PartialContent(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp500(value: PinterestLibError): F[Response[F]] = InternalServerError(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    advancedAuctionItemsGet/post.routepinterest_oauth2 <+>
    advancedAuctionItemsSubmit/post.routepinterest_oauth2
}

object AdvancedAuctionApiDelegate {
  trait advancedAuctionItemsGet/postResponses[F[_]] {
    def resp200(value: AdvancedAuctionItems): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp500(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait advancedAuctionItemsSubmit/postResponses[F[_]] {
    def resp200(value: AdvancedAuctionProcessedItems): F[Response[F]]
    def resp206(value: AdvancedAuctionProcessedItems): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp500(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait AdvancedAuctionApiDelegate[F[_], pinterest_oauth2] {

  trait advancedAuctionItemsGet/post {
    import AdvancedAuctionApiDelegate.advancedAuctionItemsGet/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      advancedAuctionItemsGet/post: F[AdvancedAuctionItemsGetRequest],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: advancedAuctionItemsGet/postResponses[F]
    ): F[Response[F]]


  }
  def advancedAuctionItemsGet/post: advancedAuctionItemsGet/post


  trait advancedAuctionItemsSubmit/post {
    import AdvancedAuctionApiDelegate.advancedAuctionItemsSubmit/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      advancedAuctionItemsSubmit/post: F[AdvancedAuctionItemsSubmitRequest],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: advancedAuctionItemsSubmit/postResponses[F]
    ): F[Response[F]]


  }
  def advancedAuctionItemsSubmit/post: advancedAuctionItemsSubmit/post

}