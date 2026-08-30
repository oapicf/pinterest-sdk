const utils = require('../utils/utils');
const FrequencyGoalMetadataTimerange = require('../models/FrequencyGoalMetadataTimerange');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}frequency`,
                label: `[${labelPrefix}frequency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}timerange`,
                ...FrequencyGoalMetadataTimerange.fields(`${keyPrefix}timerange`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'frequency': bundle.inputData?.[`${keyPrefix}frequency`],
            'timerange': bundle.inputData?.[`${keyPrefix}timerange`],
        }
    },
}
