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
from pydantic import Field, StrictStr, field_validator
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.integration_logs_invalid_log_response import IntegrationLogsInvalidLogResponse
from openapi_server.models.integration_logs_request_create import IntegrationLogsRequestCreate
from openapi_server.models.integration_logs_success_response import IntegrationLogsSuccessResponse
from openapi_server.models.integration_metadata import IntegrationMetadata
from openapi_server.models.integration_metadata_create import IntegrationMetadataCreate
from openapi_server.models.integration_metadata_update import IntegrationMetadataUpdate
from openapi_server.models.integration_record import IntegrationRecord
from openapi_server.models.integrations_get_list200_response import IntegrationsGetList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/integrations",
    responses={
        200: {"model": IntegrationsGetList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["integrations"],
    summary="Get integration metadata list",
    response_model_by_alias=True,
)
async def integrations_get_list(
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> IntegrationsGetList200Response:
    """Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_get_list(bookmark, page_size)


@router.post(
    "/integrations/commerce",
    responses={
        200: {"model": IntegrationMetadata, "description": "The request has succeeded."},
        201: {"model": IntegrationMetadata, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["integrations"],
    summary="Create commerce integration",
    response_model_by_alias=True,
)
async def integrations_commerce_post(
    integration_metadata_create: IntegrationMetadataCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> IntegrationMetadata:
    """Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_commerce_post(integration_metadata_create)


@router.get(
    "/integrations/commerce/{external_business_id}",
    responses={
        200: {"model": IntegrationMetadata, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
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
        200: {"model": IntegrationMetadata, "description": "The request has succeeded."},
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
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
) -> IntegrationMetadata:
    """Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_commerce_del(external_business_id)


@router.patch(
    "/integrations/commerce/{external_business_id}",
    responses={
        200: {"model": IntegrationMetadata, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["integrations"],
    summary="Update commerce integration",
    response_model_by_alias=True,
)
async def integrations_commerce_patch(
    external_business_id: Annotated[StrictStr, Field(description="External business ID for the integration.")] = Path(..., description="External business ID for the integration."),
    integration_metadata_update: IntegrationMetadataUpdate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> IntegrationMetadata:
    """Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_commerce_patch(external_business_id, integration_metadata_update)


@router.post(
    "/integrations/logs",
    responses={
        200: {"model": IntegrationLogsSuccessResponse, "description": "The request has succeeded."},
        400: {"model": IntegrationLogsInvalidLogResponse, "description": "The server could not understand the request due to invalid syntax."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["integrations"],
    summary="Receives batched logs from integration applications.",
    response_model_by_alias=True,
)
async def integrations_logs_post(
    integration_logs_request_create: IntegrationLogsRequestCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> IntegrationLogsSuccessResponse:
    """This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_logs_post(integration_logs_request_create)


@router.get(
    "/integrations/{id}",
    responses={
        200: {"model": IntegrationRecord, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["integrations"],
    summary="Get integration metadata",
    response_model_by_alias=True,
)
async def integrations_get_by_id(
    id: Annotated[str, Field(strict=True, description="Integration record ID.")] = Path(..., description="Integration record ID.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> IntegrationRecord:
    """Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
    if not BaseIntegrationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseIntegrationsApi.subclasses[0]().integrations_get_by_id(id)
