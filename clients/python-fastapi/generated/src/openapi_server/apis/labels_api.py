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
from openapi_server.models.error import Error
from openapi_server.models.label_create_request import LabelCreateRequest
from openapi_server.models.label_update_request import LabelUpdateRequest
from openapi_server.models.labels_list200_response import LabelsList200Response
from openapi_server.models.labels_response import LabelsResponse
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/labels",
    responses={
        200: {"model": LabelsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account ads parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["labels"],
    summary="List labels",
    response_model_by_alias=True,
)
async def labels_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    campaign_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Campaign Ids to use to filter the results.")] = Query(None, description="List of Campaign Ids to use to filter the results.", alias="campaign_ids"),
    label_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Label Ids to use to filter the results.")] = Query(None, description="List of Label Ids to use to filter the results.", alias="label_ids"),
    entity_statuses: Annotated[Optional[List[StrictStr]], Field(description="Label entity status")] = Query(["ACTIVE"], description="Label entity status", alias="entity_statuses"),
    label_types: Annotated[Optional[List[StrictStr]], Field(description="Label type.")] = Query(["BRAND","CUSTOM"], description="Label type.", alias="label_types"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> LabelsList200Response:
    """&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;"""
    if not BaseLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLabelsApi.subclasses[0]().labels_list(ad_account_id, campaign_ids, label_ids, entity_statuses, label_types, page_size, bookmark)


@router.post(
    "/ad_accounts/{ad_account_id}/labels",
    responses={
        200: {"model": LabelsResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
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
    """&lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;"""
    if not BaseLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLabelsApi.subclasses[0]().labels_create(ad_account_id, label_create_request)


@router.patch(
    "/ad_accounts/{ad_account_id}/labels",
    responses={
        200: {"model": LabelsResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
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
    """&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;"""
    if not BaseLabelsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLabelsApi.subclasses[0]().labels_update(ad_account_id, label_update_request)
