const utils = require('../utils/utils');
const AdGroupDeliveryEstimates = require('../models/AdGroupDeliveryEstimates');
const BudgetDurationType = require('../models/BudgetDurationType');
const DeliveryEstimateObjectiveType = require('../models/DeliveryEstimateObjectiveType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_groups`,
                label: `[${labelPrefix}ad_groups]`,
                children: AdGroupDeliveryEstimates.fields(`${keyPrefix}ad_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}budget_duration_type`,
                ...BudgetDurationType.fields(`${keyPrefix}budget_duration_type`, isInput),
            },
            {
                key: `${keyPrefix}daily_spend_cap`,
                label: `Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. - [${labelPrefix}daily_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_date`,
                label: `End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. - [${labelPrefix}end_date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}lifetime_spend_cap`,
                label: `Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. - [${labelPrefix}lifetime_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}objective_type`,
                ...DeliveryEstimateObjectiveType.fields(`${keyPrefix}objective_type`, isInput),
            },
            {
                key: `${keyPrefix}start_date`,
                label: `Start date of the date range for an ad campaign, pattern YYYY-MM-DD. - [${labelPrefix}start_date]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_groups`], `${keyPrefix}ad_groups`, AdGroupDeliveryEstimates),
            'budget_duration_type': bundle.inputData?.[`${keyPrefix}budget_duration_type`],
            'daily_spend_cap': bundle.inputData?.[`${keyPrefix}daily_spend_cap`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'lifetime_spend_cap': bundle.inputData?.[`${keyPrefix}lifetime_spend_cap`],
            'objective_type': bundle.inputData?.[`${keyPrefix}objective_type`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
        }
    },
}
