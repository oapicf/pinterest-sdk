# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.integrations_api_base import BaseIntegrationsApi
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
from pydantic import Field, StrictStr
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.integration_logs_request import IntegrationLogsRequest
from openapi_server.models.integration_logs_success_response import IntegrationLogsSuccessResponse
from openapi_server.models.integration_metadata import IntegrationMetadata
from openapi_server.models.integration_record import IntegrationRecord
from openapi_server.models.integration_request import IntegrationRequest
from openapi_server.models.integration_request_patch import IntegrationRequestPatch
from openapi_server.models.integrations_get_list200_response import IntegrationsGetList200Response
from openapi_server.models.integrations_logs_post400_response import IntegrationsLogsPost400Response
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/integrations/commerce",
    responses={
        200: {"model": IntegrationMetadata, "description": "Success"},
        404: {"model": Error, "description": "Integration not found."},
        409: {"model": Error, "description": "Can&#39;t access this integration metadata."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["integrations"],
    summary="Create commerce integration",
    response_model_by_alias=True,
)
async def integrations_commerce_post(
    integration_request: Annotated[IntegrationRequest, Field(description="Parameters to get create/update the Integration Metadata")] = Body(None, description="Parameters to get create/update the Integration Metadata"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> IntegrationMetadata:
    """Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_commerce_post(integration_request)


@router.get(
    "/integrations/commerce/{external_business_id}",
    responses={
        200: {"model": IntegrationMetadata, "description": "Success"},
        404: {"model": Error, "description": "Integration not found."},
        409: {"model": Error, "description": "Can&#39;t access this integration metadata."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["integrations"],
    summary="Get commerce integration",
    response_model_by_alias=True,
)
async def integrations_commerce_get(
    external_business_id: Annotated[StrictStr, Field(description="External business ID for the integration.")] = Path(..., description="External business ID for the integration."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> IntegrationMetadata:
    """Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_commerce_get(external_business_id)


@router.delete(
    "/integrations/commerce/{external_business_id}",
    responses={
        204: {"description": "Commerce Integration deleted successfully"},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["integrations"],
    summary="Delete commerce integration",
    response_model_by_alias=True,
)
async def integrations_commerce_del(
    external_business_id: Annotated[StrictStr, Field(description="External business ID for the integration.")] = Path(..., description="External business ID for the integration."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> None:
    """Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_commerce_del(external_business_id)


@router.patch(
    "/integrations/commerce/{external_business_id}",
    responses={
        200: {"model": IntegrationMetadata, "description": "Success"},
        404: {"model": Error, "description": "Integration not found."},
        409: {"model": Error, "description": "Can&#39;t access this integration metadata."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["integrations"],
    summary="Update commerce integration",
    response_model_by_alias=True,
)
async def integrations_commerce_patch(
    external_business_id: Annotated[StrictStr, Field(description="External business ID for the integration.")] = Path(..., description="External business ID for the integration."),
    integration_request_patch: Annotated[IntegrationRequestPatch, Field(description="Parameters to get create/update the Integration Metadata")] = Body(None, description="Parameters to get create/update the Integration Metadata"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> IntegrationMetadata:
    """Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_commerce_patch(external_business_id, integration_request_patch)


@router.post(
    "/integrations/logs",
    responses={
        200: {"model": IntegrationLogsSuccessResponse, "description": "Success."},
        400: {"model": IntegrationsLogsPost400Response, "description": "Bad request."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["integrations"],
    summary="Receives batched logs from integration applications.",
    response_model_by_alias=True,
)
async def integrations_logs_post(
    integration_logs_request: Annotated[IntegrationLogsRequest, Field(description="Ingest log information from external integration application.")] = Body(None, description="Ingest log information from external integration application."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> IntegrationLogsSuccessResponse:
    """This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_logs_post(integration_logs_request)


@router.get(
    "/integrations",
    responses={
        200: {"model": IntegrationsGetList200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["integrations"],
    summary="Get integration metadata list",
    response_model_by_alias=True,
)
async def integrations_get_list(
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> IntegrationsGetList200Response:
    """Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_get_list(bookmark, page_size)


@router.get(
    "/integrations/{id}",
    responses={
        200: {"model": IntegrationRecord, "description": "Success"},
        404: {"model": Error, "description": "Integration not found."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["integrations"],
    summary="Get integration metadata",
    response_model_by_alias=True,
)
async def integrations_get_by_id(
    id: Annotated[StrictStr, Field(description="Integration ID.")] = Path(..., description="Integration ID."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> IntegrationRecord:
    """Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_get_by_id(id)
