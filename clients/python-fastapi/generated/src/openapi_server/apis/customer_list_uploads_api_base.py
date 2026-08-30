# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, field_validator
from typing_extensions import Annotated
from openapi_server.models.customer_list_upload import CustomerListUpload
from openapi_server.models.customer_list_upload_create_request import CustomerListUploadCreateRequest
from openapi_server.models.customer_list_upload_create_response import CustomerListUploadCreateResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseCustomerListUploadsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCustomerListUploadsApi.subclasses = BaseCustomerListUploadsApi.subclasses + (cls,)
    async def customer_list_uploads_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")],
        customer_list_upload_create_request: CustomerListUploadCreateRequest,
    ) -> CustomerListUploadCreateResponse:
        """Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**"""
        ...


    async def customer_list_uploads_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")],
        customer_list_upload_id: Annotated[str, Field(strict=True, description="Customer List Upload ID.")],
    ) -> CustomerListUpload:
        """Get the metadata for a given upload by its ID."""
        ...


    async def customer_list_uploads_run(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")],
        customer_list_upload_id: Annotated[str, Field(strict=True, description="Customer List Upload ID.")],
    ) -> CustomerListUpload:
        """Begin processing a customer list upload."""
        ...
