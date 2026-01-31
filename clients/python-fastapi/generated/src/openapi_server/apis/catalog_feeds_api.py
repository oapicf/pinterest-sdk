# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.catalog_feeds_api_base import BaseCatalogFeedsApi
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
from pydantic import Field, StrictInt, StrictStr, field_validator
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.catalogs_feed import CatalogsFeed
from openapi_server.models.catalogs_feed_ingestion import CatalogsFeedIngestion
from openapi_server.models.catalogs_item_validation_issue import CatalogsItemValidationIssue
from openapi_server.models.error import Error
from openapi_server.models.feed_processing_results_list200_response import FeedProcessingResultsList200Response
from openapi_server.models.feeds_create_request import FeedsCreateRequest
from openapi_server.models.feeds_list200_response import FeedsList200Response
from openapi_server.models.feeds_update_request import FeedsUpdateRequest
from openapi_server.models.items_issues_list200_response import ItemsIssuesList200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/catalogs/feeds",
    responses={
        200: {"model": FeedsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_feeds"],
    summary="List feeds",
    response_model_by_alias=True,
)
async def feeds_list(
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    catalog_id: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Filter entities for a given catalog_id. If not given, all catalogs are considered.")] = Query(None, description="Filter entities for a given catalog_id. If not given, all catalogs are considered.", alias="catalog_id", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read"]
    ),
) -> FeedsList200Response:
    """Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;."""
    if not BaseCatalogFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogFeedsApi.subclasses[0]().feeds_list(bookmark, page_size, catalog_id, ad_account_id)


@router.post(
    "/catalogs/feeds",
    responses={
        201: {"model": CatalogsFeed, "description": "Success"},
        400: {"model": Error, "description": "Invalid feed parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        403: {"model": Error, "description": "Business account required."},
        409: {"model": Error, "description": "User website required."},
        422: {"model": Error, "description": "Unique feed name is required."},
        501: {"model": Error, "description": "Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;)."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_feeds"],
    summary="Create feed",
    response_model_by_alias=True,
)
async def feeds_create(
    feeds_create_request: Annotated[FeedsCreateRequest, Field(description="Request object used to created a feed.")] = Body(None, description="Request object used to created a feed."),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> CatalogsFeed:
    """Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogFeedsApi.subclasses[0]().feeds_create(feeds_create_request, ad_account_id)


@router.get(
    "/catalogs/feeds/{feed_id}",
    responses={
        200: {"model": CatalogsFeed, "description": "Success"},
        400: {"model": Error, "description": "Invalid feed parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        404: {"model": Error, "description": "Data feed not found."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_feeds"],
    summary="Get feed",
    response_model_by_alias=True,
)
async def feeds_get(
    feed_id: Annotated[str, Field(strict=True, description="Unique identifier of a feed")] = Path(..., description="Unique identifier of a feed", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read"]
    ),
) -> CatalogsFeed:
    """Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;."""
    if not BaseCatalogFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogFeedsApi.subclasses[0]().feeds_get(feed_id, ad_account_id)


@router.delete(
    "/catalogs/feeds/{feed_id}",
    responses={
        204: {"description": "Feed deleted successfully."},
        400: {"model": Error, "description": "Invalid feed parameters."},
        403: {"model": Error, "description": "Forbidden. Account not approved for feed mutations yet."},
        404: {"model": Error, "description": "Data feed not found."},
        409: {"model": Error, "description": "Conflict. Can&#39;t delete a feed with active promotions."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_feeds"],
    summary="Delete feed",
    response_model_by_alias=True,
)
async def feeds_delete(
    feed_id: Annotated[str, Field(strict=True, description="Unique identifier of a feed")] = Path(..., description="Unique identifier of a feed", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> None:
    """Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;."""
    if not BaseCatalogFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogFeedsApi.subclasses[0]().feeds_delete(feed_id, ad_account_id)


@router.patch(
    "/catalogs/feeds/{feed_id}",
    responses={
        200: {"model": CatalogsFeed, "description": "Success"},
        400: {"model": Error, "description": "Invalid feed parameters."},
        403: {"model": Error, "description": "Forbidden. Account not approved for feed mutations yet."},
        404: {"model": Error, "description": "Data feed not found."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_feeds"],
    summary="Update feed",
    response_model_by_alias=True,
)
async def feeds_update(
    feed_id: Annotated[str, Field(strict=True, description="Unique identifier of a feed")] = Path(..., description="Unique identifier of a feed", regex=r"^\d+$"),
    feeds_update_request: Annotated[FeedsUpdateRequest, Field(description="Request object used to update a feed.")] = Body(None, description="Request object used to update a feed."),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read", "catalogs:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["catalogs:read", "catalogs:write"]
    ),
) -> CatalogsFeed:
    """Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogFeedsApi.subclasses[0]().feeds_update(feed_id, feeds_update_request, ad_account_id)


@router.post(
    "/catalogs/feeds/{feed_id}/ingest",
    responses={
        200: {"model": CatalogsFeedIngestion, "description": "The ingestion process was successfully started."},
        400: {"model": Error, "description": "Invalid feed parameters."},
        403: {"model": Error, "description": "Forbidden. Account not approved for feed mutations yet."},
        404: {"model": Error, "description": "Data feed not found."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["catalog_feeds"],
    summary="Ingest feed items",
    response_model_by_alias=True,
)
async def feeds_ingest(
    feed_id: Annotated[str, Field(strict=True, description="Unique identifier of a feed")] = Path(..., description="Unique identifier of a feed", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:write"]
    ),
) -> CatalogsFeedIngestion:
    """Ingest items for a given feed owned by the \&quot;operation user_account\&quot;.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager."""
    if not BaseCatalogFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogFeedsApi.subclasses[0]().feeds_ingest(feed_id, ad_account_id)


@router.get(
    "/catalogs/feeds/{feed_id}/processing_results",
    responses={
        200: {"model": FeedProcessingResultsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        401: {"model": Error, "description": "Unauthorized access."},
        404: {"model": Error, "description": "Feed not found."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_feeds"],
    summary="List feed processing results",
    response_model_by_alias=True,
)
async def feed_processing_results_list(
    feed_id: Annotated[str, Field(strict=True, description="Unique identifier of a feed")] = Path(..., description="Unique identifier of a feed", regex=r"^\d+$"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> FeedProcessingResultsList200Response:
    """Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogFeedsApi.subclasses[0]().feed_processing_results_list(feed_id, bookmark, page_size, ad_account_id)


@router.get(
    "/catalogs/processing_results/{processing_result_id}/item_issues",
    responses={
        200: {"model": ItemsIssuesList200Response, "description": "Success"},
        401: {"model": Error, "description": "Unauthorized access."},
        404: {"model": Error, "description": "Processing Result not found."},
        501: {"model": Error, "description": "Not implemented."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["catalog_feeds"],
    summary="List item issues",
    response_model_by_alias=True,
)
async def items_issues_list(
    processing_result_id: Annotated[str, Field(strict=True, description="Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).")] = Path(..., description="Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).", regex=r"^\d+$"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    item_numbers: Annotated[Optional[List[StrictInt]], Field(description="Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.")] = Query(None, description="Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.", alias="item_numbers"),
    item_validation_issue: Annotated[Optional[CatalogsItemValidationIssue], Field(description="Filter item validation issues that have a given type of item validation issue.")] = Query(None, description="Filter item validation issues that have a given type of item validation issue.", alias="item_validation_issue"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["catalogs:read"]
    ),
) -> ItemsIssuesList200Response:
    """List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/get&#39;&gt;Get catalogs report&lt;/a&gt; endpoints. Moreover, they support multiple types of catalogs.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;"""
    if not BaseCatalogFeedsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCatalogFeedsApi.subclasses[0]().items_issues_list(processing_result_id, bookmark, page_size, item_numbers, item_validation_issue, ad_account_id)
