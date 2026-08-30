# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.bulk_download import BulkDownload
from openapi_server.models.bulk_download_create import BulkDownloadCreate
from openapi_server.models.bulk_job_data import BulkJobData
from openapi_server.models.bulk_upsert_request import BulkUpsertRequest
from openapi_server.models.bulk_upsert_response import BulkUpsertResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseBulkApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBulkApi.subclasses = BaseBulkApi.subclasses + (cls,)
    async def bulk_download_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bulk_download_create: BulkDownloadCreate,
    ) -> BulkDownload:
        """Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data."""
        ...


    async def bulk_upsert_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bulk_upsert_request: Annotated[BulkUpsertRequest, Field(description="Parameters to get create/update ad entities in bulk")],
    ) -> BulkUpsertResponse:
        """Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request."""
        ...


    async def bulk_request_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bulk_request_id: Annotated[StrictStr, Field(description="Bulk request ID that is from one of the entities bulk endpoints")],
        include_details: Annotated[Optional[StrictBool], Field(description="If set to True then attach the errors/details to all the requests")],
    ) -> BulkJobData:
        """Get the status of a bulk request by &#x60;request_id&#x60;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords)."""
        ...
