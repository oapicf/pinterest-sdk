package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CustomerListUpload
import org.openapitools.models.CustomerListUploadCreateRequest
import org.openapitools.models.CustomerListUploadCreateResponse
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

final case class CustomerListUploadsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: CustomerListUploadsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object customerListUploads/create {
    import CustomerListUploadsApiDelegate.customerListUploads/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object customer_list_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_lists" / customer_list_idVarr(customer_list_id) / "uploads") as auth =>
          delegate.customerListUploads/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CustomerListUploadCreateRequest] , ad_account_id, customer_list_id, responses)

    }

    val responses: customerListUploads/createResponses[F] = new customerListUploads/createResponses[F] {
      def resp200(value: CustomerListUploadCreateResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object customerListUploads/get {
    import CustomerListUploadsApiDelegate.customerListUploads/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object customer_list_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object customer_list_upload_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_lists" / customer_list_idVarr(customer_list_id) / "uploads" / customer_list_upload_idVarr(customer_list_upload_id)) as auth =>
        delegate.customerListUploads/get.handle_pinterest_oauth2(auth, req, ad_account_id, customer_list_id, customer_list_upload_id, responses)

    }

    val responses: customerListUploads/getResponses[F] = new customerListUploads/getResponses[F] {
      def resp200(value: CustomerListUpload): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object customerListUploads/run {
    import CustomerListUploadsApiDelegate.customerListUploads/runResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object customer_list_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object customer_list_upload_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_lists" / customer_list_idVarr(customer_list_id) / "uploads" / customer_list_upload_idVarr(customer_list_upload_id) / "run") as auth =>
        delegate.customerListUploads/run.handle_pinterest_oauth2(auth, req, ad_account_id, customer_list_id, customer_list_upload_id, responses)

    }

    val responses: customerListUploads/runResponses[F] = new customerListUploads/runResponses[F] {
      def resp200(value: CustomerListUpload): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    customerListUploads/create.routepinterest_oauth2 <+>
    customerListUploads/get.routepinterest_oauth2 <+>
    customerListUploads/run.routepinterest_oauth2
}

object CustomerListUploadsApiDelegate {
  trait customerListUploads/createResponses[F[_]] {
    def resp200(value: CustomerListUploadCreateResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait customerListUploads/getResponses[F[_]] {
    def resp200(value: CustomerListUpload): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait customerListUploads/runResponses[F[_]] {
    def resp200(value: CustomerListUpload): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CustomerListUploadsApiDelegate[F[_], pinterest_oauth2] {

  trait customerListUploads/create {
    import CustomerListUploadsApiDelegate.customerListUploads/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      customerListUploads/create: F[CustomerListUploadCreateRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      customerListId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: customerListUploads/createResponses[F]
    ): F[Response[F]]


  }
  def customerListUploads/create: customerListUploads/create


  trait customerListUploads/get {
    import CustomerListUploadsApiDelegate.customerListUploads/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      customerListId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      customerListUploadId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: customerListUploads/getResponses[F]
    ): F[Response[F]]

  }
  def customerListUploads/get: customerListUploads/get


  trait customerListUploads/run {
    import CustomerListUploadsApiDelegate.customerListUploads/runResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      customerListId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      customerListUploadId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: customerListUploads/runResponses[F]
    ): F[Response[F]]

  }
  def customerListUploads/run: customerListUploads/run

}