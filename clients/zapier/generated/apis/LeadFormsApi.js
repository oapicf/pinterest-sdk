const samples = require('../samples/LeadFormsApi');
const LeadForm = require('../models/LeadForm');
const LeadFormBatchUpdate = require('../models/LeadFormBatchUpdate');
const LeadFormCreate = require('../models/LeadFormCreate');
const LeadFormTest = require('../models/LeadFormTest');
const LeadFormTestCreate = require('../models/LeadFormTestCreate');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const lead_forms_create_200_response = require('../models/lead_forms_create_200_response');
const lead_forms_list_200_response = require('../models/lead_forms_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    leadForm/get: {
        key: 'leadForm/get',
        noun: 'lead_forms',
        display: {
            label: 'Get lead form by id',
            description: '**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'lead_form_id',
                    label: 'The ID of this lead form',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...LeadForm.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadForm/get', response.json);
                    return results;
                })
            },
            sample: samples['LeadFormSample']
        }
    },
    leadFormTest/create: {
        key: 'leadFormTest/create',
        noun: 'lead_forms',
        display: {
            label: 'Create lead form test data',
            description: 'Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.',
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
                    key: 'lead_form_id',
                    label: 'Unique identifier of a lead form.',
                    type: 'string',
                    required: true,
                },
                ...LeadFormTestCreate.fields(),
            ],
            outputFields: [
                ...LeadFormTest.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LeadFormTestCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadFormTest/create', response.json);
                    return results;
                })
            },
            sample: samples['LeadFormTestSample']
        }
    },
    leadForms/create: {
        key: 'leadForms/create',
        noun: 'lead_forms',
        display: {
            label: 'Create lead forms',
            description: '**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).',
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
                    key: 'LeadFormCreate',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...lead_forms_create_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/lead_forms'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LeadFormCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadForms/create', response.json);
                    return results;
                })
            },
            sample: samples['lead_forms_create_200_responseSample']
        }
    },
    leadForms/list: {
        key: 'leadForms/list',
        noun: 'lead_forms',
        display: {
            label: 'List lead forms',
            description: '**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).',
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
                ....fields(),
            ],
            outputFields: [
                ...lead_forms_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/lead_forms'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'order': bundle.inputData?.['order'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadForms/list', response.json);
                    return results;
                })
            },
            sample: samples['lead_forms_list_200_responseSample']
        }
    },
    leadForms/update: {
        key: 'leadForms/update',
        noun: 'lead_forms',
        display: {
            label: 'Update lead forms',
            description: '**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).',
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
                    key: 'LeadFormBatchUpdate',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...lead_forms_create_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/lead_forms'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LeadFormBatchUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadForms/update', response.json);
                    return results;
                })
            },
            sample: samples['lead_forms_create_200_responseSample']
        }
    },
}
