const utils = require('../utils/utils');
const UpdateAssetGroupBody_asset_groups_to_update_inner = require('../models/UpdateAssetGroupBody_asset_groups_to_update_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_groups_to_update`,
                label: `[${labelPrefix}asset_groups_to_update]`,
                children: UpdateAssetGroupBody_asset_groups_to_update_inner.fields(`${keyPrefix}asset_groups_to_update${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_groups_to_update': utils.childMapping(bundle.inputData?.[`${keyPrefix}asset_groups_to_update`], `${keyPrefix}asset_groups_to_update`, UpdateAssetGroupBody_asset_groups_to_update_inner),
        }
    },
}
