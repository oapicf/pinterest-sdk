package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdAccountsAudience
import org.openapitools.models.AdAccountsAudienceCreate
import org.openapitools.models.AdAccountsAudienceUpdate
import org.openapitools.models.AudienceOwnershipType
import org.openapitools.models.AudiencesList200Response
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

final case class AudiencesApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: AudiencesApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object audiences/create {
    import AudiencesApiDelegate.audiences/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audiences") as auth =>
          delegate.audiences/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdAccountsAudienceCreate] , ad_account_id, responses)

    }

    val responses: audiences/createResponses[F] = new audiences/createResponses[F] {
      def resp200(value: AdAccountsAudience): F[Response[F]] = Ok(value)
      def resp201(value: AdAccountsAudience): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object audiences/get {
    import AudiencesApiDelegate.audiences/getResponses

    object audience_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / audience_idVarr(audience_id) / "audiences" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.audiences/get.handle_pinterest_oauth2(auth, req, audience_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / audience_idVarr(audience_id) / "audiences" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.audiences/get.handle_client_credentials(auth, req, audience_id, ad_account_id, responses)

    }

    val responses: audiences/getResponses[F] = new audiences/getResponses[F] {
      def resp200(value: AdAccountsAudience): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object audiences/list {
    import AudiencesApiDelegate.audiences/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object ownership_typeQueryParam extends OptionalQueryParamDecoderMatcher[AudienceOwnershipType]("ownership_type")
    object exclude_ncaQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("exclude_nca")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audiences" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& ownership_typeQueryParam(ownership_type) +& exclude_ncaQueryParam(exclude_nca)) as auth =>
        delegate.audiences/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, ownership_type, exclude_nca, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audiences" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& ownership_typeQueryParam(ownership_type) +& exclude_ncaQueryParam(exclude_nca)) as auth =>
        delegate.audiences/list.handle_client_credentials(auth, req, ad_account_id, bookmark, page_size, order, ownership_type, exclude_nca, responses)

    }

    val responses: audiences/listResponses[F] = new audiences/listResponses[F] {
      def resp200(value: AudiencesList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object audiences/update {
    import AudiencesApiDelegate.audiences/updateResponses

    object audience_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / audience_idVarr(audience_id) / "audiences" / ad_account_idVarr(ad_account_id)) as auth =>
          delegate.audiences/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdAccountsAudienceUpdate] , audience_id, ad_account_id, responses)

    }

    val responses: audiences/updateResponses[F] = new audiences/updateResponses[F] {
      def resp200(value: AdAccountsAudience): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    audiences/create.routepinterest_oauth2 <+>
    audiences/get.routepinterest_oauth2 <+>
    audiences/list.routepinterest_oauth2 <+>
    audiences/update.routepinterest_oauth2
  val routesclient_credentials =
    audiences/get.routeclient_credentials <+>
    audiences/list.routeclient_credentials
}

object AudiencesApiDelegate {
  trait audiences/createResponses[F[_]] {
    def resp200(value: AdAccountsAudience): F[Response[F]]
    def resp201(value: AdAccountsAudience): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait audiences/getResponses[F[_]] {
    def resp200(value: AdAccountsAudience): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait audiences/listResponses[F[_]] {
    def resp200(value: AudiencesList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait audiences/updateResponses[F[_]] {
    def resp200(value: AdAccountsAudience): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait AudiencesApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait audiences/create {
    import AudiencesApiDelegate.audiences/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      audiences/create: F[AdAccountsAudienceCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: audiences/createResponses[F]
    ): F[Response[F]]


  }
  def audiences/create: audiences/create


  trait audiences/get {
    import AudiencesApiDelegate.audiences/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      audienceId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: audiences/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      audienceId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: audiences/getResponses[F]
    ): F[Response[F]]

  }
  def audiences/get: audiences/get


  trait audiences/list {
    import AudiencesApiDelegate.audiences/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      ownershipType: Option[AudienceOwnershipType],
      excludeNca: Option[Boolean],
      responses: audiences/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      ownershipType: Option[AudienceOwnershipType],
      excludeNca: Option[Boolean],
      responses: audiences/listResponses[F]
    ): F[Response[F]]

  }
  def audiences/list: audiences/list


  trait audiences/update {
    import AudiencesApiDelegate.audiences/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      audiences/update: F[AdAccountsAudienceUpdate],
      audienceId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: audiences/updateResponses[F]
    ): F[Response[F]]


  }
  def audiences/update: audiences/update

}