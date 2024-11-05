const utils = require('../utils/utils');
const AssetGroupBinding = require('../models/AssetGroupBinding');

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
                key: `${keyPrefix}permissions`,
                label: `The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset. - [${labelPrefix}permissions]`,
                list: true,
                type: 'string',
            },
            ...AssetGroupBinding.fields(`${keyPrefix}asset_group_info`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'asset_type': bundle.inputData?.[`${keyPrefix}asset_type`],
            'permissions': bundle.inputData?.[`${keyPrefix}permissions`],
            'asset_group_info': utils.removeIfEmpty(AssetGroupBinding.mapping(bundle, `${keyPrefix}asset_group_info`)),
        }
    },
}
