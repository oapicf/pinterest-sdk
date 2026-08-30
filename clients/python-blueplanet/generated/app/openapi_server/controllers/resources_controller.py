import connexion

from app.openapi_server.models.ad_account_countries_get200_response import AdAccountCountriesGet200Response  # noqa: E501
from app.openapi_server.models.book_closed import BookClosed  # noqa: E501
from app.openapi_server.models.delivery_metrics_get200_response import DeliveryMetricsGet200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.public_targeting_type import PublicTargetingType  # noqa: E501
from app.openapi_server.models.report_type import ReportType  # noqa: E501
from app.openapi_server.models.single_interest_targeting_option import SingleInterestTargetingOption  # noqa: E501
from openapi_server import util


def ad_account_countries_get():  # noqa: E501
    """Get ad accounts countries

    Get Ad Accounts countries # noqa: E501


    :rtype: AdAccountCountriesGet200Response
    """
    return 'do some magic!'


def delivery_metrics_get(report_type=None):  # noqa: E501
    """Get available metrics&#39; definitions

    Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information. # noqa: E501

    :param report_type: Report type.
    :type report_type: dict | bytes

    :rtype: DeliveryMetricsGet200Response
    """
    if connexion.request.is_json:
        report_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def interest_targeting_options_get(interest_id):  # noqa: E501
    """Get interest details

    Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs. # noqa: E501

    :param interest_id: Unique identifier of an interest.
    :type interest_id: str

    :rtype: SingleInterestTargetingOption
    """
    return 'do some magic!'


def lead_form_questions_get():  # noqa: E501
    """Get lead form questions

    Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).** # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def metrics_ready_state_get(_date):  # noqa: E501
    """Get metrics ready state

    Learn whether conversion or non-conversion metrics are finalized and ready to query. # noqa: E501

    :param _date: Analytics reports request date (UTC). Format: YYYY-MM-DD
    :type _date: str

    :rtype: BookClosed
    """
    return 'do some magic!'


def targeting_options_get(targeting_type, ad_account_id=None, client_id=None, oauth_signature=None, timestamp=None):  # noqa: E501
    """Get targeting options

        You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60; # noqa: E501

    :param targeting_type: Public targeting type
    :type targeting_type: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param client_id: Client ID
    :type client_id: str
    :param oauth_signature: Oauth signature
    :type oauth_signature: str
    :param timestamp: Timestamp.
    :type timestamp: str

    :rtype: List[object]
    """
    if connexion.request.is_json:
        targeting_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
