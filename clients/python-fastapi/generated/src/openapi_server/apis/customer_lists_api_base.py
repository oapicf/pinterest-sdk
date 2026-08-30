# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.customer_list import CustomerList
from openapi_server.models.customer_list_create import CustomerListCreate
from openapi_server.models.customer_list_update_with_required_body import CustomerListUpdateWithRequiredBody
from openapi_server.models.customer_lists_list200_response import CustomerListsList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseCustomerListsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCustomerListsApi.subclasses = BaseCustomerListsApi.subclasses + (cls,)
    async def customer_lists_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        exclude_nca: Annotated[Optional[StrictBool], Field(description="When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).")],
    ) -> CustomerListsList200Response:
        """Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide."""
        ...


    async def customer_lists_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        customer_list_create: CustomerListCreate,
    ) -> CustomerList:
        """Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create)."""
        ...


    async def customer_lists_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")],
    ) -> CustomerList:
        """Gets a specific customer list given the customer list ID."""
        ...


    async def customer_lists_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")],
        customer_list_update_with_required_body: CustomerListUpdateWithRequiredBody,
    ) -> CustomerList:
        """Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide."""
        ...
