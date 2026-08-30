import connexion

from app.openapi_server.models.catalogs_items_batch import CatalogsItemsBatch  # noqa: E501
from app.openapi_server.models.catalogs_items_batch_post_request import CatalogsItemsBatchPostRequest  # noqa: E501
from app.openapi_server.models.catalogs_items_request import CatalogsItemsRequest  # noqa: E501
from app.openapi_server.models.items_post200_response import ItemsPost200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def items_batch_get(batch_id, ad_account_id=None):  # noqa: E501
    """Get item batch status

    Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. # noqa: E501

    :param batch_id: Id of a catalogs items batch to fetch
    :type batch_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsItemsBatch
    """
    return 'do some magic!'


def items_batch_post(body, ad_account_id=None):  # noqa: E501
    """Operate on item batch

    This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: CatalogsItemsBatch
    """
    if connexion.request.is_json:
        body = CatalogsItemsBatchPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def items_post(body, ad_account_id=None):  # noqa: E501
    """Get catalogs items (POST)

    Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: ItemsPost200Response
    """
    if connexion.request.is_json:
        body = CatalogsItemsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
