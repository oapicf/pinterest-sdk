const samples = require('../samples/ProductGroupsApi');
const Error = require('../models/Error');
const ad_accounts_catalogs_product_groups_list_200_response = require('../models/ad_accounts_catalogs_product_groups_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    adAccountsCatalogsProductGroups/list: {
        key: 'adAccountsCatalogsProductGroups/list',
        noun: 'product_groups',
        display: {
            label: 'Get catalog product groups',
            description: 'This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'feed_profile_id',
                    label: 'The feed profile id whose catalog product groups we want to return.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ad_accounts_catalogs_product_groups_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/product_groups/catalogs'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'feed_profile_id': bundle.inputData?.['feed_profile_id'],
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['ad_accounts_catalogs_product_groups_list_200_responseSample']
        }
    },
}
