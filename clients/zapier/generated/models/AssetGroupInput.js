const utils = require('../utils/utils');
const AssetGroupBinding = require('../models/AssetGroupBinding');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AssetGroupBinding.fields(`${keyPrefix}asset_group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_group': utils.removeIfEmpty(AssetGroupBinding.mapping(bundle, `${keyPrefix}asset_group`)),
        }
    },
}
