package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder
import org.openapitools.models.TargetingTemplate
import org.openapitools.models.TargetingTemplateCreate
import org.openapitools.models.TargetingTemplateList200Response
import org.openapitools.models.TargetingTemplateUpdateRequestReadOrUpdate

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

final case class TargetingTemplateApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: TargetingTemplateApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object targetingTemplate/create {
    import TargetingTemplateApiDelegate.targetingTemplate/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "targeting_templates") as auth =>
          delegate.targetingTemplate/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[TargetingTemplateCreate] , ad_account_id, responses)

    }

    val responses: targetingTemplate/createResponses[F] = new targetingTemplate/createResponses[F] {
      def resp200(value: TargetingTemplate): F[Response[F]] = Ok(value)
      def resp201(value: TargetingTemplate): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object targetingTemplate/list {
    import TargetingTemplateApiDelegate.targetingTemplate/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object include_sizingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("include_sizing")
    object search_queryQueryParam extends OptionalQueryParamDecoderMatcher[String]("search_query")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "targeting_templates" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& include_sizingQueryParam(include_sizing) +& search_queryQueryParam(search_query)) as auth =>
        delegate.targetingTemplate/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, include_sizing, search_query, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "targeting_templates" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& include_sizingQueryParam(include_sizing) +& search_queryQueryParam(search_query)) as auth =>
        delegate.targetingTemplate/list.handle_client_credentials(auth, req, ad_account_id, bookmark, page_size, order, include_sizing, search_query, responses)

    }

    val responses: targetingTemplate/listResponses[F] = new targetingTemplate/listResponses[F] {
      def resp200(value: TargetingTemplateList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object targetingTemplate/update {
    import TargetingTemplateApiDelegate.targetingTemplate/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "targeting_templates") as auth =>
          delegate.targetingTemplate/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[TargetingTemplateUpdateRequestReadOrUpdate] , ad_account_id, responses)

    }

    val responses: targetingTemplate/updateResponses[F] = new targetingTemplate/updateResponses[F] {
      def resp200(): F[Response[F]] = Ok()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    targetingTemplate/create.routepinterest_oauth2 <+>
    targetingTemplate/list.routepinterest_oauth2 <+>
    targetingTemplate/update.routepinterest_oauth2
  val routesclient_credentials =
    targetingTemplate/list.routeclient_credentials
}

object TargetingTemplateApiDelegate {
  trait targetingTemplate/createResponses[F[_]] {
    def resp200(value: TargetingTemplate): F[Response[F]]
    def resp201(value: TargetingTemplate): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait targetingTemplate/listResponses[F[_]] {
    def resp200(value: TargetingTemplateList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait targetingTemplate/updateResponses[F[_]] {
    def resp200(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait TargetingTemplateApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait targetingTemplate/create {
    import TargetingTemplateApiDelegate.targetingTemplate/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      targetingTemplate/create: F[TargetingTemplateCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: targetingTemplate/createResponses[F]
    ): F[Response[F]]


  }
  def targetingTemplate/create: targetingTemplate/create


  trait targetingTemplate/list {
    import TargetingTemplateApiDelegate.targetingTemplate/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      includeSizing: Option[Boolean],
      searchQuery: Option[String],
      responses: targetingTemplate/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      includeSizing: Option[Boolean],
      searchQuery: Option[String],
      responses: targetingTemplate/listResponses[F]
    ): F[Response[F]]

  }
  def targetingTemplate/list: targetingTemplate/list


  trait targetingTemplate/update {
    import TargetingTemplateApiDelegate.targetingTemplate/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      targetingTemplate/update: F[TargetingTemplateUpdateRequestReadOrUpdate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: targetingTemplate/updateResponses[F]
    ): F[Response[F]]


  }
  def targetingTemplate/update: targetingTemplate/update

}