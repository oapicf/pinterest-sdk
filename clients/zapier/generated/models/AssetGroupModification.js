const utils = require('../utils/utils');
const AssetGroupBinding = require('../models/AssetGroupBinding');
const AssetGroupUpdateError = require('../models/AssetGroupUpdateError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}exceptions`,
                label: `[${labelPrefix}exceptions]`,
                children: AssetGroupUpdateError.fields(`${keyPrefix}exceptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}updated_asset_groups`,
                label: `[${labelPrefix}updated_asset_groups]`,
                children: AssetGroupBinding.fields(`${keyPrefix}updated_asset_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, AssetGroupUpdateError),
            'updated_asset_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}updated_asset_groups`], `${keyPrefix}updated_asset_groups`, AssetGroupBinding),
        }
    },
}
