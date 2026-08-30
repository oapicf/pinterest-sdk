const samples = require('../samples/LabelsApi');
const LabelCreateRequest = require('../models/LabelCreateRequest');
const LabelUpdateRequest = require('../models/LabelUpdateRequest');
const LabeledEntities = require('../models/LabeledEntities');
const LabeledEntitiesCreate = require('../models/LabeledEntitiesCreate');
const LabelsResponse = require('../models/LabelsResponse');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const QueryLabelEntityStatusesItems = require('../models/QueryLabelEntityStatusesItems');
const QueryLabelTypesItems = require('../models/QueryLabelTypesItems');
const labels_list_200_response = require('../models/labels_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    labels/apply: {
        key: 'labels/apply',
        noun: 'labels',
        display: {
            label: 'Apply label to entity',
            description: '  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.',
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
                    key: 'label_id',
                    label: 'Label ID.',
                    type: 'string',
                    required: true,
                },
                ...LabeledEntitiesCreate.fields(),
            ],
            outputFields: [
                ...LabeledEntities.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/labels/{label_id}/apply'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LabeledEntitiesCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'labels/apply', response.json);
                    return results;
                })
            },
            sample: samples['LabeledEntitiesSample']samples['LabeledEntitiesSample']
        }
    },
    labels/create: {
        key: 'labels/create',
        noun: 'labels',
        display: {
            label: 'Create labels',
            description: '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.',
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
                ...LabelCreateRequest.fields(),
            ],
            outputFields: [
                ...LabelsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/labels'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LabelCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'labels/create', response.json);
                    return results;
                })
            },
            sample: samples['LabelsResponseSample']
        }
    },
    labels/list: {
        key: 'labels/list',
        noun: 'labels',
        display: {
            label: 'List labels',
            description: '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.',
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
                    key: 'campaign_ids',
                    label: 'List of Campaign Ids to use to filter the results.',
                    type: 'string',
                }
                {
                    key: 'label_ids',
                    label: 'List of Label Ids to use to filter the results.',
                    type: 'string',
                }
                {
                    key: 'entity_statuses',
                    label: 'Label entity status',
                    type: 'string',
                }
                {
                    key: 'label_types',
                    label: 'Label type.',
                    type: 'string',
                }
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
                ...labels_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/labels'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'campaign_ids': bundle.inputData?.['campaign_ids'],
                        'label_ids': bundle.inputData?.['label_ids'],
                        'entity_statuses': bundle.inputData?.['entity_statuses'],
                        'label_types': bundle.inputData?.['label_types'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'labels/list', response.json);
                    return results;
                })
            },
            sample: samples['labels_list_200_responseSample']
        }
    },
    labels/remove: {
        key: 'labels/remove',
        noun: 'labels',
        display: {
            label: 'Remove label from entities',
            description: '  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.',
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
                    key: 'label_id',
                    label: 'Label ID.',
                    type: 'string',
                    required: true,
                },
                ...LabeledEntitiesCreate.fields(),
            ],
            outputFields: [
                ...LabeledEntities.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/labels/{label_id}/remove'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LabeledEntitiesCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'labels/remove', response.json);
                    return results;
                })
            },
            sample: samples['LabeledEntitiesSample']samples['LabeledEntitiesSample']
        }
    },
    labels/update: {
        key: 'labels/update',
        noun: 'labels',
        display: {
            label: 'Update labels',
            description: '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.',
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
                ...LabelUpdateRequest.fields(),
            ],
            outputFields: [
                ...LabelsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/labels'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LabelUpdateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'labels/update', response.json);
                    return results;
                })
            },
            sample: samples['LabelsResponseSample']
        }
    },
}
