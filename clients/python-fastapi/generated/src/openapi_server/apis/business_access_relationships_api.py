# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.business_access_relationships_api_base import BaseBusinessAccessRelationshipsApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
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

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts",
    responses={
        200: {"model": BrandAccount, "description": "The request has succeeded."},
        201: {"model": BrandAccount, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="Create a Brand Account",
    response_model_by_alias=True,
)
async def brand_accounts_create(
    business_hierarchy_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="business hierarchy node id")] = Path(..., description="business hierarchy node id", regex=r"^\d+$", min_length=1, max_length=20),
    brand_account_create: BrandAccountCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> BrandAccount:
    """Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country."""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().brand_accounts_create(business_hierarchy_id, brand_account_create)


@router.patch(
    "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}",
    responses={
        200: {"model": BrandAccount, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        409: {"model": PinterestLibError, "description": "The request could not be processed because of a conflict in the current state of the resource."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="Update a Brand Account",
    response_model_by_alias=True,
)
async def brand_accounts_update(
    brand_account_id: StrictStr = Path(..., description=""),
    business_hierarchy_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="business hierarchy node id")] = Path(..., description="business hierarchy node id", regex=r"^\d+$", min_length=1, max_length=20),
    brand_account_update: BrandAccountUpdate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> BrandAccount:
    """Update an existing Brand Account"""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().brand_accounts_update(brand_account_id, business_hierarchy_id, brand_account_update)


@router.get(
    "/businesses/employers",
    responses={
        200: {"model": GetBusinessEmployers200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="List business employers for user",
    response_model_by_alias=True,
)
async def get_business_employers(
    assets_summary: Annotated[Optional[StrictBool], Field(description="Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")] = Query(True, description="Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", alias="assets_summary"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> GetBusinessEmployers200Response:
    """Get all of the viewing user&#39;s business employers."""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().get_business_employers(assets_summary, bookmark, page_size)


@router.get(
    "/businesses/{business_id}/members",
    responses={
        200: {"model": GetBusinessEmployers200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="Get business members",
    response_model_by_alias=True,
)
async def get_business_members(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    fetch_system_users: Annotated[Optional[StrictBool], Field(description="Fetches system users if True. Fetches regular user employees if False.")] = Query(False, description="Fetches system users if True. Fetches regular user employees if False.", alias="fetch_system_users"),
    assets_summary: Annotated[Optional[StrictBool], Field(description="Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")] = Query(False, description="Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", alias="assets_summary"),
    business_roles: Annotated[Optional[List[MemberBusinessRole]], Field(description="A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.")] = Query(None, description="A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.", alias="business_roles"),
    member_ids: Annotated[Optional[Annotated[str, Field(strict=True, max_length=500)]], Field(description="A list of business members ids separated by comma.")] = Query(None, description="A list of business members ids separated by comma.", alias="member_ids", max_length=500),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> GetBusinessEmployers200Response:
    """Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE"""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().get_business_members(business_id, fetch_system_users, assets_summary, business_roles, member_ids, start_index, bookmark, page_size)


@router.delete(
    "/businesses/{business_id}/members",
    responses={
        200: {"model": DeleteBusinessMembership200Response, "description": "The request has succeeded."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="Terminate business memberships",
    response_model_by_alias=True,
)
async def delete_business_membership(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Business id")] = Path(..., description="Business id", regex=r"^\d+$", min_length=1, max_length=20),
    delete_business_membership_body: DeleteBusinessMembershipBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> DeleteBusinessMembership200Response:
    """Terminate memberships between the specified members and your business."""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().delete_business_membership(business_id, delete_business_membership_body)


@router.patch(
    "/businesses/{business_id}/members",
    responses={
        200: {"model": UpdateBusinessMembershipsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="Update member&#39;s business role",
    response_model_by_alias=True,
)
async def update_business_memberships(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Business id")] = Path(..., description="Business id", regex=r"^\d+$", min_length=1, max_length=20),
    business_membership_member: Annotated[List[BusinessMembershipMember], Field(min_length=1)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> UpdateBusinessMembershipsResponse:
    """Update a member&#39;s business role within the business."""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().update_business_memberships(business_id, business_membership_member)


@router.get(
    "/businesses/{business_id}/partners",
    responses={
        200: {"model": GetBusinessEmployers200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="Get business partners",
    response_model_by_alias=True,
)
async def get_business_partners(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    assets_summary: Annotated[Optional[StrictBool], Field(description="Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")] = Query(False, description="Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", alias="assets_summary"),
    partner_type: Annotated[Optional[PartnerType], Field(description="Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.")] = Query(None, description="Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.", alias="partner_type"),
    partner_ids: Annotated[Optional[Annotated[str, Field(strict=True, max_length=500)]], Field(description="A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.")] = Query(None, description="A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.", alias="partner_ids", max_length=500),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    sort_ascending: Annotated[Optional[StrictBool], Field(description="Sort ascending.")] = Query(None, description="Sort ascending.", alias="sort_ascending"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> GetBusinessEmployers200Response:
    """Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to."""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().get_business_partners(business_id, assets_summary, partner_type, partner_ids, start_index, sort_ascending, bookmark, page_size)


@router.delete(
    "/businesses/{business_id}/partners",
    responses={
        200: {"model": DeleteBusinessPartners, "description": "The request has succeeded."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="Terminate business partnerships",
    response_model_by_alias=True,
)
async def delete_business_partners(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    delete_business_partners_delete: DeleteBusinessPartnersDelete = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> DeleteBusinessPartners:
    """Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type."""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().delete_business_partners(business_id, delete_business_partners_delete)


@router.patch(
    "/businesses/{business_id}/system_users/{system_user_id}",
    responses={
        200: {"description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_relationships"],
    summary="Update a system user information.",
    response_model_by_alias=True,
)
async def system_user_update(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    system_user_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a system user.")] = Path(..., description="Unique identifier of a system user.", regex=r"^\d+$", min_length=1, max_length=20),
    system_user_update_with_required_body: SystemUserUpdateWithRequiredBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> None:
    """Update a system user information such as name."""
    if not BaseBusinessAccessRelationshipsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessRelationshipsApi.subclasses[0]().system_user_update(business_id, system_user_id, system_user_update_with_required_body)
