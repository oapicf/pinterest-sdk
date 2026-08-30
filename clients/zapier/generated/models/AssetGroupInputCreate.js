const utils = require('../utils/utils');
const AssetGroupBinding = require('../models/AssetGroupBinding');
const AssetGroupType = require('../models/AssetGroupType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AssetGroupBinding.fields(`${keyPrefix}asset_group`, isInput),
            {
                key: `${keyPrefix}asset_group_description`,
                label: `Asset group description. - [${labelPrefix}asset_group_description]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_group_name`,
                label: `Asset Group name. - [${labelPrefix}asset_group_name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_group_types`,
                list: true,
                type: 'string',
                ...AssetGroupType.fields(`${keyPrefix}asset_group_types`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_group': utils.removeIfEmpty(AssetGroupBinding.mapping(bundle, `${keyPrefix}asset_group`)),
            'asset_group_description': bundle.inputData?.[`${keyPrefix}asset_group_description`],
            'asset_group_name': bundle.inputData?.[`${keyPrefix}asset_group_name`],
            'asset_group_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}asset_group_types`], `${keyPrefix}asset_group_types`, AssetGroupType),
        }
    },
}
