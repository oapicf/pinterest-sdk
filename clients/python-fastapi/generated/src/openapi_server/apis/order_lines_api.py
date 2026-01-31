# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.order_lines_api_base import BaseOrderLinesApi
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
from openapi_server.models.error import Error
from openapi_server.models.order_line import OrderLine
from openapi_server.models.order_lines_list200_response import OrderLinesList200Response
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/order_lines",
    responses={
        200: {"model": OrderLinesList200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["order_lines"],
    summary="Get order lines",
    response_model_by_alias=True,
)
async def order_lines_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> OrderLinesList200Response:
    """List existing order lines associated with an ad account."""
    if not BaseOrderLinesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOrderLinesApi.subclasses[0]().order_lines_list(ad_account_id, page_size, order, bookmark)


@router.get(
    "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}",
    responses={
        200: {"model": OrderLine, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["order_lines"],
    summary="Get order line",
    response_model_by_alias=True,
)
async def order_lines_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    order_line_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an order line.")] = Path(..., description="Unique identifier of an order line.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> OrderLine:
    """Get a specific existing order line associated with an ad account."""
    if not BaseOrderLinesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOrderLinesApi.subclasses[0]().order_lines_get(ad_account_id, order_line_id)
