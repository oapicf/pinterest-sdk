package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.BrandAccount
import org.openapitools.models.BrandAccountCreate
import org.openapitools.models.BrandAccountUpdate
import org.openapitools.models.BusinessMembershipMember
import org.openapitools.models.DeleteBusinessMembership200Response
import org.openapitools.models.DeleteBusinessMembershipBody
import org.openapitools.models.DeleteBusinessPartners
import org.openapitools.models.DeleteBusinessPartnersDelete
import org.openapitools.models.GetBusinessEmployers200Response
import org.openapitools.models.GetBusinessMembers200Response
import org.openapitools.models.GetBusinessPartners200Response
import org.openapitools.models.MemberBusinessRole
import org.openapitools.models.PartnerType
import org.openapitools.models.PinterestLibError
import org.openapitools.models.SystemUserUpdateWithRequiredBody
import org.openapitools.models.UpdateBusinessMembershipsResponse

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

final case class BusinessAccessRelationshipsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: BusinessAccessRelationshipsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object brandAccounts/create {
    import BusinessAccessRelationshipsApiDelegate.brandAccounts/createResponses

    object business_hierarchy_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "business_access" / "business_hierarchy" / business_hierarchy_idVarr(business_hierarchy_id) / "brand_accounts") as auth =>
          delegate.brandAccounts/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BrandAccountCreate] , business_hierarchy_id, responses)

    }

    val responses: brandAccounts/createResponses[F] = new brandAccounts/createResponses[F] {
      def resp200(value: BrandAccount): F[Response[F]] = Ok(value)
      def resp201(value: BrandAccount): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object brandAccounts/update {
    import BusinessAccessRelationshipsApiDelegate.brandAccounts/updateResponses

    object business_hierarchy_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "business_access" / "business_hierarchy" / brand_account_id / "brand_accounts" / business_hierarchy_idVarr(business_hierarchy_id)) as auth =>
          delegate.brandAccounts/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BrandAccountUpdate] , brand_account_id, business_hierarchy_id, responses)

    }

    val responses: brandAccounts/updateResponses[F] = new brandAccounts/updateResponses[F] {
      def resp200(value: BrandAccount): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp409(value: PinterestLibError): F[Response[F]] = Conflict(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object deleteBusinessMembership {
    import BusinessAccessRelationshipsApiDelegate.deleteBusinessMembershipResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "businesses" / business_idVarr(business_id) / "members") as auth =>
          delegate.deleteBusinessMembership.handle_pinterest_oauth2(auth, req, req.asJsonDecode[DeleteBusinessMembershipBody] , business_id, responses)

    }

    val responses: deleteBusinessMembershipResponses[F] = new deleteBusinessMembershipResponses[F] {
      def resp200(value: DeleteBusinessMembership200Response): F[Response[F]] = Ok(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object deleteBusinessPartners {
    import BusinessAccessRelationshipsApiDelegate.deleteBusinessPartnersResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "businesses" / business_idVarr(business_id) / "partners") as auth =>
          delegate.deleteBusinessPartners.handle_pinterest_oauth2(auth, req, req.asJsonDecode[DeleteBusinessPartnersDelete] , business_id, responses)

    }

    val responses: deleteBusinessPartnersResponses[F] = new deleteBusinessPartnersResponses[F] {
      def resp200(value: DeleteBusinessPartners): F[Response[F]] = Ok(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object get/businessEmployers {
    import BusinessAccessRelationshipsApiDelegate.get/businessEmployersResponses

    object assets_summaryQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("assets_summary")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / "employers" :? assets_summaryQueryParam(assets_summary) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.get/businessEmployers.handle_pinterest_oauth2(auth, req, assets_summary, bookmark, page_size, responses)

    }

    val responses: get/businessEmployersResponses[F] = new get/businessEmployersResponses[F] {
      def resp200(value: GetBusinessEmployers200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object get/businessMembers {
    import BusinessAccessRelationshipsApiDelegate.get/businessMembersResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object fetch_system_usersQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("fetch_system_users")
    object assets_summaryQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("assets_summary")
    object business_rolesQueryParam extends OptionalQuerySeqParamDecoderMatcher[MemberBusinessRole]("business_roles")
    object member_idsQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[500]]]("member_ids")
    object start_indexQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[0]]]("start_index")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "members" :? fetch_system_usersQueryParam(fetch_system_users) +& assets_summaryQueryParam(assets_summary) +& business_rolesQueryParam(business_roles) +& member_idsQueryParam(member_ids) +& start_indexQueryParam(start_index) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.get/businessMembers.handle_pinterest_oauth2(auth, req, business_id, fetch_system_users, assets_summary, business_roles, member_ids, start_index, bookmark, page_size, responses)

    }

    val responses: get/businessMembersResponses[F] = new get/businessMembersResponses[F] {
      def resp200(value: GetBusinessMembers200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object get/businessPartners {
    import BusinessAccessRelationshipsApiDelegate.get/businessPartnersResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object assets_summaryQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("assets_summary")
    object partner_typeQueryParam extends OptionalQueryParamDecoderMatcher[PartnerType]("partner_type")
    object partner_idsQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[500]]]("partner_ids")
    object start_indexQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[0]]]("start_index")
    object sort_ascendingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("sort_ascending")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "partners" :? assets_summaryQueryParam(assets_summary) +& partner_typeQueryParam(partner_type) +& partner_idsQueryParam(partner_ids) +& start_indexQueryParam(start_index) +& sort_ascendingQueryParam(sort_ascending) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.get/businessPartners.handle_pinterest_oauth2(auth, req, business_id, assets_summary, partner_type, partner_ids, start_index, sort_ascending, bookmark, page_size, responses)

    }

    val responses: get/businessPartnersResponses[F] = new get/businessPartnersResponses[F] {
      def resp200(value: GetBusinessPartners200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object systemUser/update {
    import BusinessAccessRelationshipsApiDelegate.systemUser/updateResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object system_user_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "businesses" / business_idVarr(business_id) / "system_users" / system_user_idVarr(system_user_id)) as auth =>
          delegate.systemUser/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[SystemUserUpdateWithRequiredBody] , business_id, system_user_id, responses)

    }

    val responses: systemUser/updateResponses[F] = new systemUser/updateResponses[F] {
      def resp200(): F[Response[F]] = Ok()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object update/businessMemberships {
    import BusinessAccessRelationshipsApiDelegate.update/businessMembershipsResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "businesses" / business_idVarr(business_id) / "members") as auth =>
          delegate.update/businessMemberships.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[BusinessMembershipMember]] , business_id, responses)

    }

    val responses: update/businessMembershipsResponses[F] = new update/businessMembershipsResponses[F] {
      def resp200(value: UpdateBusinessMembershipsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    brandAccounts/create.routepinterest_oauth2 <+>
    brandAccounts/update.routepinterest_oauth2 <+>
    deleteBusinessMembership.routepinterest_oauth2 <+>
    deleteBusinessPartners.routepinterest_oauth2 <+>
    get/businessEmployers.routepinterest_oauth2 <+>
    get/businessMembers.routepinterest_oauth2 <+>
    get/businessPartners.routepinterest_oauth2 <+>
    systemUser/update.routepinterest_oauth2 <+>
    update/businessMemberships.routepinterest_oauth2
}

object BusinessAccessRelationshipsApiDelegate {
  trait brandAccounts/createResponses[F[_]] {
    def resp200(value: BrandAccount): F[Response[F]]
    def resp201(value: BrandAccount): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait brandAccounts/updateResponses[F[_]] {
    def resp200(value: BrandAccount): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp409(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait deleteBusinessMembershipResponses[F[_]] {
    def resp200(value: DeleteBusinessMembership200Response): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait deleteBusinessPartnersResponses[F[_]] {
    def resp200(value: DeleteBusinessPartners): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait get/businessEmployersResponses[F[_]] {
    def resp200(value: GetBusinessEmployers200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait get/businessMembersResponses[F[_]] {
    def resp200(value: GetBusinessMembers200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait get/businessPartnersResponses[F[_]] {
    def resp200(value: GetBusinessPartners200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait systemUser/updateResponses[F[_]] {
    def resp200(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait update/businessMembershipsResponses[F[_]] {
    def resp200(value: UpdateBusinessMembershipsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait BusinessAccessRelationshipsApiDelegate[F[_], pinterest_oauth2] {

  trait brandAccounts/create {
    import BusinessAccessRelationshipsApiDelegate.brandAccounts/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      brandAccounts/create: F[BrandAccountCreate],
      businessHierarchyId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: brandAccounts/createResponses[F]
    ): F[Response[F]]


  }
  def brandAccounts/create: brandAccounts/create


  trait brandAccounts/update {
    import BusinessAccessRelationshipsApiDelegate.brandAccounts/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      brandAccounts/update: F[BrandAccountUpdate],
      brandAccountId: String,
      businessHierarchyId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: brandAccounts/updateResponses[F]
    ): F[Response[F]]


  }
  def brandAccounts/update: brandAccounts/update


  trait deleteBusinessMembership {
    import BusinessAccessRelationshipsApiDelegate.deleteBusinessMembershipResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      deleteBusinessMembership: F[DeleteBusinessMembershipBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: deleteBusinessMembershipResponses[F]
    ): F[Response[F]]


  }
  def deleteBusinessMembership: deleteBusinessMembership


  trait deleteBusinessPartners {
    import BusinessAccessRelationshipsApiDelegate.deleteBusinessPartnersResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      deleteBusinessPartners: F[DeleteBusinessPartnersDelete],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: deleteBusinessPartnersResponses[F]
    ): F[Response[F]]


  }
  def deleteBusinessPartners: deleteBusinessPartners


  trait get/businessEmployers {
    import BusinessAccessRelationshipsApiDelegate.get/businessEmployersResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      assetsSummary: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: get/businessEmployersResponses[F]
    ): F[Response[F]]

  }
  def get/businessEmployers: get/businessEmployers


  trait get/businessMembers {
    import BusinessAccessRelationshipsApiDelegate.get/businessMembersResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      fetchSystemUsers: Option[Boolean],
      assetsSummary: Option[Boolean],
      businessRoles: Option[List[MemberBusinessRole]],
      memberIds: Option[Refined[String, MaxSize[500]]],
      startIndex: Option[Refined[Int, GreaterEqual[0]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: get/businessMembersResponses[F]
    ): F[Response[F]]

  }
  def get/businessMembers: get/businessMembers


  trait get/businessPartners {
    import BusinessAccessRelationshipsApiDelegate.get/businessPartnersResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      assetsSummary: Option[Boolean],
      partnerType: Option[PartnerType],
      partnerIds: Option[Refined[String, MaxSize[500]]],
      startIndex: Option[Refined[Int, GreaterEqual[0]]],
      sortAscending: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: get/businessPartnersResponses[F]
    ): F[Response[F]]

  }
  def get/businessPartners: get/businessPartners


  trait systemUser/update {
    import BusinessAccessRelationshipsApiDelegate.systemUser/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      systemUser/update: F[SystemUserUpdateWithRequiredBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      systemUserId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: systemUser/updateResponses[F]
    ): F[Response[F]]


  }
  def systemUser/update: systemUser/update


  trait update/businessMemberships {
    import BusinessAccessRelationshipsApiDelegate.update/businessMembershipsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      update/businessMemberships: F[List[BusinessMembershipMember]],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: update/businessMembershipsResponses[F]
    ): F[Response[F]]


  }
  def update/businessMemberships: update/businessMemberships

}