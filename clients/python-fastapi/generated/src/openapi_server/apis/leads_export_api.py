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
from openapi_server.models.error import Error
from openapi_server.models.leads_export_create_request import LeadsExportCreateRequest
from openapi_server.models.leads_export_create_response import LeadsExportCreateResponse
from openapi_server.models.leads_export_response_data import LeadsExportResponseData
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/ad_accounts/{ad_account_id}/leads_export",
    responses={
        200: {"model": LeadsExportCreateResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["leads_export"],
    summary="Create a request to export leads collected from a lead ad",
    response_model_by_alias=True,
)
async def leads_export_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    leads_export_create_request: LeadsExportCreateRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadsExportCreateResponse:
    """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
    if not BaseLeadsExportApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadsExportApi.subclasses[0]().leads_export_create(ad_account_id, leads_export_create_request)


@router.get(
    "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}",
    responses={
        200: {"model": LeadsExportResponseData, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account parameter."},
        404: {"model": Error, "description": "Invalid leads export id parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
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
    """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
    if not BaseLeadsExportApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadsExportApi.subclasses[0]().leads_export_get(ad_account_id, leads_export_id)
