# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.audience import Audience
from openapi_server.models.audience_create_request import AudienceCreateRequest
from openapi_server.models.audience_update_request import AudienceUpdateRequest
from openapi_server.models.audiences_list200_response import AudiencesList200Response
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseAudiencesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAudiencesApi.subclasses = BaseAudiencesApi.subclasses + (cls,)
    async def audiences_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        ownership_type: Annotated[Optional[StrictStr], Field(description="Filter audiences by ownership type.")],
    ) -> AudiencesList200Response:
        """Get list of audiences for the ad account."""
        ...


    async def audiences_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        audience_create_request: Annotated[AudienceCreateRequest, Field(description="List of ads to create, size limit [1, 30]")],
    ) -> Audience:
        """Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific &#x60;audience_ids&#x60; when you create an ad group. &lt;p/&gt; Learn about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;creating different kinds of audiences&lt;/a&gt;."""
        ...


    async def audiences_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an audience")],
    ) -> Audience:
        """Get a specific audience given the audience ID."""
        ...


    async def audiences_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an audience")],
        audience_update_request: Annotated[AudienceUpdateRequest, Field(description="The audience to be updated.")],
    ) -> Audience:
        """Update (edit or remove) an existing targeting audience."""
        ...
