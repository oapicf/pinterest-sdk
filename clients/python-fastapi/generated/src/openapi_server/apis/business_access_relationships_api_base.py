# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.brand_account import BrandAccount
from openapi_server.models.brand_account_create import BrandAccountCreate
from openapi_server.models.brand_account_update import BrandAccountUpdate
from openapi_server.models.business_membership_member import BusinessMembershipMember
from openapi_server.models.delete_business_membership200_response import DeleteBusinessMembership200Response
from openapi_server.models.delete_business_membership_body import DeleteBusinessMembershipBody
from openapi_server.models.delete_business_partners import DeleteBusinessPartners
from openapi_server.models.delete_business_partners_delete import DeleteBusinessPartnersDelete
from openapi_server.models.get_business_employers200_response import GetBusinessEmployers200Response
from openapi_server.models.member_business_role import MemberBusinessRole
from openapi_server.models.partner_type import PartnerType
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.system_user_update_with_required_body import SystemUserUpdateWithRequiredBody
from openapi_server.models.update_business_memberships_response import UpdateBusinessMembershipsResponse
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseBusinessAccessRelationshipsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBusinessAccessRelationshipsApi.subclasses = BaseBusinessAccessRelationshipsApi.subclasses + (cls,)
    async def brand_accounts_create(
        self,
        business_hierarchy_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="business hierarchy node id")],
        brand_account_create: BrandAccountCreate,
    ) -> BrandAccount:
        """Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country."""
        ...


    async def brand_accounts_update(
        self,
        brand_account_id: StrictStr,
        business_hierarchy_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="business hierarchy node id")],
        brand_account_update: BrandAccountUpdate,
    ) -> BrandAccount:
        """Update an existing Brand Account"""
        ...


    async def get_business_employers(
        self,
        assets_summary: Annotated[Optional[StrictBool], Field(description="Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> GetBusinessEmployers200Response:
        """Get all of the viewing user&#39;s business employers."""
        ...


    async def get_business_members(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        fetch_system_users: Annotated[Optional[StrictBool], Field(description="Fetches system users if True. Fetches regular user employees if False.")],
        assets_summary: Annotated[Optional[StrictBool], Field(description="Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")],
        business_roles: Annotated[Optional[List[MemberBusinessRole]], Field(description="A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.")],
        member_ids: Annotated[Optional[Annotated[str, Field(strict=True, max_length=500)]], Field(description="A list of business members ids separated by comma.")],
        start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> GetBusinessEmployers200Response:
        """Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE"""
        ...


    async def delete_business_membership(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Business id")],
        delete_business_membership_body: DeleteBusinessMembershipBody,
    ) -> DeleteBusinessMembership200Response:
        """Terminate memberships between the specified members and your business."""
        ...


    async def update_business_memberships(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Business id")],
        business_membership_member: Annotated[List[BusinessMembershipMember], Field(min_length=1)],
    ) -> UpdateBusinessMembershipsResponse:
        """Update a member&#39;s business role within the business."""
        ...


    async def get_business_partners(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        assets_summary: Annotated[Optional[StrictBool], Field(description="Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")],
        partner_type: Annotated[Optional[PartnerType], Field(description="Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.")],
        partner_ids: Annotated[Optional[Annotated[str, Field(strict=True, max_length=500)]], Field(description="A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.")],
        start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")],
        sort_ascending: Annotated[Optional[StrictBool], Field(description="Sort ascending.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> GetBusinessEmployers200Response:
        """Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to."""
        ...


    async def delete_business_partners(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        delete_business_partners_delete: DeleteBusinessPartnersDelete,
    ) -> DeleteBusinessPartners:
        """Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type."""
        ...


    async def system_user_update(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        system_user_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a system user.")],
        system_user_update_with_required_body: SystemUserUpdateWithRequiredBody,
    ) -> None:
        """Update a system user information such as name."""
        ...
