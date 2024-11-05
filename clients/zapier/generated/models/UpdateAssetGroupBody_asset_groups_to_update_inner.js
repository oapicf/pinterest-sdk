const utils = require('../utils/utils');
const AssetGroupType = require('../models/AssetGroupType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_group_id`,
                label: `Unique identifier of the asset group to update. - [${labelPrefix}asset_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Asset Group name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Asset group description - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_group_types`,
                list: true,
                type: 'string',
                ...AssetGroupType.fields(`${keyPrefix}asset_group_types`, isInput),
            },
            {
                key: `${keyPrefix}assets_to_add`,
                label: `A list of asset ids to add to the asset group. - [${labelPrefix}assets_to_add]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}assets_to_remove`,
                label: `A list of asset ids to remove from the asset group. - [${labelPrefix}assets_to_remove]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_group_id': bundle.inputData?.[`${keyPrefix}asset_group_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'asset_group_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}asset_group_types`], `${keyPrefix}asset_group_types`, AssetGroupType),
            'assets_to_add': bundle.inputData?.[`${keyPrefix}assets_to_add`],
            'assets_to_remove': bundle.inputData?.[`${keyPrefix}assets_to_remove`],
        }
    },
}
