package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Board
import org.openapitools.models.BoardCreate
import org.openapitools.models.BoardPrivacyFilter
import org.openapitools.models.BoardSection
import org.openapitools.models.BoardSectionCreate
import org.openapitools.models.BoardSectionUpdateWithRequiredBody
import org.openapitools.models.BoardSectionsList200Response
import org.openapitools.models.BoardSectionsListPins200Response
import org.openapitools.models.BoardWithUpdatePrivacy
import org.openapitools.models.BoardWithUpdatePrivacyUpdate
import org.openapitools.models.BoardsList200Response
import org.openapitools.models.BoardsListPins200Response
import org.openapitools.models.CreativeType
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

final case class BoardsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: BoardsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object boardSections/create {
    import BoardsApiDelegate.boardSections/createResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "boards" / board_idVarr(board_id) / "sections" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.boardSections/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BoardSectionCreate] , board_id, ad_account_id, responses)

    }

    val responses: boardSections/createResponses[F] = new boardSections/createResponses[F] {
      def resp200(value: BoardSection): F[Response[F]] = Ok(value)
      def resp201(value: BoardSection): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boardSections/delete {
    import BoardsApiDelegate.boardSections/deleteResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object section_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "boards" / board_idVarr(board_id) / "sections" / section_idVarr(section_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.boardSections/delete.handle_pinterest_oauth2(auth, req, board_id, section_id, ad_account_id, responses)

    }

    val responses: boardSections/deleteResponses[F] = new boardSections/deleteResponses[F] {
      def resp200(value: BoardSection): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boardSections/list {
    import BoardsApiDelegate.boardSections/listResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "boards" / board_idVarr(board_id) / "sections" :? ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boardSections/list.handle_pinterest_oauth2(auth, req, board_id, ad_account_id, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "boards" / board_idVarr(board_id) / "sections" :? ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boardSections/list.handle_client_credentials(auth, req, board_id, ad_account_id, bookmark, page_size, responses)

    }

    val responses: boardSections/listResponses[F] = new boardSections/listResponses[F] {
      def resp200(value: BoardSectionsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boardSections/listPins {
    import BoardsApiDelegate.boardSections/listPinsResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object section_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "boards" / board_idVarr(board_id) / "sections" / section_idVarr(section_id) / "pins" :? ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boardSections/listPins.handle_pinterest_oauth2(auth, req, board_id, section_id, ad_account_id, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "boards" / board_idVarr(board_id) / "sections" / section_idVarr(section_id) / "pins" :? ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boardSections/listPins.handle_client_credentials(auth, req, board_id, section_id, ad_account_id, bookmark, page_size, responses)

    }

    val responses: boardSections/listPinsResponses[F] = new boardSections/listPinsResponses[F] {
      def resp200(value: BoardSectionsListPins200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boardSections/update {
    import BoardsApiDelegate.boardSections/updateResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object section_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "boards" / board_idVarr(board_id) / "sections" / section_idVarr(section_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.boardSections/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BoardSectionUpdateWithRequiredBody] , board_id, section_id, ad_account_id, responses)

    }

    val responses: boardSections/updateResponses[F] = new boardSections/updateResponses[F] {
      def resp200(value: BoardSection): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boards/create {
    import BoardsApiDelegate.boards/createResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "boards" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.boards/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BoardCreate] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "boards" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.boards/create.handle_client_credentials(auth, req, req.asJsonDecode[BoardCreate] , ad_account_id, responses)

    }

    val responses: boards/createResponses[F] = new boards/createResponses[F] {
      def resp200(value: Board): F[Response[F]] = Ok(value)
      def resp201(value: Board): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boards/delete {
    import BoardsApiDelegate.boards/deleteResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "boards" / board_idVarr(board_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.boards/delete.handle_pinterest_oauth2(auth, req, board_id, ad_account_id, responses)

    }

    val responses: boards/deleteResponses[F] = new boards/deleteResponses[F] {
      def resp200(value: Board): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boards/get {
    import BoardsApiDelegate.boards/getResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "boards" / board_idVarr(board_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.boards/get.handle_pinterest_oauth2(auth, req, board_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "boards" / board_idVarr(board_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.boards/get.handle_client_credentials(auth, req, board_id, ad_account_id, responses)

    }

    val responses: boards/getResponses[F] = new boards/getResponses[F] {
      def resp200(value: Board): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boards/list {
    import BoardsApiDelegate.boards/listResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object privacyQueryParam extends OptionalQueryParamDecoderMatcher[BoardPrivacyFilter]("privacy")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "boards" :? ad_account_idQueryParam(ad_account_id) +& privacyQueryParam(privacy) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boards/list.handle_pinterest_oauth2(auth, req, ad_account_id, privacy, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "boards" :? ad_account_idQueryParam(ad_account_id) +& privacyQueryParam(privacy) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boards/list.handle_client_credentials(auth, req, ad_account_id, privacy, bookmark, page_size, responses)

    }

    val responses: boards/listResponses[F] = new boards/listResponses[F] {
      def resp200(value: BoardsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boards/listPins {
    import BoardsApiDelegate.boards/listPinsResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object creative_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[CreativeType]("creative_types")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object pin_metricsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("pin_metrics")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "boards" / board_idVarr(board_id) / "pins" :? creative_typesQueryParam(creative_types) +& ad_account_idQueryParam(ad_account_id) +& pin_metricsQueryParam(pin_metrics) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boards/listPins.handle_pinterest_oauth2(auth, req, board_id, creative_types, ad_account_id, pin_metrics, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "boards" / board_idVarr(board_id) / "pins" :? creative_typesQueryParam(creative_types) +& ad_account_idQueryParam(ad_account_id) +& pin_metricsQueryParam(pin_metrics) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.boards/listPins.handle_client_credentials(auth, req, board_id, creative_types, ad_account_id, pin_metrics, bookmark, page_size, responses)

    }

    val responses: boards/listPinsResponses[F] = new boards/listPinsResponses[F] {
      def resp200(value: BoardsListPins200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object boards/update {
    import BoardsApiDelegate.boards/updateResponses

    object board_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "boards" / board_idVarr(board_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.boards/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BoardWithUpdatePrivacyUpdate] , board_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ PATCH -> Root / "boards" / board_idVarr(board_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.boards/update.handle_client_credentials(auth, req, req.asJsonDecode[BoardWithUpdatePrivacyUpdate] , board_id, ad_account_id, responses)

    }

    val responses: boards/updateResponses[F] = new boards/updateResponses[F] {
      def resp200(value: BoardWithUpdatePrivacy): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    boardSections/create.routepinterest_oauth2 <+>
    boardSections/delete.routepinterest_oauth2 <+>
    boardSections/list.routepinterest_oauth2 <+>
    boardSections/listPins.routepinterest_oauth2 <+>
    boardSections/update.routepinterest_oauth2 <+>
    boards/create.routepinterest_oauth2 <+>
    boards/delete.routepinterest_oauth2 <+>
    boards/get.routepinterest_oauth2 <+>
    boards/list.routepinterest_oauth2 <+>
    boards/listPins.routepinterest_oauth2 <+>
    boards/update.routepinterest_oauth2
  val routesclient_credentials =
    boardSections/list.routeclient_credentials <+>
    boardSections/listPins.routeclient_credentials <+>
    boards/create.routeclient_credentials <+>
    boards/get.routeclient_credentials <+>
    boards/list.routeclient_credentials <+>
    boards/listPins.routeclient_credentials <+>
    boards/update.routeclient_credentials
}

object BoardsApiDelegate {
  trait boardSections/createResponses[F[_]] {
    def resp200(value: BoardSection): F[Response[F]]
    def resp201(value: BoardSection): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boardSections/deleteResponses[F[_]] {
    def resp200(value: BoardSection): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boardSections/listResponses[F[_]] {
    def resp200(value: BoardSectionsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boardSections/listPinsResponses[F[_]] {
    def resp200(value: BoardSectionsListPins200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boardSections/updateResponses[F[_]] {
    def resp200(value: BoardSection): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boards/createResponses[F[_]] {
    def resp200(value: Board): F[Response[F]]
    def resp201(value: Board): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boards/deleteResponses[F[_]] {
    def resp200(value: Board): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boards/getResponses[F[_]] {
    def resp200(value: Board): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boards/listResponses[F[_]] {
    def resp200(value: BoardsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boards/listPinsResponses[F[_]] {
    def resp200(value: BoardsListPins200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait boards/updateResponses[F[_]] {
    def resp200(value: BoardWithUpdatePrivacy): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait BoardsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait boardSections/create {
    import BoardsApiDelegate.boardSections/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boardSections/create: F[BoardSectionCreate],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boardSections/createResponses[F]
    ): F[Response[F]]


  }
  def boardSections/create: boardSections/create


  trait boardSections/delete {
    import BoardsApiDelegate.boardSections/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      sectionId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boardSections/deleteResponses[F]
    ): F[Response[F]]

  }
  def boardSections/delete: boardSections/delete


  trait boardSections/list {
    import BoardsApiDelegate.boardSections/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boardSections/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boardSections/listResponses[F]
    ): F[Response[F]]

  }
  def boardSections/list: boardSections/list


  trait boardSections/listPins {
    import BoardsApiDelegate.boardSections/listPinsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      sectionId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boardSections/listPinsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      sectionId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boardSections/listPinsResponses[F]
    ): F[Response[F]]

  }
  def boardSections/listPins: boardSections/listPins


  trait boardSections/update {
    import BoardsApiDelegate.boardSections/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boardSections/update: F[BoardSectionUpdateWithRequiredBody],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      sectionId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boardSections/updateResponses[F]
    ): F[Response[F]]


  }
  def boardSections/update: boardSections/update


  trait boards/create {
    import BoardsApiDelegate.boards/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boards/create: F[BoardCreate],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boards/createResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      boards/create: F[BoardCreate],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boards/createResponses[F]
    ): F[Response[F]]


  }
  def boards/create: boards/create


  trait boards/delete {
    import BoardsApiDelegate.boards/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boards/deleteResponses[F]
    ): F[Response[F]]

  }
  def boards/delete: boards/delete


  trait boards/get {
    import BoardsApiDelegate.boards/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boards/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boards/getResponses[F]
    ): F[Response[F]]

  }
  def boards/get: boards/get


  trait boards/list {
    import BoardsApiDelegate.boards/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      privacy: Option[BoardPrivacyFilter],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boards/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      privacy: Option[BoardPrivacyFilter],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boards/listResponses[F]
    ): F[Response[F]]

  }
  def boards/list: boards/list


  trait boards/listPins {
    import BoardsApiDelegate.boards/listPinsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      creativeTypes: Option[List[CreativeType]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      pinMetrics: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boards/listPinsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      creativeTypes: Option[List[CreativeType]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      pinMetrics: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: boards/listPinsResponses[F]
    ): F[Response[F]]

  }
  def boards/listPins: boards/listPins


  trait boards/update {
    import BoardsApiDelegate.boards/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      boards/update: F[BoardWithUpdatePrivacyUpdate],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boards/updateResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      boards/update: F[BoardWithUpdatePrivacyUpdate],
      boardId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: boards/updateResponses[F]
    ): F[Response[F]]


  }
  def boards/update: boards/update

}