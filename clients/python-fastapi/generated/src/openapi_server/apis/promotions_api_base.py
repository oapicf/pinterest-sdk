# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.promotion_create_request import PromotionCreateRequest
from openapi_server.models.promotion_response import PromotionResponse
from openapi_server.models.promotion_update_request import PromotionUpdateRequest
from openapi_server.models.promotions_list200_response import PromotionsList200Response
from openapi_server.models.promotions_response import PromotionsResponse
from openapi_server.security_api import get_token_pinterest_oauth2

class BasePromotionsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BasePromotionsApi.subclasses = BasePromotionsApi.subclasses + (cls,)
    async def promotions_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> PromotionsList200Response:
        """Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration."""
        ...


    async def promotions_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        promotion_create_request: Annotated[List[PromotionCreateRequest], Field(min_length=1, max_length=30, description="List of promotions to create, size limit [1, 30].")],
    ) -> PromotionsResponse:
        """Create multiple new promotions."""
        ...


    async def promotions_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        promotion_update_request: Annotated[List[PromotionUpdateRequest], Field(min_length=1, max_length=30, description="List of promotions to create, size limit [1, 30].")],
    ) -> PromotionsResponse:
        """Update multiple promotions."""
        ...


    async def promotions_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        promotion_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a promotion")],
    ) -> PromotionResponse:
        """Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id."""
        ...


    async def promotions_delete(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        promotion_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a promotion")],
    ) -> None:
        """Delete a promotion within Pinterest."""
        ...
