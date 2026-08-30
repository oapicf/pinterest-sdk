# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.terms_api_base import BaseTermsApi
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
from pydantic import Field, StrictStr
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.related_terms import RelatedTerms
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/terms/related",
    responses={
        200: {"model": RelatedTerms, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["terms"],
    summary="List related terms",
    response_model_by_alias=True,
)
async def terms_related_list(
    terms: Annotated[List[StrictStr], Field(description="List of input terms.")] = Query(None, description="List of input terms.", alias="terms"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> RelatedTerms:
    """Get a list of terms logically related to each input term.  Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc."""
    if not BaseTermsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTermsApi.subclasses[0]().terms_related_list(terms)


@router.get(
    "/terms/suggested",
    responses={
        200: {"model": List[str], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["terms"],
    summary="List suggested terms",
    response_model_by_alias=True,
)
async def terms_suggested_list(
    term: Annotated[StrictStr, Field(description="Input term.")] = Query(None, description="Input term.", alias="term"),
    limit: Annotated[Optional[Annotated[int, Field(le=10, strict=True, ge=1)]], Field(description="Max suggested terms to return.")] = Query(4, description="Max suggested terms to return.", alias="limit", ge=1, le=10),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> List[str]:
    """Get popular search terms that begin with your input term.  Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term."""
    if not BaseTermsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTermsApi.subclasses[0]().terms_suggested_list(term, limit)
