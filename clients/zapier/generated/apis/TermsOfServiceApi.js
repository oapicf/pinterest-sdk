const samples = require('../samples/TermsOfServiceApi');
const Error = require('../models/Error');
const TermsOfService = require('../models/TermsOfService');
const utils = require('../utils/utils');

module.exports = {
    termsOfService/get: {
        key: 'termsOfService/get',
        noun: 'terms_of_service',
        display: {
            label: 'Get terms of service',
            description: 'Get the text of the terms of service and see whether the advertiser has accepted the terms of service.',
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
                    key: 'include_html',
                    label: 'Return HTML in TOS text.',
                    type: 'boolean',
                },
                {
                    key: 'tos_type',
                    label: 'Request type.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...TermsOfService.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/terms_of_service'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'include_html': bundle.inputData?.['include_html'],
                        'tos_type': bundle.inputData?.['tos_type'],
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
            sample: samples['TermsOfServiceSample']
        }
    },
}
