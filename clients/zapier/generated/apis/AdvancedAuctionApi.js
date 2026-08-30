const samples = require('../samples/AdvancedAuctionApi');
const AdvancedAuctionItems = require('../models/AdvancedAuctionItems');
const AdvancedAuctionItemsGetRequest = require('../models/AdvancedAuctionItemsGetRequest');
const AdvancedAuctionItemsSubmitRequest = require('../models/AdvancedAuctionItemsSubmitRequest');
const AdvancedAuctionProcessedItems = require('../models/AdvancedAuctionProcessedItems');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const utils = require('../utils/utils');

module.exports = {
    advancedAuctionItemsGet/post: {
        key: 'advancedAuctionItemsGet/post',
        noun: 'advanced_auction',
        display: {
            label: 'Get item bid options (POST)',
            description: 'Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...AdvancedAuctionItemsGetRequest.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...AdvancedAuctionItems.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/advanced_auction/items/get'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...AdvancedAuctionItemsGetRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'advancedAuctionItemsGet/post', response.json);
                    return results;
                })
            },
            sample: samples['AdvancedAuctionItemsSample']
        }
    },
    advancedAuctionItemsSubmit/post: {
        key: 'advancedAuctionItemsSubmit/post',
        noun: 'advanced_auction',
        display: {
            label: 'Operate on item level bid options',
            description: 'This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...AdvancedAuctionItemsSubmitRequest.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...AdvancedAuctionProcessedItems.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/advanced_auction/items/submit'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...AdvancedAuctionItemsSubmitRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'advancedAuctionItemsSubmit/post', response.json);
                    return results;
                })
            },
            sample: samples['AdvancedAuctionProcessedItemsSample']samples['AdvancedAuctionProcessedItemsSample']
        }
    },
}
