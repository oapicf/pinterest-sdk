import connexion

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.lead_form_array_response import LeadFormArrayResponse  # noqa: E501
from app.openapi_server.models.lead_form_create_request import LeadFormCreateRequest  # noqa: E501
from app.openapi_server.models.lead_form_response import LeadFormResponse  # noqa: E501
from app.openapi_server.models.lead_form_test_request import LeadFormTestRequest  # noqa: E501
from app.openapi_server.models.lead_form_test_response import LeadFormTestResponse  # noqa: E501
from app.openapi_server.models.lead_form_update_request import LeadFormUpdateRequest  # noqa: E501
from app.openapi_server.models.lead_forms_list200_response import LeadFormsList200Response  # noqa: E501
from openapi_server import util


def lead_form_get(ad_account_id, lead_form_id):  # noqa: E501
    """Get lead form by id

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param lead_form_id: Unique identifier of a lead form.
    :type lead_form_id: str

    :rtype: LeadFormResponse
    """
    return 'do some magic!'


def lead_form_test_create(ad_account_id, lead_form_id, body):  # noqa: E501
    """Create lead form test data

    Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param lead_form_id: Unique identifier of a lead form.
    :type lead_form_id: str
    :param body: Subscription to create.
    :type body: dict | bytes

    :rtype: LeadFormTestResponse
    """
    if connexion.request.is_json:
        body = LeadFormTestRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def lead_forms_create(ad_account_id, body):  # noqa: E501
    """Create lead forms

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: List of lead forms to create, size limit [1, 30].
    :type body: list | bytes

    :rtype: LeadFormArrayResponse
    """
    if connexion.request.is_json:
        body = [LeadFormCreateRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def lead_forms_list(ad_account_id, page_size=None, order=None, bookmark=None):  # noqa: E501
    """List lead forms

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: LeadFormsList200Response
    """
    return 'do some magic!'


def lead_forms_update(ad_account_id, body):  # noqa: E501
    """Update lead forms

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: List of lead forms to update, size limit [1, 30].
    :type body: list | bytes

    :rtype: LeadFormArrayResponse
    """
    if connexion.request.is_json:
        body = [LeadFormUpdateRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
