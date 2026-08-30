const utils = require('../utils/utils');
const AssetGroupDeleteError = require('../models/AssetGroupDeleteError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}deleted_asset_groups`,
                label: `[${labelPrefix}deleted_asset_groups]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}exceptions`,
                label: `[${labelPrefix}exceptions]`,
                children: AssetGroupDeleteError.fields(`${keyPrefix}exceptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'deleted_asset_groups': bundle.inputData?.[`${keyPrefix}deleted_asset_groups`],
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, AssetGroupDeleteError),
        }
    },
}
