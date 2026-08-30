package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CustomerSegment
import org.openapitools.models.CustomerSegmentCreate
import org.openapitools.models.CustomerSegmentList200Response
import org.openapitools.models.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder

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

final case class CustomerSegmentApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: CustomerSegmentApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object customerSegment/create {
    import CustomerSegmentApiDelegate.customerSegment/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_segments") as auth =>
          delegate.customerSegment/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CustomerSegmentCreate] , ad_account_id, responses)

    }

    val responses: customerSegment/createResponses[F] = new customerSegment/createResponses[F] {
      def resp200(value: CustomerSegment): F[Response[F]] = Ok(value)
      def resp201(value: CustomerSegment): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object customerSegment/list {
    import CustomerSegmentApiDelegate.customerSegment/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object include_sizingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("include_sizing")
    object search_queryQueryParam extends OptionalQueryParamDecoderMatcher[String]("search_query")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_segments" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& include_sizingQueryParam(include_sizing) +& search_queryQueryParam(search_query)) as auth =>
        delegate.customerSegment/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, include_sizing, search_query, responses)

    }

    val responses: customerSegment/listResponses[F] = new customerSegment/listResponses[F] {
      def resp200(value: CustomerSegmentList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object customerSegment/update {
    import CustomerSegmentApiDelegate.customerSegment/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_segments") as auth =>
          delegate.customerSegment/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CustomerSegmentUpdateRequestUpdateWithRequiredBody] , ad_account_id, responses)

    }

    val responses: customerSegment/updateResponses[F] = new customerSegment/updateResponses[F] {
      def resp200(): F[Response[F]] = Ok()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    customerSegment/create.routepinterest_oauth2 <+>
    customerSegment/list.routepinterest_oauth2 <+>
    customerSegment/update.routepinterest_oauth2
}

object CustomerSegmentApiDelegate {
  trait customerSegment/createResponses[F[_]] {
    def resp200(value: CustomerSegment): F[Response[F]]
    def resp201(value: CustomerSegment): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait customerSegment/listResponses[F[_]] {
    def resp200(value: CustomerSegmentList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait customerSegment/updateResponses[F[_]] {
    def resp200(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CustomerSegmentApiDelegate[F[_], pinterest_oauth2] {

  trait customerSegment/create {
    import CustomerSegmentApiDelegate.customerSegment/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      customerSegment/create: F[CustomerSegmentCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: customerSegment/createResponses[F]
    ): F[Response[F]]


  }
  def customerSegment/create: customerSegment/create


  trait customerSegment/list {
    import CustomerSegmentApiDelegate.customerSegment/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      includeSizing: Option[Boolean],
      searchQuery: Option[String],
      responses: customerSegment/listResponses[F]
    ): F[Response[F]]

  }
  def customerSegment/list: customerSegment/list


  trait customerSegment/update {
    import CustomerSegmentApiDelegate.customerSegment/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      customerSegment/update: F[CustomerSegmentUpdateRequestUpdateWithRequiredBody],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: customerSegment/updateResponses[F]
    ): F[Response[F]]


  }
  def customerSegment/update: customerSegment/update

}