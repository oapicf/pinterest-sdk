import connexion

from app.openapi_server.models.leads_export_response_data import LeadsExportResponseData  # noqa: E501
from app.openapi_server.models.leads_exports import LeadsExports  # noqa: E501
from app.openapi_server.models.leads_exports_create import LeadsExportsCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def leads_export_create(ad_account_id, body):  # noqa: E501
    """Create a request to export leads collected from a lead ad

    **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads). # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: LeadsExports
    """
    if connexion.request.is_json:
        body = LeadsExportsCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def leads_export_get(ad_account_id, leads_export_id):  # noqa: E501
    """Get the lead export from the lead export create call

    **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads). # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param leads_export_id: lead_export_id token returned from the create a lead export endpoint
    :type leads_export_id: str

    :rtype: LeadsExportResponseData
    """
    return 'do some magic!'
