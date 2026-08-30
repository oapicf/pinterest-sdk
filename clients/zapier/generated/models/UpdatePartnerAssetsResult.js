const utils = require('../utils/utils');
const AssetTypeResponse = require('../models/AssetTypeResponse');

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
                ...AssetTypeResponse.fields(`${keyPrefix}asset_type`, isInput),
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
