package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AgeTrendsBucket
import org.openapitools.models.FeaturedTrend
import org.openapitools.models.GenderBucket
import org.openapitools.models.InterestsEnum
import org.openapitools.models.PinterestLibError
import org.openapitools.models.ProductCategoriesEngagementType
import org.openapitools.models.ProductCategoryDetailLookbackWindow
import org.openapitools.models.ProductCategoryDetails
import org.openapitools.models.ProductCategoryEnum
import org.openapitools.models.ProductCategoryRegion
import org.openapitools.models.TrendingProductCategory
import org.openapitools.models.TrendsEditorial
import org.openapitools.models.VerticalProductCategory

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.collection.MinSize

import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class TrendsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: TrendsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object trendsEditorialArticles/list {
    import TrendsApiDelegate.trendsEditorialArticles/listResponses

    object regionQueryParam extends QueryParamDecoderMatcher[ProductCategoryRegion]("region")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "trends" / "editorial_articles" :? regionQueryParam(region)) as auth =>
        delegate.trendsEditorialArticles/list.handle_pinterest_oauth2(auth, req, region, responses)

    }

    val responses: trendsEditorialArticles/listResponses[F] = new trendsEditorialArticles/listResponses[F] {
      def resp200(value: List[TrendsEditorial]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object trendsFeaturedTopics/list {
    import TrendsApiDelegate.trendsFeaturedTopics/listResponses

    object interestQueryParam extends OptionalQueryParamDecoderMatcher[InterestsEnum]("interest")
    object regionQueryParam extends QueryParamDecoderMatcher[ProductCategoryRegion]("region")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "trends" / "topics" / "featured" :? interestQueryParam(interest) +& regionQueryParam(region)) as auth =>
        delegate.trendsFeaturedTopics/list.handle_pinterest_oauth2(auth, req, interest, region, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "trends" / "topics" / "featured" :? interestQueryParam(interest) +& regionQueryParam(region)) as auth =>
        delegate.trendsFeaturedTopics/list.handle_client_credentials(auth, req, interest, region, responses)

    }

    val responses: trendsFeaturedTopics/listResponses[F] = new trendsFeaturedTopics/listResponses[F] {
      def resp200(value: List[FeaturedTrend]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object trendsProductCategoriesDetails/list {
    import TrendsApiDelegate.trendsProductCategoriesDetails/listResponses

    object product_categoriesQueryParam extends QuerySeqParamDecoderMatcher[ProductCategoryEnum]("product_categories")
    object regionQueryParam extends QueryParamDecoderMatcher[ProductCategoryRegion]("region")
    object lookback_windowQueryParam extends OptionalQueryParamDecoderMatcher[ProductCategoryDetailLookbackWindow]("lookback_window")
    object engagement_typeQueryParam extends OptionalQueryParamDecoderMatcher[ProductCategoriesEngagementType]("engagement_type")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "trends" / "product_categories" / "details" :? product_categoriesQueryParam(product_categories) +& regionQueryParam(region) +& lookback_windowQueryParam(lookback_window) +& engagement_typeQueryParam(engagement_type)) as auth =>
        delegate.trendsProductCategoriesDetails/list.handle_pinterest_oauth2(auth, req, product_categories, region, lookback_window, engagement_type, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "trends" / "product_categories" / "details" :? product_categoriesQueryParam(product_categories) +& regionQueryParam(region) +& lookback_windowQueryParam(lookback_window) +& engagement_typeQueryParam(engagement_type)) as auth =>
        delegate.trendsProductCategoriesDetails/list.handle_client_credentials(auth, req, product_categories, region, lookback_window, engagement_type, responses)

    }

    val responses: trendsProductCategoriesDetails/listResponses[F] = new trendsProductCategoriesDetails/listResponses[F] {
      def resp200(value: List[ProductCategoryDetails]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object trendsProductCategoriesTrending/list {
    import TrendsApiDelegate.trendsProductCategoriesTrending/listResponses

    object regionQueryParam extends QueryParamDecoderMatcher[ProductCategoryRegion]("region")
    object verticalsQueryParam extends OptionalQuerySeqParamDecoderMatcher[VerticalProductCategory]("verticals")
    object agesQueryParam extends OptionalQuerySeqParamDecoderMatcher[AgeTrendsBucket]("ages")
    object gendersQueryParam extends OptionalQuerySeqParamDecoderMatcher[GenderBucket]("genders")
    object engagement_typeQueryParam extends OptionalQueryParamDecoderMatcher[ProductCategoriesEngagementType]("engagement_type")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "trends" / "product_categories" / "trending" :? regionQueryParam(region) +& verticalsQueryParam(verticals) +& agesQueryParam(ages) +& gendersQueryParam(genders) +& engagement_typeQueryParam(engagement_type)) as auth =>
        delegate.trendsProductCategoriesTrending/list.handle_pinterest_oauth2(auth, req, region, verticals, ages, genders, engagement_type, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "trends" / "product_categories" / "trending" :? regionQueryParam(region) +& verticalsQueryParam(verticals) +& agesQueryParam(ages) +& gendersQueryParam(genders) +& engagement_typeQueryParam(engagement_type)) as auth =>
        delegate.trendsProductCategoriesTrending/list.handle_client_credentials(auth, req, region, verticals, ages, genders, engagement_type, responses)

    }

    val responses: trendsProductCategoriesTrending/listResponses[F] = new trendsProductCategoriesTrending/listResponses[F] {
      def resp200(value: List[TrendingProductCategory]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    trendsEditorialArticles/list.routepinterest_oauth2 <+>
    trendsFeaturedTopics/list.routepinterest_oauth2 <+>
    trendsProductCategoriesDetails/list.routepinterest_oauth2 <+>
    trendsProductCategoriesTrending/list.routepinterest_oauth2
  val routesclient_credentials =
    trendsFeaturedTopics/list.routeclient_credentials <+>
    trendsProductCategoriesDetails/list.routeclient_credentials <+>
    trendsProductCategoriesTrending/list.routeclient_credentials
}

object TrendsApiDelegate {
  trait trendsEditorialArticles/listResponses[F[_]] {
    def resp200(value: List[TrendsEditorial]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait trendsFeaturedTopics/listResponses[F[_]] {
    def resp200(value: List[FeaturedTrend]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait trendsProductCategoriesDetails/listResponses[F[_]] {
    def resp200(value: List[ProductCategoryDetails]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait trendsProductCategoriesTrending/listResponses[F[_]] {
    def resp200(value: List[TrendingProductCategory]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait TrendsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait trendsEditorialArticles/list {
    import TrendsApiDelegate.trendsEditorialArticles/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      region: ProductCategoryRegion,
      responses: trendsEditorialArticles/listResponses[F]
    ): F[Response[F]]

  }
  def trendsEditorialArticles/list: trendsEditorialArticles/list


  trait trendsFeaturedTopics/list {
    import TrendsApiDelegate.trendsFeaturedTopics/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      interest: Option[InterestsEnum],
      region: ProductCategoryRegion,
      responses: trendsFeaturedTopics/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      interest: Option[InterestsEnum],
      region: ProductCategoryRegion,
      responses: trendsFeaturedTopics/listResponses[F]
    ): F[Response[F]]

  }
  def trendsFeaturedTopics/list: trendsFeaturedTopics/list


  trait trendsProductCategoriesDetails/list {
    import TrendsApiDelegate.trendsProductCategoriesDetails/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productCategories: List[ProductCategoryEnum],
      region: ProductCategoryRegion,
      lookbackWindow: Option[ProductCategoryDetailLookbackWindow],
      engagementType: Option[ProductCategoriesEngagementType],
      responses: trendsProductCategoriesDetails/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      productCategories: List[ProductCategoryEnum],
      region: ProductCategoryRegion,
      lookbackWindow: Option[ProductCategoryDetailLookbackWindow],
      engagementType: Option[ProductCategoriesEngagementType],
      responses: trendsProductCategoriesDetails/listResponses[F]
    ): F[Response[F]]

  }
  def trendsProductCategoriesDetails/list: trendsProductCategoriesDetails/list


  trait trendsProductCategoriesTrending/list {
    import TrendsApiDelegate.trendsProductCategoriesTrending/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      region: ProductCategoryRegion,
      verticals: Option[List[VerticalProductCategory]],
      ages: Option[List[AgeTrendsBucket]],
      genders: Option[List[GenderBucket]],
      engagementType: Option[ProductCategoriesEngagementType],
      responses: trendsProductCategoriesTrending/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      region: ProductCategoryRegion,
      verticals: Option[List[VerticalProductCategory]],
      ages: Option[List[AgeTrendsBucket]],
      genders: Option[List[GenderBucket]],
      engagementType: Option[ProductCategoriesEngagementType],
      responses: trendsProductCategoriesTrending/listResponses[F]
    ): F[Response[F]]

  }
  def trendsProductCategoriesTrending/list: trendsProductCategoriesTrending/list

}