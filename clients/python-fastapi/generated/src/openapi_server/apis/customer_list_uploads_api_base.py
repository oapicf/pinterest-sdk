# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, field_validator
from typing_extensions import Annotated
from openapi_server.models.customer_list_upload_create_request import CustomerListUploadCreateRequest
from openapi_server.models.customer_list_upload_create_response import CustomerListUploadCreateResponse
from openapi_server.models.customer_list_upload_response import CustomerListUploadResponse
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseCustomerListUploadsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCustomerListUploadsApi.subclasses = BaseCustomerListUploadsApi.subclasses + (cls,)
    async def customer_list_uploads_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list")],
        customer_list_upload_create_request: Annotated[CustomerListUploadCreateRequest, Field(description="Parameters to create a customer list upload request")],
    ) -> CustomerListUploadCreateResponse:
        """&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;"""
        ...


    async def customer_list_uploads_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list")],
        customer_list_upload_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list upload")],
    ) -> CustomerListUploadResponse:
        """&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;"""
        ...


    async def customer_list_uploads_run(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list")],
        customer_list_upload_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list upload")],
    ) -> CustomerListUploadResponse:
        """&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;"""
        ...
