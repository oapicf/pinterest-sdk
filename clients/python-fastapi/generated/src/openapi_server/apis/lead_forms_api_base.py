# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.lead_form import LeadForm
from openapi_server.models.lead_form_batch_update import LeadFormBatchUpdate
from openapi_server.models.lead_form_create import LeadFormCreate
from openapi_server.models.lead_form_test import LeadFormTest
from openapi_server.models.lead_form_test_create import LeadFormTestCreate
from openapi_server.models.lead_forms_create200_response import LeadFormsCreate200Response
from openapi_server.models.lead_forms_list200_response import LeadFormsList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseLeadFormsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLeadFormsApi.subclasses = BaseLeadFormsApi.subclasses + (cls,)
    async def lead_forms_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
    ) -> LeadFormsList200Response:
        """**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
        ...


    async def lead_forms_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        lead_form_create: Annotated[List[LeadFormCreate], Field(min_length=1, max_length=30)],
    ) -> LeadFormsCreate200Response:
        """**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
        ...


    async def lead_forms_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        lead_form_batch_update: Annotated[List[LeadFormBatchUpdate], Field(min_length=1, max_length=30)],
    ) -> LeadFormsCreate200Response:
        """**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
        ...


    async def lead_form_get(
        self,
        lead_form_id: Annotated[str, Field(strict=True, description="The ID of this lead form")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> LeadForm:
        """**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
        ...


    async def lead_form_test_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        lead_form_id: Annotated[str, Field(strict=True, description="Unique identifier of a lead form.")],
        lead_form_test_create: LeadFormTestCreate,
    ) -> LeadFormTest:
        """Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order."""
        ...
