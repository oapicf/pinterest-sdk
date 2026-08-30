package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.PinterestLibError
import org.openapitools.models.SearchPartnerPins200Response
import org.openapitools.models.SearchUserBoardsGet200Response
import org.openapitools.models.SearchUserPinsList200Response

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

final case class SearchApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: SearchApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object searchPartnerPins {
    import SearchApiDelegate.searchPartnerPinsResponses

    object termQueryParam extends QueryParamDecoderMatcher[String]("term")
    object country_codeQueryParam extends QueryParamDecoderMatcher[String]("country_code")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object localeQueryParam extends OptionalQueryParamDecoderMatcher[String]("locale")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[50]]]("limit")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "search" / "partner" / "pins" :? termQueryParam(term) +& country_codeQueryParam(country_code) +& bookmarkQueryParam(bookmark) +& localeQueryParam(locale) +& limitQueryParam(limit)) as auth =>
        delegate.searchPartnerPins.handle_pinterest_oauth2(auth, req, term, country_code, bookmark, locale, limit, responses)

    }

    val responses: searchPartnerPinsResponses[F] = new searchPartnerPinsResponses[F] {
      def resp200(value: SearchPartnerPins200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object searchUserBoards/get {
    import SearchApiDelegate.searchUserBoards/getResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object queryQueryParam extends OptionalQueryParamDecoderMatcher[String]("query")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "search" / "boards" :? ad_account_idQueryParam(ad_account_id) +& queryQueryParam(query) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.searchUserBoards/get.handle_pinterest_oauth2(auth, req, ad_account_id, query, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "search" / "boards" :? ad_account_idQueryParam(ad_account_id) +& queryQueryParam(query) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.searchUserBoards/get.handle_client_credentials(auth, req, ad_account_id, query, bookmark, page_size, responses)

    }

    val responses: searchUserBoards/getResponses[F] = new searchUserBoards/getResponses[F] {
      def resp200(value: SearchUserBoardsGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object searchUserPins/list {
    import SearchApiDelegate.searchUserPins/listResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object queryQueryParam extends QueryParamDecoderMatcher[String]("query")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "search" / "pins" :? ad_account_idQueryParam(ad_account_id) +& queryQueryParam(query) +& bookmarkQueryParam(bookmark)) as auth =>
        delegate.searchUserPins/list.handle_pinterest_oauth2(auth, req, ad_account_id, query, bookmark, responses)

    }

    val responses: searchUserPins/listResponses[F] = new searchUserPins/listResponses[F] {
      def resp200(value: SearchUserPinsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    searchPartnerPins.routepinterest_oauth2 <+>
    searchUserBoards/get.routepinterest_oauth2 <+>
    searchUserPins/list.routepinterest_oauth2
  val routesclient_credentials =
    searchUserBoards/get.routeclient_credentials
}

object SearchApiDelegate {
  trait searchPartnerPinsResponses[F[_]] {
    def resp200(value: SearchPartnerPins200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait searchUserBoards/getResponses[F[_]] {
    def resp200(value: SearchUserBoardsGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait searchUserPins/listResponses[F[_]] {
    def resp200(value: SearchUserPinsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait SearchApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait searchPartnerPins {
    import SearchApiDelegate.searchPartnerPinsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      term: String,
      countryCode: String,
      bookmark: Option[String],
      locale: Option[String],
      limit: Option[Refined[Int, GreaterEqual[1] And LessEqual[50]]],
      responses: searchPartnerPinsResponses[F]
    ): F[Response[F]]

  }
  def searchPartnerPins: searchPartnerPins


  trait searchUserBoards/get {
    import SearchApiDelegate.searchUserBoards/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      query: Option[String],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: searchUserBoards/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      query: Option[String],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: searchUserBoards/getResponses[F]
    ): F[Response[F]]

  }
  def searchUserBoards/get: searchUserBoards/get


  trait searchUserPins/list {
    import SearchApiDelegate.searchUserPins/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      query: String,
      bookmark: Option[String],
      responses: searchUserPins/listResponses[F]
    ): F[Response[F]]

  }
  def searchUserPins/list: searchUserPins/list

}