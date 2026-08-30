import connexion

from app.openapi_server.models.lead_form import LeadForm  # noqa: E501
from app.openapi_server.models.lead_form_batch_update import LeadFormBatchUpdate  # noqa: E501
from app.openapi_server.models.lead_form_create import LeadFormCreate  # noqa: E501
from app.openapi_server.models.lead_form_test import LeadFormTest  # noqa: E501
from app.openapi_server.models.lead_form_test_create import LeadFormTestCreate  # noqa: E501
from app.openapi_server.models.lead_forms_create200_response import LeadFormsCreate200Response  # noqa: E501
from app.openapi_server.models.lead_forms_list200_response import LeadFormsList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server import util


def lead_form_get(lead_form_id, ad_account_id):  # noqa: E501
    """Get lead form by id

    **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads). # noqa: E501

    :param lead_form_id: The ID of this lead form
    :type lead_form_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: LeadForm
    """
    return 'do some magic!'


def lead_form_test_create(ad_account_id, lead_form_id, body):  # noqa: E501
    """Create lead form test data

    Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order. # noqa: E501

    :param ad_account_id: 
    :type ad_account_id: str
    :param lead_form_id: Unique identifier of a lead form.
    :type lead_form_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LeadFormTest
    """
    if connexion.request.is_json:
        body = LeadFormTestCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def lead_forms_create(ad_account_id, body):  # noqa: E501
    """Create lead forms

    **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads). # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: LeadFormsCreate200Response
    """
    if connexion.request.is_json:
        body = [LeadFormCreate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def lead_forms_list(ad_account_id, bookmark=None, page_size=None, order=None):  # noqa: E501
    """List lead forms

    **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads). # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes

    :rtype: LeadFormsList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def lead_forms_update(ad_account_id, body):  # noqa: E501
    """Update lead forms

    **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads). # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: LeadFormsCreate200Response
    """
    if connexion.request.is_json:
        body = [LeadFormBatchUpdate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
