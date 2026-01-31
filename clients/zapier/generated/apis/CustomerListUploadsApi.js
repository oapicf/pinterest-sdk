const samples = require('../samples/CustomerListUploadsApi');
const CustomerListUploadCreateRequest = require('../models/CustomerListUploadCreateRequest');
const CustomerListUploadCreateResponse = require('../models/CustomerListUploadCreateResponse');
const CustomerListUploadResponse = require('../models/CustomerListUploadResponse');
const Error = require('../models/Error');
const utils = require('../utils/utils');

module.exports = {
    customerListUploads/create: {
        key: 'customerListUploads/create',
        noun: 'customer_list_uploads',
        display: {
            label: 'Create customer list upload',
            description: '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;',
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
                    key: 'customer_list_id',
                    label: 'Unique identifier of a customer list',
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
            description: '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;',
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
                    key: 'customer_list_id',
                    label: 'Unique identifier of a customer list',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_upload_id',
                    label: 'Unique identifier of a customer list upload',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...CustomerListUploadResponse.fields('', false),
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
            sample: samples['CustomerListUploadResponseSample']
        }
    },
    customerListUploads/run: {
        key: 'customerListUploads/run',
        noun: 'customer_list_uploads',
        display: {
            label: 'Run customer list upload',
            description: '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;',
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
                    key: 'customer_list_id',
                    label: 'Unique identifier of a customer list',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'customer_list_upload_id',
                    label: 'Unique identifier of a customer list upload',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...CustomerListUploadResponse.fields('', false),
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
            sample: samples['CustomerListUploadResponseSample']
        }
    },
}
