package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdsCreditRedeem
import org.openapitools.models.AdsCreditRedeemCreate
import org.openapitools.models.AdsCreditsDiscountsGet200Response
import org.openapitools.models.BillingInvoiceDocumentType
import org.openapitools.models.BillingInvoiceDownloadResponse
import org.openapitools.models.BillingInvoiceSortField
import org.openapitools.models.BillingInvoiceStatus
import org.openapitools.models.BillingInvoicesGet200Response
import org.openapitools.models.BillingProfilesGet200Response
import java.time.LocalDate
import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder
import org.openapitools.models.SSIOAccount
import org.openapitools.models.SSIOInsertionOrder
import org.openapitools.models.SSIOInsertionOrderCreate
import org.openapitools.models.SSIOInsertionOrderStatusResponse
import org.openapitools.models.SSIOInsertionOrderUpdate
import org.openapitools.models.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.models.SsioOrderLinesGetByAdAccount200Response

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

final case class BillingApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: BillingApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object adsCredit/redeem {
    import BillingApiDelegate.adsCredit/redeemResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads_credit" / "redeem") as auth =>
          delegate.adsCredit/redeem.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdsCreditRedeemCreate] , ad_account_id, responses)

    }

    val responses: adsCredit/redeemResponses[F] = new adsCredit/redeemResponses[F] {
      def resp200(value: AdsCreditRedeem): F[Response[F]] = Ok(value)
      def resp201(value: AdsCreditRedeem): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adsCreditsDiscounts/get {
    import BillingApiDelegate.adsCreditsDiscounts/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads_credit" / "discounts" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.adsCreditsDiscounts/get.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, responses)

    }

    val responses: adsCreditsDiscounts/getResponses[F] = new adsCreditsDiscounts/getResponses[F] {
      def resp200(value: AdsCreditsDiscountsGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object billingInvoiceDownload/get {
    import BillingApiDelegate.billingInvoiceDownload/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object billing_invoice_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "billing_invoice" / billing_invoice_idVarr(billing_invoice_id) / "download") as auth =>
        delegate.billingInvoiceDownload/get.handle_pinterest_oauth2(auth, req, ad_account_id, billing_invoice_id, responses)

    }

    val responses: billingInvoiceDownload/getResponses[F] = new billingInvoiceDownload/getResponses[F] {
      def resp200(value: BillingInvoiceDownloadResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object billingInvoices/get {
    import BillingApiDelegate.billingInvoices/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object sortQueryParam extends OptionalQueryParamDecoderMatcher[BillingInvoiceSortField]("sort")
    object statusQueryParam extends OptionalQueryParamDecoderMatcher[BillingInvoiceStatus]("status")
    object document_typeQueryParam extends OptionalQueryParamDecoderMatcher[BillingInvoiceDocumentType]("document_type")
    object start_due_dateQueryParam extends OptionalQueryParamDecoderMatcher[LocalDate]("start_due_date")
    object end_due_dateQueryParam extends OptionalQueryParamDecoderMatcher[LocalDate]("end_due_date")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "billing_invoices" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& sortQueryParam(sort) +& statusQueryParam(status) +& document_typeQueryParam(document_type) +& start_due_dateQueryParam(start_due_date) +& end_due_dateQueryParam(end_due_date)) as auth =>
        delegate.billingInvoices/get.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, sort, status, document_type, start_due_date, end_due_date, responses)

    }

    val responses: billingInvoices/getResponses[F] = new billingInvoices/getResponses[F] {
      def resp200(value: BillingInvoicesGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object billingProfiles/get {
    import BillingApiDelegate.billingProfiles/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object is_activeQueryParam extends QueryParamDecoderMatcher[Boolean]("is_active")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "billing_profiles" :? is_activeQueryParam(is_active) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.billingProfiles/get.handle_pinterest_oauth2(auth, req, ad_account_id, is_active, bookmark, page_size, responses)

    }

    val responses: billingProfiles/getResponses[F] = new billingProfiles/getResponses[F] {
      def resp200(value: BillingProfilesGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ssioAccounts/get {
    import BillingApiDelegate.ssioAccounts/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ssio" / "accounts") as auth =>
        delegate.ssioAccounts/get.handle_pinterest_oauth2(auth, req, ad_account_id, responses)

    }

    val responses: ssioAccounts/getResponses[F] = new ssioAccounts/getResponses[F] {
      def resp200(value: SSIOAccount): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ssioInsertionOrder/create {
    import BillingApiDelegate.ssioInsertionOrder/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ssio" / "insertion_orders") as auth =>
          delegate.ssioInsertionOrder/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[SSIOInsertionOrderCreate] , ad_account_id, responses)

    }

    val responses: ssioInsertionOrder/createResponses[F] = new ssioInsertionOrder/createResponses[F] {
      def resp200(value: SSIOInsertionOrder): F[Response[F]] = Ok(value)
      def resp201(value: SSIOInsertionOrder): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ssioInsertionOrder/edit {
    import BillingApiDelegate.ssioInsertionOrder/editResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ssio" / "insertion_orders") as auth =>
          delegate.ssioInsertionOrder/edit.handle_pinterest_oauth2(auth, req, req.asJsonDecode[SSIOInsertionOrderUpdate] , ad_account_id, responses)

    }

    val responses: ssioInsertionOrder/editResponses[F] = new ssioInsertionOrder/editResponses[F] {
      def resp200(value: SSIOInsertionOrder): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ssioInsertionOrdersStatus/getByAdAccount {
    import BillingApiDelegate.ssioInsertionOrdersStatus/getByAdAccountResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ssio" / "insertion_orders" / "status" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.ssioInsertionOrdersStatus/getByAdAccount.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, responses)

    }

    val responses: ssioInsertionOrdersStatus/getByAdAccountResponses[F] = new ssioInsertionOrdersStatus/getByAdAccountResponses[F] {
      def resp200(value: SsioInsertionOrdersStatusGetByAdAccount200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ssioInsertionOrdersStatus/getByPinOrderId {
    import BillingApiDelegate.ssioInsertionOrdersStatus/getByPinOrderIdResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ssio" / "insertion_orders" / pin_order_id / "status") as auth =>
        delegate.ssioInsertionOrdersStatus/getByPinOrderId.handle_pinterest_oauth2(auth, req, ad_account_id, pin_order_id, responses)

    }

    val responses: ssioInsertionOrdersStatus/getByPinOrderIdResponses[F] = new ssioInsertionOrdersStatus/getByPinOrderIdResponses[F] {
      def resp200(value: SSIOInsertionOrderStatusResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ssioOrderLines/getByAdAccount {
    import BillingApiDelegate.ssioOrderLines/getByAdAccountResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object pin_order_idQueryParam extends OptionalQueryParamDecoderMatcher[String]("pin_order_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ssio" / "order_lines" :? pin_order_idQueryParam(pin_order_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.ssioOrderLines/getByAdAccount.handle_pinterest_oauth2(auth, req, ad_account_id, pin_order_id, bookmark, page_size, responses)

    }

    val responses: ssioOrderLines/getByAdAccountResponses[F] = new ssioOrderLines/getByAdAccountResponses[F] {
      def resp200(value: SsioOrderLinesGetByAdAccount200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    adsCredit/redeem.routepinterest_oauth2 <+>
    adsCreditsDiscounts/get.routepinterest_oauth2 <+>
    billingInvoiceDownload/get.routepinterest_oauth2 <+>
    billingInvoices/get.routepinterest_oauth2 <+>
    billingProfiles/get.routepinterest_oauth2 <+>
    ssioAccounts/get.routepinterest_oauth2 <+>
    ssioInsertionOrder/create.routepinterest_oauth2 <+>
    ssioInsertionOrder/edit.routepinterest_oauth2 <+>
    ssioInsertionOrdersStatus/getByAdAccount.routepinterest_oauth2 <+>
    ssioInsertionOrdersStatus/getByPinOrderId.routepinterest_oauth2 <+>
    ssioOrderLines/getByAdAccount.routepinterest_oauth2
}

object BillingApiDelegate {
  trait adsCredit/redeemResponses[F[_]] {
    def resp200(value: AdsCreditRedeem): F[Response[F]]
    def resp201(value: AdsCreditRedeem): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adsCreditsDiscounts/getResponses[F[_]] {
    def resp200(value: AdsCreditsDiscountsGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait billingInvoiceDownload/getResponses[F[_]] {
    def resp200(value: BillingInvoiceDownloadResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait billingInvoices/getResponses[F[_]] {
    def resp200(value: BillingInvoicesGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait billingProfiles/getResponses[F[_]] {
    def resp200(value: BillingProfilesGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ssioAccounts/getResponses[F[_]] {
    def resp200(value: SSIOAccount): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ssioInsertionOrder/createResponses[F[_]] {
    def resp200(value: SSIOInsertionOrder): F[Response[F]]
    def resp201(value: SSIOInsertionOrder): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ssioInsertionOrder/editResponses[F[_]] {
    def resp200(value: SSIOInsertionOrder): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ssioInsertionOrdersStatus/getByAdAccountResponses[F[_]] {
    def resp200(value: SsioInsertionOrdersStatusGetByAdAccount200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ssioInsertionOrdersStatus/getByPinOrderIdResponses[F[_]] {
    def resp200(value: SSIOInsertionOrderStatusResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ssioOrderLines/getByAdAccountResponses[F[_]] {
    def resp200(value: SsioOrderLinesGetByAdAccount200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait BillingApiDelegate[F[_], pinterest_oauth2] {

  trait adsCredit/redeem {
    import BillingApiDelegate.adsCredit/redeemResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adsCredit/redeem: F[AdsCreditRedeemCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adsCredit/redeemResponses[F]
    ): F[Response[F]]


  }
  def adsCredit/redeem: adsCredit/redeem


  trait adsCreditsDiscounts/get {
    import BillingApiDelegate.adsCreditsDiscounts/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: adsCreditsDiscounts/getResponses[F]
    ): F[Response[F]]

  }
  def adsCreditsDiscounts/get: adsCreditsDiscounts/get


  trait billingInvoiceDownload/get {
    import BillingApiDelegate.billingInvoiceDownload/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      billingInvoiceId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: billingInvoiceDownload/getResponses[F]
    ): F[Response[F]]

  }
  def billingInvoiceDownload/get: billingInvoiceDownload/get


  trait billingInvoices/get {
    import BillingApiDelegate.billingInvoices/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      sort: Option[BillingInvoiceSortField],
      status: Option[BillingInvoiceStatus],
      documentType: Option[BillingInvoiceDocumentType],
      startDueDate: Option[LocalDate],
      endDueDate: Option[LocalDate],
      responses: billingInvoices/getResponses[F]
    ): F[Response[F]]

  }
  def billingInvoices/get: billingInvoices/get


  trait billingProfiles/get {
    import BillingApiDelegate.billingProfiles/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      isActive: Boolean,
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: billingProfiles/getResponses[F]
    ): F[Response[F]]

  }
  def billingProfiles/get: billingProfiles/get


  trait ssioAccounts/get {
    import BillingApiDelegate.ssioAccounts/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ssioAccounts/getResponses[F]
    ): F[Response[F]]

  }
  def ssioAccounts/get: ssioAccounts/get


  trait ssioInsertionOrder/create {
    import BillingApiDelegate.ssioInsertionOrder/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      ssioInsertionOrder/create: F[SSIOInsertionOrderCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ssioInsertionOrder/createResponses[F]
    ): F[Response[F]]


  }
  def ssioInsertionOrder/create: ssioInsertionOrder/create


  trait ssioInsertionOrder/edit {
    import BillingApiDelegate.ssioInsertionOrder/editResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      ssioInsertionOrder/edit: F[SSIOInsertionOrderUpdate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ssioInsertionOrder/editResponses[F]
    ): F[Response[F]]


  }
  def ssioInsertionOrder/edit: ssioInsertionOrder/edit


  trait ssioInsertionOrdersStatus/getByAdAccount {
    import BillingApiDelegate.ssioInsertionOrdersStatus/getByAdAccountResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: ssioInsertionOrdersStatus/getByAdAccountResponses[F]
    ): F[Response[F]]

  }
  def ssioInsertionOrdersStatus/getByAdAccount: ssioInsertionOrdersStatus/getByAdAccount


  trait ssioInsertionOrdersStatus/getByPinOrderId {
    import BillingApiDelegate.ssioInsertionOrdersStatus/getByPinOrderIdResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      pinOrderId: String,
      responses: ssioInsertionOrdersStatus/getByPinOrderIdResponses[F]
    ): F[Response[F]]

  }
  def ssioInsertionOrdersStatus/getByPinOrderId: ssioInsertionOrdersStatus/getByPinOrderId


  trait ssioOrderLines/getByAdAccount {
    import BillingApiDelegate.ssioOrderLines/getByAdAccountResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      pinOrderId: Option[String],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: ssioOrderLines/getByAdAccountResponses[F]
    ): F[Response[F]]

  }
  def ssioOrderLines/getByAdAccount: ssioOrderLines/getByAdAccount

}