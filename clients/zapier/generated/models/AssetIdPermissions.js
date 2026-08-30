const utils = require('../utils/utils');
const AssetGroupBinding = require('../models/AssetGroupBinding');
const AssetTypeResponse = require('../models/AssetTypeResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AssetGroupBinding.fields(`${keyPrefix}asset_group_info`, isInput),
            {
                key: `${keyPrefix}asset_id`,
                label: `Unique identifier of a business asset. - [${labelPrefix}asset_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_type`,
                ...AssetTypeResponse.fields(`${keyPrefix}asset_type`, isInput),
            },
            {
                key: `${keyPrefix}permissions`,
                label: `Permission levels member or partner has on an asset. - [${labelPrefix}permissions]`,
                required: true,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_group_info': utils.removeIfEmpty(AssetGroupBinding.mapping(bundle, `${keyPrefix}asset_group_info`)),
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'asset_type': bundle.inputData?.[`${keyPrefix}asset_type`],
            'permissions': bundle.inputData?.[`${keyPrefix}permissions`],
        }
    },
}
