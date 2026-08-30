package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Keywords
import org.openapitools.models.KeywordsCreate
import org.openapitools.models.KeywordsGet200Response
import org.openapitools.models.KeywordsMetricsArrayResponse
import org.openapitools.models.KeywordsUpdate
import org.openapitools.models.MatchType
import org.openapitools.models.PinterestLibError
import org.openapitools.models.TrendType
import org.openapitools.models.TrendingKeywordsResponse
import org.openapitools.models.TrendsAgeBucket
import org.openapitools.models.TrendsGenderFilter
import org.openapitools.models.TrendsL1Interest
import org.openapitools.models.TrendsSupportedRegion

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

final case class KeywordsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: KeywordsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object countryKeywordsMetrics/get {
    import KeywordsApiDelegate.countryKeywordsMetrics/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object country_codeQueryParam extends QueryParamDecoderMatcher[String]("country_code")
    object keywordsQueryParam extends QuerySeqParamDecoderMatcher[String]("keywords")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "keywords" / "metrics" :? country_codeQueryParam(country_code) +& keywordsQueryParam(keywords)) as auth =>
        delegate.countryKeywordsMetrics/get.handle_pinterest_oauth2(auth, req, ad_account_id, country_code, keywords, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "keywords" / "metrics" :? country_codeQueryParam(country_code) +& keywordsQueryParam(keywords)) as auth =>
        delegate.countryKeywordsMetrics/get.handle_client_credentials(auth, req, ad_account_id, country_code, keywords, responses)

    }

    val responses: countryKeywordsMetrics/getResponses[F] = new countryKeywordsMetrics/getResponses[F] {
      def resp200(value: KeywordsMetricsArrayResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object keywords/create {
    import KeywordsApiDelegate.keywords/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "keywords") as auth =>
          delegate.keywords/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[KeywordsCreate] , ad_account_id, responses)

    }

    val responses: keywords/createResponses[F] = new keywords/createResponses[F] {
      def resp200(value: Keywords): F[Response[F]] = Ok(value)
      def resp201(value: Keywords): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object keywords/get {
    import KeywordsApiDelegate.keywords/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object campaign_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_id")
    object ad_group_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_group_id")
    object ad_group_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("ad_group_ids")
    object match_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[MatchType]("match_types")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "keywords" :? campaign_idQueryParam(campaign_id) +& ad_group_idQueryParam(ad_group_id) +& ad_group_idsQueryParam(ad_group_ids) +& match_typesQueryParam(match_types) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.keywords/get.handle_pinterest_oauth2(auth, req, ad_account_id, campaign_id, ad_group_id, ad_group_ids, match_types, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "keywords" :? campaign_idQueryParam(campaign_id) +& ad_group_idQueryParam(ad_group_id) +& ad_group_idsQueryParam(ad_group_ids) +& match_typesQueryParam(match_types) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.keywords/get.handle_client_credentials(auth, req, ad_account_id, campaign_id, ad_group_id, ad_group_ids, match_types, bookmark, page_size, responses)

    }

    val responses: keywords/getResponses[F] = new keywords/getResponses[F] {
      def resp200(value: KeywordsGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object keywords/update {
    import KeywordsApiDelegate.keywords/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "keywords") as auth =>
          delegate.keywords/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[KeywordsUpdate] , ad_account_id, responses)

    }

    val responses: keywords/updateResponses[F] = new keywords/updateResponses[F] {
      def resp200(value: Keywords): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object trendingKeywords/list {
    import KeywordsApiDelegate.trendingKeywords/listResponses

    object interestsQueryParam extends OptionalQuerySeqParamDecoderMatcher[TrendsL1Interest]("interests")
    object gendersQueryParam extends OptionalQuerySeqParamDecoderMatcher[TrendsGenderFilter]("genders")
    object agesQueryParam extends OptionalQuerySeqParamDecoderMatcher[TrendsAgeBucket]("ages")
    object include_keywordsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MinSize[1] And MaxSize[100]]]("include_keywords")
    object normalize_against_groupQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("normalize_against_group")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[50]]]("limit")
    object include_demographicsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("include_demographics")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "trends" / "keywords" / TrendsSupportedRegionVarr(region) / "top" / TrendTypeVarr(trend_type) :? interestsQueryParam(interests) +& gendersQueryParam(genders) +& agesQueryParam(ages) +& include_keywordsQueryParam(include_keywords) +& normalize_against_groupQueryParam(normalize_against_group) +& limitQueryParam(limit) +& include_demographicsQueryParam(include_demographics)) as auth =>
        delegate.trendingKeywords/list.handle_pinterest_oauth2(auth, req, region, trend_type, interests, genders, ages, include_keywords, normalize_against_group, limit, include_demographics, responses)

    }

    val responses: trendingKeywords/listResponses[F] = new trendingKeywords/listResponses[F] {
      def resp200(value: TrendingKeywordsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    countryKeywordsMetrics/get.routepinterest_oauth2 <+>
    keywords/create.routepinterest_oauth2 <+>
    keywords/get.routepinterest_oauth2 <+>
    keywords/update.routepinterest_oauth2 <+>
    trendingKeywords/list.routepinterest_oauth2
  val routesclient_credentials =
    countryKeywordsMetrics/get.routeclient_credentials <+>
    keywords/get.routeclient_credentials
}

object KeywordsApiDelegate {
  trait countryKeywordsMetrics/getResponses[F[_]] {
    def resp200(value: KeywordsMetricsArrayResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait keywords/createResponses[F[_]] {
    def resp200(value: Keywords): F[Response[F]]
    def resp201(value: Keywords): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait keywords/getResponses[F[_]] {
    def resp200(value: KeywordsGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait keywords/updateResponses[F[_]] {
    def resp200(value: Keywords): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait trendingKeywords/listResponses[F[_]] {
    def resp200(value: TrendingKeywordsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait KeywordsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait countryKeywordsMetrics/get {
    import KeywordsApiDelegate.countryKeywordsMetrics/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      countryCode: String,
      keywords: List[String],
      responses: countryKeywordsMetrics/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      countryCode: String,
      keywords: List[String],
      responses: countryKeywordsMetrics/getResponses[F]
    ): F[Response[F]]

  }
  def countryKeywordsMetrics/get: countryKeywordsMetrics/get


  trait keywords/create {
    import KeywordsApiDelegate.keywords/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      keywords/create: F[KeywordsCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: keywords/createResponses[F]
    ): F[Response[F]]


  }
  def keywords/create: keywords/create


  trait keywords/get {
    import KeywordsApiDelegate.keywords/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      campaignId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      adGroupId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      adGroupIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      matchTypes: Option[List[MatchType]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: keywords/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      campaignId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      adGroupId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      adGroupIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      matchTypes: Option[List[MatchType]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: keywords/getResponses[F]
    ): F[Response[F]]

  }
  def keywords/get: keywords/get


  trait keywords/update {
    import KeywordsApiDelegate.keywords/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      keywords/update: F[KeywordsUpdate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: keywords/updateResponses[F]
    ): F[Response[F]]


  }
  def keywords/update: keywords/update


  trait trendingKeywords/list {
    import KeywordsApiDelegate.trendingKeywords/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      region: TrendsSupportedRegion,
      trendType: TrendType,
      interests: Option[List[TrendsL1Interest]],
      genders: Option[List[TrendsGenderFilter]],
      ages: Option[List[TrendsAgeBucket]],
      includeKeywords: Option[List[Refined[String, MinSize[1] And MaxSize[100]]]],
      normalizeAgainstGroup: Option[Boolean],
      limit: Option[Refined[Int, GreaterEqual[1] And LessEqual[50]]],
      includeDemographics: Option[Boolean],
      responses: trendingKeywords/listResponses[F]
    ): F[Response[F]]

  }
  def trendingKeywords/list: trendingKeywords/list

}