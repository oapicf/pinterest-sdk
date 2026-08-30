package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AuthRespondInvitesBody
import org.openapitools.models.CancelInvitesRequest
import org.openapitools.models.CancelInvitesResponse
import org.openapitools.models.CreateAssetAccessRequestBody
import org.openapitools.models.CreateAssetAccessRequestResponse
import org.openapitools.models.CreateAssetInvitesRequest
import org.openapitools.models.CreateInvitesResultsResponseArray
import org.openapitools.models.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.models.GetInvites200Response
import org.openapitools.models.InviteFilterStatus
import org.openapitools.models.InviteType
import org.openapitools.models.PinterestLibError
import org.openapitools.models.RespondToInvitesResponseArray
import org.openapitools.models.UpdateInvitesResultsResponseArray

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

final case class BusinessAccessInviteApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: BusinessAccessInviteApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object assetAccessRequests/create {
    import BusinessAccessInviteApiDelegate.assetAccessRequests/createResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "businesses" / business_idVarr(business_id) / "requests" / "assets" / "access") as auth =>
          delegate.assetAccessRequests/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CreateAssetAccessRequestBody] , business_id, responses)

    }

    val responses: assetAccessRequests/createResponses[F] = new assetAccessRequests/createResponses[F] {
      def resp200(value: CreateAssetAccessRequestResponse): F[Response[F]] = Ok(value)
      def resp201(value: CreateAssetAccessRequestResponse): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object cancelInvitesOrRequests {
    import BusinessAccessInviteApiDelegate.cancelInvitesOrRequestsResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "businesses" / business_idVarr(business_id) / "invites") as auth =>
          delegate.cancelInvitesOrRequests.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CancelInvitesRequest] , business_id, responses)

    }

    val responses: cancelInvitesOrRequestsResponses[F] = new cancelInvitesOrRequestsResponses[F] {
      def resp200(value: CancelInvitesResponse): F[Response[F]] = Ok(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object createAssetInvites {
    import BusinessAccessInviteApiDelegate.createAssetInvitesResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "businesses" / business_idVarr(business_id) / "invites" / "assets" / "access") as auth =>
          delegate.createAssetInvites.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CreateAssetInvitesRequest] , business_id, responses)

    }

    val responses: createAssetInvitesResponses[F] = new createAssetInvitesResponses[F] {
      def resp200(value: UpdateInvitesResultsResponseArray): F[Response[F]] = Ok(value)
      def resp201(value: UpdateInvitesResultsResponseArray): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object createMembershipOrPartnershipInvites {
    import BusinessAccessInviteApiDelegate.createMembershipOrPartnershipInvitesResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "businesses" / business_idVarr(business_id) / "invites") as auth =>
          delegate.createMembershipOrPartnershipInvites.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CreateMembershipOrPartnershipInvitesBody] , business_id, responses)

    }

    val responses: createMembershipOrPartnershipInvitesResponses[F] = new createMembershipOrPartnershipInvitesResponses[F] {
      def resp200(value: CreateInvitesResultsResponseArray): F[Response[F]] = Ok(value)
      def resp201(value: CreateInvitesResultsResponseArray): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object get/invites {
    import BusinessAccessInviteApiDelegate.get/invitesResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MatchesRegex["^\\d+$"]]
    object is_memberQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("is_member")
    object invite_statusQueryParam extends OptionalQuerySeqParamDecoderMatcher[InviteFilterStatus]("invite_status")
    object invite_typeQueryParam extends OptionalQueryParamDecoderMatcher[InviteType]("invite_type")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "invites" :? is_memberQueryParam(is_member) +& invite_statusQueryParam(invite_status) +& invite_typeQueryParam(invite_type) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.get/invites.handle_pinterest_oauth2(auth, req, business_id, is_member, invite_status, invite_type, bookmark, page_size, responses)

    }

    val responses: get/invitesResponses[F] = new get/invitesResponses[F] {
      def resp200(value: GetInvites200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object respondBusinessAccessInvites {
    import BusinessAccessInviteApiDelegate.respondBusinessAccessInvitesResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "businesses" / "invites") as auth =>
          delegate.respondBusinessAccessInvites.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AuthRespondInvitesBody] , responses)

    }

    val responses: respondBusinessAccessInvitesResponses[F] = new respondBusinessAccessInvitesResponses[F] {
      def resp200(value: RespondToInvitesResponseArray): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    assetAccessRequests/create.routepinterest_oauth2 <+>
    cancelInvitesOrRequests.routepinterest_oauth2 <+>
    createAssetInvites.routepinterest_oauth2 <+>
    createMembershipOrPartnershipInvites.routepinterest_oauth2 <+>
    get/invites.routepinterest_oauth2 <+>
    respondBusinessAccessInvites.routepinterest_oauth2
}

object BusinessAccessInviteApiDelegate {
  trait assetAccessRequests/createResponses[F[_]] {
    def resp200(value: CreateAssetAccessRequestResponse): F[Response[F]]
    def resp201(value: CreateAssetAccessRequestResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait cancelInvitesOrRequestsResponses[F[_]] {
    def resp200(value: CancelInvitesResponse): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait createAssetInvitesResponses[F[_]] {
    def resp200(value: UpdateInvitesResultsResponseArray): F[Response[F]]
    def resp201(value: UpdateInvitesResultsResponseArray): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait createMembershipOrPartnershipInvitesResponses[F[_]] {
    def resp200(value: CreateInvitesResultsResponseArray): F[Response[F]]
    def resp201(value: CreateInvitesResultsResponseArray): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait get/invitesResponses[F[_]] {
    def resp200(value: GetInvites200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait respondBusinessAccessInvitesResponses[F[_]] {
    def resp200(value: RespondToInvitesResponseArray): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait BusinessAccessInviteApiDelegate[F[_], pinterest_oauth2] {

  trait assetAccessRequests/create {
    import BusinessAccessInviteApiDelegate.assetAccessRequests/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      assetAccessRequests/create: F[CreateAssetAccessRequestBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: assetAccessRequests/createResponses[F]
    ): F[Response[F]]


  }
  def assetAccessRequests/create: assetAccessRequests/create


  trait cancelInvitesOrRequests {
    import BusinessAccessInviteApiDelegate.cancelInvitesOrRequestsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      cancelInvitesOrRequests: F[CancelInvitesRequest],
      businessId: Refined[String, MinSize[1] And MatchesRegex["^\\d+$"]],
      responses: cancelInvitesOrRequestsResponses[F]
    ): F[Response[F]]


  }
  def cancelInvitesOrRequests: cancelInvitesOrRequests


  trait createAssetInvites {
    import BusinessAccessInviteApiDelegate.createAssetInvitesResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      createAssetInvites: F[CreateAssetInvitesRequest],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: createAssetInvitesResponses[F]
    ): F[Response[F]]


  }
  def createAssetInvites: createAssetInvites


  trait createMembershipOrPartnershipInvites {
    import BusinessAccessInviteApiDelegate.createMembershipOrPartnershipInvitesResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      createMembershipOrPartnershipInvites: F[CreateMembershipOrPartnershipInvitesBody],
      businessId: Refined[String, MinSize[1] And MatchesRegex["^\\d+$"]],
      responses: createMembershipOrPartnershipInvitesResponses[F]
    ): F[Response[F]]


  }
  def createMembershipOrPartnershipInvites: createMembershipOrPartnershipInvites


  trait get/invites {
    import BusinessAccessInviteApiDelegate.get/invitesResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MatchesRegex["^\\d+$"]],
      isMember: Option[Boolean],
      inviteStatus: Option[List[InviteFilterStatus]],
      inviteType: Option[InviteType],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: get/invitesResponses[F]
    ): F[Response[F]]

  }
  def get/invites: get/invites


  trait respondBusinessAccessInvites {
    import BusinessAccessInviteApiDelegate.respondBusinessAccessInvitesResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      respondBusinessAccessInvites: F[AuthRespondInvitesBody],
      responses: respondBusinessAccessInvitesResponses[F]
    ): F[Response[F]]


  }
  def respondBusinessAccessInvites: respondBusinessAccessInvites

}