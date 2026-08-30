const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}cpc`,
                label: `Estimated cost per click. - [${labelPrefix}cpc]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}cpc_lower`,
                label: `Lower estimate of the cost per click. - [${labelPrefix}cpc_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}cpc_upper`,
                label: `Upper estimate of the cost per click. - [${labelPrefix}cpc_upper]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}cpm`,
                label: `Estimated cost per thousand impressions. - [${labelPrefix}cpm]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}cpm_lower`,
                label: `Lower estimate of cost per thousand impressions. - [${labelPrefix}cpm_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}cpm_upper`,
                label: `Upper estimate of cost per thousand impressions. - [${labelPrefix}cpm_upper]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_frequency`,
                label: `Estimated lifetime frequency. - [${labelPrefix}lifetime_frequency]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_frequency_lower`,
                label: `Lower estimate of lifetime frequency. - [${labelPrefix}lifetime_frequency_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_frequency_upper`,
                label: `Upper estimate of lifetime frequency. - [${labelPrefix}lifetime_frequency_upper]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_impression`,
                label: `Estimated lifetime impressions. - [${labelPrefix}lifetime_impression]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_impression_lower`,
                label: `Lower estimate of lifetime impressions. - [${labelPrefix}lifetime_impression_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_impression_upper`,
                label: `Upper estimate of lifetime impressions. - [${labelPrefix}lifetime_impression_upper]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_reach`,
                label: `Estimated lifetime reach. - [${labelPrefix}lifetime_reach]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_reach_lower`,
                label: `Lower estimate of lifetime reach. - [${labelPrefix}lifetime_reach_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lifetime_reach_upper`,
                label: `Upper estimate of lifetime reach. - [${labelPrefix}lifetime_reach_upper]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_click`,
                label: `Estimated weekly clicks. - [${labelPrefix}weekly_click]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_click_lower`,
                label: `Lower estimate of weekly clicks. - [${labelPrefix}weekly_click_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_click_upper`,
                label: `Upper estimate of weekly clicks. - [${labelPrefix}weekly_click_upper]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_frequency`,
                label: `Estimated weekly frequency. - [${labelPrefix}weekly_frequency]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_frequency_lower`,
                label: `Lower estimate of weekly frequency. - [${labelPrefix}weekly_frequency_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_frequency_upper`,
                label: `Upper estimate of weekly frequency. - [${labelPrefix}weekly_frequency_upper]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_impression`,
                label: `Estimated weekly impressions. - [${labelPrefix}weekly_impression]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_impression_lower`,
                label: `Lower estimate of weekly impressions. - [${labelPrefix}weekly_impression_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_impression_upper`,
                label: `Upper estimate of weekly impressions. - [${labelPrefix}weekly_impression_upper]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_reach`,
                label: `Estimated weekly reach. - [${labelPrefix}weekly_reach]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_reach_lower`,
                label: `Lower estimate of weekly reach. - [${labelPrefix}weekly_reach_lower]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}weekly_reach_upper`,
                label: `Upper estimate of weekly reach. - [${labelPrefix}weekly_reach_upper]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cpc': bundle.inputData?.[`${keyPrefix}cpc`],
            'cpc_lower': bundle.inputData?.[`${keyPrefix}cpc_lower`],
            'cpc_upper': bundle.inputData?.[`${keyPrefix}cpc_upper`],
            'cpm': bundle.inputData?.[`${keyPrefix}cpm`],
            'cpm_lower': bundle.inputData?.[`${keyPrefix}cpm_lower`],
            'cpm_upper': bundle.inputData?.[`${keyPrefix}cpm_upper`],
            'lifetime_frequency': bundle.inputData?.[`${keyPrefix}lifetime_frequency`],
            'lifetime_frequency_lower': bundle.inputData?.[`${keyPrefix}lifetime_frequency_lower`],
            'lifetime_frequency_upper': bundle.inputData?.[`${keyPrefix}lifetime_frequency_upper`],
            'lifetime_impression': bundle.inputData?.[`${keyPrefix}lifetime_impression`],
            'lifetime_impression_lower': bundle.inputData?.[`${keyPrefix}lifetime_impression_lower`],
            'lifetime_impression_upper': bundle.inputData?.[`${keyPrefix}lifetime_impression_upper`],
            'lifetime_reach': bundle.inputData?.[`${keyPrefix}lifetime_reach`],
            'lifetime_reach_lower': bundle.inputData?.[`${keyPrefix}lifetime_reach_lower`],
            'lifetime_reach_upper': bundle.inputData?.[`${keyPrefix}lifetime_reach_upper`],
            'weekly_click': bundle.inputData?.[`${keyPrefix}weekly_click`],
            'weekly_click_lower': bundle.inputData?.[`${keyPrefix}weekly_click_lower`],
            'weekly_click_upper': bundle.inputData?.[`${keyPrefix}weekly_click_upper`],
            'weekly_frequency': bundle.inputData?.[`${keyPrefix}weekly_frequency`],
            'weekly_frequency_lower': bundle.inputData?.[`${keyPrefix}weekly_frequency_lower`],
            'weekly_frequency_upper': bundle.inputData?.[`${keyPrefix}weekly_frequency_upper`],
            'weekly_impression': bundle.inputData?.[`${keyPrefix}weekly_impression`],
            'weekly_impression_lower': bundle.inputData?.[`${keyPrefix}weekly_impression_lower`],
            'weekly_impression_upper': bundle.inputData?.[`${keyPrefix}weekly_impression_upper`],
            'weekly_reach': bundle.inputData?.[`${keyPrefix}weekly_reach`],
            'weekly_reach_lower': bundle.inputData?.[`${keyPrefix}weekly_reach_lower`],
            'weekly_reach_upper': bundle.inputData?.[`${keyPrefix}weekly_reach_upper`],
        }
    },
}
