# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.integration_logs_request import IntegrationLogsRequest
from openapi_server.models.integration_logs_success_response import IntegrationLogsSuccessResponse
from openapi_server.models.integration_metadata import IntegrationMetadata
from openapi_server.models.integration_record import IntegrationRecord
from openapi_server.models.integration_request import IntegrationRequest
from openapi_server.models.integration_request_patch import IntegrationRequestPatch
from openapi_server.models.integrations_get_list200_response import IntegrationsGetList200Response
from openapi_server.models.integrations_logs_post400_response import IntegrationsLogsPost400Response
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseIntegrationsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseIntegrationsApi.subclasses = BaseIntegrationsApi.subclasses + (cls,)
    async def integrations_commerce_post(
        self,
        integration_request: Annotated[IntegrationRequest, Field(description="Parameters to get create/update the Integration Metadata")],
    ) -> IntegrationMetadata:
        """Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_commerce_get(
        self,
        external_business_id: Annotated[StrictStr, Field(description="External business ID for the integration.")],
    ) -> IntegrationMetadata:
        """Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_commerce_del(
        self,
        external_business_id: Annotated[StrictStr, Field(description="External business ID for the integration.")],
    ) -> None:
        """Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_commerce_patch(
        self,
        external_business_id: Annotated[StrictStr, Field(description="External business ID for the integration.")],
        integration_request_patch: Annotated[IntegrationRequestPatch, Field(description="Parameters to get create/update the Integration Metadata")],
    ) -> IntegrationMetadata:
        """Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_logs_post(
        self,
        integration_logs_request: Annotated[IntegrationLogsRequest, Field(description="Ingest log information from external integration application.")],
    ) -> IntegrationLogsSuccessResponse:
        """This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_get_list(
        self,
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> IntegrationsGetList200Response:
        """Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_get_by_id(
        self,
        id: Annotated[StrictStr, Field(description="Integration ID.")],
    ) -> IntegrationRecord:
        """Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...
