# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.brand_accounts_create200_response import BrandAccountsCreate200Response
from openapi_server.models.brand_accounts_create_request import BrandAccountsCreateRequest
from openapi_server.models.brand_accounts_update_request import BrandAccountsUpdateRequest
from openapi_server.models.delete_partners_request import DeletePartnersRequest
from openapi_server.models.delete_partners_response import DeletePartnersResponse
from openapi_server.models.deleted_members_response import DeletedMembersResponse
from openapi_server.models.error import Error
from openapi_server.models.get_business_employers200_response import GetBusinessEmployers200Response
from openapi_server.models.get_business_members200_response import GetBusinessMembers200Response
from openapi_server.models.get_business_partners200_response import GetBusinessPartners200Response
from openapi_server.models.member_business_role import MemberBusinessRole
from openapi_server.models.members_to_delete_body import MembersToDeleteBody
from openapi_server.models.partner_type import PartnerType
from openapi_server.models.system_user_update_request import SystemUserUpdateRequest
from openapi_server.models.update_member_business_role_body import UpdateMemberBusinessRoleBody
from openapi_server.models.update_member_results_response_array import UpdateMemberResultsResponseArray
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseBusinessAccessRelationshipsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBusinessAccessRelationshipsApi.subclasses = BaseBusinessAccessRelationshipsApi.subclasses + (cls,)
    async def get_business_employers(
        self,
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> GetBusinessEmployers200Response:
        """Get all of the viewing user&#39;s business employers."""
        ...


    async def system_user_update(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        system_user_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a system user.")],
        system_user_update_request: SystemUserUpdateRequest,
    ) -> None:
        """Update a system user information such as name."""
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
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> GetBusinessMembers200Response:
        """Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE"""
        ...


    async def delete_business_membership(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Business id")],
        members_to_delete_body: Annotated[MembersToDeleteBody, Field(description="List of members with role to delete.")],
    ) -> DeletedMembersResponse:
        """Terminate memberships between the specified members and your business."""
        ...


    async def update_business_memberships(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Business id")],
        update_member_business_role_body: Annotated[List[UpdateMemberBusinessRoleBody], Field(min_length=1, description="List of objects with the member id and the business_role.")],
    ) -> UpdateMemberResultsResponseArray:
        """Update a member&#39;s business role within the business."""
        ...


    async def get_business_partners(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        assets_summary: Annotated[Optional[StrictBool], Field(description="Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")],
        partner_type: Annotated[Optional[PartnerType], Field(description="Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.")],
        partner_ids: Annotated[Optional[Annotated[str, Field(strict=True, max_length=500)]], Field(description="A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.")],
        start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> GetBusinessPartners200Response:
        """Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to."""
        ...


    async def delete_business_partners(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        delete_partners_request: Annotated[DeletePartnersRequest, Field(description="An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. ")],
    ) -> DeletePartnersResponse:
        """Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type."""
        ...


    async def brand_accounts_create(
        self,
        business_hierarchy_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="business hierarchy node id")],
        brand_accounts_create_request: BrandAccountsCreateRequest,
    ) -> BrandAccountsCreate200Response:
        """Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country."""
        ...


    async def brand_accounts_update(
        self,
        business_hierarchy_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="business hierarchy node id")],
        brand_account_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a brand account.")],
        brand_accounts_update_request: BrandAccountsUpdateRequest,
    ) -> BrandAccountsCreate200Response:
        """Update an existing Brand Account"""
        ...
