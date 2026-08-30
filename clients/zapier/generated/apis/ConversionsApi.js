const samples = require('../samples/ConversionsApi');
const AdvertiserDefinedEventsCreateRequest = require('../models/AdvertiserDefinedEventsCreateRequest');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const advertiser_defined_events_create_200_response = require('../models/advertiser_defined_events_create_200_response');
const advertiser_defined_events_get_200_response = require('../models/advertiser_defined_events_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    advertiserDefinedEvents/create: {
        key: 'advertiserDefinedEvents/create',
        noun: 'conversions',
        display: {
            label: 'Create advertiser defined events',
            description: 'Map advertiser defined events to standard events for the given ad account.',
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
                ...AdvertiserDefinedEventsCreateRequest.fields(),
            ],
            outputFields: [
                ...advertiser_defined_events_create_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdvertiserDefinedEventsCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'advertiserDefinedEvents/create', response.json);
                    return results;
                })
            },
            sample: samples['advertiser_defined_events_create_200_responseSample']
        }
    },
    advertiserDefinedEvents/delete: {
        key: 'advertiserDefinedEvents/delete',
        noun: 'conversions',
        display: {
            label: 'Delete advertiser defined events',
            description: 'Untrack advertiser defined events for the given ad account.',
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
                    key: 'event_names',
                    label: 'List of event names to delete',
                    type: 'string',
                }
            ],
            outputFields: [
                ...advertiser_defined_events_create_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'event_names': bundle.inputData?.['event_names'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'advertiserDefinedEvents/delete', response.json);
                    return results;
                })
            },
            sample: samples['advertiser_defined_events_create_200_responseSample']
        }
    },
    advertiserDefinedEvents/get: {
        key: 'advertiserDefinedEvents/get',
        noun: 'conversions',
        display: {
            label: 'Get advertiser defined events',
            description: 'Get advertiser defined events for the given ad account.',
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
            ],
            outputFields: [
                ...advertiser_defined_events_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'advertiserDefinedEvents/get', response.json);
                    return results;
                })
            },
            sample: samples['advertiser_defined_events_get_200_responseSample']
        }
    },
    advertiserDefinedEvents/update: {
        key: 'advertiserDefinedEvents/update',
        noun: 'conversions',
        display: {
            label: 'Update advertiser defined events',
            description: 'Update advertiser defined event names or mappings for the given ad account.',
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
                ...AdvertiserDefinedEventsCreateRequest.fields(),
            ],
            outputFields: [
                ...advertiser_defined_events_create_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdvertiserDefinedEventsCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'advertiserDefinedEvents/update', response.json);
                    return results;
                })
            },
            sample: samples['advertiser_defined_events_create_200_responseSample']
        }
    },
}
