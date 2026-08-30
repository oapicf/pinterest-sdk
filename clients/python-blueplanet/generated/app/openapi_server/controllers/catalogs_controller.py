import connexion

from app.openapi_server.models.catalog import Catalog  # noqa: E501
from app.openapi_server.models.catalog_create import CatalogCreate  # noqa: E501
from app.openapi_server.models.catalogs_available_filter_values import CatalogsAvailableFilterValues  # noqa: E501
from app.openapi_server.models.catalogs_list200_response import CatalogsList200Response  # noqa: E501
from app.openapi_server.models.catalogs_locale import CatalogsLocale  # noqa: E501
from app.openapi_server.models.country import Country  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def catalogs_available_filter_values(catalog_id, feed_id=None, country=None, language=None, ad_account_id=None):  # noqa: E501
    """List available filter values

    Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &#x60;country&#x60;, &#x60;language&#x60;, and &#x60;feed_id&#x60; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param catalog_id: Filter entities for a given catalog_id.
    :type catalog_id: str
    :param feed_id: Filter entities for a given feed_id. If not given, all feeds are considered.
    :type feed_id: str
    :param country: Country for the Catalogs Items
    :type country: dict | bytes
    :param language: Language for the Catalogs Items
    :type language: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsAvailableFilterValues
    """
    if connexion.request.is_json:
        country = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        language = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def catalogs_create(body, ad_account_id=None):  # noqa: E501
    """Create catalog

    Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Catalog
    """
    if connexion.request.is_json:
        body = CatalogCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def catalogs_list(ad_account_id=None, bookmark=None, page_size=None):  # noqa: E501
    """List catalogs

    Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/) # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: CatalogsList200Response
    """
    return 'do some magic!'
