const utils = require('../utils/utils');
const CampaignPlanningConversionAttributionWindowDays = require('../models/CampaignPlanningConversionAttributionWindowDays');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}click_window_days`,
                ...CampaignPlanningConversionAttributionWindowDays.fields(`${keyPrefix}click_window_days`, isInput),
            },
            {
                key: `${keyPrefix}engagement_window_days`,
                ...CampaignPlanningConversionAttributionWindowDays.fields(`${keyPrefix}engagement_window_days`, isInput),
            },
            {
                key: `${keyPrefix}view_window_days`,
                ...CampaignPlanningConversionAttributionWindowDays.fields(`${keyPrefix}view_window_days`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'click_window_days': bundle.inputData?.[`${keyPrefix}click_window_days`],
            'engagement_window_days': bundle.inputData?.[`${keyPrefix}engagement_window_days`],
            'view_window_days': bundle.inputData?.[`${keyPrefix}view_window_days`],
        }
    },
}
