# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.leads_export_api_base import BaseLeadsExportApi
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
from typing_extensions import Annotated
from openapi_server.models.leads_export_response_data import LeadsExportResponseData
from openapi_server.models.leads_exports import LeadsExports
from openapi_server.models.leads_exports_create import LeadsExportsCreate
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/ad_accounts/{ad_account_id}/leads_export",
    responses={
        200: {"model": LeadsExports, "description": "The request has succeeded."},
        201: {"model": LeadsExports, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["leads_export"],
    summary="Create a request to export leads collected from a lead ad",
    response_model_by_alias=True,
)
async def leads_export_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    leads_exports_create: LeadsExportsCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadsExports:
    """**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
    if not BaseLeadsExportApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadsExportApi.subclasses[0]().leads_export_create(ad_account_id, leads_exports_create)


@router.get(
    "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}",
    responses={
        200: {"model": LeadsExportResponseData, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["leads_export"],
    summary="Get the lead export from the lead export create call",
    response_model_by_alias=True,
)
async def leads_export_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    leads_export_id: Annotated[str, Field(strict=True, description="lead_export_id token returned from the create a lead export endpoint")] = Path(..., description="lead_export_id token returned from the create a lead export endpoint", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> LeadsExportResponseData:
    """**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
    if not BaseLeadsExportApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadsExportApi.subclasses[0]().leads_export_get(ad_account_id, leads_export_id)
