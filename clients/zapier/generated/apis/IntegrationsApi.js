const samples = require('../samples/IntegrationsApi');
const IntegrationLogsInvalidLogResponse = require('../models/IntegrationLogsInvalidLogResponse');
const IntegrationLogsRequestCreate = require('../models/IntegrationLogsRequestCreate');
const IntegrationLogsSuccessResponse = require('../models/IntegrationLogsSuccessResponse');
const IntegrationMetadata = require('../models/IntegrationMetadata');
const IntegrationMetadataCreate = require('../models/IntegrationMetadataCreate');
const IntegrationMetadataUpdate = require('../models/IntegrationMetadataUpdate');
const IntegrationRecord = require('../models/IntegrationRecord');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
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
                    label: 'Integration record ID.',
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
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
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
                ...IntegrationMetadata.fields('', false),
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
            sample: samples['IntegrationMetadataSample']
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
                ...IntegrationMetadataUpdate.fields(),
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
                        ...IntegrationMetadataUpdate.mapping(bundle),
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
                ...IntegrationMetadataCreate.fields(),
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
                        ...IntegrationMetadataCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'integrationsCommerce/post', response.json);
                    return results;
                })
            },
            sample: samples['IntegrationMetadataSample']samples['IntegrationMetadataSample']
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
                ...IntegrationLogsRequestCreate.fields(),
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
                        ...IntegrationLogsRequestCreate.mapping(bundle),
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
