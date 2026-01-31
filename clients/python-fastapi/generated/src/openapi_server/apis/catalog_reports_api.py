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
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.catalogs_create_report_response import CatalogsCreateReportResponse
from openapi_server.models.catalogs_report import CatalogsReport
from openapi_server.models.catalogs_report_parameters import CatalogsReportParameters
from openapi_server.models.error import Error
from openapi_server.models.reports_stats200_response import ReportsStats200Response
from openapi_server.models.reports_stats_parameters_parameter import ReportsStatsParametersParameter
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/catalogs/reports",
    responses={
        200: {"model": CatalogsReport, "description": "Response that contains a link to download the report"},
        400: {"model": Error, "description": "The token you provided is not valid or has expired."},
        409: {"model": Error, "description": "Can&#39;t access this feature without an existing catalog."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_reports"],
    summary="Get catalogs report",
    response_model_by_alias=True,
)
async def reports_get(
    token: Annotated[StrictStr, Field(description="Token returned from async build report call")] = Query(None, description="Token returned from async build report call", alias="token"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsReport:
    """This returns a URL to a report given a token returned from &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt;. You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager."""
    if not BaseCatalogReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogReportsApi.subclasses[0]().reports_get(token, ad_account_id)


@router.post(
    "/catalogs/reports",
    responses={
        200: {"model": CatalogsCreateReportResponse, "description": "Response containing the report token"},
        404: {"model": Error, "description": "Entity (e.g., catalog, feed or processing_result) not found"},
        409: {"model": Error, "description": "Can&#39;t access this feature without an existing catalog."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_reports"],
    summary="Build catalogs report",
    response_model_by_alias=True,
)
async def reports_create(
    catalogs_report_parameters: Annotated[CatalogsReportParameters, Field(description="Request object to asynchronously create a report.")] = Body(None, description="Request object to asynchronously create a report."),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> CatalogsCreateReportResponse:
    """Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogReportsApi.subclasses[0]().reports_create(catalogs_report_parameters, ad_account_id)


@router.get(
    "/catalogs/reports/stats",
    responses={
        200: {"model": ReportsStats200Response, "description": "Response containing the diagnostics aggregated counters"},
        401: {"model": Error, "description": "Not authorized to access catalogs"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_reports"],
    summary="List report stats",
    response_model_by_alias=True,
)
async def reports_stats(
    parameters: Annotated[ReportsStatsParametersParameter, Field(description="Contains the parameters for report identification.")] = Query(None, description="Contains the parameters for report identification.", alias="parameters"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> ReportsStats200Response:
    """List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager."""
    if not BaseCatalogReportsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogReportsApi.subclasses[0]().reports_stats(parameters, ad_account_id, page_size, bookmark)
