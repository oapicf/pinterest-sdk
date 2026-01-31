import connexion

from app.openapi_server.models.catalog import Catalog  # noqa: E501
from app.openapi_server.models.catalogs_available_filter_values import CatalogsAvailableFilterValues  # noqa: E501
from app.openapi_server.models.catalogs_create_request import CatalogsCreateRequest  # noqa: E501
from app.openapi_server.models.catalogs_list200_response import CatalogsList200Response  # noqa: E501
from app.openapi_server.models.catalogs_locale import CatalogsLocale  # noqa: E501
from app.openapi_server.models.country import Country  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def catalogs_available_filter_values(catalog_id, feed_id=None, country=None, language=None, ad_account_id=None):  # noqa: E501
    """List available filter values

    Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &lt;code&gt;country&lt;/code&gt;, &lt;code&gt;language&lt;/code&gt;, and &lt;code&gt;feed_id&lt;/code&gt; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt; # noqa: E501

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

    Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. # noqa: E501

    :param body: Request object used to created a feed.
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Catalog
    """
    if connexion.request.is_json:
        body = CatalogsCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def catalogs_list(bookmark=None, page_size=None, ad_account_id=None):  # noqa: E501
    """List catalogs

    Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt; # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsList200Response
    """
    return 'do some magic!'
