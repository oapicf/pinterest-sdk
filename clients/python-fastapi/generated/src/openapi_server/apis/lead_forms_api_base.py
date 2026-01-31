# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.lead_form_array_response import LeadFormArrayResponse
from openapi_server.models.lead_form_create_request import LeadFormCreateRequest
from openapi_server.models.lead_form_response import LeadFormResponse
from openapi_server.models.lead_form_test_request import LeadFormTestRequest
from openapi_server.models.lead_form_test_response import LeadFormTestResponse
from openapi_server.models.lead_form_update_request import LeadFormUpdateRequest
from openapi_server.models.lead_forms_list200_response import LeadFormsList200Response
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseLeadFormsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLeadFormsApi.subclasses = BaseLeadFormsApi.subclasses + (cls,)
    async def lead_forms_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> LeadFormsList200Response:
        """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
        ...


    async def lead_forms_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        lead_form_create_request: Annotated[List[LeadFormCreateRequest], Field(min_length=1, max_length=30, description="List of lead forms to create, size limit [1, 30].")],
    ) -> LeadFormArrayResponse:
        """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
        ...


    async def lead_forms_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        lead_form_update_request: Annotated[List[LeadFormUpdateRequest], Field(min_length=1, max_length=30, description="List of lead forms to update, size limit [1, 30].")],
    ) -> LeadFormArrayResponse:
        """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
        ...


    async def lead_form_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        lead_form_id: Annotated[str, Field(strict=True, description="Unique identifier of a lead form.")],
    ) -> LeadFormResponse:
        """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;."""
        ...


    async def lead_form_test_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        lead_form_id: Annotated[str, Field(strict=True, description="Unique identifier of a lead form.")],
        lead_form_test_request: Annotated[LeadFormTestRequest, Field(description="Subscription to create.")],
    ) -> LeadFormTestResponse:
        """Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order."""
        ...
