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
from openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse
from openapi_server.models.error import Error
from openapi_server.models.pin import Pin
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()


@router.get(
    "/pins/{pin_id}/analytics",
    responses={
        200: {"model": Dict[str, AnalyticsMetricsResponse], "description": "response"},
        403: {"model": Error, "description": "Not authorized to access board or Pin."},
        404: {"model": Error, "description": "Pin not found."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["pins"],
    summary="Get Pin analytics",
)
async def pins_analytics(
    pin_id: str = Path(None, description="Unique identifier of a Pin."),
    start_date: str = Query(None, description="Metric report start date (UTC). Format: YYYY-MM-DD"),
    end_date: str = Query(None, description="Metric report end date (UTC). Format: YYYY-MM-DD"),
    metric_types: List[str] = Query(None, description="Pin metric types to get data for, default is all."),
    app_types: str = Query(&#39;ALL&#39;, description="Apps or devices to get data for, default is all."),
    split_field: str = Query(&#39;NO_SPLIT&#39;, description="How to split the data into groups. Not including this param means data won&#39;t be split."),
    ad_account_id: str = Query(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
) -> Dict[str, AnalyticsMetricsResponse]:
    """Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin."""
    ...


@router.post(
    "/pins",
    responses={
        201: {"model": Pin, "description": "Successful pin creation."},
        400: {"model": Error, "description": "Invalid Pin parameters response"},
        403: {"model": Error, "description": "The Pin&#39;s image is too small, too large or is broken"},
        404: {"model": Error, "description": "Board or section not found"},
        429: {"model": Error, "description": "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["pins"],
    summary="Create Pin",
)
async def pins_create(
    pin: Pin = Body(None, description="Create a new Pin."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
) -> Pin:
    """Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation."""
    ...


@router.delete(
    "/pins/{pin_id}",
    responses={
        204: {"description": "Successfully deleted Pin"},
        403: {"model": Error, "description": "Not authorized to access board or Pin."},
        404: {"model": Error, "description": "Pin not found."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["pins"],
    summary="Delete Pin",
)
async def pins_delete(
    pin_id: str = Path(None, description="Unique identifier of a Pin."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write", "pins:read", "pins:write"]
    ),
) -> None:
    """Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.get(
    "/pins/{pin_id}",
    responses={
        200: {"model": Pin, "description": "response"},
        403: {"model": Error, "description": "Not authorized to access board or Pin."},
        404: {"model": Error, "description": "Pin not found."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["pins"],
    summary="Get Pin",
)
async def pins_get(
    pin_id: str = Path(None, description="Unique identifier of a Pin."),
    ad_account_id: str = Query(None, description="Unique identifier of an ad account.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
) -> Pin:
    """Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin."""
    ...
