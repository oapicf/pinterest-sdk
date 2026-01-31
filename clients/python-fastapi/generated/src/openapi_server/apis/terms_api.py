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
from openapi_server.models.error import Error
from openapi_server.models.related_terms import RelatedTerms
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/terms/related",
    responses={
        200: {"model": RelatedTerms, "description": "Success"},
        400: {"model": Error, "description": "Invalid terms related parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
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
    """Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc."""
    if not BaseTermsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTermsApi.subclasses[0]().terms_related_list(terms)


@router.get(
    "/terms/suggested",
    responses={
        200: {"model": List[str], "description": "Success"},
        400: {"model": Error, "description": "Invalid terms suggested parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
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
    """Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term."""
    if not BaseTermsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTermsApi.subclasses[0]().terms_suggested_list(term, limit)
