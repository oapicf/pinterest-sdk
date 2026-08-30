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
            {
                key: `${keyPrefix}points`,
                label: `[${labelPrefix}points]`,
                children: CampaignPlanningPointEstimate.fields(`${keyPrefix}points${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'estimation_type': bundle.inputData?.[`${keyPrefix}estimation_type`],
            'points': utils.childMapping(bundle.inputData?.[`${keyPrefix}points`], `${keyPrefix}points`, CampaignPlanningPointEstimate),
        }
    },
}
