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
from openapi_server.models.error import Error
from openapi_server.models.lead_form_array_response import LeadFormArrayResponse
from openapi_server.models.lead_form_create_request import LeadFormCreateRequest
from openapi_server.models.lead_form_response import LeadFormResponse
from openapi_server.models.lead_form_test_request import LeadFormTestRequest
from openapi_server.models.lead_form_test_response import LeadFormTestResponse
from openapi_server.models.lead_form_update_request import LeadFormUpdateRequest
from openapi_server.models.lead_forms_list200_response import LeadFormsList200Response
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/lead_forms",
    responses={
        200: {"model": LeadFormsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account lead forms parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["lead_forms"],
    summary="List lead forms",
    response_model_by_alias=True,
)
async def lead_forms_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> LeadFormsList200Response:
    """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_forms_list(ad_account_id, page_size, order, bookmark)


@router.post(
    "/ad_accounts/{ad_account_id}/lead_forms",
    responses={
        200: {"model": LeadFormArrayResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account lead forms parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["lead_forms"],
    summary="Create lead forms",
    response_model_by_alias=True,
)
async def lead_forms_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    lead_form_create_request: Annotated[List[LeadFormCreateRequest], Field(min_length=1, max_length=30, description="List of lead forms to create, size limit [1, 30].")] = Body(None, description="List of lead forms to create, size limit [1, 30]."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadFormArrayResponse:
    """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_forms_create(ad_account_id, lead_form_create_request)


@router.patch(
    "/ad_accounts/{ad_account_id}/lead_forms",
    responses={
        200: {"model": LeadFormArrayResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account lead forms parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["lead_forms"],
    summary="Update lead forms",
    response_model_by_alias=True,
)
async def lead_forms_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    lead_form_update_request: Annotated[List[LeadFormUpdateRequest], Field(min_length=1, max_length=30, description="List of lead forms to update, size limit [1, 30].")] = Body(None, description="List of lead forms to update, size limit [1, 30]."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadFormArrayResponse:
    """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_forms_update(ad_account_id, lead_form_update_request)


@router.get(
    "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}",
    responses={
        200: {"model": LeadFormResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account lead forms parameters."},
        404: {"model": Error, "description": "The lead form ID for the given ad account ID does not exist."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["lead_forms"],
    summary="Get lead form by id",
    response_model_by_alias=True,
)
async def lead_form_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    lead_form_id: Annotated[str, Field(strict=True, description="Unique identifier of a lead form.")] = Path(..., description="Unique identifier of a lead form.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> LeadFormResponse:
    """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_form_get(ad_account_id, lead_form_id)


@router.post(
    "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test",
    responses={
        200: {"model": LeadFormTestResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        404: {"model": Error, "description": "Lead not found."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["lead_forms"],
    summary="Create lead form test data",
    response_model_by_alias=True,
)
async def lead_form_test_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    lead_form_id: Annotated[str, Field(strict=True, description="Unique identifier of a lead form.")] = Path(..., description="Unique identifier of a lead form.", regex=r"^\d+$"),
    lead_form_test_request: Annotated[LeadFormTestRequest, Field(description="Subscription to create.")] = Body(None, description="Subscription to create."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadFormTestResponse:
    """Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order."""
    if not BaseLeadFormsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadFormsApi.subclasses[0]().lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_request)
