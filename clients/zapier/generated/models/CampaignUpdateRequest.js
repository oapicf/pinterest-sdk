const utils = require('../utils/utils');
const AdCommon_tracking_urls = require('../models/AdCommon_tracking_urls');
const EntityStatus = require('../models/EntityStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Campaign ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Campaign's Advertiser ID. - [${labelPrefix}ad_account_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Campaign name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}lifetime_spend_cap`,
                label: `Campaign total spending cap. - [${labelPrefix}lifetime_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}daily_spend_cap`,
                label: `Campaign daily spending cap. - [${labelPrefix}daily_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}order_line_id`,
                label: `Order line ID that appears on the invoice. - [${labelPrefix}order_line_id]`,
                type: 'string',
            },
            ...AdCommon_tracking_urls.fields(`${keyPrefix}tracking_urls`, isInput),
            {
                key: `${keyPrefix}start_time`,
                label: `Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. - [${labelPrefix}start_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_time`,
                label: `Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. - [${labelPrefix}end_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_campaign_budget_optimization`,
                label: `Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. - [${labelPrefix}is_campaign_budget_optimization]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_flexible_daily_budgets`,
                label: `Determine if a campaign has flexible daily budgets setup. - [${labelPrefix}is_flexible_daily_budgets]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}default_ad_group_budget_in_micro_currency`,
                label: `When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. - [${labelPrefix}default_ad_group_budget_in_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_automated_campaign`,
                label: `Specifies whether the campaign was created in the automated campaign flow - [${labelPrefix}is_automated_campaign]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'lifetime_spend_cap': bundle.inputData?.[`${keyPrefix}lifetime_spend_cap`],
            'daily_spend_cap': bundle.inputData?.[`${keyPrefix}daily_spend_cap`],
            'order_line_id': bundle.inputData?.[`${keyPrefix}order_line_id`],
            'tracking_urls': utils.removeIfEmpty(AdCommon_tracking_urls.mapping(bundle, `${keyPrefix}tracking_urls`)),
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'is_campaign_budget_optimization': bundle.inputData?.[`${keyPrefix}is_campaign_budget_optimization`],
            'is_flexible_daily_budgets': bundle.inputData?.[`${keyPrefix}is_flexible_daily_budgets`],
            'default_ad_group_budget_in_micro_currency': bundle.inputData?.[`${keyPrefix}default_ad_group_budget_in_micro_currency`],
            'is_automated_campaign': bundle.inputData?.[`${keyPrefix}is_automated_campaign`],
        }
    },
}
