# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.audiences_api_base import BaseAudiencesApi
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
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.audience import Audience
from openapi_server.models.audience_create_request import AudienceCreateRequest
from openapi_server.models.audience_update_request import AudienceUpdateRequest
from openapi_server.models.audiences_list200_response import AudiencesList200Response
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/audiences",
    responses={
        200: {"model": AudiencesList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account audience parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["audiences"],
    summary="List audiences",
    response_model_by_alias=True,
)
async def audiences_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    ownership_type: Annotated[Optional[StrictStr], Field(description="Filter audiences by ownership type.")] = Query(OWNED, description="Filter audiences by ownership type.", alias="ownership_type"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AudiencesList200Response:
    """Get list of audiences for the ad account."""
    if not BaseAudiencesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudiencesApi.subclasses[0]().audiences_list(ad_account_id, bookmark, order, page_size, ownership_type)


@router.post(
    "/ad_accounts/{ad_account_id}/audiences",
    responses={
        200: {"model": Audience, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["audiences"],
    summary="Create audience",
    response_model_by_alias=True,
)
async def audiences_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    audience_create_request: Annotated[AudienceCreateRequest, Field(description="List of ads to create, size limit [1, 30]")] = Body(None, description="List of ads to create, size limit [1, 30]"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> Audience:
    """Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific &#x60;audience_ids&#x60; when you create an ad group. &lt;p/&gt; Learn about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;creating different kinds of audiences&lt;/a&gt;."""
    if not BaseAudiencesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudiencesApi.subclasses[0]().audiences_create(ad_account_id, audience_create_request)


@router.get(
    "/ad_accounts/{ad_account_id}/audiences/{audience_id}",
    responses={
        200: {"model": Audience, "description": "Success"},
        404: {"model": Error, "description": "Audience not found."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["audiences"],
    summary="Get audience",
    response_model_by_alias=True,
)
async def audiences_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an audience")] = Path(..., description="Unique identifier of an audience", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> Audience:
    """Get a specific audience given the audience ID."""
    if not BaseAudiencesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudiencesApi.subclasses[0]().audiences_get(ad_account_id, audience_id)


@router.patch(
    "/ad_accounts/{ad_account_id}/audiences/{audience_id}",
    responses={
        200: {"model": Audience, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["audiences"],
    summary="Update audience",
    response_model_by_alias=True,
)
async def audiences_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an audience")] = Path(..., description="Unique identifier of an audience", regex=r"^\d+$", max_length=18),
    audience_update_request: Annotated[AudienceUpdateRequest, Field(description="The audience to be updated.")] = Body(None, description="The audience to be updated."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> Audience:
    """Update (edit or remove) an existing targeting audience."""
    if not BaseAudiencesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudiencesApi.subclasses[0]().audiences_update(ad_account_id, audience_id, audience_update_request)
