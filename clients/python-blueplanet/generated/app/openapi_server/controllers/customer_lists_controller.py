import connexion

from app.openapi_server.models.customer_list import CustomerList  # noqa: E501
from app.openapi_server.models.customer_list_create import CustomerListCreate  # noqa: E501
from app.openapi_server.models.customer_list_update_with_required_body import CustomerListUpdateWithRequiredBody  # noqa: E501
from app.openapi_server.models.customer_lists_list200_response import CustomerListsList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server import util


def customer_lists_create(ad_account_id, body):  # noqa: E501
    """Create customer lists

    Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create). # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: CustomerList
    """
    if connexion.request.is_json:
        body = CustomerListCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def customer_lists_get(ad_account_id, customer_list_id):  # noqa: E501
    """Get customer list

    Gets a specific customer list given the customer list ID. # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param customer_list_id: Customer list ID.
    :type customer_list_id: str

    :rtype: CustomerList
    """
    return 'do some magic!'


def customer_lists_list(ad_account_id, bookmark=None, page_size=None, order=None, exclude_nca=None):  # noqa: E501
    """Get customer lists

    Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide. # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes
    :param exclude_nca: When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
    :type exclude_nca: bool

    :rtype: CustomerListsList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def customer_lists_update(ad_account_id, customer_list_id, body):  # noqa: E501
    """Update customer list

    Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide. # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param customer_list_id: Customer list ID.
    :type customer_list_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: CustomerList
    """
    if connexion.request.is_json:
        body = CustomerListUpdateWithRequiredBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
