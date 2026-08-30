# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.labels_api_base import BaseLabelsApi
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
from pydantic import Field, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.label_create_request import LabelCreateRequest
from openapi_server.models.label_update_request import LabelUpdateRequest
from openapi_server.models.labeled_entities import LabeledEntities
from openapi_server.models.labeled_entities_create import LabeledEntitiesCreate
from openapi_server.models.labels_list200_response import LabelsList200Response
from openapi_server.models.labels_response import LabelsResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.query_label_entity_statuses_items import QueryLabelEntityStatusesItems
from openapi_server.models.query_label_types_items import QueryLabelTypesItems
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/labels",
    responses={
        200: {"model": LabelsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["labels"],
    summary="List labels",
    response_model_by_alias=True,
)
async def labels_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    campaign_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Campaign Ids to use to filter the results.")] = Query(None, description="List of Campaign Ids to use to filter the results.", alias="campaign_ids"),
    label_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Label Ids to use to filter the results.")] = Query(None, description="List of Label Ids to use to filter the results.", alias="label_ids"),
    entity_statuses: Annotated[Optional[List[QueryLabelEntityStatusesItems]], Field(description="Label entity status")] = Query(["ACTIVE"], description="Label entity status", alias="entity_statuses"),
    label_types: Annotated[Optional[List[QueryLabelTypesItems]], Field(description="Label type.")] = Query(["BRAND","CUSTOM"], description="Label type.", alias="label_types"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> LabelsList200Response:
    """[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id."""
    if not BaseLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLabelsApi.subclasses[0]().labels_list(ad_account_id, campaign_ids, label_ids, entity_statuses, label_types, bookmark, page_size)


@router.post(
    "/ad_accounts/{ad_account_id}/labels",
    responses={
        200: {"model": LabelsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["labels"],
    summary="Create labels",
    response_model_by_alias=True,
)
async def labels_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    label_create_request: LabelCreateRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LabelsResponse:
    """[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign."""
    if not BaseLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLabelsApi.subclasses[0]().labels_create(ad_account_id, label_create_request)


@router.patch(
    "/ad_accounts/{ad_account_id}/labels",
    responses={
        200: {"model": LabelsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["labels"],
    summary="Update labels",
    response_model_by_alias=True,
)
async def labels_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    label_update_request: LabelUpdateRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LabelsResponse:
    """[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels."""
    if not BaseLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLabelsApi.subclasses[0]().labels_update(ad_account_id, label_update_request)


@router.post(
    "/ad_accounts/{ad_account_id}/labels/{label_id}/apply",
    responses={
        200: {"model": LabeledEntities, "description": "The request has succeeded."},
        201: {"model": LabeledEntities, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["labels"],
    summary="Apply label to entity",
    response_model_by_alias=True,
)
async def labels_apply(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    label_id: Annotated[StrictStr, Field(description="Label ID.")] = Path(..., description="Label ID."),
    labeled_entities_create: LabeledEntitiesCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LabeledEntities:
    """  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign."""
    if not BaseLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLabelsApi.subclasses[0]().labels_apply(ad_account_id, label_id, labeled_entities_create)


@router.post(
    "/ad_accounts/{ad_account_id}/labels/{label_id}/remove",
    responses={
        200: {"model": LabeledEntities, "description": "The request has succeeded."},
        201: {"model": LabeledEntities, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["labels"],
    summary="Remove label from entities",
    response_model_by_alias=True,
)
async def labels_remove(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    label_id: Annotated[StrictStr, Field(description="Label ID.")] = Path(..., description="Label ID."),
    labeled_entities_create: LabeledEntitiesCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LabeledEntities:
    """  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities."""
    if not BaseLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLabelsApi.subclasses[0]().labels_remove(ad_account_id, label_id, labeled_entities_create)
