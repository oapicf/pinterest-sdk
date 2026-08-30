const utils = require('../utils/utils');
const CampaignPlanningEstimationType = require('../models/CampaignPlanningEstimationType');
const CampaignPlanningPointEstimate = require('../models/CampaignPlanningPointEstimate');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}estimation_type`,
                ...CampaignPlanningEstimationType.fields(`${keyPrefix}estimation_type`, isInput),
            },
            ...CampaignPlanningPointEstimate.fields(`${keyPrefix}point_estimate`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'estimation_type': bundle.inputData?.[`${keyPrefix}estimation_type`],
            'point_estimate': utils.removeIfEmpty(CampaignPlanningPointEstimate.mapping(bundle, `${keyPrefix}point_estimate`)),
        }
    },
}
