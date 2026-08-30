package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.BulkDownload
import org.openapitools.models.BulkDownloadCreate
import org.openapitools.models.BulkJobData
import org.openapitools.models.BulkUpsertRequest
import org.openapitools.models.BulkUpsertResponse
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

final case class BulkApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: BulkApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object bulkDownload/create {
    import BulkApiDelegate.bulkDownload/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "bulk" / "download") as auth =>
          delegate.bulkDownload/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BulkDownloadCreate] , ad_account_id, responses)

    }

    val responses: bulkDownload/createResponses[F] = new bulkDownload/createResponses[F] {
      def resp200(value: BulkDownload): F[Response[F]] = Ok(value)
      def resp201(value: BulkDownload): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object bulkRequest/get {
    import BulkApiDelegate.bulkRequest/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object include_detailsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("include_details")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "bulk" / bulk_request_id :? include_detailsQueryParam(include_details)) as auth =>
        delegate.bulkRequest/get.handle_pinterest_oauth2(auth, req, ad_account_id, bulk_request_id, include_details, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "bulk" / bulk_request_id :? include_detailsQueryParam(include_details)) as auth =>
        delegate.bulkRequest/get.handle_client_credentials(auth, req, ad_account_id, bulk_request_id, include_details, responses)

    }

    val responses: bulkRequest/getResponses[F] = new bulkRequest/getResponses[F] {
      def resp200(value: BulkJobData): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object bulkUpsert/create {
    import BulkApiDelegate.bulkUpsert/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "bulk" / "upsert") as auth =>
          delegate.bulkUpsert/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BulkUpsertRequest] , ad_account_id, responses)

    }

    val responses: bulkUpsert/createResponses[F] = new bulkUpsert/createResponses[F] {
      def resp200(value: BulkUpsertResponse): F[Response[F]] = Ok(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    bulkDownload/create.routepinterest_oauth2 <+>
    bulkRequest/get.routepinterest_oauth2 <+>
    bulkUpsert/create.routepinterest_oauth2
  val routesclient_credentials =
    bulkRequest/get.routeclient_credentials
}

object BulkApiDelegate {
  trait bulkDownload/createResponses[F[_]] {
    def resp200(value: BulkDownload): F[Response[F]]
    def resp201(value: BulkDownload): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait bulkRequest/getResponses[F[_]] {
    def resp200(value: BulkJobData): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait bulkUpsert/createResponses[F[_]] {
    def resp200(value: BulkUpsertResponse): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait BulkApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait bulkDownload/create {
    import BulkApiDelegate.bulkDownload/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      bulkDownload/create: F[BulkDownloadCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: bulkDownload/createResponses[F]
    ): F[Response[F]]


  }
  def bulkDownload/create: bulkDownload/create


  trait bulkRequest/get {
    import BulkApiDelegate.bulkRequest/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bulkRequestId: String,
      includeDetails: Option[Boolean],
      responses: bulkRequest/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bulkRequestId: String,
      includeDetails: Option[Boolean],
      responses: bulkRequest/getResponses[F]
    ): F[Response[F]]

  }
  def bulkRequest/get: bulkRequest/get


  trait bulkUpsert/create {
    import BulkApiDelegate.bulkUpsert/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      bulkUpsert/create: F[BulkUpsertRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: bulkUpsert/createResponses[F]
    ): F[Response[F]]


  }
  def bulkUpsert/create: bulkUpsert/create

}