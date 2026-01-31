import connexion

from app.openapi_server.models.customer_list_upload_create_request import CustomerListUploadCreateRequest  # noqa: E501
from app.openapi_server.models.customer_list_upload_create_response import CustomerListUploadCreateResponse  # noqa: E501
from app.openapi_server.models.customer_list_upload_response import CustomerListUploadResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def customer_list_uploads_create(ad_account_id, customer_list_id, body):  # noqa: E501
    """Create customer list upload

    &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param customer_list_id: Unique identifier of a customer list
    :type customer_list_id: str
    :param body: Parameters to create a customer list upload request
    :type body: dict | bytes

    :rtype: CustomerListUploadCreateResponse
    """
    if connexion.request.is_json:
        body = CustomerListUploadCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id):  # noqa: E501
    """Get customer list upload

    &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param customer_list_id: Unique identifier of a customer list
    :type customer_list_id: str
    :param customer_list_upload_id: Unique identifier of a customer list upload
    :type customer_list_upload_id: str

    :rtype: CustomerListUploadResponse
    """
    return 'do some magic!'


def customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id):  # noqa: E501
    """Run customer list upload

    &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param customer_list_id: Unique identifier of a customer list
    :type customer_list_id: str
    :param customer_list_upload_id: Unique identifier of a customer list upload
    :type customer_list_upload_id: str

    :rtype: CustomerListUploadResponse
    """
    return 'do some magic!'
