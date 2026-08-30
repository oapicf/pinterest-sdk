const utils = require('../utils/utils');
const CampaignDeliveryEstimatesDerivedMetrics = require('../models/CampaignDeliveryEstimatesDerivedMetrics');
const CampaignPlanningCurveEstimate = require('../models/CampaignPlanningCurveEstimate');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}curves`,
                label: `[${labelPrefix}curves]`,
                children: CampaignPlanningCurveEstimate.fields(`${keyPrefix}curves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...CampaignDeliveryEstimatesDerivedMetrics.fields(`${keyPrefix}derived_metrics`, isInput),
            {
                key: `${keyPrefix}max_potential_spend`,
                label: `Maximum potential spend estimate. - [${labelPrefix}max_potential_spend]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'curves': utils.childMapping(bundle.inputData?.[`${keyPrefix}curves`], `${keyPrefix}curves`, CampaignPlanningCurveEstimate),
            'derived_metrics': utils.removeIfEmpty(CampaignDeliveryEstimatesDerivedMetrics.mapping(bundle, `${keyPrefix}derived_metrics`)),
            'max_potential_spend': bundle.inputData?.[`${keyPrefix}max_potential_spend`],
        }
    },
}
