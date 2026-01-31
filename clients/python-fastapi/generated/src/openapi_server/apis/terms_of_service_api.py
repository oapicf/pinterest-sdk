# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.terms_of_service_api_base import BaseTermsOfServiceApi
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
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.terms_of_service import TermsOfService
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/terms_of_service",
    responses={
        200: {"model": TermsOfService, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["terms_of_service"],
    summary="Get terms of service",
    response_model_by_alias=True,
)
async def terms_of_service_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    include_html: Annotated[Optional[StrictBool], Field(description="Return HTML in TOS text.")] = Query(False, description="Return HTML in TOS text.", alias="include_html"),
    tos_type: Annotated[Optional[StrictStr], Field(description="Request type.")] = Query(None, description="Request type.", alias="tos_type"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> TermsOfService:
    """Get the text of the terms of service and see whether the advertiser has accepted the terms of service."""
    if not BaseTermsOfServiceApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTermsOfServiceApi.subclasses[0]().terms_of_service_get(ad_account_id, include_html, tos_type)
