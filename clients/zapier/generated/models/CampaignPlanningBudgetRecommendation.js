const utils = require('../utils/utils');
const CampaignPlanningBudgetRecommendationPoint = require('../models/CampaignPlanningBudgetRecommendationPoint');
const CampaignPlanningExperimentBudgetRecommendation = require('../models/CampaignPlanningExperimentBudgetRecommendation');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}budget_recommendation`,
                label: `The recommended budget amount. - [${labelPrefix}budget_recommendation]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}experiment_campaign_budget_recommendation`,
                label: `[${labelPrefix}experiment_campaign_budget_recommendation]`,
                children: CampaignPlanningExperimentBudgetRecommendation.fields(`${keyPrefix}experiment_campaign_budget_recommendation${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}lifetime_days_recommendation`,
                label: `Recommended number of days for the campaign lifetime. - [${labelPrefix}lifetime_days_recommendation]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}point_estimations`,
                label: `[${labelPrefix}point_estimations]`,
                children: CampaignPlanningBudgetRecommendationPoint.fields(`${keyPrefix}point_estimations${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'budget_recommendation': bundle.inputData?.[`${keyPrefix}budget_recommendation`],
            'experiment_campaign_budget_recommendation': utils.childMapping(bundle.inputData?.[`${keyPrefix}experiment_campaign_budget_recommendation`], `${keyPrefix}experiment_campaign_budget_recommendation`, CampaignPlanningExperimentBudgetRecommendation),
            'lifetime_days_recommendation': bundle.inputData?.[`${keyPrefix}lifetime_days_recommendation`],
            'point_estimations': utils.childMapping(bundle.inputData?.[`${keyPrefix}point_estimations`], `${keyPrefix}point_estimations`, CampaignPlanningBudgetRecommendationPoint),
        }
    },
}
