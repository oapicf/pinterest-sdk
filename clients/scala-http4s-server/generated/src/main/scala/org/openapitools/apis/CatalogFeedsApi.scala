package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CatalogsFeed
import org.openapitools.models.CatalogsFeedCreateRequestSchema
import org.openapitools.models.CatalogsFeedIngestion
import org.openapitools.models.CatalogsFeedUpdateRequestSchema
import org.openapitools.models.CatalogsItemValidationIssue
import org.openapitools.models.FeedProcessingResultsList200Response
import org.openapitools.models.FeedsList200Response
import org.openapitools.models.ItemsIssuesList200Response
import org.openapitools.models.PinterestLibError

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

final case class CatalogFeedsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: CatalogFeedsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object feedProcessingResults/list {
    import CatalogFeedsApiDelegate.feedProcessingResults/listResponses

    object feed_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "feeds" / feed_idVarr(feed_id) / "processing_results" :? ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.feedProcessingResults/list.handle_pinterest_oauth2(auth, req, feed_id, ad_account_id, bookmark, page_size, responses)

    }

    val responses: feedProcessingResults/listResponses[F] = new feedProcessingResults/listResponses[F] {
      def resp200(value: FeedProcessingResultsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object feeds/create {
    import CatalogFeedsApiDelegate.feeds/createResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / "feeds" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.feeds/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogsFeedCreateRequestSchema] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "catalogs" / "feeds" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.feeds/create.handle_client_credentials(auth, req, req.asJsonDecode[CatalogsFeedCreateRequestSchema] , ad_account_id, responses)

    }

    val responses: feeds/createResponses[F] = new feeds/createResponses[F] {
      def resp200(value: CatalogsFeed): F[Response[F]] = Ok(value)
      def resp201(value: CatalogsFeed): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object feeds/delete {
    import CatalogFeedsApiDelegate.feeds/deleteResponses

    object feed_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "catalogs" / "feeds" / feed_idVarr(feed_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.feeds/delete.handle_pinterest_oauth2(auth, req, feed_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ DELETE -> Root / "catalogs" / "feeds" / feed_idVarr(feed_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.feeds/delete.handle_client_credentials(auth, req, feed_id, ad_account_id, responses)

    }

    val responses: feeds/deleteResponses[F] = new feeds/deleteResponses[F] {
      def resp200(value: CatalogsFeed): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object feeds/get {
    import CatalogFeedsApiDelegate.feeds/getResponses

    object feed_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "feeds" / feed_idVarr(feed_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.feeds/get.handle_pinterest_oauth2(auth, req, feed_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "catalogs" / "feeds" / feed_idVarr(feed_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.feeds/get.handle_client_credentials(auth, req, feed_id, ad_account_id, responses)

    }

    val responses: feeds/getResponses[F] = new feeds/getResponses[F] {
      def resp200(value: CatalogsFeed): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object feeds/ingest {
    import CatalogFeedsApiDelegate.feeds/ingestResponses

    object feed_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / "feeds" / feed_idVarr(feed_id) / "ingest" :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.feeds/ingest.handle_pinterest_oauth2(auth, req, feed_id, ad_account_id, responses)

    }

    val responses: feeds/ingestResponses[F] = new feeds/ingestResponses[F] {
      def resp200(value: CatalogsFeedIngestion): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object feeds/list {
    import CatalogFeedsApiDelegate.feeds/listResponses

    object catalog_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("catalog_id")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "feeds" :? catalog_idQueryParam(catalog_id) +& ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.feeds/list.handle_pinterest_oauth2(auth, req, catalog_id, ad_account_id, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "catalogs" / "feeds" :? catalog_idQueryParam(catalog_id) +& ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.feeds/list.handle_client_credentials(auth, req, catalog_id, ad_account_id, bookmark, page_size, responses)

    }

    val responses: feeds/listResponses[F] = new feeds/listResponses[F] {
      def resp200(value: FeedsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object feeds/update {
    import CatalogFeedsApiDelegate.feeds/updateResponses

    object feed_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "catalogs" / "feeds" / feed_idVarr(feed_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.feeds/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogsFeedUpdateRequestSchema] , feed_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ PATCH -> Root / "catalogs" / "feeds" / feed_idVarr(feed_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.feeds/update.handle_client_credentials(auth, req, req.asJsonDecode[CatalogsFeedUpdateRequestSchema] , feed_id, ad_account_id, responses)

    }

    val responses: feeds/updateResponses[F] = new feeds/updateResponses[F] {
      def resp200(value: CatalogsFeed): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object itemsIssues/list {
    import CatalogFeedsApiDelegate.itemsIssues/listResponses

    object processing_result_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object item_numbersQueryParam extends OptionalQuerySeqParamDecoderMatcher[Int]("item_numbers")
    object item_validation_issueQueryParam extends OptionalQueryParamDecoderMatcher[CatalogsItemValidationIssue]("item_validation_issue")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "processing_results" / processing_result_idVarr(processing_result_id) / "item_issues" :? item_numbersQueryParam(item_numbers) +& item_validation_issueQueryParam(item_validation_issue) +& ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.itemsIssues/list.handle_pinterest_oauth2(auth, req, processing_result_id, item_numbers, item_validation_issue, ad_account_id, bookmark, page_size, responses)

    }

    val responses: itemsIssues/listResponses[F] = new itemsIssues/listResponses[F] {
      def resp200(value: ItemsIssuesList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    feedProcessingResults/list.routepinterest_oauth2 <+>
    feeds/create.routepinterest_oauth2 <+>
    feeds/delete.routepinterest_oauth2 <+>
    feeds/get.routepinterest_oauth2 <+>
    feeds/ingest.routepinterest_oauth2 <+>
    feeds/list.routepinterest_oauth2 <+>
    feeds/update.routepinterest_oauth2 <+>
    itemsIssues/list.routepinterest_oauth2
  val routesclient_credentials =
    feeds/create.routeclient_credentials <+>
    feeds/delete.routeclient_credentials <+>
    feeds/get.routeclient_credentials <+>
    feeds/list.routeclient_credentials <+>
    feeds/update.routeclient_credentials
}

object CatalogFeedsApiDelegate {
  trait feedProcessingResults/listResponses[F[_]] {
    def resp200(value: FeedProcessingResultsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait feeds/createResponses[F[_]] {
    def resp200(value: CatalogsFeed): F[Response[F]]
    def resp201(value: CatalogsFeed): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait feeds/deleteResponses[F[_]] {
    def resp200(value: CatalogsFeed): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait feeds/getResponses[F[_]] {
    def resp200(value: CatalogsFeed): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait feeds/ingestResponses[F[_]] {
    def resp200(value: CatalogsFeedIngestion): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait feeds/listResponses[F[_]] {
    def resp200(value: FeedsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait feeds/updateResponses[F[_]] {
    def resp200(value: CatalogsFeed): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait itemsIssues/listResponses[F[_]] {
    def resp200(value: ItemsIssuesList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CatalogFeedsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait feedProcessingResults/list {
    import CatalogFeedsApiDelegate.feedProcessingResults/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      feedId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: feedProcessingResults/listResponses[F]
    ): F[Response[F]]

  }
  def feedProcessingResults/list: feedProcessingResults/list


  trait feeds/create {
    import CatalogFeedsApiDelegate.feeds/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      feeds/create: F[CatalogsFeedCreateRequestSchema],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/createResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      feeds/create: F[CatalogsFeedCreateRequestSchema],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/createResponses[F]
    ): F[Response[F]]


  }
  def feeds/create: feeds/create


  trait feeds/delete {
    import CatalogFeedsApiDelegate.feeds/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      feedId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/deleteResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      feedId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/deleteResponses[F]
    ): F[Response[F]]

  }
  def feeds/delete: feeds/delete


  trait feeds/get {
    import CatalogFeedsApiDelegate.feeds/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      feedId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      feedId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/getResponses[F]
    ): F[Response[F]]

  }
  def feeds/get: feeds/get


  trait feeds/ingest {
    import CatalogFeedsApiDelegate.feeds/ingestResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      feedId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/ingestResponses[F]
    ): F[Response[F]]

  }
  def feeds/ingest: feeds/ingest


  trait feeds/list {
    import CatalogFeedsApiDelegate.feeds/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogId: Option[Refined[String, MatchesRegex["^\\d+$"]]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: feeds/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      catalogId: Option[Refined[String, MatchesRegex["^\\d+$"]]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: feeds/listResponses[F]
    ): F[Response[F]]

  }
  def feeds/list: feeds/list


  trait feeds/update {
    import CatalogFeedsApiDelegate.feeds/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      feeds/update: F[CatalogsFeedUpdateRequestSchema],
      feedId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/updateResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      feeds/update: F[CatalogsFeedUpdateRequestSchema],
      feedId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: feeds/updateResponses[F]
    ): F[Response[F]]


  }
  def feeds/update: feeds/update


  trait itemsIssues/list {
    import CatalogFeedsApiDelegate.itemsIssues/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      processingResultId: Refined[String, MatchesRegex["^\\d+$"]],
      itemNumbers: Option[List[Int]],
      itemValidationIssue: Option[CatalogsItemValidationIssue],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: itemsIssues/listResponses[F]
    ): F[Response[F]]

  }
  def itemsIssues/list: itemsIssues/list

}