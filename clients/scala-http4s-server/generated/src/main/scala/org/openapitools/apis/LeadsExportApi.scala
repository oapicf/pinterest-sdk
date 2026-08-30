package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.LeadsExportResponseData
import org.openapitools.models.LeadsExports
import org.openapitools.models.LeadsExportsCreate
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

final case class LeadsExportApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: LeadsExportApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object leadsExport/create {
    import LeadsExportApiDelegate.leadsExport/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "leads_export") as auth =>
          delegate.leadsExport/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LeadsExportsCreate] , ad_account_id, responses)

    }

    val responses: leadsExport/createResponses[F] = new leadsExport/createResponses[F] {
      def resp200(value: LeadsExports): F[Response[F]] = Ok(value)
      def resp201(value: LeadsExports): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object leadsExport/get {
    import LeadsExportApiDelegate.leadsExport/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object leads_export_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "leads_export" / leads_export_idVarr(leads_export_id)) as auth =>
        delegate.leadsExport/get.handle_pinterest_oauth2(auth, req, ad_account_id, leads_export_id, responses)

    }

    val responses: leadsExport/getResponses[F] = new leadsExport/getResponses[F] {
      def resp200(value: LeadsExportResponseData): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    leadsExport/create.routepinterest_oauth2 <+>
    leadsExport/get.routepinterest_oauth2
}

object LeadsExportApiDelegate {
  trait leadsExport/createResponses[F[_]] {
    def resp200(value: LeadsExports): F[Response[F]]
    def resp201(value: LeadsExports): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait leadsExport/getResponses[F[_]] {
    def resp200(value: LeadsExportResponseData): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait LeadsExportApiDelegate[F[_], pinterest_oauth2] {

  trait leadsExport/create {
    import LeadsExportApiDelegate.leadsExport/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      leadsExport/create: F[LeadsExportsCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: leadsExport/createResponses[F]
    ): F[Response[F]]


  }
  def leadsExport/create: leadsExport/create


  trait leadsExport/get {
    import LeadsExportApiDelegate.leadsExport/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      leadsExportId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: leadsExport/getResponses[F]
    ): F[Response[F]]

  }
  def leadsExport/get: leadsExport/get

}