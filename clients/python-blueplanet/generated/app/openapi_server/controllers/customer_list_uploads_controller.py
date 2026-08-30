import connexion

from app.openapi_server.models.customer_list_upload import CustomerListUpload  # noqa: E501
from app.openapi_server.models.customer_list_upload_create_request import CustomerListUploadCreateRequest  # noqa: E501
from app.openapi_server.models.customer_list_upload_create_response import CustomerListUploadCreateResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def customer_list_uploads_create(ad_account_id, customer_list_id, body):  # noqa: E501
    """Create customer list upload

    Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.** # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param customer_list_id: Customer list ID.
    :type customer_list_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: CustomerListUploadCreateResponse
    """
    if connexion.request.is_json:
        body = CustomerListUploadCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id):  # noqa: E501
    """Get customer list upload

    Get the metadata for a given upload by its ID. # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param customer_list_id: Customer list ID.
    :type customer_list_id: str
    :param customer_list_upload_id: Customer List Upload ID.
    :type customer_list_upload_id: str

    :rtype: CustomerListUpload
    """
    return 'do some magic!'


def customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id):  # noqa: E501
    """Run customer list upload

    Begin processing a customer list upload. # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param customer_list_id: Customer list ID.
    :type customer_list_id: str
    :param customer_list_upload_id: Customer List Upload ID.
    :type customer_list_upload_id: str

    :rtype: CustomerListUpload
    """
    return 'do some magic!'
