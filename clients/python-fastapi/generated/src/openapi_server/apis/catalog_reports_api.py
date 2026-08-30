# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.catalog_reports_api_base import BaseCatalogReportsApi
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
from typing import Any, Dict, Optional
from typing_extensions import Annotated
from openapi_server.models.catalogs_create_report_response import CatalogsCreateReportResponse
from openapi_server.models.catalogs_report import CatalogsReport
from openapi_server.models.catalogs_report_parameters import CatalogsReportParameters
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.reports_stats200_response import ReportsStats200Response
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/catalogs/reports",
    responses={
        200: {"model": CatalogsReport, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_reports"],
    summary="Get catalogs report",
    response_model_by_alias=True,
)
async def reports_get(
    token: Annotated[StrictStr, Field(description="Token returned from the post request creation call")] = Query(None, description="Token returned from the post request creation call", alias="token"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsReport:
    """This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager."""
    if not BaseCatalogReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogReportsApi.subclasses[0]().reports_get(token, ad_account_id)


@router.post(
    "/catalogs/reports",
    responses={
        200: {"model": CatalogsCreateReportResponse, "description": "The request has succeeded."},
        201: {"model": CatalogsCreateReportResponse, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_reports"],
    summary="Build catalogs report",
    response_model_by_alias=True,
)
async def reports_create(
    catalogs_report_parameters: CatalogsReportParameters = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsCreateReportResponse:
    """Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog."""
    if not BaseCatalogReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogReportsApi.subclasses[0]().reports_create(catalogs_report_parameters, ad_account_id)


@router.get(
    "/catalogs/reports/stats",
    responses={
        200: {"model": ReportsStats200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["catalog_reports"],
    summary="List report stats",
    response_model_by_alias=True,
)
async def reports_stats(
    parameters: Annotated[Dict[str, Any], Field(description="Contains the parameters for report identification.")] = Query(None, description="Contains the parameters for report identification.", alias="parameters"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> ReportsStats200Response:
    """List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager."""
    if not BaseCatalogReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogReportsApi.subclasses[0]().reports_stats(parameters, ad_account_id, bookmark, page_size)
