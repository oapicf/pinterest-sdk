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
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.promotion import Promotion
from openapi_server.models.promotion_batch_update import PromotionBatchUpdate
from openapi_server.models.promotion_create import PromotionCreate
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
        200: {"model": PromotionsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["promotions"],
    summary="Get promotions",
    response_model_by_alias=True,
)
async def promotions_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> PromotionsList200Response:
    """Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_list(ad_account_id, bookmark, page_size, order)


@router.post(
    "/ad_accounts/{ad_account_id}/promotions",
    responses={
        200: {"model": PromotionsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["promotions"],
    summary="Create promotions",
    response_model_by_alias=True,
)
async def promotions_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    promotion_create: Annotated[List[PromotionCreate], Field(min_length=1, max_length=30)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> PromotionsResponse:
    """Create multiple new promotions."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_create(ad_account_id, promotion_create)


@router.patch(
    "/ad_accounts/{ad_account_id}/promotions",
    responses={
        200: {"model": PromotionsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["promotions"],
    summary="Update promotions",
    response_model_by_alias=True,
)
async def promotions_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    promotion_batch_update: Annotated[List[PromotionBatchUpdate], Field(min_length=1, max_length=30)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> PromotionsResponse:
    """Update multiple promotions."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_update(ad_account_id, promotion_batch_update)


@router.get(
    "/ad_accounts/{ad_account_id}/promotions/{promotion_id}",
    responses={
        200: {"model": Promotion, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["promotions"],
    summary="Get promotion by id",
    response_model_by_alias=True,
)
async def promotions_get(
    promotion_id: Annotated[str, Field(strict=True, max_length=18, description="Promotion ID")] = Path(..., description="Promotion ID", regex=r"^\d+$", max_length=18),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> Promotion:
    """Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_get(promotion_id, ad_account_id)


@router.delete(
    "/ad_accounts/{ad_account_id}/promotions/{promotion_id}",
    responses={
        200: {"model": Promotion, "description": "The request has succeeded."},
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["promotions"],
    summary="Delete promotion by id",
    response_model_by_alias=True,
)
async def promotions_delete(
    promotion_id: Annotated[str, Field(strict=True, max_length=18, description="Promotion ID")] = Path(..., description="Promotion ID", regex=r"^\d+$", max_length=18),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> Promotion:
    """Delete a promotion within Pinterest."""
    if not BasePromotionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BasePromotionsApi.subclasses[0]().promotions_delete(promotion_id, ad_account_id)
