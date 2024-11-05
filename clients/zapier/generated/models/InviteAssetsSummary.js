const utils = require('../utils/utils');
const InviteAssetsSummary_ad_accounts_inner = require('../models/InviteAssetsSummary_ad_accounts_inner');
const InviteAssetsSummary_profiles_inner = require('../models/InviteAssetsSummary_profiles_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_accounts`,
                label: `[${labelPrefix}ad_accounts]`,
                children: InviteAssetsSummary_ad_accounts_inner.fields(`${keyPrefix}ad_accounts${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}profiles`,
                label: `[${labelPrefix}profiles]`,
                children: InviteAssetsSummary_profiles_inner.fields(`${keyPrefix}profiles${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_accounts': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_accounts`], `${keyPrefix}ad_accounts`, InviteAssetsSummary_ad_accounts_inner),
            'profiles': utils.childMapping(bundle.inputData?.[`${keyPrefix}profiles`], `${keyPrefix}profiles`, InviteAssetsSummary_profiles_inner),
        }
    },
}
