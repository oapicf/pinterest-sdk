import connexion

from app.openapi_server.models.advanced_auction_items import AdvancedAuctionItems  # noqa: E501
from app.openapi_server.models.advanced_auction_items_get_request import AdvancedAuctionItemsGetRequest  # noqa: E501
from app.openapi_server.models.advanced_auction_items_submit_request import AdvancedAuctionItemsSubmitRequest  # noqa: E501
from app.openapi_server.models.advanced_auction_processed_items import AdvancedAuctionProcessedItems  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def advanced_auction_items_get_post(body, ad_account_id=None):  # noqa: E501
    """Get item bid options (POST)

    Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users. # noqa: E501

    :param body: Request object used to get bid options values for a batch of retail catalog items
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: AdvancedAuctionItems
    """
    if connexion.request.is_json:
        body = AdvancedAuctionItemsGetRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def advanced_auction_items_submit_post(body, ad_account_id=None):  # noqa: E501
    """Operate on item level bid options

    This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users. # noqa: E501

    :param body: Request object used to upsert or delete bid options for a batch of retail catalog items
    :type body: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: AdvancedAuctionProcessedItems
    """
    if connexion.request.is_json:
        body = AdvancedAuctionItemsSubmitRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
