const utils = require('../utils/utils');
const BusinessMemberAssetsSummary_ad_accounts_inner = require('../models/BusinessMemberAssetsSummary_ad_accounts_inner');
const BusinessMemberAssetsSummary_profiles_inner = require('../models/BusinessMemberAssetsSummary_profiles_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_accounts`,
                label: `[${labelPrefix}ad_accounts]`,
                children: BusinessMemberAssetsSummary_ad_accounts_inner.fields(`${keyPrefix}ad_accounts${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}profiles`,
                label: `[${labelPrefix}profiles]`,
                children: BusinessMemberAssetsSummary_profiles_inner.fields(`${keyPrefix}profiles${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_accounts': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_accounts`], `${keyPrefix}ad_accounts`, BusinessMemberAssetsSummary_ad_accounts_inner),
            'profiles': utils.childMapping(bundle.inputData?.[`${keyPrefix}profiles`], `${keyPrefix}profiles`, BusinessMemberAssetsSummary_profiles_inner),
        }
    },
}
