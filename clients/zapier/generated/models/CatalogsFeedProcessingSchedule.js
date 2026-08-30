const utils = require('../utils/utils');
const CatalogsFeedProcessingScheduleTimezone = require('../models/CatalogsFeedProcessingScheduleTimezone');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}time`,
                label: `A time in format HH:MM with leading 0 (zero) - [${labelPrefix}time]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}timezone`,
                ...CatalogsFeedProcessingScheduleTimezone.fields(`${keyPrefix}timezone`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'time': bundle.inputData?.[`${keyPrefix}time`],
            'timezone': bundle.inputData?.[`${keyPrefix}timezone`],
        }
    },
}
