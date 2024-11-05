const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_id`,
                label: `Unique identifier of a business asset. - [${labelPrefix}asset_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}member_id`,
                label: `Unique identifier of the business member with asset access. - [${labelPrefix}member_id]`,
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
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'member_id': bundle.inputData?.[`${keyPrefix}member_id`],
            'permissions': bundle.inputData?.[`${keyPrefix}permissions`],
        }
    },
}
