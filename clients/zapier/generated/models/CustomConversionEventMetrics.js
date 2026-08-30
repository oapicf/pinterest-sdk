const utils = require('../utils/utils');
const AdeColumnType = require('../models/AdeColumnType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}custom_event_metrics_type`,
                ...AdeColumnType.fields(`${keyPrefix}custom_event_metrics_type`, isInput),
            },
            {
                key: `${keyPrefix}custom_event_name`,
                label: `Name of the advertiser-defined custom conversion event - [${labelPrefix}custom_event_name]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'custom_event_metrics_type': bundle.inputData?.[`${keyPrefix}custom_event_metrics_type`],
            'custom_event_name': bundle.inputData?.[`${keyPrefix}custom_event_name`],
        }
    },
}
