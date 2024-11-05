const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier of a business ad account. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}permissions`,
                label: `Permission levels member or partner has on an asset. - [${labelPrefix}permissions]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'permissions': bundle.inputData?.[`${keyPrefix}permissions`],
        }
    },
}
