package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdAccountsSubscriptionsGetList200Response
import org.openapitools.models.LeadSubscription
import org.openapitools.models.LeadSubscriptionPostParamsCreate
import org.openapitools.models.PinterestLibError

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

final case class LeadAdsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: LeadAdsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object adAccountsSubscriptions/delById {
    import LeadAdsApiDelegate.adAccountsSubscriptions/delByIdResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object subscription_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "leads" / "subscriptions" / subscription_idVarr(subscription_id)) as auth =>
        delegate.adAccountsSubscriptions/delById.handle_pinterest_oauth2(auth, req, ad_account_id, subscription_id, responses)

    }

    val responses: adAccountsSubscriptions/delByIdResponses[F] = new adAccountsSubscriptions/delByIdResponses[F] {
      def resp200(value: LeadSubscription): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adAccountsSubscriptions/getById {
    import LeadAdsApiDelegate.adAccountsSubscriptions/getByIdResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object subscription_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "leads" / "subscriptions" / subscription_idVarr(subscription_id)) as auth =>
        delegate.adAccountsSubscriptions/getById.handle_pinterest_oauth2(auth, req, ad_account_id, subscription_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "leads" / "subscriptions" / subscription_idVarr(subscription_id)) as auth =>
        delegate.adAccountsSubscriptions/getById.handle_client_credentials(auth, req, ad_account_id, subscription_id, responses)

    }

    val responses: adAccountsSubscriptions/getByIdResponses[F] = new adAccountsSubscriptions/getByIdResponses[F] {
      def resp200(value: LeadSubscription): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adAccountsSubscriptions/getList {
    import LeadAdsApiDelegate.adAccountsSubscriptions/getListResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "leads" / "subscriptions" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.adAccountsSubscriptions/getList.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, responses)

    }

    val responses: adAccountsSubscriptions/getListResponses[F] = new adAccountsSubscriptions/getListResponses[F] {
      def resp200(value: AdAccountsSubscriptionsGetList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adAccountsSubscriptions/post {
    import LeadAdsApiDelegate.adAccountsSubscriptions/postResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "leads" / "subscriptions") as auth =>
          delegate.adAccountsSubscriptions/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LeadSubscriptionPostParamsCreate] , ad_account_id, responses)

    }

    val responses: adAccountsSubscriptions/postResponses[F] = new adAccountsSubscriptions/postResponses[F] {
      def resp200(value: LeadSubscription): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    adAccountsSubscriptions/delById.routepinterest_oauth2 <+>
    adAccountsSubscriptions/getById.routepinterest_oauth2 <+>
    adAccountsSubscriptions/getList.routepinterest_oauth2 <+>
    adAccountsSubscriptions/post.routepinterest_oauth2
  val routesclient_credentials =
    adAccountsSubscriptions/getById.routeclient_credentials
}

object LeadAdsApiDelegate {
  trait adAccountsSubscriptions/delByIdResponses[F[_]] {
    def resp200(value: LeadSubscription): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adAccountsSubscriptions/getByIdResponses[F[_]] {
    def resp200(value: LeadSubscription): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adAccountsSubscriptions/getListResponses[F[_]] {
    def resp200(value: AdAccountsSubscriptionsGetList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adAccountsSubscriptions/postResponses[F[_]] {
    def resp200(value: LeadSubscription): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait LeadAdsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait adAccountsSubscriptions/delById {
    import LeadAdsApiDelegate.adAccountsSubscriptions/delByIdResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      subscriptionId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: adAccountsSubscriptions/delByIdResponses[F]
    ): F[Response[F]]

  }
  def adAccountsSubscriptions/delById: adAccountsSubscriptions/delById


  trait adAccountsSubscriptions/getById {
    import LeadAdsApiDelegate.adAccountsSubscriptions/getByIdResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      subscriptionId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: adAccountsSubscriptions/getByIdResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      subscriptionId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: adAccountsSubscriptions/getByIdResponses[F]
    ): F[Response[F]]

  }
  def adAccountsSubscriptions/getById: adAccountsSubscriptions/getById


  trait adAccountsSubscriptions/getList {
    import LeadAdsApiDelegate.adAccountsSubscriptions/getListResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: adAccountsSubscriptions/getListResponses[F]
    ): F[Response[F]]

  }
  def adAccountsSubscriptions/getList: adAccountsSubscriptions/getList


  trait adAccountsSubscriptions/post {
    import LeadAdsApiDelegate.adAccountsSubscriptions/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountsSubscriptions/post: F[LeadSubscriptionPostParamsCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adAccountsSubscriptions/postResponses[F]
    ): F[Response[F]]


  }
  def adAccountsSubscriptions/post: adAccountsSubscriptions/post

}