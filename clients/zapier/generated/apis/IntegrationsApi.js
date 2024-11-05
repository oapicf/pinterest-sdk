const samples = require('../samples/IntegrationsApi');
const DetailedError = require('../models/DetailedError');
const Error = require('../models/Error');
const IntegrationLogsRequest = require('../models/IntegrationLogsRequest');
const IntegrationLogsSuccessResponse = require('../models/IntegrationLogsSuccessResponse');
const IntegrationMetadata = require('../models/IntegrationMetadata');
const IntegrationRecord = require('../models/IntegrationRecord');
const IntegrationRequest = require('../models/IntegrationRequest');
const IntegrationRequestPatch = require('../models/IntegrationRequestPatch');
const integrations_get_list_200_response = require('../models/integrations_get_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    integrations/getById: {
        key: 'integrations/getById',
        noun: 'integrations',
        display: {
            label: 'Get integration metadata',
            description: 'Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'id',
                    label: 'Integration ID.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...IntegrationRecord.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/integrations/{id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'integrations/getById', response.json);
                    return results;
                })
            },
            sample: samples['IntegrationRecordSample']
        }
    },
    integrations/getList: {
        key: 'integrations/getList',
        noun: 'integrations',
        display: {
            label: 'Get integration metadata list',
            description: 'Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...integrations_get_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/integrations'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'integrations/getList', response.json);
                    return results;
                })
            },
            sample: samples['integrations_get_list_200_responseSample']
        }
    },
    integrationsCommerce/del: {
        key: 'integrationsCommerce/del',
        noun: 'integrations',
        display: {
            label: 'Delete commerce integration',
            description: 'Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'external_business_id',
                    label: 'External business ID for the integration.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/integrations/commerce/{external_business_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'integrationsCommerce/del', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    integrationsCommerce/get: {
        key: 'integrationsCommerce/get',
        noun: 'integrations',
        display: {
            label: 'Get commerce integration',
            description: 'Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'external_business_id',
                    label: 'External business ID for the integration.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...IntegrationMetadata.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/integrations/commerce/{external_business_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'integrationsCommerce/get', response.json);
                    return results;
                })
            },
            sample: samples['IntegrationMetadataSample']
        }
    },
    integrationsCommerce/patch: {
        key: 'integrationsCommerce/patch',
        noun: 'integrations',
        display: {
            label: 'Update commerce integration',
            description: 'Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'external_business_id',
                    label: 'External business ID for the integration.',
                    type: 'string',
                    required: true,
                },
                ...IntegrationRequestPatch.fields(),
            ],
            outputFields: [
                ...IntegrationMetadata.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/integrations/commerce/{external_business_id}'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...IntegrationRequestPatch.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'integrationsCommerce/patch', response.json);
                    return results;
                })
            },
            sample: samples['IntegrationMetadataSample']
        }
    },
    integrationsCommerce/post: {
        key: 'integrationsCommerce/post',
        noun: 'integrations',
        display: {
            label: 'Create commerce integration',
            description: 'Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...IntegrationRequest.fields(),
            ],
            outputFields: [
                ...IntegrationMetadata.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/integrations/commerce'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...IntegrationRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'integrationsCommerce/post', response.json);
                    return results;
                })
            },
            sample: samples['IntegrationMetadataSample']
        }
    },
    integrationsLogs/post: {
        key: 'integrationsLogs/post',
        noun: 'integrations',
        display: {
            label: 'Receives batched logs from integration applications.',
            description: 'This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...IntegrationLogsRequest.fields(),
            ],
            outputFields: [
                ...IntegrationLogsSuccessResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/integrations/logs'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...IntegrationLogsRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'integrationsLogs/post', response.json);
                    return results;
                })
            },
            sample: samples['IntegrationLogsSuccessResponseSample']
        }
    },
}
