package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Account
import org.openapitools.models.AnalyticsMetricsResponse
import org.openapitools.models.BoardsUserFollowsList200Response
import org.openapitools.models.FollowUser
import org.openapitools.models.FollowUserCreate
import org.openapitools.models.FollowersList200Response
import org.openapitools.models.LinkedBusiness
import java.time.LocalDate
import org.openapitools.models.PinterestLibError
import org.openapitools.models.QuerymetrictypesItems
import org.openapitools.models.QueryvideopinmetrictypesItems
import org.openapitools.models.TopPinsAnalyticsResponse
import org.openapitools.models.TopPinsSortBy
import org.openapitools.models.TopVideoPinsAnalyticsResponse
import org.openapitools.models.TopVideoPinsSortBy
import org.openapitools.models.UserAccountFollowedInterests200Response
import org.openapitools.models.UserFollowingFeedType
import org.openapitools.models.UserFollowingGet200Response
import org.openapitools.models.UserWebsite
import org.openapitools.models.UserWebsiteCreate
import org.openapitools.models.UserWebsiteVerification
import org.openapitools.models.UserWebsitesGet200Response

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

final case class UserAccountApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: UserAccountApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object boardsUserFollows/list {
    import UserAccountApiDelegate.boardsUserFollows/listResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object explicit_followingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("explicit_following")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "following" / "boards" :? ad_account_idQueryParam(ad_account_id) +& explicit_followingQueryParam(explicit_following) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boardsUserFollows/list.handle_pinterest_oauth2(auth, req, ad_account_id, explicit_following, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "user_account" / "following" / "boards" :? ad_account_idQueryParam(ad_account_id) +& explicit_followingQueryParam(explicit_following) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boardsUserFollows/list.handle_client_credentials(auth, req, ad_account_id, explicit_following, bookmark, page_size, responses)

    }

    val responses: boardsUserFollows/listResponses[F] = new boardsUserFollows/listResponses[F] {
      def resp200(value: BoardsUserFollowsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object followUser/update {
    import UserAccountApiDelegate.followUser/updateResponses

    object usernameVarr extends RefinedVarr[String, MatchesRegex["(?!^\\d+$)^.+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "user_account" / "following" / usernameVarr(username)) as auth =>
          delegate.followUser/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[FollowUserCreate] , username, responses)

    }

    val responses: followUser/updateResponses[F] = new followUser/updateResponses[F] {
      def resp200(value: FollowUser): F[Response[F]] = Ok(value)
      def resp201(value: FollowUser): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object followers/list {
    import UserAccountApiDelegate.followers/listResponses

    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "followers" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.followers/list.handle_pinterest_oauth2(auth, req, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "user_account" / "followers" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.followers/list.handle_client_credentials(auth, req, bookmark, page_size, responses)

    }

    val responses: followers/listResponses[F] = new followers/listResponses[F] {
      def resp200(value: FollowersList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object linkedBusinessAccounts/get {
    import UserAccountApiDelegate.linkedBusinessAccounts/getResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "businesses") as auth =>
        delegate.linkedBusinessAccounts/get.handle_pinterest_oauth2(auth, req, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "user_account" / "businesses") as auth =>
        delegate.linkedBusinessAccounts/get.handle_client_credentials(auth, req, responses)

    }

    val responses: linkedBusinessAccounts/getResponses[F] = new linkedBusinessAccounts/getResponses[F] {
      def resp200(value: List[LinkedBusiness]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object unverifyWebsite/delete {
    import UserAccountApiDelegate.unverifyWebsite/deleteResponses

    object websiteQueryParam extends QueryParamDecoderMatcher[String]("website")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "user_account" / "websites" :? websiteQueryParam(website)) as auth =>
        delegate.unverifyWebsite/delete.handle_pinterest_oauth2(auth, req, website, responses)

    }

    val responses: unverifyWebsite/deleteResponses[F] = new unverifyWebsite/deleteResponses[F] {
      def resp200(value: UserWebsite): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object userAccount/analytics {
    import UserAccountApiDelegate.userAccount/analyticsResponses

    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object from_claimed_contentQueryParam extends OptionalQueryParamDecoderMatcher[String]("from_claimed_content")
    object pin_formatQueryParam extends OptionalQueryParamDecoderMatcher[String]("pin_format")
    object app_typesQueryParam extends OptionalQueryParamDecoderMatcher[String]("app_types")
    object content_typeQueryParam extends OptionalQueryParamDecoderMatcher[String]("content_type")
    object sourceQueryParam extends OptionalQueryParamDecoderMatcher[String]("source")
    object metric_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[QuerymetrictypesItems]("metric_types")
    object split_fieldQueryParam extends OptionalQueryParamDecoderMatcher[String]("split_field")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& from_claimed_contentQueryParam(from_claimed_content) +& pin_formatQueryParam(pin_format) +& app_typesQueryParam(app_types) +& content_typeQueryParam(content_type) +& sourceQueryParam(source) +& metric_typesQueryParam(metric_types) +& split_fieldQueryParam(split_field) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.userAccount/analytics.handle_pinterest_oauth2(auth, req, start_date, end_date, from_claimed_content, pin_format, app_types, content_type, source, metric_types, split_field, ad_account_id, responses)

    }

    val responses: userAccount/analyticsResponses[F] = new userAccount/analyticsResponses[F] {
      def resp200(value: Map[String, AnalyticsMetricsResponse]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object userAccount/analytics/topPins {
    import UserAccountApiDelegate.userAccount/analytics/topPinsResponses

    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object sort_byQueryParam extends QueryParamDecoderMatcher[TopPinsSortBy]("sort_by")
    object from_claimed_contentQueryParam extends OptionalQueryParamDecoderMatcher[String]("from_claimed_content")
    object pin_formatQueryParam extends OptionalQueryParamDecoderMatcher[String]("pin_format")
    object app_typesQueryParam extends OptionalQueryParamDecoderMatcher[String]("app_types")
    object content_typeQueryParam extends OptionalQueryParamDecoderMatcher[String]("content_type")
    object sourceQueryParam extends OptionalQueryParamDecoderMatcher[String]("source")
    object metric_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[QuerymetrictypesItems]("metric_types")
    object num_of_pinsQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[50]]]("num_of_pins")
    object created_in_last_n_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("created_in_last_n_days")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "analytics" / "top_pins" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& sort_byQueryParam(sort_by) +& from_claimed_contentQueryParam(from_claimed_content) +& pin_formatQueryParam(pin_format) +& app_typesQueryParam(app_types) +& content_typeQueryParam(content_type) +& sourceQueryParam(source) +& metric_typesQueryParam(metric_types) +& num_of_pinsQueryParam(num_of_pins) +& created_in_last_n_daysQueryParam(created_in_last_n_days) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.userAccount/analytics/topPins.handle_pinterest_oauth2(auth, req, start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "user_account" / "analytics" / "top_pins" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& sort_byQueryParam(sort_by) +& from_claimed_contentQueryParam(from_claimed_content) +& pin_formatQueryParam(pin_format) +& app_typesQueryParam(app_types) +& content_typeQueryParam(content_type) +& sourceQueryParam(source) +& metric_typesQueryParam(metric_types) +& num_of_pinsQueryParam(num_of_pins) +& created_in_last_n_daysQueryParam(created_in_last_n_days) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.userAccount/analytics/topPins.handle_client_credentials(auth, req, start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, responses)

    }

    val responses: userAccount/analytics/topPinsResponses[F] = new userAccount/analytics/topPinsResponses[F] {
      def resp200(value: TopPinsAnalyticsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object userAccount/analytics/topVideoPins {
    import UserAccountApiDelegate.userAccount/analytics/topVideoPinsResponses

    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object sort_byQueryParam extends QueryParamDecoderMatcher[TopVideoPinsSortBy]("sort_by")
    object from_claimed_contentQueryParam extends OptionalQueryParamDecoderMatcher[String]("from_claimed_content")
    object pin_formatQueryParam extends OptionalQueryParamDecoderMatcher[String]("pin_format")
    object app_typesQueryParam extends OptionalQueryParamDecoderMatcher[String]("app_types")
    object content_typeQueryParam extends OptionalQueryParamDecoderMatcher[String]("content_type")
    object sourceQueryParam extends OptionalQueryParamDecoderMatcher[String]("source")
    object metric_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[QueryvideopinmetrictypesItems]("metric_types")
    object num_of_pinsQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[50]]]("num_of_pins")
    object created_in_last_n_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("created_in_last_n_days")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "analytics" / "top_video_pins" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& sort_byQueryParam(sort_by) +& from_claimed_contentQueryParam(from_claimed_content) +& pin_formatQueryParam(pin_format) +& app_typesQueryParam(app_types) +& content_typeQueryParam(content_type) +& sourceQueryParam(source) +& metric_typesQueryParam(metric_types) +& num_of_pinsQueryParam(num_of_pins) +& created_in_last_n_daysQueryParam(created_in_last_n_days) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.userAccount/analytics/topVideoPins.handle_pinterest_oauth2(auth, req, start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "user_account" / "analytics" / "top_video_pins" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& sort_byQueryParam(sort_by) +& from_claimed_contentQueryParam(from_claimed_content) +& pin_formatQueryParam(pin_format) +& app_typesQueryParam(app_types) +& content_typeQueryParam(content_type) +& sourceQueryParam(source) +& metric_typesQueryParam(metric_types) +& num_of_pinsQueryParam(num_of_pins) +& created_in_last_n_daysQueryParam(created_in_last_n_days) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.userAccount/analytics/topVideoPins.handle_client_credentials(auth, req, start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, responses)

    }

    val responses: userAccount/analytics/topVideoPinsResponses[F] = new userAccount/analytics/topVideoPinsResponses[F] {
      def resp200(value: TopVideoPinsAnalyticsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object userAccount/followedInterests {
    import UserAccountApiDelegate.userAccount/followedInterestsResponses

    object usernameVarr extends RefinedVarr[String, MatchesRegex["(?!^\\d+$)^.+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "users" / usernameVarr(username) / "interests" / "follow" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.userAccount/followedInterests.handle_pinterest_oauth2(auth, req, username, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "users" / usernameVarr(username) / "interests" / "follow" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.userAccount/followedInterests.handle_client_credentials(auth, req, username, bookmark, page_size, responses)

    }

    val responses: userAccount/followedInterestsResponses[F] = new userAccount/followedInterestsResponses[F] {
      def resp200(value: UserAccountFollowedInterests200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object userAccount/get {
    import UserAccountApiDelegate.userAccount/getResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.userAccount/get.handle_pinterest_oauth2(auth, req, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "user_account" :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.userAccount/get.handle_client_credentials(auth, req, ad_account_id, responses)

    }

    val responses: userAccount/getResponses[F] = new userAccount/getResponses[F] {
      def resp200(value: Account): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object userFollowing/get {
    import UserAccountApiDelegate.userFollowing/getResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object explicit_followingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("explicit_following")
    object feed_typeQueryParam extends OptionalQueryParamDecoderMatcher[UserFollowingFeedType]("feed_type")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "following" :? ad_account_idQueryParam(ad_account_id) +& explicit_followingQueryParam(explicit_following) +& feed_typeQueryParam(feed_type) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.userFollowing/get.handle_pinterest_oauth2(auth, req, ad_account_id, explicit_following, feed_type, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "user_account" / "following" :? ad_account_idQueryParam(ad_account_id) +& explicit_followingQueryParam(explicit_following) +& feed_typeQueryParam(feed_type) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.userFollowing/get.handle_client_credentials(auth, req, ad_account_id, explicit_following, feed_type, bookmark, page_size, responses)

    }

    val responses: userFollowing/getResponses[F] = new userFollowing/getResponses[F] {
      def resp200(value: UserFollowingGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object userWebsites/get {
    import UserAccountApiDelegate.userWebsites/getResponses

    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "websites" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.userWebsites/get.handle_pinterest_oauth2(auth, req, bookmark, page_size, responses)

    }

    val responses: userWebsites/getResponses[F] = new userWebsites/getResponses[F] {
      def resp200(value: UserWebsitesGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object verifyWebsite/update {
    import UserAccountApiDelegate.verifyWebsite/updateResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "user_account" / "websites" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.verifyWebsite/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[UserWebsiteCreate] , ad_account_id, responses)

    }

    val responses: verifyWebsite/updateResponses[F] = new verifyWebsite/updateResponses[F] {
      def resp200(value: UserWebsite): F[Response[F]] = Ok(value)
      def resp201(value: UserWebsite): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object websiteVerification/get {
    import UserAccountApiDelegate.websiteVerification/getResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "user_account" / "websites" / "verification" :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.websiteVerification/get.handle_pinterest_oauth2(auth, req, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "user_account" / "websites" / "verification" :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.websiteVerification/get.handle_client_credentials(auth, req, ad_account_id, responses)

    }

    val responses: websiteVerification/getResponses[F] = new websiteVerification/getResponses[F] {
      def resp200(value: UserWebsiteVerification): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    boardsUserFollows/list.routepinterest_oauth2 <+>
    followUser/update.routepinterest_oauth2 <+>
    followers/list.routepinterest_oauth2 <+>
    linkedBusinessAccounts/get.routepinterest_oauth2 <+>
    unverifyWebsite/delete.routepinterest_oauth2 <+>
    userAccount/analytics.routepinterest_oauth2 <+>
    userAccount/analytics/topPins.routepinterest_oauth2 <+>
    userAccount/analytics/topVideoPins.routepinterest_oauth2 <+>
    userAccount/followedInterests.routepinterest_oauth2 <+>
    userAccount/get.routepinterest_oauth2 <+>
    userFollowing/get.routepinterest_oauth2 <+>
    userWebsites/get.routepinterest_oauth2 <+>
    verifyWebsite/update.routepinterest_oauth2 <+>
    websiteVerification/get.routepinterest_oauth2
  val routesclient_credentials =
    boardsUserFollows/list.routeclient_credentials <+>
    followers/list.routeclient_credentials <+>
    linkedBusinessAccounts/get.routeclient_credentials <+>
    userAccount/analytics/topPins.routeclient_credentials <+>
    userAccount/analytics/topVideoPins.routeclient_credentials <+>
    userAccount/followedInterests.routeclient_credentials <+>
    userAccount/get.routeclient_credentials <+>
    userFollowing/get.routeclient_credentials <+>
    websiteVerification/get.routeclient_credentials
}

object UserAccountApiDelegate {
  trait boardsUserFollows/listResponses[F[_]] {
    def resp200(value: BoardsUserFollowsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait followUser/updateResponses[F[_]] {
    def resp200(value: FollowUser): F[Response[F]]
    def resp201(value: FollowUser): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait followers/listResponses[F[_]] {
    def resp200(value: FollowersList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait linkedBusinessAccounts/getResponses[F[_]] {
    def resp200(value: List[LinkedBusiness]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait unverifyWebsite/deleteResponses[F[_]] {
    def resp200(value: UserWebsite): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait userAccount/analyticsResponses[F[_]] {
    def resp200(value: Map[String, AnalyticsMetricsResponse]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait userAccount/analytics/topPinsResponses[F[_]] {
    def resp200(value: TopPinsAnalyticsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait userAccount/analytics/topVideoPinsResponses[F[_]] {
    def resp200(value: TopVideoPinsAnalyticsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait userAccount/followedInterestsResponses[F[_]] {
    def resp200(value: UserAccountFollowedInterests200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait userAccount/getResponses[F[_]] {
    def resp200(value: Account): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait userFollowing/getResponses[F[_]] {
    def resp200(value: UserFollowingGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait userWebsites/getResponses[F[_]] {
    def resp200(value: UserWebsitesGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait verifyWebsite/updateResponses[F[_]] {
    def resp200(value: UserWebsite): F[Response[F]]
    def resp201(value: UserWebsite): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait websiteVerification/getResponses[F[_]] {
    def resp200(value: UserWebsiteVerification): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait UserAccountApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait boardsUserFollows/list {
    import UserAccountApiDelegate.boardsUserFollows/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      explicitFollowing: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boardsUserFollows/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      explicitFollowing: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boardsUserFollows/listResponses[F]
    ): F[Response[F]]

  }
  def boardsUserFollows/list: boardsUserFollows/list


  trait followUser/update {
    import UserAccountApiDelegate.followUser/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      followUser/update: F[FollowUserCreate],
      username: Refined[String, MatchesRegex["(?!^\\d+$)^.+$"]],
      responses: followUser/updateResponses[F]
    ): F[Response[F]]


  }
  def followUser/update: followUser/update


  trait followers/list {
    import UserAccountApiDelegate.followers/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: followers/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: followers/listResponses[F]
    ): F[Response[F]]

  }
  def followers/list: followers/list


  trait linkedBusinessAccounts/get {
    import UserAccountApiDelegate.linkedBusinessAccounts/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      responses: linkedBusinessAccounts/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      responses: linkedBusinessAccounts/getResponses[F]
    ): F[Response[F]]

  }
  def linkedBusinessAccounts/get: linkedBusinessAccounts/get


  trait unverifyWebsite/delete {
    import UserAccountApiDelegate.unverifyWebsite/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      website: String,
      responses: unverifyWebsite/deleteResponses[F]
    ): F[Response[F]]

  }
  def unverifyWebsite/delete: unverifyWebsite/delete


  trait userAccount/analytics {
    import UserAccountApiDelegate.userAccount/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      startDate: LocalDate,
      endDate: LocalDate,
      fromClaimedContent: Option[String],
      pinFormat: Option[String],
      appTypes: Option[String],
      contentType: Option[String],
      source: Option[String],
      metricTypes: Option[List[QuerymetrictypesItems]],
      splitField: Option[String],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: userAccount/analyticsResponses[F]
    ): F[Response[F]]

  }
  def userAccount/analytics: userAccount/analytics


  trait userAccount/analytics/topPins {
    import UserAccountApiDelegate.userAccount/analytics/topPinsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      startDate: LocalDate,
      endDate: LocalDate,
      sortBy: TopPinsSortBy,
      fromClaimedContent: Option[String],
      pinFormat: Option[String],
      appTypes: Option[String],
      contentType: Option[String],
      source: Option[String],
      metricTypes: Option[List[QuerymetrictypesItems]],
      numOfPins: Option[Refined[Int, GreaterEqual[1] And LessEqual[50]]],
      createdInLastNDays: Option[BigDecimal],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: userAccount/analytics/topPinsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      startDate: LocalDate,
      endDate: LocalDate,
      sortBy: TopPinsSortBy,
      fromClaimedContent: Option[String],
      pinFormat: Option[String],
      appTypes: Option[String],
      contentType: Option[String],
      source: Option[String],
      metricTypes: Option[List[QuerymetrictypesItems]],
      numOfPins: Option[Refined[Int, GreaterEqual[1] And LessEqual[50]]],
      createdInLastNDays: Option[BigDecimal],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: userAccount/analytics/topPinsResponses[F]
    ): F[Response[F]]

  }
  def userAccount/analytics/topPins: userAccount/analytics/topPins


  trait userAccount/analytics/topVideoPins {
    import UserAccountApiDelegate.userAccount/analytics/topVideoPinsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      startDate: LocalDate,
      endDate: LocalDate,
      sortBy: TopVideoPinsSortBy,
      fromClaimedContent: Option[String],
      pinFormat: Option[String],
      appTypes: Option[String],
      contentType: Option[String],
      source: Option[String],
      metricTypes: Option[List[QueryvideopinmetrictypesItems]],
      numOfPins: Option[Refined[Int, GreaterEqual[1] And LessEqual[50]]],
      createdInLastNDays: Option[BigDecimal],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: userAccount/analytics/topVideoPinsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      startDate: LocalDate,
      endDate: LocalDate,
      sortBy: TopVideoPinsSortBy,
      fromClaimedContent: Option[String],
      pinFormat: Option[String],
      appTypes: Option[String],
      contentType: Option[String],
      source: Option[String],
      metricTypes: Option[List[QueryvideopinmetrictypesItems]],
      numOfPins: Option[Refined[Int, GreaterEqual[1] And LessEqual[50]]],
      createdInLastNDays: Option[BigDecimal],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: userAccount/analytics/topVideoPinsResponses[F]
    ): F[Response[F]]

  }
  def userAccount/analytics/topVideoPins: userAccount/analytics/topVideoPins


  trait userAccount/followedInterests {
    import UserAccountApiDelegate.userAccount/followedInterestsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      username: Refined[String, MatchesRegex["(?!^\\d+$)^.+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: userAccount/followedInterestsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      username: Refined[String, MatchesRegex["(?!^\\d+$)^.+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: userAccount/followedInterestsResponses[F]
    ): F[Response[F]]

  }
  def userAccount/followedInterests: userAccount/followedInterests


  trait userAccount/get {
    import UserAccountApiDelegate.userAccount/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: userAccount/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: userAccount/getResponses[F]
    ): F[Response[F]]

  }
  def userAccount/get: userAccount/get


  trait userFollowing/get {
    import UserAccountApiDelegate.userFollowing/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      explicitFollowing: Option[Boolean],
      feedType: Option[UserFollowingFeedType],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: userFollowing/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      explicitFollowing: Option[Boolean],
      feedType: Option[UserFollowingFeedType],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: userFollowing/getResponses[F]
    ): F[Response[F]]

  }
  def userFollowing/get: userFollowing/get


  trait userWebsites/get {
    import UserAccountApiDelegate.userWebsites/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: userWebsites/getResponses[F]
    ): F[Response[F]]

  }
  def userWebsites/get: userWebsites/get


  trait verifyWebsite/update {
    import UserAccountApiDelegate.verifyWebsite/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      verifyWebsite/update: F[UserWebsiteCreate],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: verifyWebsite/updateResponses[F]
    ): F[Response[F]]


  }
  def verifyWebsite/update: verifyWebsite/update


  trait websiteVerification/get {
    import UserAccountApiDelegate.websiteVerification/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: websiteVerification/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: websiteVerification/getResponses[F]
    ): F[Response[F]]

  }
  def websiteVerification/get: websiteVerification/get

}