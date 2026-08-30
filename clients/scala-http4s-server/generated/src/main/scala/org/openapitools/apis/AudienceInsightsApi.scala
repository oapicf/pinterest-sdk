package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AudienceInsightType
import org.openapitools.models.AudienceInsights
import org.openapitools.models.AudienceInsightsScopeAndTypeGet200Response
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

final case class AudienceInsightsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: AudienceInsightsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object audienceInsights/get {
    import AudienceInsightsApiDelegate.audienceInsights/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object audience_insight_typeQueryParam extends QueryParamDecoderMatcher[AudienceInsightType]("audience_insight_type")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audience_insights" :? audience_insight_typeQueryParam(audience_insight_type)) as auth =>
        delegate.audienceInsights/get.handle_pinterest_oauth2(auth, req, ad_account_id, audience_insight_type, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audience_insights" :? audience_insight_typeQueryParam(audience_insight_type)) as auth =>
        delegate.audienceInsights/get.handle_client_credentials(auth, req, ad_account_id, audience_insight_type, responses)

    }

    val responses: audienceInsights/getResponses[F] = new audienceInsights/getResponses[F] {
      def resp200(value: AudienceInsights): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object audienceInsightsScopeAndType/get {
    import AudienceInsightsApiDelegate.audienceInsightsScopeAndType/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "insights" / "audiences") as auth =>
        delegate.audienceInsightsScopeAndType/get.handle_pinterest_oauth2(auth, req, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "insights" / "audiences") as auth =>
        delegate.audienceInsightsScopeAndType/get.handle_client_credentials(auth, req, ad_account_id, responses)

    }

    val responses: audienceInsightsScopeAndType/getResponses[F] = new audienceInsightsScopeAndType/getResponses[F] {
      def resp200(value: AudienceInsightsScopeAndTypeGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    audienceInsights/get.routepinterest_oauth2 <+>
    audienceInsightsScopeAndType/get.routepinterest_oauth2
  val routesclient_credentials =
    audienceInsights/get.routeclient_credentials <+>
    audienceInsightsScopeAndType/get.routeclient_credentials
}

object AudienceInsightsApiDelegate {
  trait audienceInsights/getResponses[F[_]] {
    def resp200(value: AudienceInsights): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait audienceInsightsScopeAndType/getResponses[F[_]] {
    def resp200(value: AudienceInsightsScopeAndTypeGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait AudienceInsightsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait audienceInsights/get {
    import AudienceInsightsApiDelegate.audienceInsights/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      audienceInsightType: AudienceInsightType,
      responses: audienceInsights/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      audienceInsightType: AudienceInsightType,
      responses: audienceInsights/getResponses[F]
    ): F[Response[F]]

  }
  def audienceInsights/get: audienceInsights/get


  trait audienceInsightsScopeAndType/get {
    import AudienceInsightsApiDelegate.audienceInsightsScopeAndType/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: audienceInsightsScopeAndType/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: audienceInsightsScopeAndType/getResponses[F]
    ): F[Response[F]]

  }
  def audienceInsightsScopeAndType/get: audienceInsightsScopeAndType/get

}