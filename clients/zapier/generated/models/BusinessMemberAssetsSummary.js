const utils = require('../utils/utils');
const AssetIdWithPermissions = require('../models/AssetIdWithPermissions');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_accounts`,
                label: `[${labelPrefix}ad_accounts]`,
                children: AssetIdWithPermissions.fields(`${keyPrefix}ad_accounts${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}profiles`,
                label: `[${labelPrefix}profiles]`,
                children: AssetIdWithPermissions.fields(`${keyPrefix}profiles${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_accounts': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_accounts`], `${keyPrefix}ad_accounts`, AssetIdWithPermissions),
            'profiles': utils.childMapping(bundle.inputData?.[`${keyPrefix}profiles`], `${keyPrefix}profiles`, AssetIdWithPermissions),
        }
    },
}
