# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, field_validator
from typing import Any
from typing_extensions import Annotated
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.product_tags_bulk_add_request import ProductTagsBulkAddRequest
from openapi_server.models.product_tags_bulk_delete_request import ProductTagsBulkDeleteRequest
from openapi_server.models.product_tags_error import ProductTagsError
from openapi_server.models.product_tags_response import ProductTagsResponse
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseProductTagsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseProductTagsApi.subclasses = BaseProductTagsApi.subclasses + (cls,)
    async def product_tags_list(
        self,
        pin_id: Annotated[str, Field(strict=True, description="Unique identifier of the hero pin that will receive product tags.")],
    ) -> ProductTagsResponse:
        """Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags."""
        ...


    async def product_tags_bulk_add(
        self,
        pin_id: Annotated[str, Field(strict=True, description="Unique identifier of the hero pin that will receive product tags.")],
        product_tags_bulk_add_request: ProductTagsBulkAddRequest,
    ) -> ProductTagsResponse:
        """Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success."""
        ...


    async def product_tags_bulk_delete(
        self,
        pin_id: Annotated[str, Field(strict=True, description="Unique identifier of the hero pin that will receive product tags.")],
        product_tags_bulk_delete_request: ProductTagsBulkDeleteRequest,
    ) -> None:
        """Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success."""
        ...
