package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.ConversionEventResponse
import org.openapitools.models.ConversionTag
import org.openapitools.models.ConversionTagCreate
import org.openapitools.models.ConversionTagsList200Response
import org.openapitools.models.PageVisitConversionTagsGet200Response
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

final case class ConversionTagsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: ConversionTagsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object conversionTags/create {
    import ConversionTagsApiDelegate.conversionTags/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags") as auth =>
          delegate.conversionTags/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[ConversionTagCreate] , ad_account_id, responses)

    }

    val responses: conversionTags/createResponses[F] = new conversionTags/createResponses[F] {
      def resp200(value: ConversionTag): F[Response[F]] = Ok(value)
      def resp201(value: ConversionTag): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object conversionTags/get {
    import ConversionTagsApiDelegate.conversionTags/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object conversion_tag_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags" / conversion_tag_idVarr(conversion_tag_id)) as auth =>
        delegate.conversionTags/get.handle_pinterest_oauth2(auth, req, ad_account_id, conversion_tag_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags" / conversion_tag_idVarr(conversion_tag_id)) as auth =>
        delegate.conversionTags/get.handle_client_credentials(auth, req, ad_account_id, conversion_tag_id, responses)

    }

    val responses: conversionTags/getResponses[F] = new conversionTags/getResponses[F] {
      def resp200(value: ConversionTag): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object conversionTags/list {
    import ConversionTagsApiDelegate.conversionTags/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object filter_deletedQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("filter_deleted")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags" :? filter_deletedQueryParam(filter_deleted)) as auth =>
        delegate.conversionTags/list.handle_pinterest_oauth2(auth, req, ad_account_id, filter_deleted, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags" :? filter_deletedQueryParam(filter_deleted)) as auth =>
        delegate.conversionTags/list.handle_client_credentials(auth, req, ad_account_id, filter_deleted, responses)

    }

    val responses: conversionTags/listResponses[F] = new conversionTags/listResponses[F] {
      def resp200(value: ConversionTagsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ocpmEligibleConversionTags/get {
    import ConversionTagsApiDelegate.ocpmEligibleConversionTags/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags" / "ocpm_eligible") as auth =>
        delegate.ocpmEligibleConversionTags/get.handle_pinterest_oauth2(auth, req, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags" / "ocpm_eligible") as auth =>
        delegate.ocpmEligibleConversionTags/get.handle_client_credentials(auth, req, ad_account_id, responses)

    }

    val responses: ocpmEligibleConversionTags/getResponses[F] = new ocpmEligibleConversionTags/getResponses[F] {
      def resp200(value: Map[String, List[ConversionEventResponse]]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object pageVisitConversionTags/get {
    import ConversionTagsApiDelegate.pageVisitConversionTags/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags" / "page_visit" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order)) as auth =>
        delegate.pageVisitConversionTags/get.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_tags" / "page_visit" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order)) as auth =>
        delegate.pageVisitConversionTags/get.handle_client_credentials(auth, req, ad_account_id, bookmark, page_size, order, responses)

    }

    val responses: pageVisitConversionTags/getResponses[F] = new pageVisitConversionTags/getResponses[F] {
      def resp200(value: PageVisitConversionTagsGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    conversionTags/create.routepinterest_oauth2 <+>
    conversionTags/get.routepinterest_oauth2 <+>
    conversionTags/list.routepinterest_oauth2 <+>
    ocpmEligibleConversionTags/get.routepinterest_oauth2 <+>
    pageVisitConversionTags/get.routepinterest_oauth2
  val routesclient_credentials =
    conversionTags/get.routeclient_credentials <+>
    conversionTags/list.routeclient_credentials <+>
    ocpmEligibleConversionTags/get.routeclient_credentials <+>
    pageVisitConversionTags/get.routeclient_credentials
}

object ConversionTagsApiDelegate {
  trait conversionTags/createResponses[F[_]] {
    def resp200(value: ConversionTag): F[Response[F]]
    def resp201(value: ConversionTag): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait conversionTags/getResponses[F[_]] {
    def resp200(value: ConversionTag): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait conversionTags/listResponses[F[_]] {
    def resp200(value: ConversionTagsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ocpmEligibleConversionTags/getResponses[F[_]] {
    def resp200(value: Map[String, List[ConversionEventResponse]]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait pageVisitConversionTags/getResponses[F[_]] {
    def resp200(value: PageVisitConversionTagsGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait ConversionTagsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait conversionTags/create {
    import ConversionTagsApiDelegate.conversionTags/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      conversionTags/create: F[ConversionTagCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionTags/createResponses[F]
    ): F[Response[F]]


  }
  def conversionTags/create: conversionTags/create


  trait conversionTags/get {
    import ConversionTagsApiDelegate.conversionTags/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      conversionTagId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionTags/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      conversionTagId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionTags/getResponses[F]
    ): F[Response[F]]

  }
  def conversionTags/get: conversionTags/get


  trait conversionTags/list {
    import ConversionTagsApiDelegate.conversionTags/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      filterDeleted: Option[Boolean],
      responses: conversionTags/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      filterDeleted: Option[Boolean],
      responses: conversionTags/listResponses[F]
    ): F[Response[F]]

  }
  def conversionTags/list: conversionTags/list


  trait ocpmEligibleConversionTags/get {
    import ConversionTagsApiDelegate.ocpmEligibleConversionTags/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ocpmEligibleConversionTags/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ocpmEligibleConversionTags/getResponses[F]
    ): F[Response[F]]

  }
  def ocpmEligibleConversionTags/get: ocpmEligibleConversionTags/get


  trait pageVisitConversionTags/get {
    import ConversionTagsApiDelegate.pageVisitConversionTags/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      responses: pageVisitConversionTags/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      responses: pageVisitConversionTags/getResponses[F]
    ): F[Response[F]]

  }
  def pageVisitConversionTags/get: pageVisitConversionTags/get

}