import connexion

from app.openapi_server.models.catalogs_create_report_response import CatalogsCreateReportResponse  # noqa: E501
from app.openapi_server.models.catalogs_report import CatalogsReport  # noqa: E501
from app.openapi_server.models.catalogs_report_parameters import CatalogsReportParameters  # noqa: E501
from app.openapi_server.models.catalogs_report_stats_parameters import CatalogsReportStatsParameters  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.reports_stats200_response import ReportsStats200Response  # noqa: E501
from openapi_server import util


def reports_create(body, ad_account_id=None):  # noqa: E501
    """Build catalogs report

    Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsCreateReportResponse
    """
    if connexion.request.is_json:
        body = CatalogsReportParameters.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def reports_get(token, ad_account_id=None):  # noqa: E501
    """Get catalogs report

    This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. # noqa: E501

    :param token: Token returned from the post request creation call
    :type token: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsReport
    """
    return 'do some magic!'


def reports_stats(parameters, ad_account_id=None, bookmark=None, page_size=None):  # noqa: E501
    """List report stats

    List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. # noqa: E501

    :param parameters: Contains the parameters for report identification.
    :type parameters: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: ReportsStats200Response
    """
    if connexion.request.is_json:
        parameters = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
