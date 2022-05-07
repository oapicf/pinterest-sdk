# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.account import Account
from openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()


@router.get(
    "/user_account/analytics",
    responses={
        200: {"model": Dict[str, AnalyticsMetricsResponse], "description": "Success"},
        403: {"model": Error, "description": "Not authorized to access the user account analytics."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["user_account"],
    summary="Get user account analytics",
)
async def user_account_analytics(
    start_date: str = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD"),
    end_date: str = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD"),
    from_claimed_content: str = Query(&#39;BOTH&#39;, description="Filter on Pins that match your claimed domain."),
    pin_format: str = Query(&#39;ALL&#39;, description="Pin formats to get data for, default is all."),
    app_types: str = Query(&#39;ALL&#39;, description="Apps or devices to get data for, default is all."),
    metric_types: List[str] = Query(None, description="Metric types to get data for, default is all. "),
    split_field: str = Query(&#39;NO_SPLIT&#39;, description="How to split the data into groups. Not including this param means data won&#39;t be split."),
    ad_account_id: str = Query(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
) -> Dict[str, AnalyticsMetricsResponse]:
    """Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;."""
    ...


@router.get(
    "/user_account",
    responses={
        200: {"model": Account, "description": "response"},
        403: {"model": Error, "description": "Not authorized to access the user account."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["user_account"],
    summary="Get user account",
)
async def user_account_get(
    ad_account_id: str = Query(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
) -> Account:
    """Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information."""
    ...
