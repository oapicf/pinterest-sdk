const utils = require('../utils/utils');
const ConversionApiResponse_events_inner = require('../models/ConversionApiResponse_events_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}num_events_received`,
                label: `Total number of events received in the request. - [${labelPrefix}num_events_received]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}num_events_processed`,
                label: `Number of events that were successfully processed from the events. - [${labelPrefix}num_events_processed]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}events`,
                label: `[${labelPrefix}events]`,
                children: ConversionApiResponse_events_inner.fields(`${keyPrefix}events${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'num_events_received': bundle.inputData?.[`${keyPrefix}num_events_received`],
            'num_events_processed': bundle.inputData?.[`${keyPrefix}num_events_processed`],
            'events': utils.childMapping(bundle.inputData?.[`${keyPrefix}events`], `${keyPrefix}events`, ConversionApiResponse_events_inner),
        }
    },
}
