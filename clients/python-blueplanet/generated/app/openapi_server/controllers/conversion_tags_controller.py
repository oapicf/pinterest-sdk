import connexion

from app.openapi_server.models.conversion_event_response import ConversionEventResponse  # noqa: E501
from app.openapi_server.models.conversion_tag import ConversionTag  # noqa: E501
from app.openapi_server.models.conversion_tag_create import ConversionTagCreate  # noqa: E501
from app.openapi_server.models.conversion_tags_list200_response import ConversionTagsList200Response  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.page_visit_conversion_tags_get200_response import PageVisitConversionTagsGet200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def conversion_tags_create(ad_account_id, body):  # noqa: E501
    """Create conversion tag

    Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match) # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: ConversionTag
    """
    if connexion.request.is_json:
        body = ConversionTagCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def conversion_tags_get(ad_account_id, conversion_tag_id):  # noqa: E501
    """Get conversion tag

    Get information about an existing conversion tag. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param conversion_tag_id: Id of the conversion tag.
    :type conversion_tag_id: str

    :rtype: ConversionTag
    """
    return 'do some magic!'


def conversion_tags_list(ad_account_id, filter_deleted=None):  # noqa: E501
    """List conversion tags

    List conversion tags associated with an ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param filter_deleted: Filter by deleted status
    :type filter_deleted: bool

    :rtype: ConversionTagsList200Response
    """
    return 'do some magic!'


def ocpm_eligible_conversion_tags_get(ad_account_id):  # noqa: E501
    """Get Ocpm eligible conversion tags

    Get Ocpm eligible conversion tag events for an ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Dict[str, List[ConversionEventResponse]]
    """
    return 'do some magic!'


def page_visit_conversion_tags_get(ad_account_id, page_size=None, order=None, bookmark=None):  # noqa: E501
    """Get page visit conversion tags

    Get all page visit conversion tag events for an ad account. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: PageVisitConversionTagsGet200Response
    """
    return 'do some magic!'
