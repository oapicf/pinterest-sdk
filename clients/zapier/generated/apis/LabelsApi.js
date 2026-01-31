const samples = require('../samples/LabelsApi');
const Error = require('../models/Error');
const LabelCreateRequest = require('../models/LabelCreateRequest');
const LabelUpdateRequest = require('../models/LabelUpdateRequest');
const LabelsResponse = require('../models/LabelsResponse');
const labels_list_200_response = require('../models/labels_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    labels/create: {
        key: 'labels/create',
        noun: 'labels',
        display: {
            label: 'Create labels',
            description: '&lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;',
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
            description: '&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;',
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
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
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
                        'page_size': bundle.inputData?.['page_size'],
                        'bookmark': bundle.inputData?.['bookmark'],
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
    labels/update: {
        key: 'labels/update',
        noun: 'labels',
        display: {
            label: 'Update labels',
            description: '&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;',
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
