# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.business_access_assets_api_base import BaseBusinessAccessAssetsApi
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
from openapi_server.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response
from openapi_server.models.business_asset_partners_get200_response import BusinessAssetPartnersGet200Response
from openapi_server.models.business_assets_get200_response import BusinessAssetsGet200Response
from openapi_server.models.business_member_assets_get200_response import BusinessMemberAssetsGet200Response
from openapi_server.models.business_members_asset_access_delete_request import BusinessMembersAssetAccessDeleteRequest
from openapi_server.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response
from openapi_server.models.create_asset_group_body import CreateAssetGroupBody
from openapi_server.models.create_asset_group_response import CreateAssetGroupResponse
from openapi_server.models.delete_asset_group_body import DeleteAssetGroupBody
from openapi_server.models.delete_asset_group_response import DeleteAssetGroupResponse
from openapi_server.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray
from openapi_server.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody
from openapi_server.models.delete_partner_assets_results_response_array import DeletePartnerAssetsResultsResponseArray
from openapi_server.models.error import Error
from openapi_server.models.permissions_with_owner import PermissionsWithOwner
from openapi_server.models.update_asset_group_body import UpdateAssetGroupBody
from openapi_server.models.update_asset_group_response import UpdateAssetGroupResponse
from openapi_server.models.update_member_asset_access_body import UpdateMemberAssetAccessBody
from openapi_server.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray
from openapi_server.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody
from openapi_server.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/businesses/{business_id}/assets/{asset_id}/members",
    responses={
        200: {"model": BusinessAssetMembersGet200Response, "description": "Sucess"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Get members with access to asset",
    response_model_by_alias=True,
)
async def business_asset_members_get(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    asset_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a business asset.")] = Path(..., description="Unique identifier of a business asset.", regex=r"^\d+$", min_length=1, max_length=20),
    fetch_system_users: Annotated[Optional[StrictBool], Field(description="Fetches system users if True. Fetches regular user employees if False.")] = Query(False, description="Fetches system users if True. Fetches regular user employees if False.", alias="fetch_system_users"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessAssetMembersGet200Response:
    """Get all the members the requesting business has granted access to on the given asset."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_asset_members_get(business_id, asset_id, fetch_system_users, bookmark, page_size, start_index)


@router.get(
    "/businesses/{business_id}/assets/{asset_id}/partners",
    responses={
        200: {"model": BusinessAssetPartnersGet200Response, "description": "Sucess"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Get partners with access to asset",
    response_model_by_alias=True,
)
async def business_asset_partners_get(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    asset_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a business asset.")] = Path(..., description="Unique identifier of a business asset.", regex=r"^\d+$", min_length=1, max_length=20),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessAssetPartnersGet200Response:
    """Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_asset_partners_get(business_id, asset_id, start_index, bookmark, page_size)


@router.get(
    "/businesses/{business_id}/assets",
    responses={
        200: {"model": BusinessAssetsGet200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="List business assets",
    response_model_by_alias=True,
)
async def business_assets_get(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    permissions: Annotated[Optional[List[PermissionsWithOwner]], Field(description="A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.")] = Query(None, description="A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.", alias="permissions"),
    child_asset_id: Annotated[Optional[Annotated[str, Field(min_length=1, strict=True, max_length=20)]], Field(description="A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.")] = Query(None, description="A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.", alias="child_asset_id", regex=r"^\d+$", min_length=1, max_length=20),
    asset_group_id: Annotated[Optional[Annotated[str, Field(min_length=1, strict=True, max_length=20)]], Field(description="An asset group unique identifier. Used to fetch assets contained within the specified asset group.")] = Query(None, description="An asset group unique identifier. Used to fetch assets contained within the specified asset group.", alias="asset_group_id", regex=r"^\d+$", min_length=1, max_length=20),
    asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")] = Query(AD_ACCOUNT, description="A resource type to filter the assets by. Only assets of the specified type will be returned.", alias="asset_type"),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessAssetsGet200Response:
    """Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_assets_get(business_id, permissions, child_asset_id, asset_group_id, asset_type, start_index, bookmark, page_size)


@router.get(
    "/businesses/{business_id}/members/{member_id}/assets",
    responses={
        200: {"model": BusinessMemberAssetsGet200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Get assets assigned to a member",
    response_model_by_alias=True,
)
async def business_member_assets_get(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    member_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="The member id to fetch assets for.")] = Path(..., description="The member id to fetch assets for.", regex=r"^\d+$", min_length=1, max_length=20),
    asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")] = Query(AD_ACCOUNT, description="A resource type to filter the assets by. Only assets of the specified type will be returned.", alias="asset_type"),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessMemberAssetsGet200Response:
    """Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_member_assets_get(business_id, member_id, asset_type, start_index, bookmark, page_size)


@router.delete(
    "/businesses/{business_id}/members/assets/access",
    responses={
        200: {"model": DeleteMemberAccessResultsResponseArray, "description": "response"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Delete member access to asset",
    response_model_by_alias=True,
)
async def business_members_asset_access_delete(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    business_members_asset_access_delete_request: Annotated[BusinessMembersAssetAccessDeleteRequest, Field(description="List member assset permissions to delete.")] = Body(None, description="List member assset permissions to delete."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> DeleteMemberAccessResultsResponseArray:
    """Terminate multiple members&#39; access to an asset."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_members_asset_access_delete(business_id, business_members_asset_access_delete_request)


@router.patch(
    "/businesses/{business_id}/members/assets/access",
    responses={
        200: {"model": UpdateMemberAssetsResultsResponseArray, "description": "response"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Assign/Update member asset permissions",
    response_model_by_alias=True,
)
async def business_members_asset_access_update(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    update_member_asset_access_body: Annotated[UpdateMemberAssetAccessBody, Field(description="List of member asset permissions to create or update.")] = Body(None, description="List of member asset permissions to create or update."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> UpdateMemberAssetsResultsResponseArray:
    """Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. """
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_members_asset_access_update(business_id, update_member_asset_access_body)


@router.delete(
    "/businesses/{business_id}/partners/assets",
    responses={
        200: {"model": DeletePartnerAssetsResultsResponseArray, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Delete partner access to asset",
    response_model_by_alias=True,
)
async def delete_partner_asset_access_handler_impl(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    delete_partner_asset_access_body: DeletePartnerAssetAccessBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> DeletePartnerAssetsResultsResponseArray:
    """Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body)


@router.patch(
    "/businesses/{business_id}/partners/assets",
    responses={
        200: {"model": UpdatePartnerAssetsResultsResponseArray, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Assign/Update partner asset permissions",
    response_model_by_alias=True,
)
async def update_partner_asset_access_handler_impl(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    update_partner_asset_access_body: Annotated[UpdatePartnerAssetAccessBody, Field(description="A list of assets and permissions to assign to your partners.")] = Body(None, description="A list of assets and permissions to assign to your partners."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> UpdatePartnerAssetsResultsResponseArray:
    """Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().update_partner_asset_access_handler_impl(business_id, update_partner_asset_access_body)


@router.get(
    "/businesses/{business_id}/partners/{partner_id}/assets",
    responses={
        200: {"model": BusinessPartnerAssetAccessGet200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Get assets assigned to a partner or assets assigned by a partner",
    response_model_by_alias=True,
)
async def business_partner_asset_access_get(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    partner_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="The partner id to be bound to the Business")] = Path(..., description="The partner id to be bound to the Business", regex=r"^\d+$", min_length=1, max_length=20),
    partner_type: Annotated[Optional[Any], Field(description="Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.")] = Query(None, description="Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.", alias="partner_type"),
    asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")] = Query(AD_ACCOUNT, description="A resource type to filter the assets by. Only assets of the specified type will be returned.", alias="asset_type"),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessPartnerAssetAccessGet200Response:
    """Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_partner_asset_access_get(business_id, partner_id, partner_type, asset_type, start_index, page_size, bookmark)


@router.post(
    "/businesses/{business_id}/asset_groups",
    responses={
        200: {"model": CreateAssetGroupResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Create a new asset group.",
    response_model_by_alias=True,
)
async def asset_group_create(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    create_asset_group_body: CreateAssetGroupBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> CreateAssetGroupResponse:
    """Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().asset_group_create(business_id, create_asset_group_body)


@router.delete(
    "/businesses/{business_id}/asset_groups",
    responses={
        200: {"model": DeleteAssetGroupResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Delete asset groups.",
    response_model_by_alias=True,
)
async def asset_group_delete(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    delete_asset_group_body: DeleteAssetGroupBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> DeleteAssetGroupResponse:
    """Delete a batch of asset groups."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().asset_group_delete(business_id, delete_asset_group_body)


@router.patch(
    "/businesses/{business_id}/asset_groups",
    responses={
        200: {"model": UpdateAssetGroupResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["business_access_assets"],
    summary="Update asset groups.",
    response_model_by_alias=True,
)
async def asset_group_update(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    update_asset_group_body: UpdateAssetGroupBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> UpdateAssetGroupResponse:
    """Update a batch of asset groups with the specified parameters."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().asset_group_update(business_id, update_asset_group_body)
