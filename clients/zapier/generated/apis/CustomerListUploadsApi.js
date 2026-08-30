const samples = require('../samples/CustomerListUploadsApi');
const CustomerListUpload = require('../models/CustomerListUpload');
const CustomerListUploadCreateRequest = require('../models/CustomerListUploadCreateRequest');
const CustomerListUploadCreateResponse = require('../models/CustomerListUploadCreateResponse');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const utils = require('../utils/utils');

module.exports = {
    customerListUploads/create: {
        key: 'customerListUploads/create',
        noun: 'customer_list_uploads',
        display: {
            label: 'Create customer list upload',
            description: 'Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_id',
                    label: 'Customer list ID.',
                    type: 'string',
                    required: true,
                },
                ...CustomerListUploadCreateRequest.fields(),
            ],
            outputFields: [
                ...CustomerListUploadCreateResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CustomerListUploadCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerListUploads/create', response.json);
                    return results;
                })
            },
            sample: samples['CustomerListUploadCreateResponseSample']
        }
    },
    customerListUploads/get: {
        key: 'customerListUploads/get',
        noun: 'customer_list_uploads',
        display: {
            label: 'Get customer list upload',
            description: 'Get the metadata for a given upload by its ID.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_id',
                    label: 'Customer list ID.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_upload_id',
                    label: 'Customer List Upload ID.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...CustomerListUpload.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerListUploads/get', response.json);
                    return results;
                })
            },
            sample: samples['CustomerListUploadSample']
        }
    },
    customerListUploads/run: {
        key: 'customerListUploads/run',
        noun: 'customer_list_uploads',
        display: {
            label: 'Run customer list upload',
            description: 'Begin processing a customer list upload.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_id',
                    label: 'Customer list ID.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_upload_id',
                    label: 'Customer List Upload ID.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...CustomerListUpload.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run'),
                    method: 'POST',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'customerListUploads/run', response.json);
                    return results;
                })
            },
            sample: samples['CustomerListUploadSample']
        }
    },
}
