# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.auth_respond_invites_body import AuthRespondInvitesBody
from openapi_server.models.cancel_invites_request import CancelInvitesRequest
from openapi_server.models.cancel_invites_response import CancelInvitesResponse
from openapi_server.models.create_asset_access_request_body import CreateAssetAccessRequestBody
from openapi_server.models.create_asset_access_request_response import CreateAssetAccessRequestResponse
from openapi_server.models.create_asset_invites_request import CreateAssetInvitesRequest
from openapi_server.models.create_invites_results_response_array import CreateInvitesResultsResponseArray
from openapi_server.models.create_membership_or_partnership_invites_body import CreateMembershipOrPartnershipInvitesBody
from openapi_server.models.get_invites200_response import GetInvites200Response
from openapi_server.models.invite_filter_status import InviteFilterStatus
from openapi_server.models.invite_type import InviteType
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.respond_to_invites_response_array import RespondToInvitesResponseArray
from openapi_server.models.update_invites_results_response_array import UpdateInvitesResultsResponseArray
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseBusinessAccessInviteApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBusinessAccessInviteApi.subclasses = BaseBusinessAccessInviteApi.subclasses + (cls,)
    async def respond_business_access_invites(
        self,
        auth_respond_invites_body: AuthRespondInvitesBody,
    ) -> RespondToInvitesResponseArray:
        """Accept or decline invites or requests."""
        ...


    async def get_invites(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, description="Unique identifier of the requesting business.")],
        is_member: Annotated[Optional[StrictBool], Field(description="A boolean field to indicate whether the invite is to create a partnership or a membership.")],
        invite_status: Annotated[Optional[Annotated[List[InviteFilterStatus], Field(min_length=1)]], Field(description="A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.")],
        invite_type: Annotated[Optional[InviteType], Field(description="Invite type to filter invites by. Only invites of the specified type will be returned.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> GetInvites200Response:
        """Get the membership/partnership invites and/or requests for the authorized user."""
        ...


    async def create_membership_or_partnership_invites(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, description="Unique identifier of the requesting business.")],
        create_membership_or_partnership_invites_body: CreateMembershipOrPartnershipInvitesBody,
    ) -> CreateInvitesResultsResponseArray:
        """Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners"""
        ...


    async def cancel_invites_or_requests(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, description="Unique identifier of the requesting business.")],
        cancel_invites_request: CancelInvitesRequest,
    ) -> CancelInvitesResponse:
        """Cancel membership/partnership invites and/or requests."""
        ...


    async def create_asset_invites(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        create_asset_invites_request: CreateAssetInvitesRequest,
    ) -> UpdateInvitesResultsResponseArray:
        """Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview."""
        ...


    async def asset_access_requests_create(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        create_asset_access_request_body: CreateAssetAccessRequestBody,
    ) -> CreateAssetAccessRequestResponse:
        """Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles."""
        ...
