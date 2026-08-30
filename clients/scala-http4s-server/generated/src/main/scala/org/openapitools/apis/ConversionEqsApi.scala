package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.EventQualityScore
import org.openapitools.models.IngestionSourceOptions
import org.openapitools.models.LookbackPeriodOptions
import org.openapitools.models.PinterestLibError
import org.openapitools.models.SourcePlatformOptions

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

final case class ConversionEqsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: ConversionEqsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object conversionEqs/list {
    import ConversionEqsApiDelegate.conversionEqs/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object lookback_periodQueryParam extends QueryParamDecoderMatcher[LookbackPeriodOptions]("lookback_period")
    object source_platformQueryParam extends OptionalQueryParamDecoderMatcher[SourcePlatformOptions]("source_platform")
    object ingestion_sourceQueryParam extends OptionalQueryParamDecoderMatcher[IngestionSourceOptions]("ingestion_source")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_eqs" :? lookback_periodQueryParam(lookback_period) +& source_platformQueryParam(source_platform) +& ingestion_sourceQueryParam(ingestion_source)) as auth =>
        delegate.conversionEqs/list.handle_pinterest_oauth2(auth, req, ad_account_id, lookback_period, source_platform, ingestion_source, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_eqs" :? lookback_periodQueryParam(lookback_period) +& source_platformQueryParam(source_platform) +& ingestion_sourceQueryParam(ingestion_source)) as auth =>
        delegate.conversionEqs/list.handle_client_credentials(auth, req, ad_account_id, lookback_period, source_platform, ingestion_source, responses)

    }

    val responses: conversionEqs/listResponses[F] = new conversionEqs/listResponses[F] {
      def resp200(value: List[EventQualityScore]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    conversionEqs/list.routepinterest_oauth2
  val routesclient_credentials =
    conversionEqs/list.routeclient_credentials
}

object ConversionEqsApiDelegate {
  trait conversionEqs/listResponses[F[_]] {
    def resp200(value: List[EventQualityScore]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait ConversionEqsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait conversionEqs/list {
    import ConversionEqsApiDelegate.conversionEqs/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      lookbackPeriod: LookbackPeriodOptions,
      sourcePlatform: Option[SourcePlatformOptions],
      ingestionSource: Option[IngestionSourceOptions],
      responses: conversionEqs/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      lookbackPeriod: LookbackPeriodOptions,
      sourcePlatform: Option[SourcePlatformOptions],
      ingestionSource: Option[IngestionSourceOptions],
      responses: conversionEqs/listResponses[F]
    ): F[Response[F]]

  }
  def conversionEqs/list: conversionEqs/list

}