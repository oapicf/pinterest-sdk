# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.product_tags_api_base import BaseProductTagsApi
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
from pydantic import Field, field_validator
from typing import Any
from typing_extensions import Annotated
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.product_tags_bulk_add_request import ProductTagsBulkAddRequest
from openapi_server.models.product_tags_bulk_delete_request import ProductTagsBulkDeleteRequest
from openapi_server.models.product_tags_error import ProductTagsError
from openapi_server.models.product_tags_response import ProductTagsResponse
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/pins/{pin_id}/product_tags",
    responses={
        200: {"model": ProductTagsResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["product_tags"],
    summary="Get product tags for pin",
    response_model_by_alias=True,
)
async def product_tags_list(
    pin_id: Annotated[str, Field(strict=True, description="Unique identifier of the hero pin that will receive product tags.")] = Path(..., description="Unique identifier of the hero pin that will receive product tags.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
) -> ProductTagsResponse:
    """Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags."""
    if not BaseProductTagsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProductTagsApi.subclasses[0]().product_tags_list(pin_id)


@router.post(
    "/pins/{pin_id}/product_tags",
    responses={
        200: {"model": ProductTagsResponse, "description": "The request has succeeded."},
        400: {"model": ProductTagsError, "description": "The request contains ineligible product tags."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["product_tags"],
    summary="Add product tags to pin",
    response_model_by_alias=True,
)
async def product_tags_bulk_add(
    pin_id: Annotated[str, Field(strict=True, description="Unique identifier of the hero pin that will receive product tags.")] = Path(..., description="Unique identifier of the hero pin that will receive product tags.", regex=r"^\d+$"),
    product_tags_bulk_add_request: ProductTagsBulkAddRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
) -> ProductTagsResponse:
    """Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success."""
    if not BaseProductTagsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProductTagsApi.subclasses[0]().product_tags_bulk_add(pin_id, product_tags_bulk_add_request)


@router.post(
    "/pins/{pin_id}/product_tags/bulk-delete",
    responses={
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["product_tags"],
    summary="Delete product tags from pin",
    response_model_by_alias=True,
)
async def product_tags_bulk_delete(
    pin_id: Annotated[str, Field(strict=True, description="Unique identifier of the hero pin that will receive product tags.")] = Path(..., description="Unique identifier of the hero pin that will receive product tags.", regex=r"^\d+$"),
    product_tags_bulk_delete_request: ProductTagsBulkDeleteRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
) -> None:
    """Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success."""
    if not BaseProductTagsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProductTagsApi.subclasses[0]().product_tags_bulk_delete(pin_id, product_tags_bulk_delete_request)
