const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}boost_prospecting_ad_group_bid`,
                label: `Whether to boost prospecting ad group bid. - [${labelPrefix}boost_prospecting_ad_group_bid]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}pinner_list_exclusions`,
                label: `List of campaign-level exclusion pinner list IDs. - [${labelPrefix}pinner_list_exclusions]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'boost_prospecting_ad_group_bid': bundle.inputData?.[`${keyPrefix}boost_prospecting_ad_group_bid`],
            'pinner_list_exclusions': bundle.inputData?.[`${keyPrefix}pinner_list_exclusions`],
        }
    },
}
