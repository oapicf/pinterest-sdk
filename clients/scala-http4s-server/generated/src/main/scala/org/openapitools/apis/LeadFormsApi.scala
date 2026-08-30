package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.LeadForm
import org.openapitools.models.LeadFormBatchUpdate
import org.openapitools.models.LeadFormCreate
import org.openapitools.models.LeadFormTest
import org.openapitools.models.LeadFormTestCreate
import org.openapitools.models.LeadFormsCreate200Response
import org.openapitools.models.LeadFormsList200Response
import org.openapitools.models.LeadFormsUpdate200Response
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

final case class LeadFormsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: LeadFormsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object leadForm/get {
    import LeadFormsApiDelegate.leadForm/getResponses

    object lead_form_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / lead_form_idVarr(lead_form_id) / "lead_forms" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.leadForm/get.handle_pinterest_oauth2(auth, req, lead_form_id, ad_account_id, responses)

    }

    val responses: leadForm/getResponses[F] = new leadForm/getResponses[F] {
      def resp200(value: LeadForm): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object leadFormTest/create {
    import LeadFormsApiDelegate.leadFormTest/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object lead_form_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "lead_forms" / lead_form_idVarr(lead_form_id) / "test") as auth =>
          delegate.leadFormTest/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LeadFormTestCreate] , ad_account_id, lead_form_id, responses)

    }

    val responses: leadFormTest/createResponses[F] = new leadFormTest/createResponses[F] {
      def resp200(value: LeadFormTest): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object leadForms/create {
    import LeadFormsApiDelegate.leadForms/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "lead_forms") as auth =>
          delegate.leadForms/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[LeadFormCreate]] , ad_account_id, responses)

    }

    val responses: leadForms/createResponses[F] = new leadForms/createResponses[F] {
      def resp200(value: LeadFormsCreate200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object leadForms/list {
    import LeadFormsApiDelegate.leadForms/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "lead_forms" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order)) as auth =>
        delegate.leadForms/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, responses)

    }

    val responses: leadForms/listResponses[F] = new leadForms/listResponses[F] {
      def resp200(value: LeadFormsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object leadForms/update {
    import LeadFormsApiDelegate.leadForms/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "lead_forms") as auth =>
          delegate.leadForms/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[LeadFormBatchUpdate]] , ad_account_id, responses)

    }

    val responses: leadForms/updateResponses[F] = new leadForms/updateResponses[F] {
      def resp200(value: LeadFormsUpdate200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    leadForm/get.routepinterest_oauth2 <+>
    leadFormTest/create.routepinterest_oauth2 <+>
    leadForms/create.routepinterest_oauth2 <+>
    leadForms/list.routepinterest_oauth2 <+>
    leadForms/update.routepinterest_oauth2
}

object LeadFormsApiDelegate {
  trait leadForm/getResponses[F[_]] {
    def resp200(value: LeadForm): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait leadFormTest/createResponses[F[_]] {
    def resp200(value: LeadFormTest): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait leadForms/createResponses[F[_]] {
    def resp200(value: LeadFormsCreate200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait leadForms/listResponses[F[_]] {
    def resp200(value: LeadFormsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait leadForms/updateResponses[F[_]] {
    def resp200(value: LeadFormsUpdate200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait LeadFormsApiDelegate[F[_], pinterest_oauth2] {

  trait leadForm/get {
    import LeadFormsApiDelegate.leadForm/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      leadFormId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: leadForm/getResponses[F]
    ): F[Response[F]]

  }
  def leadForm/get: leadForm/get


  trait leadFormTest/create {
    import LeadFormsApiDelegate.leadFormTest/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      leadFormTest/create: F[LeadFormTestCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      leadFormId: Refined[String, MatchesRegex["^\\d+$"]],
      responses: leadFormTest/createResponses[F]
    ): F[Response[F]]


  }
  def leadFormTest/create: leadFormTest/create


  trait leadForms/create {
    import LeadFormsApiDelegate.leadForms/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      leadForms/create: F[List[LeadFormCreate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: leadForms/createResponses[F]
    ): F[Response[F]]


  }
  def leadForms/create: leadForms/create


  trait leadForms/list {
    import LeadFormsApiDelegate.leadForms/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      responses: leadForms/listResponses[F]
    ): F[Response[F]]

  }
  def leadForms/list: leadForms/list


  trait leadForms/update {
    import LeadFormsApiDelegate.leadForms/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      leadForms/update: F[List[LeadFormBatchUpdate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: leadForms/updateResponses[F]
    ): F[Response[F]]


  }
  def leadForms/update: leadForms/update

}