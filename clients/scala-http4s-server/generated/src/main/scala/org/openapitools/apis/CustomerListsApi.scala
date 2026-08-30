package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CustomerList
import org.openapitools.models.CustomerListCreate
import org.openapitools.models.CustomerListUpdateWithRequiredBody
import org.openapitools.models.CustomerListsList200Response
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

final case class CustomerListsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: CustomerListsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object customerLists/create {
    import CustomerListsApiDelegate.customerLists/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_lists") as auth =>
          delegate.customerLists/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CustomerListCreate] , ad_account_id, responses)

    }

    val responses: customerLists/createResponses[F] = new customerLists/createResponses[F] {
      def resp200(value: CustomerList): F[Response[F]] = Ok(value)
      def resp201(value: CustomerList): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object customerLists/get {
    import CustomerListsApiDelegate.customerLists/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object customer_list_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_lists" / customer_list_idVarr(customer_list_id)) as auth =>
        delegate.customerLists/get.handle_pinterest_oauth2(auth, req, ad_account_id, customer_list_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_lists" / customer_list_idVarr(customer_list_id)) as auth =>
        delegate.customerLists/get.handle_client_credentials(auth, req, ad_account_id, customer_list_id, responses)

    }

    val responses: customerLists/getResponses[F] = new customerLists/getResponses[F] {
      def resp200(value: CustomerList): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object customerLists/list {
    import CustomerListsApiDelegate.customerLists/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object exclude_ncaQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("exclude_nca")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_lists" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& exclude_ncaQueryParam(exclude_nca)) as auth =>
        delegate.customerLists/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, exclude_nca, responses)

    }

    val responses: customerLists/listResponses[F] = new customerLists/listResponses[F] {
      def resp200(value: CustomerListsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object customerLists/update {
    import CustomerListsApiDelegate.customerLists/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object customer_list_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "customer_lists" / customer_list_idVarr(customer_list_id)) as auth =>
          delegate.customerLists/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CustomerListUpdateWithRequiredBody] , ad_account_id, customer_list_id, responses)

    }

    val responses: customerLists/updateResponses[F] = new customerLists/updateResponses[F] {
      def resp200(value: CustomerList): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    customerLists/create.routepinterest_oauth2 <+>
    customerLists/get.routepinterest_oauth2 <+>
    customerLists/list.routepinterest_oauth2 <+>
    customerLists/update.routepinterest_oauth2
  val routesclient_credentials =
    customerLists/get.routeclient_credentials
}

object CustomerListsApiDelegate {
  trait customerLists/createResponses[F[_]] {
    def resp200(value: CustomerList): F[Response[F]]
    def resp201(value: CustomerList): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait customerLists/getResponses[F[_]] {
    def resp200(value: CustomerList): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait customerLists/listResponses[F[_]] {
    def resp200(value: CustomerListsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait customerLists/updateResponses[F[_]] {
    def resp200(value: CustomerList): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CustomerListsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait customerLists/create {
    import CustomerListsApiDelegate.customerLists/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      customerLists/create: F[CustomerListCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: customerLists/createResponses[F]
    ): F[Response[F]]


  }
  def customerLists/create: customerLists/create


  trait customerLists/get {
    import CustomerListsApiDelegate.customerLists/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      customerListId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: customerLists/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      customerListId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: customerLists/getResponses[F]
    ): F[Response[F]]

  }
  def customerLists/get: customerLists/get


  trait customerLists/list {
    import CustomerListsApiDelegate.customerLists/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      excludeNca: Option[Boolean],
      responses: customerLists/listResponses[F]
    ): F[Response[F]]

  }
  def customerLists/list: customerLists/list


  trait customerLists/update {
    import CustomerListsApiDelegate.customerLists/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      customerLists/update: F[CustomerListUpdateWithRequiredBody],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      customerListId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: customerLists/updateResponses[F]
    ): F[Response[F]]


  }
  def customerLists/update: customerLists/update

}