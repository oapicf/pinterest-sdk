const utils = require('../utils/utils');
const CampaignPlanningBudgetRecommendationPoint = require('../models/CampaignPlanningBudgetRecommendationPoint');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}budget_recommendation`,
                label: `Recommended budget for this experiment version. - [${labelPrefix}budget_recommendation]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}lifetime_days_recommendation`,
                label: `Recommended lifetime days for this experiment. - [${labelPrefix}lifetime_days_recommendation]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}point_estimations`,
                label: `[${labelPrefix}point_estimations]`,
                children: CampaignPlanningBudgetRecommendationPoint.fields(`${keyPrefix}point_estimations${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}version_id`,
                label: `Version identifier for the experiment. - [${labelPrefix}version_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'budget_recommendation': bundle.inputData?.[`${keyPrefix}budget_recommendation`],
            'lifetime_days_recommendation': bundle.inputData?.[`${keyPrefix}lifetime_days_recommendation`],
            'point_estimations': utils.childMapping(bundle.inputData?.[`${keyPrefix}point_estimations`], `${keyPrefix}point_estimations`, CampaignPlanningBudgetRecommendationPoint),
            'version_id': bundle.inputData?.[`${keyPrefix}version_id`],
        }
    },
}
