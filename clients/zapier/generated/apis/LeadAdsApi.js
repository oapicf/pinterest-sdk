const samples = require('../samples/LeadAdsApi');
const LeadSubscription = require('../models/LeadSubscription');
const LeadSubscriptionPostParamsCreate = require('../models/LeadSubscriptionPostParamsCreate');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const ad_accounts_subscriptions_get_list_200_response = require('../models/ad_accounts_subscriptions_get_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    adAccountsSubscriptions/delById: {
        key: 'adAccountsSubscriptions/delById',
        noun: 'lead_ads',
        display: {
            label: 'Delete lead ads subscription',
            description: 'Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;',
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
                    key: 'subscription_id',
                    label: 'Unique identifier of a subscription.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...LeadSubscription.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccountsSubscriptions/delById', response.json);
                    return results;
                })
            },
            sample: samples['LeadSubscriptionSample']
        }
    },
    adAccountsSubscriptions/getById: {
        key: 'adAccountsSubscriptions/getById',
        noun: 'lead_ads',
        display: {
            label: 'Get lead ads subscription by ID',
            description: 'Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;',
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
                    key: 'subscription_id',
                    label: 'Unique identifier of a subscription.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...LeadSubscription.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccountsSubscriptions/getById', response.json);
                    return results;
                })
            },
            sample: samples['LeadSubscriptionSample']
        }
    },
    adAccountsSubscriptions/getList: {
        key: 'adAccountsSubscriptions/getList',
        noun: 'lead_ads',
        display: {
            label: 'Get lead ads subscriptions',
            description: 'Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.',
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
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ad_accounts_subscriptions_get_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/leads/subscriptions'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccountsSubscriptions/getList', response.json);
                    return results;
                })
            },
            sample: samples['ad_accounts_subscriptions_get_list_200_responseSample']
        }
    },
    adAccountsSubscriptions/post: {
        key: 'adAccountsSubscriptions/post',
        noun: 'lead_ads',
        display: {
            label: 'Create lead ads subscription',
            description: 'Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.',
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
                ...LeadSubscriptionPostParamsCreate.fields(),
            ],
            outputFields: [
                ...LeadSubscription.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/leads/subscriptions'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LeadSubscriptionPostParamsCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adAccountsSubscriptions/post', response.json);
                    return results;
                })
            },
            sample: samples['LeadSubscriptionSample']
        }
    },
}
