const samples = require('../samples/BulkApi');
const BulkDownload = require('../models/BulkDownload');
const BulkDownloadCreate = require('../models/BulkDownloadCreate');
const BulkJobData = require('../models/BulkJobData');
const BulkUpsertRequest = require('../models/BulkUpsertRequest');
const BulkUpsertResponse = require('../models/BulkUpsertResponse');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const utils = require('../utils/utils');

module.exports = {
    bulkDownload/create: {
        key: 'bulkDownload/create',
        noun: 'bulk',
        display: {
            label: 'Get advertiser entities in bulk',
            description: 'Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.',
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
                ...BulkDownloadCreate.fields(),
            ],
            outputFields: [
                ...BulkDownload.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/bulk/download'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BulkDownloadCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'bulkDownload/create', response.json);
                    return results;
                })
            },
            sample: samples['BulkDownloadSample']samples['BulkDownloadSample']
        }
    },
    bulkRequest/get: {
        key: 'bulkRequest/get',
        noun: 'bulk',
        display: {
            label: 'Download advertiser entities in bulk',
            description: 'Get the status of a bulk request by &#x60;request_id&#x60;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).',
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
                    label: 'Bulk request ID that is from one of the entities bulk endpoints',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'include_details',
                    label: 'If set to True then attach the errors/details to all the requests',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...BulkJobData.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'include_details': bundle.inputData?.['include_details'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'bulkRequest/get', response.json);
                    return results;
                })
            },
            sample: samples['BulkJobDataSample']
        }
    },
    bulkUpsert/create: {
        key: 'bulkUpsert/create',
        noun: 'bulk',
        display: {
            label: 'Create/update ad entities in bulk',
            description: 'Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.',
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
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...BulkUpsertRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'bulkUpsert/create', response.json);
                    return results;
                })
            },
            sample: samples['BulkUpsertResponseSample']
        }
    },
}
