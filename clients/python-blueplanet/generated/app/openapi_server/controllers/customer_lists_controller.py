import connexion

from app.openapi_server.models.customer_list import CustomerList  # noqa: E501
from app.openapi_server.models.customer_list_request import CustomerListRequest  # noqa: E501
from app.openapi_server.models.customer_list_update_request import CustomerListUpdateRequest  # noqa: E501
from app.openapi_server.models.customer_lists_list200_response import CustomerListsList200Response  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def customer_lists_create(ad_account_id, body):  # noqa: E501
    """Create customer lists

    &lt;p&gt;Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).&lt;/p&gt; &lt;p&gt;A customer list is one of the four types of Pinterest audiences: for more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;p/&gt; &lt;p&gt;&lt;b&gt;Please review our &lt;u&gt;&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting#section-13341\&quot; target&#x3D;\&quot;_blank\&quot;&gt;requirements&lt;/a&gt;&lt;/u&gt; for what type of information is allowed when uploading a customer list.&lt;/b&gt;&lt;/p&gt; &lt;p&gt;When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.&lt;/p&gt; &lt;p&gt;To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/audiences-create\&quot; target&#x3D;\&quot;blank\&quot;&gt;create audience endpoint&lt;/a&gt;.&lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: Parameters to get Customer lists info
    :type body: dict | bytes

    :rtype: CustomerList
    """
    if connexion.request.is_json:
        body = CustomerListRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def customer_lists_get(ad_account_id, customer_list_id):  # noqa: E501
    """Get customer list

    Gets a specific customer list given the customer list ID. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param customer_list_id: Unique identifier of a customer list
    :type customer_list_id: str

    :rtype: CustomerList
    """
    return 'do some magic!'


def customer_lists_list(ad_account_id, page_size=None, order=None, bookmark=None):  # noqa: E501
    """Get customer lists

    &lt;p&gt;Get a set of customer lists including id and name based on the filters provided.&lt;/p&gt; &lt;p&gt;(Customer lists are a type of audience.) For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;  or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: CustomerListsList200Response
    """
    return 'do some magic!'


def customer_lists_update(ad_account_id, customer_list_id, body):  # noqa: E501
    """Update customer list

    &lt;p&gt;Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)&lt;/p&gt; &lt;p&gt;When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param customer_list_id: Unique identifier of a customer list
    :type customer_list_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: CustomerList
    """
    if connexion.request.is_json:
        body = CustomerListUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
