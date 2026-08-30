# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, field_validator
from typing_extensions import Annotated
from openapi_server.models.leads_export_response_data import LeadsExportResponseData
from openapi_server.models.leads_exports import LeadsExports
from openapi_server.models.leads_exports_create import LeadsExportsCreate
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseLeadsExportApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLeadsExportApi.subclasses = BaseLeadsExportApi.subclasses + (cls,)
    async def leads_export_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        leads_exports_create: LeadsExportsCreate,
    ) -> LeadsExports:
        """**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
        ...


    async def leads_export_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        leads_export_id: Annotated[str, Field(strict=True, description="lead_export_id token returned from the create a lead export endpoint")],
    ) -> LeadsExportResponseData:
        """**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads)."""
        ...
