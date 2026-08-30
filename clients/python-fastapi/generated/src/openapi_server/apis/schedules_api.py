# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.schedules_api_base import BaseSchedulesApi
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
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.schedule import Schedule
from openapi_server.models.schedule_batch_update import ScheduleBatchUpdate
from openapi_server.models.schedule_create import ScheduleCreate
from openapi_server.models.schedule_status import ScheduleStatus
from openapi_server.models.schedule_type import ScheduleType
from openapi_server.models.schedules_create200_response_inner import SchedulesCreate200ResponseInner
from openapi_server.models.schedules_list200_response import SchedulesList200Response
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/schedules",
    responses={
        200: {"model": SchedulesList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["schedules"],
    summary="Get Schedules",
    response_model_by_alias=True,
)
async def schedules_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    entity_ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, description="List of Entity IDs, must be associated with the Ad Accound ID provided in the path.")] = Query(None, description="List of Entity IDs, must be associated with the Ad Accound ID provided in the path.", alias="entity_ids"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    schedule_statuses: Annotated[Optional[List[ScheduleStatus]], Field(description="Filter schedules by status (one or more)")] = Query(None, description="Filter schedules by status (one or more)", alias="schedule_statuses"),
    schedule_type: Annotated[Optional[ScheduleType], Field(description="Filter schedules by a type")] = Query(None, description="Filter schedules by a type", alias="schedule_type"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SchedulesList200Response:
    """Get schedules for a specific advertiser"""
    if not BaseSchedulesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSchedulesApi.subclasses[0]().schedules_list(ad_account_id, entity_ids, bookmark, page_size, order, schedule_statuses, schedule_type)


@router.post(
    "/ad_accounts/{ad_account_id}/schedules",
    responses={
        200: {"model": List[SchedulesCreate200ResponseInner], "description": "The request has succeeded."},
        201: {"model": List[Schedule], "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["schedules"],
    summary="Create schedules",
    response_model_by_alias=True,
)
async def schedules_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    schedule_create: List[ScheduleCreate] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> List[SchedulesCreate200ResponseInner]:
    """Batch create schedules"""
    if not BaseSchedulesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSchedulesApi.subclasses[0]().schedules_create(ad_account_id, schedule_create)


@router.patch(
    "/ad_accounts/{ad_account_id}/schedules",
    responses={
        200: {"model": List[SchedulesCreate200ResponseInner], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["schedules"],
    summary="Update schedules",
    response_model_by_alias=True,
)
async def schedules_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    schedule_batch_update: List[ScheduleBatchUpdate] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> List[SchedulesCreate200ResponseInner]:
    """Update one or more schedules"""
    if not BaseSchedulesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSchedulesApi.subclasses[0]().schedules_update(ad_account_id, schedule_batch_update)
