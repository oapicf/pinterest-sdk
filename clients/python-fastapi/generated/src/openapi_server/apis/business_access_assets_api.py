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
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.asset_group_deletion import AssetGroupDeletion
from openapi_server.models.asset_group_deletion_delete import AssetGroupDeletionDelete
from openapi_server.models.asset_group_input import AssetGroupInput
from openapi_server.models.asset_group_input_create import AssetGroupInputCreate
from openapi_server.models.asset_group_modification import AssetGroupModification
from openapi_server.models.asset_group_modification_read_or_update import AssetGroupModificationReadOrUpdate
from openapi_server.models.asset_permission_type import AssetPermissionType
from openapi_server.models.asset_search_by import AssetSearchBy
from openapi_server.models.asset_sort_by import AssetSortBy
from openapi_server.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response
from openapi_server.models.business_assets_get200_response import BusinessAssetsGet200Response
from openapi_server.models.business_member_assets_get_response import BusinessMemberAssetsGetResponse
from openapi_server.models.business_members_asset_access_delete_body import BusinessMembersAssetAccessDeleteBody
from openapi_server.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response
from openapi_server.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray
from openapi_server.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody
from openapi_server.models.delete_partner_asset_access_results_response_array import DeletePartnerAssetAccessResultsResponseArray
from openapi_server.models.non_draft_entity_status import NonDraftEntityStatus
from openapi_server.models.permissions_with_owner import PermissionsWithOwner
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.update_member_asset_access_body import UpdateMemberAssetAccessBody
from openapi_server.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray
from openapi_server.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody
from openapi_server.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/businesses/{business_id}/asset_groups",
    responses={
        200: {"model": AssetGroupInput, "description": "The request has succeeded."},
        201: {"model": AssetGroupInput, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Create a new asset group.",
    response_model_by_alias=True,
)
async def asset_group_create(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    asset_group_input_create: AssetGroupInputCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> AssetGroupInput:
    """Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().asset_group_create(business_id, asset_group_input_create)


@router.delete(
    "/businesses/{business_id}/asset_groups",
    responses={
        200: {"model": AssetGroupDeletion, "description": "The request has succeeded."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Delete asset groups.",
    response_model_by_alias=True,
)
async def asset_group_delete(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    asset_group_deletion_delete: AssetGroupDeletionDelete = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> AssetGroupDeletion:
    """Delete a batch of asset groups."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().asset_group_delete(business_id, asset_group_deletion_delete)


@router.patch(
    "/businesses/{business_id}/asset_groups",
    responses={
        200: {"model": AssetGroupModification, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Update asset groups.",
    response_model_by_alias=True,
)
async def asset_group_update(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    asset_group_modification_read_or_update: AssetGroupModificationReadOrUpdate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read", "biz_access:write"]
    ),
) -> AssetGroupModification:
    """Update a batch of asset groups with the specified parameters."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().asset_group_update(business_id, asset_group_modification_read_or_update)


@router.get(
    "/businesses/{business_id}/assets",
    responses={
        200: {"model": BusinessAssetsGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
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
    asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")] = Query('AD_ACCOUNT', description="A resource type to filter the assets by. Only assets of the specified type will be returned.", alias="asset_type"),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessAssetsGet200Response:
    """Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_assets_get(business_id, permissions, child_asset_id, asset_group_id, asset_type, start_index, bookmark, page_size)


@router.get(
    "/businesses/{business_id}/assets/{asset_id}/members",
    responses={
        200: {"model": BusinessAssetMembersGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Get members with access to asset",
    response_model_by_alias=True,
)
async def business_asset_members_get(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    asset_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a business asset.")] = Path(..., description="Unique identifier of a business asset.", regex=r"^\d+$", min_length=1, max_length=20),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    fetch_system_users: Annotated[Optional[StrictBool], Field(description="Fetches system users if True. Fetches regular user employees if False.")] = Query(False, description="Fetches system users if True. Fetches regular user employees if False.", alias="fetch_system_users"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessAssetMembersGet200Response:
    """Get all the members the requesting business has granted access to on the given asset."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_asset_members_get(business_id, asset_id, start_index, fetch_system_users, bookmark, page_size)


@router.get(
    "/businesses/{business_id}/assets/{asset_id}/partners",
    responses={
        200: {"model": BusinessAssetMembersGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
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
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessAssetMembersGet200Response:
    """Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_asset_partners_get(business_id, asset_id, start_index, bookmark, page_size)


@router.delete(
    "/businesses/{business_id}/members/assets/access",
    responses={
        200: {"model": DeleteMemberAccessResultsResponseArray, "description": "The request has succeeded."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Delete member access to asset",
    response_model_by_alias=True,
)
async def business_members_asset_access_delete(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    business_members_asset_access_delete_body: BusinessMembersAssetAccessDeleteBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> DeleteMemberAccessResultsResponseArray:
    """Terminate multiple members&#39; access to an asset."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_members_asset_access_delete(business_id, business_members_asset_access_delete_body)


@router.patch(
    "/businesses/{business_id}/members/assets/access",
    responses={
        200: {"model": UpdateMemberAssetsResultsResponseArray, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Assign/Update member asset permissions",
    response_model_by_alias=True,
)
async def business_members_asset_access_update(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    update_member_asset_access_body: UpdateMemberAssetAccessBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> UpdateMemberAssetsResultsResponseArray:
    """Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_members_asset_access_update(business_id, update_member_asset_access_body)


@router.get(
    "/businesses/{business_id}/members/{member_id}/assets",
    responses={
        200: {"model": BusinessMemberAssetsGetResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Get assets assigned to a member",
    response_model_by_alias=True,
)
async def business_member_assets_get(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    member_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="The member id to fetch assets for.")] = Path(..., description="The member id to fetch assets for.", regex=r"^\d+$", min_length=1, max_length=20),
    asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")] = Query('AD_ACCOUNT', description="A resource type to filter the assets by. Only assets of the specified type will be returned.", alias="asset_type"),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    sort_by: Annotated[Optional[AssetSortBy], Field(description="The field to sort member assets by")] = Query(None, description="The field to sort member assets by", alias="sort_by"),
    sort_ascending: Annotated[Optional[StrictBool], Field(description="Sort assets in ascending order")] = Query(True, description="Sort assets in ascending order", alias="sort_ascending"),
    search_by: Annotated[Optional[AssetSearchBy], Field(description="The field to search member assets by")] = Query(None, description="The field to search member assets by", alias="search_by"),
    search_value: Annotated[Optional[StrictStr], Field(description="The value to search for")] = Query(None, description="The value to search for", alias="search_value"),
    asset_permission_type: Annotated[Optional[AssetPermissionType], Field(description="The type of asset permission to filter by")] = Query(None, description="The type of asset permission to filter by", alias="asset_permission_type"),
    ad_account_statuses: Annotated[Optional[List[NonDraftEntityStatus]], Field(description="A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.")] = Query(None, description="A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.", alias="ad_account_statuses"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessMemberAssetsGetResponse:
    """Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_member_assets_get(business_id, member_id, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, asset_permission_type, ad_account_statuses, bookmark, page_size)


@router.delete(
    "/businesses/{business_id}/partners/assets",
    responses={
        200: {"model": DeletePartnerAssetAccessResultsResponseArray, "description": "The request has succeeded."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
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
) -> DeletePartnerAssetAccessResultsResponseArray:
    """Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body)


@router.patch(
    "/businesses/{business_id}/partners/assets",
    responses={
        200: {"model": UpdatePartnerAssetsResultsResponseArray, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Assign/Update partner asset permissions",
    response_model_by_alias=True,
)
async def update_partner_asset_access_handler_impl(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    update_partner_asset_access_body: UpdatePartnerAssetAccessBody = Body(None, description=""),
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
        200: {"model": BusinessPartnerAssetAccessGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["business_access_assets"],
    summary="Get assets assigned to a partner or assets assigned by a partner",
    response_model_by_alias=True,
)
async def business_partner_asset_access_get(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    partner_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="The partner id to be bound to the Business")] = Path(..., description="The partner id to be bound to the Business", regex=r"^\d+$", min_length=1, max_length=20),
    partner_type: Annotated[Optional[StrictStr], Field(description="Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.")] = Query('INTERNAL', description="Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.", alias="partner_type"),
    asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")] = Query('AD_ACCOUNT', description="A resource type to filter the assets by. Only assets of the specified type will be returned.", alias="asset_type"),
    start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")] = Query(0, description="An index to start fetching the results from. Only the results starting from this index will be returned.", alias="start_index", ge=0),
    sort_by: Annotated[Optional[AssetSortBy], Field(description="The field to sort member assets by")] = Query(None, description="The field to sort member assets by", alias="sort_by"),
    sort_ascending: Annotated[Optional[StrictBool], Field(description="Sort assets in ascending order")] = Query(True, description="Sort assets in ascending order", alias="sort_ascending"),
    search_by: Annotated[Optional[AssetSearchBy], Field(description="The field to search member assets by")] = Query(None, description="The field to search member assets by", alias="search_by"),
    search_value: Annotated[Optional[StrictStr], Field(description="The value to search for")] = Query(None, description="The value to search for", alias="search_value"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> BusinessPartnerAssetAccessGet200Response:
    """Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to."""
    if not BaseBusinessAccessAssetsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessAccessAssetsApi.subclasses[0]().business_partner_asset_access_get(business_id, partner_id, partner_type, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, bookmark, page_size)
