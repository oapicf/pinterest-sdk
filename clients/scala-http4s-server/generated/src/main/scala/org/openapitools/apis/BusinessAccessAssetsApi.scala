package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AssetGroupDeletion
import org.openapitools.models.AssetGroupDeletionDelete
import org.openapitools.models.AssetGroupInput
import org.openapitools.models.AssetGroupInputCreate
import org.openapitools.models.AssetGroupModification
import org.openapitools.models.AssetGroupModificationReadOrUpdate
import org.openapitools.models.AssetPermissionType
import org.openapitools.models.AssetSearchBy
import org.openapitools.models.AssetSortBy
import org.openapitools.models.BusinessAssetMembersGet200Response
import org.openapitools.models.BusinessAssetPartnersGet200Response
import org.openapitools.models.BusinessAssetsGet200Response
import org.openapitools.models.BusinessMemberAssetsGetResponse
import org.openapitools.models.BusinessMembersAssetAccessDeleteBody
import org.openapitools.models.BusinessPartnerAssetAccessGet200Response
import org.openapitools.models.DeleteMemberAccessResultsResponseArray
import org.openapitools.models.DeletePartnerAssetAccessBody
import org.openapitools.models.DeletePartnerAssetAccessResultsResponseArray
import org.openapitools.models.NonDraftEntityStatus
import org.openapitools.models.PermissionsWithOwner
import org.openapitools.models.PinterestLibError
import org.openapitools.models.UpdateMemberAssetAccessBody
import org.openapitools.models.UpdateMemberAssetsResultsResponseArray
import org.openapitools.models.UpdatePartnerAssetAccessBody
import org.openapitools.models.UpdatePartnerAssetsResultsResponseArray

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

final case class BusinessAccessAssetsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: BusinessAccessAssetsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object assetGroup/create {
    import BusinessAccessAssetsApiDelegate.assetGroup/createResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "businesses" / business_idVarr(business_id) / "asset_groups") as auth =>
          delegate.assetGroup/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AssetGroupInputCreate] , business_id, responses)

    }

    val responses: assetGroup/createResponses[F] = new assetGroup/createResponses[F] {
      def resp200(value: AssetGroupInput): F[Response[F]] = Ok(value)
      def resp201(value: AssetGroupInput): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object assetGroup/delete {
    import BusinessAccessAssetsApiDelegate.assetGroup/deleteResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "businesses" / business_idVarr(business_id) / "asset_groups") as auth =>
          delegate.assetGroup/delete.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AssetGroupDeletionDelete] , business_id, responses)

    }

    val responses: assetGroup/deleteResponses[F] = new assetGroup/deleteResponses[F] {
      def resp200(value: AssetGroupDeletion): F[Response[F]] = Ok(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object assetGroup/update {
    import BusinessAccessAssetsApiDelegate.assetGroup/updateResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "businesses" / business_idVarr(business_id) / "asset_groups") as auth =>
          delegate.assetGroup/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AssetGroupModificationReadOrUpdate] , business_id, responses)

    }

    val responses: assetGroup/updateResponses[F] = new assetGroup/updateResponses[F] {
      def resp200(value: AssetGroupModification): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object businessAssetMembers/get {
    import BusinessAccessAssetsApiDelegate.businessAssetMembers/getResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object asset_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object start_indexQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[0]]]("start_index")
    object fetch_system_usersQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("fetch_system_users")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "assets" / asset_idVarr(asset_id) / "members" :? start_indexQueryParam(start_index) +& fetch_system_usersQueryParam(fetch_system_users) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.businessAssetMembers/get.handle_pinterest_oauth2(auth, req, business_id, asset_id, start_index, fetch_system_users, bookmark, page_size, responses)

    }

    val responses: businessAssetMembers/getResponses[F] = new businessAssetMembers/getResponses[F] {
      def resp200(value: BusinessAssetMembersGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object businessAssetPartners/get {
    import BusinessAccessAssetsApiDelegate.businessAssetPartners/getResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object asset_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object start_indexQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[0]]]("start_index")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "assets" / asset_idVarr(asset_id) / "partners" :? start_indexQueryParam(start_index) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.businessAssetPartners/get.handle_pinterest_oauth2(auth, req, business_id, asset_id, start_index, bookmark, page_size, responses)

    }

    val responses: businessAssetPartners/getResponses[F] = new businessAssetPartners/getResponses[F] {
      def resp200(value: BusinessAssetPartnersGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object businessAssets/get {
    import BusinessAccessAssetsApiDelegate.businessAssets/getResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object permissionsQueryParam extends OptionalQuerySeqParamDecoderMatcher[PermissionsWithOwner]("permissions")
    object child_asset_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]]("child_asset_id")
    object asset_group_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]]("asset_group_id")
    object asset_typeQueryParam extends OptionalQueryParamDecoderMatcher[String]("asset_type")
    object start_indexQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[0]]]("start_index")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "assets" :? permissionsQueryParam(permissions) +& child_asset_idQueryParam(child_asset_id) +& asset_group_idQueryParam(asset_group_id) +& asset_typeQueryParam(asset_type) +& start_indexQueryParam(start_index) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.businessAssets/get.handle_pinterest_oauth2(auth, req, business_id, permissions, child_asset_id, asset_group_id, asset_type, start_index, bookmark, page_size, responses)

    }

    val responses: businessAssets/getResponses[F] = new businessAssets/getResponses[F] {
      def resp200(value: BusinessAssetsGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object businessMemberAssets/get {
    import BusinessAccessAssetsApiDelegate.businessMemberAssets/getResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object member_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object asset_typeQueryParam extends OptionalQueryParamDecoderMatcher[String]("asset_type")
    object start_indexQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[0]]]("start_index")
    object sort_byQueryParam extends OptionalQueryParamDecoderMatcher[AssetSortBy]("sort_by")
    object sort_ascendingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("sort_ascending")
    object search_byQueryParam extends OptionalQueryParamDecoderMatcher[AssetSearchBy]("search_by")
    object search_valueQueryParam extends OptionalQueryParamDecoderMatcher[String]("search_value")
    object asset_permission_typeQueryParam extends OptionalQueryParamDecoderMatcher[AssetPermissionType]("asset_permission_type")
    object ad_account_statusesQueryParam extends OptionalQuerySeqParamDecoderMatcher[NonDraftEntityStatus]("ad_account_statuses")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "members" / member_idVarr(member_id) / "assets" :? asset_typeQueryParam(asset_type) +& start_indexQueryParam(start_index) +& sort_byQueryParam(sort_by) +& sort_ascendingQueryParam(sort_ascending) +& search_byQueryParam(search_by) +& search_valueQueryParam(search_value) +& asset_permission_typeQueryParam(asset_permission_type) +& ad_account_statusesQueryParam(ad_account_statuses) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.businessMemberAssets/get.handle_pinterest_oauth2(auth, req, business_id, member_id, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, asset_permission_type, ad_account_statuses, bookmark, page_size, responses)

    }

    val responses: businessMemberAssets/getResponses[F] = new businessMemberAssets/getResponses[F] {
      def resp200(value: BusinessMemberAssetsGetResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object businessMembersAssetAccess/delete {
    import BusinessAccessAssetsApiDelegate.businessMembersAssetAccess/deleteResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "businesses" / business_idVarr(business_id) / "members" / "assets" / "access") as auth =>
          delegate.businessMembersAssetAccess/delete.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BusinessMembersAssetAccessDeleteBody] , business_id, responses)

    }

    val responses: businessMembersAssetAccess/deleteResponses[F] = new businessMembersAssetAccess/deleteResponses[F] {
      def resp200(value: DeleteMemberAccessResultsResponseArray): F[Response[F]] = Ok(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object businessMembersAssetAccess/update {
    import BusinessAccessAssetsApiDelegate.businessMembersAssetAccess/updateResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "businesses" / business_idVarr(business_id) / "members" / "assets" / "access") as auth =>
          delegate.businessMembersAssetAccess/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[UpdateMemberAssetAccessBody] , business_id, responses)

    }

    val responses: businessMembersAssetAccess/updateResponses[F] = new businessMembersAssetAccess/updateResponses[F] {
      def resp200(value: UpdateMemberAssetsResultsResponseArray): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object businessPartnerAssetAccess/get {
    import BusinessAccessAssetsApiDelegate.businessPartnerAssetAccess/getResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object partner_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object partner_typeQueryParam extends OptionalQueryParamDecoderMatcher[String]("partner_type")
    object asset_typeQueryParam extends OptionalQueryParamDecoderMatcher[String]("asset_type")
    object start_indexQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[0]]]("start_index")
    object sort_byQueryParam extends OptionalQueryParamDecoderMatcher[AssetSortBy]("sort_by")
    object sort_ascendingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("sort_ascending")
    object search_byQueryParam extends OptionalQueryParamDecoderMatcher[AssetSearchBy]("search_by")
    object search_valueQueryParam extends OptionalQueryParamDecoderMatcher[String]("search_value")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "partners" / partner_idVarr(partner_id) / "assets" :? partner_typeQueryParam(partner_type) +& asset_typeQueryParam(asset_type) +& start_indexQueryParam(start_index) +& sort_byQueryParam(sort_by) +& sort_ascendingQueryParam(sort_ascending) +& search_byQueryParam(search_by) +& search_valueQueryParam(search_value) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.businessPartnerAssetAccess/get.handle_pinterest_oauth2(auth, req, business_id, partner_id, partner_type, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, bookmark, page_size, responses)

    }

    val responses: businessPartnerAssetAccess/getResponses[F] = new businessPartnerAssetAccess/getResponses[F] {
      def resp200(value: BusinessPartnerAssetAccessGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object deletePartnerAssetAccessHandlerImpl {
    import BusinessAccessAssetsApiDelegate.deletePartnerAssetAccessHandlerImplResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "businesses" / business_idVarr(business_id) / "partners" / "assets") as auth =>
          delegate.deletePartnerAssetAccessHandlerImpl.handle_pinterest_oauth2(auth, req, req.asJsonDecode[DeletePartnerAssetAccessBody] , business_id, responses)

    }

    val responses: deletePartnerAssetAccessHandlerImplResponses[F] = new deletePartnerAssetAccessHandlerImplResponses[F] {
      def resp200(value: DeletePartnerAssetAccessResultsResponseArray): F[Response[F]] = Ok(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object updatePartnerAssetAccessHandlerImpl {
    import BusinessAccessAssetsApiDelegate.updatePartnerAssetAccessHandlerImplResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "businesses" / business_idVarr(business_id) / "partners" / "assets") as auth =>
          delegate.updatePartnerAssetAccessHandlerImpl.handle_pinterest_oauth2(auth, req, req.asJsonDecode[UpdatePartnerAssetAccessBody] , business_id, responses)

    }

    val responses: updatePartnerAssetAccessHandlerImplResponses[F] = new updatePartnerAssetAccessHandlerImplResponses[F] {
      def resp200(value: UpdatePartnerAssetsResultsResponseArray): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    assetGroup/create.routepinterest_oauth2 <+>
    assetGroup/delete.routepinterest_oauth2 <+>
    assetGroup/update.routepinterest_oauth2 <+>
    businessAssetMembers/get.routepinterest_oauth2 <+>
    businessAssetPartners/get.routepinterest_oauth2 <+>
    businessAssets/get.routepinterest_oauth2 <+>
    businessMemberAssets/get.routepinterest_oauth2 <+>
    businessMembersAssetAccess/delete.routepinterest_oauth2 <+>
    businessMembersAssetAccess/update.routepinterest_oauth2 <+>
    businessPartnerAssetAccess/get.routepinterest_oauth2 <+>
    deletePartnerAssetAccessHandlerImpl.routepinterest_oauth2 <+>
    updatePartnerAssetAccessHandlerImpl.routepinterest_oauth2
}

object BusinessAccessAssetsApiDelegate {
  trait assetGroup/createResponses[F[_]] {
    def resp200(value: AssetGroupInput): F[Response[F]]
    def resp201(value: AssetGroupInput): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait assetGroup/deleteResponses[F[_]] {
    def resp200(value: AssetGroupDeletion): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait assetGroup/updateResponses[F[_]] {
    def resp200(value: AssetGroupModification): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait businessAssetMembers/getResponses[F[_]] {
    def resp200(value: BusinessAssetMembersGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait businessAssetPartners/getResponses[F[_]] {
    def resp200(value: BusinessAssetPartnersGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait businessAssets/getResponses[F[_]] {
    def resp200(value: BusinessAssetsGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait businessMemberAssets/getResponses[F[_]] {
    def resp200(value: BusinessMemberAssetsGetResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait businessMembersAssetAccess/deleteResponses[F[_]] {
    def resp200(value: DeleteMemberAccessResultsResponseArray): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait businessMembersAssetAccess/updateResponses[F[_]] {
    def resp200(value: UpdateMemberAssetsResultsResponseArray): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait businessPartnerAssetAccess/getResponses[F[_]] {
    def resp200(value: BusinessPartnerAssetAccessGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait deletePartnerAssetAccessHandlerImplResponses[F[_]] {
    def resp200(value: DeletePartnerAssetAccessResultsResponseArray): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait updatePartnerAssetAccessHandlerImplResponses[F[_]] {
    def resp200(value: UpdatePartnerAssetsResultsResponseArray): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait BusinessAccessAssetsApiDelegate[F[_], pinterest_oauth2] {

  trait assetGroup/create {
    import BusinessAccessAssetsApiDelegate.assetGroup/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      assetGroup/create: F[AssetGroupInputCreate],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: assetGroup/createResponses[F]
    ): F[Response[F]]


  }
  def assetGroup/create: assetGroup/create


  trait assetGroup/delete {
    import BusinessAccessAssetsApiDelegate.assetGroup/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      assetGroup/delete: F[AssetGroupDeletionDelete],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: assetGroup/deleteResponses[F]
    ): F[Response[F]]


  }
  def assetGroup/delete: assetGroup/delete


  trait assetGroup/update {
    import BusinessAccessAssetsApiDelegate.assetGroup/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      assetGroup/update: F[AssetGroupModificationReadOrUpdate],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: assetGroup/updateResponses[F]
    ): F[Response[F]]


  }
  def assetGroup/update: assetGroup/update


  trait businessAssetMembers/get {
    import BusinessAccessAssetsApiDelegate.businessAssetMembers/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      assetId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      startIndex: Option[Refined[Int, GreaterEqual[0]]],
      fetchSystemUsers: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: businessAssetMembers/getResponses[F]
    ): F[Response[F]]

  }
  def businessAssetMembers/get: businessAssetMembers/get


  trait businessAssetPartners/get {
    import BusinessAccessAssetsApiDelegate.businessAssetPartners/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      assetId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      startIndex: Option[Refined[Int, GreaterEqual[0]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: businessAssetPartners/getResponses[F]
    ): F[Response[F]]

  }
  def businessAssetPartners/get: businessAssetPartners/get


  trait businessAssets/get {
    import BusinessAccessAssetsApiDelegate.businessAssets/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      permissions: Option[List[PermissionsWithOwner]],
      childAssetId: Option[Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]],
      assetGroupId: Option[Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]],
      assetType: Option[String],
      startIndex: Option[Refined[Int, GreaterEqual[0]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: businessAssets/getResponses[F]
    ): F[Response[F]]

  }
  def businessAssets/get: businessAssets/get


  trait businessMemberAssets/get {
    import BusinessAccessAssetsApiDelegate.businessMemberAssets/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      memberId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      assetType: Option[String],
      startIndex: Option[Refined[Int, GreaterEqual[0]]],
      sortBy: Option[AssetSortBy],
      sortAscending: Option[Boolean],
      searchBy: Option[AssetSearchBy],
      searchValue: Option[String],
      assetPermissionType: Option[AssetPermissionType],
      adAccountStatuses: Option[List[NonDraftEntityStatus]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: businessMemberAssets/getResponses[F]
    ): F[Response[F]]

  }
  def businessMemberAssets/get: businessMemberAssets/get


  trait businessMembersAssetAccess/delete {
    import BusinessAccessAssetsApiDelegate.businessMembersAssetAccess/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessMembersAssetAccess/delete: F[BusinessMembersAssetAccessDeleteBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: businessMembersAssetAccess/deleteResponses[F]
    ): F[Response[F]]


  }
  def businessMembersAssetAccess/delete: businessMembersAssetAccess/delete


  trait businessMembersAssetAccess/update {
    import BusinessAccessAssetsApiDelegate.businessMembersAssetAccess/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessMembersAssetAccess/update: F[UpdateMemberAssetAccessBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: businessMembersAssetAccess/updateResponses[F]
    ): F[Response[F]]


  }
  def businessMembersAssetAccess/update: businessMembersAssetAccess/update


  trait businessPartnerAssetAccess/get {
    import BusinessAccessAssetsApiDelegate.businessPartnerAssetAccess/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      partnerId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      partnerType: Option[String],
      assetType: Option[String],
      startIndex: Option[Refined[Int, GreaterEqual[0]]],
      sortBy: Option[AssetSortBy],
      sortAscending: Option[Boolean],
      searchBy: Option[AssetSearchBy],
      searchValue: Option[String],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: businessPartnerAssetAccess/getResponses[F]
    ): F[Response[F]]

  }
  def businessPartnerAssetAccess/get: businessPartnerAssetAccess/get


  trait deletePartnerAssetAccessHandlerImpl {
    import BusinessAccessAssetsApiDelegate.deletePartnerAssetAccessHandlerImplResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      deletePartnerAssetAccessHandlerImpl: F[DeletePartnerAssetAccessBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: deletePartnerAssetAccessHandlerImplResponses[F]
    ): F[Response[F]]


  }
  def deletePartnerAssetAccessHandlerImpl: deletePartnerAssetAccessHandlerImpl


  trait updatePartnerAssetAccessHandlerImpl {
    import BusinessAccessAssetsApiDelegate.updatePartnerAssetAccessHandlerImplResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      updatePartnerAssetAccessHandlerImpl: F[UpdatePartnerAssetAccessBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: updatePartnerAssetAccessHandlerImplResponses[F]
    ): F[Response[F]]


  }
  def updatePartnerAssetAccessHandlerImpl: updatePartnerAssetAccessHandlerImpl

}