const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}audience_ids`,
                label: `Audience IDs included in the customer segment. - [${labelPrefix}audience_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Customer segment name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'audience_ids': bundle.inputData?.[`${keyPrefix}audience_ids`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
