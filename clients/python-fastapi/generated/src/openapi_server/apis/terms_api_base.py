# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.related_terms import RelatedTerms
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseTermsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseTermsApi.subclasses = BaseTermsApi.subclasses + (cls,)
    async def terms_related_list(
        self,
        terms: Annotated[List[StrictStr], Field(description="List of input terms.")],
    ) -> RelatedTerms:
        """Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc."""
        ...


    async def terms_suggested_list(
        self,
        term: Annotated[StrictStr, Field(description="Input term.")],
        limit: Annotated[Optional[Annotated[int, Field(le=10, strict=True, ge=1)]], Field(description="Max suggested terms to return.")],
    ) -> List[str]:
        """Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term."""
        ...
