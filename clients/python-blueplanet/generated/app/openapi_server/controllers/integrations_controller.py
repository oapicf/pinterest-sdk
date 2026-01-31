import connexion

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.integration_logs_request import IntegrationLogsRequest  # noqa: E501
from app.openapi_server.models.integration_logs_success_response import IntegrationLogsSuccessResponse  # noqa: E501
from app.openapi_server.models.integration_metadata import IntegrationMetadata  # noqa: E501
from app.openapi_server.models.integration_record import IntegrationRecord  # noqa: E501
from app.openapi_server.models.integration_request import IntegrationRequest  # noqa: E501
from app.openapi_server.models.integration_request_patch import IntegrationRequestPatch  # noqa: E501
from app.openapi_server.models.integrations_get_list200_response import IntegrationsGetList200Response  # noqa: E501
from app.openapi_server.models.integrations_logs_post400_response import IntegrationsLogsPost400Response  # noqa: E501
from openapi_server import util


def integrations_commerce_del(external_business_id):  # noqa: E501
    """Delete commerce integration

    Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager. # noqa: E501

    :param external_business_id: External business ID for the integration.
    :type external_business_id: str

    :rtype: None
    """
    return 'do some magic!'


def integrations_commerce_get(external_business_id):  # noqa: E501
    """Get commerce integration

    Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager. # noqa: E501

    :param external_business_id: External business ID for the integration.
    :type external_business_id: str

    :rtype: IntegrationMetadata
    """
    return 'do some magic!'


def integrations_commerce_patch(external_business_id, body):  # noqa: E501
    """Update commerce integration

    Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager. # noqa: E501

    :param external_business_id: External business ID for the integration.
    :type external_business_id: str
    :param body: Parameters to get create/update the Integration Metadata
    :type body: dict | bytes

    :rtype: IntegrationMetadata
    """
    if connexion.request.is_json:
        body = IntegrationRequestPatch.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def integrations_commerce_post(body):  # noqa: E501
    """Create commerce integration

    Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager. # noqa: E501

    :param body: Parameters to get create/update the Integration Metadata
    :type body: dict | bytes

    :rtype: IntegrationMetadata
    """
    if connexion.request.is_json:
        body = IntegrationRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def integrations_get_by_id(id):  # noqa: E501
    """Get integration metadata

    Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager. # noqa: E501

    :param id: Integration ID.
    :type id: str

    :rtype: IntegrationRecord
    """
    return 'do some magic!'


def integrations_get_list(bookmark=None, page_size=None):  # noqa: E501
    """Get integration metadata list

    Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager. # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int

    :rtype: IntegrationsGetList200Response
    """
    return 'do some magic!'


def integrations_logs_post(body):  # noqa: E501
    """Receives batched logs from integration applications.

    This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager. # noqa: E501

    :param body: Ingest log information from external integration application.
    :type body: dict | bytes

    :rtype: IntegrationLogsSuccessResponse
    """
    if connexion.request.is_json:
        body = IntegrationLogsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
