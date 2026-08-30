const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}entity_id`,
                label: `[${labelPrefix}entity_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}entity_type`,
                label: `Entity type - [${labelPrefix}entity_type]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'entity_id': bundle.inputData?.[`${keyPrefix}entity_id`],
            'entity_type': bundle.inputData?.[`${keyPrefix}entity_type`],
        }
    },
}
