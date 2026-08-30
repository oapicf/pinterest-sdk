# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.integration_logs_invalid_log_response import IntegrationLogsInvalidLogResponse
from openapi_server.models.integration_logs_request_create import IntegrationLogsRequestCreate
from openapi_server.models.integration_logs_success_response import IntegrationLogsSuccessResponse
from openapi_server.models.integration_metadata import IntegrationMetadata
from openapi_server.models.integration_metadata_create import IntegrationMetadataCreate
from openapi_server.models.integration_metadata_update import IntegrationMetadataUpdate
from openapi_server.models.integration_record import IntegrationRecord
from openapi_server.models.integrations_get_list200_response import IntegrationsGetList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseIntegrationsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseIntegrationsApi.subclasses = BaseIntegrationsApi.subclasses + (cls,)
    async def integrations_get_list(
        self,
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> IntegrationsGetList200Response:
        """Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_commerce_post(
        self,
        integration_metadata_create: IntegrationMetadataCreate,
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
    ) -> IntegrationMetadata:
        """Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_commerce_patch(
        self,
        external_business_id: Annotated[StrictStr, Field(description="External business ID for the integration.")],
        integration_metadata_update: IntegrationMetadataUpdate,
    ) -> IntegrationMetadata:
        """Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_logs_post(
        self,
        integration_logs_request_create: IntegrationLogsRequestCreate,
    ) -> IntegrationLogsSuccessResponse:
        """This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...


    async def integrations_get_by_id(
        self,
        id: Annotated[str, Field(strict=True, description="Integration record ID.")],
    ) -> IntegrationRecord:
        """Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager."""
        ...
