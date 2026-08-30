import connexion

from app.openapi_server.models.ads_credit_redeem import AdsCreditRedeem  # noqa: E501
from app.openapi_server.models.ads_credit_redeem_create import AdsCreditRedeemCreate  # noqa: E501
from app.openapi_server.models.ads_credits_discounts_get200_response import AdsCreditsDiscountsGet200Response  # noqa: E501
from app.openapi_server.models.billing_invoice_document_type import BillingInvoiceDocumentType  # noqa: E501
from app.openapi_server.models.billing_invoice_download_response import BillingInvoiceDownloadResponse  # noqa: E501
from app.openapi_server.models.billing_invoice_sort_field import BillingInvoiceSortField  # noqa: E501
from app.openapi_server.models.billing_invoice_status import BillingInvoiceStatus  # noqa: E501
from app.openapi_server.models.billing_invoices_get200_response import BillingInvoicesGet200Response  # noqa: E501
from app.openapi_server.models.billing_profiles_get200_response import BillingProfilesGet200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.ssio_account import SSIOAccount  # noqa: E501
from app.openapi_server.models.ssio_insertion_order import SSIOInsertionOrder  # noqa: E501
from app.openapi_server.models.ssio_insertion_order_create import SSIOInsertionOrderCreate  # noqa: E501
from app.openapi_server.models.ssio_insertion_order_status_response import SSIOInsertionOrderStatusResponse  # noqa: E501
from app.openapi_server.models.ssio_insertion_order_update import SSIOInsertionOrderUpdate  # noqa: E501
from app.openapi_server.models.ssio_insertion_orders_status_get_by_ad_account200_response import SsioInsertionOrdersStatusGetByAdAccount200Response  # noqa: E501
from app.openapi_server.models.ssio_order_lines_get_by_ad_account200_response import SsioOrderLinesGetByAdAccount200Response  # noqa: E501
from openapi_server import util


def ads_credit_redeem(ad_account_id, body):  # noqa: E501
    """Redeem ad credits

    Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).** # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AdsCreditRedeem
    """
    if connexion.request.is_json:
        body = AdsCreditRedeemCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ads_credits_discounts_get(ad_account_id, bookmark=None, page_size=None):  # noqa: E501
    """Get ads credit discounts

    Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).** # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: AdsCreditsDiscountsGet200Response
    """
    return 'do some magic!'


def billing_invoice_download_get(ad_account_id, billing_invoice_id):  # noqa: E501
    """Get download url for a billing invoice

    Get download url for a billing invoice. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param billing_invoice_id: Unique identifier of a billing invoice.
    :type billing_invoice_id: str

    :rtype: BillingInvoiceDownloadResponse
    """
    return 'do some magic!'


def billing_invoices_get(ad_account_id, bookmark=None, page_size=None, order=None, sort=None, status=None, document_type=None, start_due_date=None, end_due_date=None):  # noqa: E501
    """Get billing invoices

    Get billing invoices in the advertiser account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes
    :param sort: Field of which to sort billing invoices
    :type sort: dict | bytes
    :param status: Status of billing invoices to filter by
    :type status: dict | bytes
    :param document_type: Document type of billing invoices to filter by
    :type document_type: dict | bytes
    :param start_due_date: Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
    :type start_due_date: str
    :param end_due_date: Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
    :type end_due_date: str

    :rtype: BillingInvoicesGet200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        sort = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        status = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        document_type = .from_dict(connexion.request.get_json())  # noqa: E501
    start_due_date = util.deserialize_date(start_due_date)
    end_due_date = util.deserialize_date(end_due_date)
    return 'do some magic!'


def billing_profiles_get(is_active, ad_account_id, bookmark=None, page_size=None):  # noqa: E501
    """Get billing profiles

    Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).** # noqa: E501

    :param is_active: Return active billing profiles, if false return all billing profiles.
    :type is_active: bool
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BillingProfilesGet200Response
    """
    return 'do some magic!'


def ssio_accounts_get(ad_account_id):  # noqa: E501
    """Get Salesforce account details including bill-to information.

      Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: SSIOAccount
    """
    return 'do some magic!'


def ssio_insertion_order_create(ad_account_id, body):  # noqa: E501
    """Create insertion order through SSIO.

      Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: SSIOInsertionOrder
    """
    if connexion.request.is_json:
        body = SSIOInsertionOrderCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ssio_insertion_order_edit(ad_account_id, body):  # noqa: E501
    """Edit insertion order through SSIO.

      Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: SSIOInsertionOrder
    """
    if connexion.request.is_json:
        body = SSIOInsertionOrderUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ssio_insertion_orders_status_get_by_ad_account(ad_account_id, bookmark=None, page_size=None):  # noqa: E501
    """Get insertion order status by ad account id.

      Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: SsioInsertionOrdersStatusGetByAdAccount200Response
    """
    return 'do some magic!'


def ssio_insertion_orders_status_get_by_pin_order_id(ad_account_id, pin_order_id):  # noqa: E501
    """Get insertion order status by pin order id.

      Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param pin_order_id: The pin order id associated with the ssio insertion order
    :type pin_order_id: str

    :rtype: SSIOInsertionOrderStatusResponse
    """
    return 'do some magic!'


def ssio_order_lines_get_by_ad_account(ad_account_id, pin_order_id=None, bookmark=None, page_size=None):  # noqa: E501
    """Get Salesforce order lines by ad account id.

      Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param pin_order_id: The pin order id associated with the SSIO insertion order
    :type pin_order_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: SsioOrderLinesGetByAdAccount200Response
    """
    return 'do some magic!'
