const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_id`,
                label: `Unique identifier of the business asset. - [${labelPrefix}asset_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}member_id`,
                label: `Unique identifier of the business member. - [${labelPrefix}member_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'member_id': bundle.inputData?.[`${keyPrefix}member_id`],
        }
    },
}
