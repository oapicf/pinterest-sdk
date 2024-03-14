const samples = require('../samples/BulkApi');
const BulkDownloadRequest = require('../models/BulkDownloadRequest');
const BulkDownloadResponse = require('../models/BulkDownloadResponse');
const BulkUpsertRequest = require('../models/BulkUpsertRequest');
const BulkUpsertResponse = require('../models/BulkUpsertResponse');
const BulkUpsertStatusResponse = require('../models/BulkUpsertStatusResponse');
const Error = require('../models/Error');
const utils = require('../utils/utils');

module.exports = {
    bulkDownload/create: {
        key: 'bulkDownload/create',
        noun: 'bulk',
        display: {
            label: 'Get advertiser entities in bulk',
            description: 'Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.',
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
                ...BulkDownloadRequest.fields(),
            ],
            outputFields: [
                ...BulkDownloadResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/bulk/download'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BulkDownloadRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['BulkDownloadResponseSample']
        }
    },
    bulkRequest/get: {
        key: 'bulkRequest/get',
        noun: 'bulk',
        display: {
            label: 'Download advertiser entities in bulk',
            description: 'Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).',
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
                    key: 'bulk_request_id',
                    label: 'Unique identifier of a bulk upsert request.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...BulkUpsertStatusResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
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
            sample: samples['BulkUpsertStatusResponseSample']
        }
    },
    bulkUpsert/create: {
        key: 'bulkUpsert/create',
        noun: 'bulk',
        display: {
            label: 'Create/update ad entities in bulk',
            description: 'Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.',
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
                ...BulkUpsertRequest.fields(),
            ],
            outputFields: [
                ...BulkUpsertResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/bulk/upsert'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BulkUpsertRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['BulkUpsertResponseSample']
        }
    },
}
