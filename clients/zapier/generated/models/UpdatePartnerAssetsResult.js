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
                key: `${keyPrefix}asset_type`,
                label: `Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. - [${labelPrefix}asset_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_id`,
                label: `Unique identifier of a business partner. - [${labelPrefix}partner_id]`,
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
            'asset_type': bundle.inputData?.[`${keyPrefix}asset_type`],
            'partner_id': bundle.inputData?.[`${keyPrefix}partner_id`],
            'permissions': bundle.inputData?.[`${keyPrefix}permissions`],
        }
    },
}
