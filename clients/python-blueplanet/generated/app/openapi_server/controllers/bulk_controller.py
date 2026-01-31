import connexion

from app.openapi_server.models.bulk_download_request import BulkDownloadRequest  # noqa: E501
from app.openapi_server.models.bulk_download_response import BulkDownloadResponse  # noqa: E501
from app.openapi_server.models.bulk_upsert_request import BulkUpsertRequest  # noqa: E501
from app.openapi_server.models.bulk_upsert_response import BulkUpsertResponse  # noqa: E501
from app.openapi_server.models.bulk_upsert_status_response import BulkUpsertStatusResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def bulk_download_create(ad_account_id, body):  # noqa: E501
    """Get advertiser entities in bulk

    Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: Parameters to get ad entities in bulk
    :type body: dict | bytes

    :rtype: BulkDownloadResponse
    """
    if connexion.request.is_json:
        body = BulkDownloadRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def bulk_request_get(ad_account_id, bulk_request_id, include_details=None):  # noqa: E501
    """Download advertiser entities in bulk

    Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords). # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bulk_request_id: Unique identifier of a bulk upsert request.
    :type bulk_request_id: str
    :param include_details: if set to True then attach the errors/details to all the requests
    :type include_details: bool

    :rtype: BulkUpsertStatusResponse
    """
    return 'do some magic!'


def bulk_upsert_create(ad_account_id, body):  # noqa: E501
    """Create/update ad entities in bulk

    Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: Parameters to get create/update ad entities in bulk
    :type body: dict | bytes

    :rtype: BulkUpsertResponse
    """
    if connexion.request.is_json:
        body = BulkUpsertRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
