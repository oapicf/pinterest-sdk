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
from openapi_server.models.error import Error
from openapi_server.models.media_upload import MediaUpload
from openapi_server.models.media_upload_details import MediaUploadDetails
from openapi_server.models.media_upload_request import MediaUploadRequest
from openapi_server.models.paginated import Paginated
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()


@router.post(
    "/media",
    responses={
        201: {"model": MediaUpload, "description": "response"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["media"],
    summary="Register media upload",
)
async def media_create(
    media_upload_request: MediaUploadRequest = Body(None, description="Create a media upload request"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["pins:read", "pins:write"]
    ),
) -> MediaUpload:
    """Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation."""
    ...


@router.get(
    "/media/{media_id}",
    responses={
        200: {"model": MediaUploadDetails, "description": "response"},
        404: {"model": Error, "description": "Media upload not found"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["media"],
    summary="Get media upload details",
)
async def media_get(
    media_id: str = Path(None, description="Media identifier", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["pins:read"]
    ),
) -> MediaUploadDetails:
    """Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation."""
    ...


@router.get(
    "/media",
    responses={
        200: {"model": Paginated, "description": "response"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["media"],
    summary="List media uploads",
)
async def media_list(
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["pins:read"]
    ),
) -> Paginated:
    """List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation."""
    ...
