const utils = require('../utils/utils');
const ConversionApiResponseEventsItems = require('../models/ConversionApiResponseEventsItems');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}events`,
                label: `[${labelPrefix}events]`,
                children: ConversionApiResponseEventsItems.fields(`${keyPrefix}events${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}num_events_processed`,
                label: `Number of events that were successfully processed from the events. - [${labelPrefix}num_events_processed]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}num_events_received`,
                label: `Total number of events received in the request. - [${labelPrefix}num_events_received]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'events': utils.childMapping(bundle.inputData?.[`${keyPrefix}events`], `${keyPrefix}events`, ConversionApiResponseEventsItems),
            'num_events_processed': bundle.inputData?.[`${keyPrefix}num_events_processed`],
            'num_events_received': bundle.inputData?.[`${keyPrefix}num_events_received`],
        }
    },
}
