const samples = require('../samples/SchedulesApi');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const Schedule = require('../models/Schedule');
const ScheduleBatchUpdate = require('../models/ScheduleBatchUpdate');
const ScheduleCreate = require('../models/ScheduleCreate');
const ScheduleStatus = require('../models/ScheduleStatus');
const ScheduleType = require('../models/ScheduleType');
const schedules_create_200_response_inner = require('../models/schedules_create_200_response_inner');
const schedules_list_200_response = require('../models/schedules_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    schedules/create: {
        key: 'schedules/create',
        noun: 'schedules',
        display: {
            label: 'Create schedules',
            description: 'Batch create schedules',
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
                    key: 'ScheduleCreate',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/schedules'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ScheduleCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'schedules/create', response.json);
                    return results;
                })
            },
            sample: samples['schedules_create_200_response_innerSample']samples['ScheduleSample']
        }
    },
    schedules/list: {
        key: 'schedules/list',
        noun: 'schedules',
        display: {
            label: 'Get Schedules',
            description: 'Get schedules for a specific advertiser',
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
                    key: 'entity_ids',
                    label: 'List of Entity IDs, must be associated with the Ad Accound ID provided in the path.',
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
                ....fields(),
                {
                    key: 'schedule_statuses',
                    label: 'Filter schedules by status (one or more)',
                    type: 'string',
                }
                ....fields(),
            ],
            outputFields: [
                ...schedules_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/schedules'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'entity_ids': bundle.inputData?.['entity_ids'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'order': bundle.inputData?.['order'],
                        'schedule_statuses': bundle.inputData?.['schedule_statuses'],
                        'schedule_type': bundle.inputData?.['schedule_type'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'schedules/list', response.json);
                    return results;
                })
            },
            sample: samples['schedules_list_200_responseSample']
        }
    },
    schedules/update: {
        key: 'schedules/update',
        noun: 'schedules',
        display: {
            label: 'Update schedules',
            description: 'Update one or more schedules',
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
                    key: 'ScheduleBatchUpdate',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/schedules'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ScheduleBatchUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'schedules/update', response.json);
                    return results;
                })
            },
            sample: samples['schedules_create_200_response_innerSample']
        }
    },
}
