const utils = require('../utils/utils');
const AssetGroupBinding = require('../models/AssetGroupBinding');
const GetBusinessAssetsResponse_catalog_info = require('../models/GetBusinessAssetsResponse_catalog_info');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AssetGroupBinding.fields(`${keyPrefix}asset_group_info`, isInput),
            {
                key: `${keyPrefix}asset_id`,
                label: `Unique identifier of a business asset. - [${labelPrefix}asset_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_type`,
                label: `Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. - [${labelPrefix}asset_type]`,
                type: 'string',
            },
            ...GetBusinessAssetsResponse_catalog_info.fields(`${keyPrefix}catalog_info`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_group_info': utils.removeIfEmpty(AssetGroupBinding.mapping(bundle, `${keyPrefix}asset_group_info`)),
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'asset_type': bundle.inputData?.[`${keyPrefix}asset_type`],
            'catalog_info': utils.removeIfEmpty(GetBusinessAssetsResponse_catalog_info.mapping(bundle, `${keyPrefix}catalog_info`)),
        }
    },
}
