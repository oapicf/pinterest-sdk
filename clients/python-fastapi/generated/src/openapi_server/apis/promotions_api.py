# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.promotions_api_base import BasePromotionsApi
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
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.promotion_create_request import PromotionCreateRequest
from openapi_server.models.promotion_response import PromotionResponse
from openapi_server.models.promotion_update_request import PromotionUpdateRequest
from openapi_server.models.promotions_list200_response import PromotionsList200Response
from openapi_server.models.promotions_response import PromotionsResponse
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/promotions",
    responses={
        200: {"model": PromotionsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account promotions parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["promotions"],
    summary="Get promotions",
    response_model_by_alias=True,
)
async def promotions_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> PromotionsList200Response:
    """Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_list(ad_account_id, page_size, order, bookmark)


@router.post(
    "/ad_accounts/{ad_account_id}/promotions",
    responses={
        200: {"model": PromotionsResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid create promotions request parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["promotions"],
    summary="Create promotions",
    response_model_by_alias=True,
)
async def promotions_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    promotion_create_request: Annotated[List[PromotionCreateRequest], Field(min_length=1, max_length=30, description="List of promotions to create, size limit [1, 30].")] = Body(None, description="List of promotions to create, size limit [1, 30]."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> PromotionsResponse:
    """Create multiple new promotions."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_create(ad_account_id, promotion_create_request)


@router.patch(
    "/ad_accounts/{ad_account_id}/promotions",
    responses={
        200: {"model": PromotionsResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid create promotions request parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["promotions"],
    summary="Update promotions",
    response_model_by_alias=True,
)
async def promotions_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    promotion_update_request: Annotated[List[PromotionUpdateRequest], Field(min_length=1, max_length=30, description="List of promotions to create, size limit [1, 30].")] = Body(None, description="List of promotions to create, size limit [1, 30]."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> PromotionsResponse:
    """Update multiple promotions."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_update(ad_account_id, promotion_update_request)


@router.get(
    "/ad_accounts/{ad_account_id}/promotions/{promotion_id}",
    responses={
        200: {"model": PromotionResponse, "description": "Success"},
        404: {"model": Error, "description": "The promotion ID for the given ad account ID was not found."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["promotions"],
    summary="Get promotion by id",
    response_model_by_alias=True,
)
async def promotions_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    promotion_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a promotion")] = Path(..., description="Unique identifier of a promotion", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> PromotionResponse:
    """Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_get(ad_account_id, promotion_id)


@router.delete(
    "/ad_accounts/{ad_account_id}/promotions/{promotion_id}",
    responses={
        204: {"description": "Promotion deleted successfully"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["promotions"],
    summary="Delete promotion by id",
    response_model_by_alias=True,
)
async def promotions_delete(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    promotion_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a promotion")] = Path(..., description="Unique identifier of a promotion", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> None:
    """Delete a promotion within Pinterest."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_delete(ad_account_id, promotion_id)
