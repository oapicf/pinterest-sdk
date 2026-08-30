# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.lead_forms_api_base import BaseLeadFormsApi
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
from openapi_server.models.lead_form import LeadForm
from openapi_server.models.lead_form_batch_update import LeadFormBatchUpdate
from openapi_server.models.lead_form_create import LeadFormCreate
from openapi_server.models.lead_form_test import LeadFormTest
from openapi_server.models.lead_form_test_create import LeadFormTestCreate
from openapi_server.models.lead_forms_create200_response import LeadFormsCreate200Response
from openapi_server.models.lead_forms_list200_response import LeadFormsList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/lead_forms",
    responses={
        200: {"model": LeadFormsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_forms"],
    summary="List lead forms",
    response_model_by_alias=True,
)
async def lead_forms_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> LeadFormsList200Response:
    """**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_forms_list(ad_account_id, bookmark, page_size, order)


@router.post(
    "/ad_accounts/{ad_account_id}/lead_forms",
    responses={
        200: {"model": LeadFormsCreate200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_forms"],
    summary="Create lead forms",
    response_model_by_alias=True,
)
async def lead_forms_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    lead_form_create: Annotated[List[LeadFormCreate], Field(min_length=1, max_length=30)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadFormsCreate200Response:
    """**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_forms_create(ad_account_id, lead_form_create)


@router.patch(
    "/ad_accounts/{ad_account_id}/lead_forms",
    responses={
        200: {"model": LeadFormsCreate200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_forms"],
    summary="Update lead forms",
    response_model_by_alias=True,
)
async def lead_forms_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    lead_form_batch_update: Annotated[List[LeadFormBatchUpdate], Field(min_length=1, max_length=30)] = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadFormsCreate200Response:
    """**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_forms_update(ad_account_id, lead_form_batch_update)


@router.get(
    "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}",
    responses={
        200: {"model": LeadForm, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_forms"],
    summary="Get lead form by id",
    response_model_by_alias=True,
)
async def lead_form_get(
    lead_form_id: Annotated[str, Field(strict=True, description="The ID of this lead form")] = Path(..., description="The ID of this lead form", regex=r"^\d+$"),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> LeadForm:
    """**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_form_get(lead_form_id, ad_account_id)


@router.post(
    "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test",
    responses={
        200: {"model": LeadFormTest, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_forms"],
    summary="Create lead form test data",
    response_model_by_alias=True,
)
async def lead_form_test_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    lead_form_id: Annotated[str, Field(strict=True, description="Unique identifier of a lead form.")] = Path(..., description="Unique identifier of a lead form.", regex=r"^\d+$"),
    lead_form_test_create: LeadFormTestCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadFormTest:
    """Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_create)
