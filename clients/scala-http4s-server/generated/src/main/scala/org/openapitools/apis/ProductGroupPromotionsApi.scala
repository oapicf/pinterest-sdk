package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.EntityStatus
import org.openapitools.models.Granularity
import java.time.LocalDate
import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder
import org.openapitools.models.ProductGroupAnalyticsItems
import org.openapitools.models.ProductGroupPromotion
import org.openapitools.models.ProductGroupPromotions
import org.openapitools.models.ProductGroupPromotionsCreate
import org.openapitools.models.ProductGroupPromotionsList200Response
import org.openapitools.models.ProductGroupPromotionsUpdateWithRequiredBody
import org.openapitools.models.ReportingColumnSync
import org.openapitools.models.ReportingTimeZone

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.collection.MinSize
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

final case class ProductGroupPromotionsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: ProductGroupPromotionsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object productGroupPromotions/create {
    import ProductGroupPromotionsApiDelegate.productGroupPromotions/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "product_group_promotions") as auth =>
          delegate.productGroupPromotions/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[ProductGroupPromotionsCreate] , ad_account_id, responses)

    }

    val responses: productGroupPromotions/createResponses[F] = new productGroupPromotions/createResponses[F] {
      def resp200(value: ProductGroupPromotions): F[Response[F]] = Ok(value)
      def resp201(value: ProductGroupPromotions): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object productGroupPromotions/get {
    import ProductGroupPromotionsApiDelegate.productGroupPromotions/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object product_group_promotion_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "product_group_promotions" / product_group_promotion_idVarr(product_group_promotion_id)) as auth =>
        delegate.productGroupPromotions/get.handle_pinterest_oauth2(auth, req, ad_account_id, product_group_promotion_id, responses)

    }

    val responses: productGroupPromotions/getResponses[F] = new productGroupPromotions/getResponses[F] {
      def resp200(value: ProductGroupPromotion): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object productGroupPromotions/list {
    import ProductGroupPromotionsApiDelegate.productGroupPromotions/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object product_group_promotion_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("product_group_promotion_ids")
    object entity_statusesQueryParam extends OptionalQuerySeqParamDecoderMatcher[EntityStatus]("entity_statuses")
    object ad_group_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_group_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "product_group_promotions" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& product_group_promotion_idsQueryParam(product_group_promotion_ids) +& entity_statusesQueryParam(entity_statuses) +& ad_group_idQueryParam(ad_group_id)) as auth =>
        delegate.productGroupPromotions/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, product_group_promotion_ids, entity_statuses, ad_group_id, responses)

    }

    val responses: productGroupPromotions/listResponses[F] = new productGroupPromotions/listResponses[F] {
      def resp200(value: ProductGroupPromotionsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object productGroupPromotions/update {
    import ProductGroupPromotionsApiDelegate.productGroupPromotions/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "product_group_promotions") as auth =>
          delegate.productGroupPromotions/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[ProductGroupPromotionsUpdateWithRequiredBody] , ad_account_id, responses)

    }

    val responses: productGroupPromotions/updateResponses[F] = new productGroupPromotions/updateResponses[F] {
      def resp200(value: ProductGroupPromotions): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object productGroups/analytics {
    import ProductGroupPromotionsApiDelegate.productGroups/analyticsResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object product_group_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("product_group_ids")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "product_groups" / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& product_group_idsQueryParam(product_group_ids) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.productGroups/analytics.handle_pinterest_oauth2(auth, req, ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "product_groups" / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& product_group_idsQueryParam(product_group_ids) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.productGroups/analytics.handle_client_credentials(auth, req, ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone, responses)

    }

    val responses: productGroups/analyticsResponses[F] = new productGroups/analyticsResponses[F] {
      def resp200(value: List[ProductGroupAnalyticsItems]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    productGroupPromotions/create.routepinterest_oauth2 <+>
    productGroupPromotions/get.routepinterest_oauth2 <+>
    productGroupPromotions/list.routepinterest_oauth2 <+>
    productGroupPromotions/update.routepinterest_oauth2 <+>
    productGroups/analytics.routepinterest_oauth2
  val routesclient_credentials =
    productGroups/analytics.routeclient_credentials
}

object ProductGroupPromotionsApiDelegate {
  trait productGroupPromotions/createResponses[F[_]] {
    def resp200(value: ProductGroupPromotions): F[Response[F]]
    def resp201(value: ProductGroupPromotions): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait productGroupPromotions/getResponses[F[_]] {
    def resp200(value: ProductGroupPromotion): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait productGroupPromotions/listResponses[F[_]] {
    def resp200(value: ProductGroupPromotionsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait productGroupPromotions/updateResponses[F[_]] {
    def resp200(value: ProductGroupPromotions): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait productGroups/analyticsResponses[F[_]] {
    def resp200(value: List[ProductGroupAnalyticsItems]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait ProductGroupPromotionsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait productGroupPromotions/create {
    import ProductGroupPromotionsApiDelegate.productGroupPromotions/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productGroupPromotions/create: F[ProductGroupPromotionsCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: productGroupPromotions/createResponses[F]
    ): F[Response[F]]


  }
  def productGroupPromotions/create: productGroupPromotions/create


  trait productGroupPromotions/get {
    import ProductGroupPromotionsApiDelegate.productGroupPromotions/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      productGroupPromotionId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: productGroupPromotions/getResponses[F]
    ): F[Response[F]]

  }
  def productGroupPromotions/get: productGroupPromotions/get


  trait productGroupPromotions/list {
    import ProductGroupPromotionsApiDelegate.productGroupPromotions/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      productGroupPromotionIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      entityStatuses: Option[List[EntityStatus]],
      adGroupId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: productGroupPromotions/listResponses[F]
    ): F[Response[F]]

  }
  def productGroupPromotions/list: productGroupPromotions/list


  trait productGroupPromotions/update {
    import ProductGroupPromotionsApiDelegate.productGroupPromotions/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productGroupPromotions/update: F[ProductGroupPromotionsUpdateWithRequiredBody],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: productGroupPromotions/updateResponses[F]
    ): F[Response[F]]


  }
  def productGroupPromotions/update: productGroupPromotions/update


  trait productGroups/analytics {
    import ProductGroupPromotionsApiDelegate.productGroups/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      productGroupIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      reportingTimezone: Option[ReportingTimeZone],
      responses: productGroups/analyticsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      productGroupIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      reportingTimezone: Option[ReportingTimeZone],
      responses: productGroups/analyticsResponses[F]
    ): F[Response[F]]

  }
  def productGroups/analytics: productGroups/analytics

}