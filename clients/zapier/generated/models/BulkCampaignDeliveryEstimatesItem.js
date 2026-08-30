const utils = require('../utils/utils');
const CampaignDeliveryEstimatesDerivedMetrics = require('../models/CampaignDeliveryEstimatesDerivedMetrics');
const CampaignPlanningAdGroupAudienceSize = require('../models/CampaignPlanningAdGroupAudienceSize');
const CampaignPlanningConversionRate = require('../models/CampaignPlanningConversionRate');
const CampaignPlanningCurveEstimate = require('../models/CampaignPlanningCurveEstimate');
const CampaignPlanningResponseError = require('../models/CampaignPlanningResponseError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}adgroup_audience_sizes`,
                label: `[${labelPrefix}adgroup_audience_sizes]`,
                children: CampaignPlanningAdGroupAudienceSize.fields(`${keyPrefix}adgroup_audience_sizes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}conversion_rate`,
                label: `Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. - [${labelPrefix}conversion_rate]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}conversion_rates`,
                label: `[${labelPrefix}conversion_rates]`,
                children: CampaignPlanningConversionRate.fields(`${keyPrefix}conversion_rates${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}curves`,
                label: `[${labelPrefix}curves]`,
                children: CampaignPlanningCurveEstimate.fields(`${keyPrefix}curves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...CampaignDeliveryEstimatesDerivedMetrics.fields(`${keyPrefix}derived_metrics`, isInput),
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: CampaignPlanningResponseError.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}estimate_id`,
                label: `UUID used to track delivery estimates when they are generated as part of a saved campaign. - [${labelPrefix}estimate_id]`,
                type: 'string',
            },
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
            'adgroup_audience_sizes': utils.childMapping(bundle.inputData?.[`${keyPrefix}adgroup_audience_sizes`], `${keyPrefix}adgroup_audience_sizes`, CampaignPlanningAdGroupAudienceSize),
            'conversion_rate': bundle.inputData?.[`${keyPrefix}conversion_rate`],
            'conversion_rates': utils.childMapping(bundle.inputData?.[`${keyPrefix}conversion_rates`], `${keyPrefix}conversion_rates`, CampaignPlanningConversionRate),
            'curves': utils.childMapping(bundle.inputData?.[`${keyPrefix}curves`], `${keyPrefix}curves`, CampaignPlanningCurveEstimate),
            'derived_metrics': utils.removeIfEmpty(CampaignDeliveryEstimatesDerivedMetrics.mapping(bundle, `${keyPrefix}derived_metrics`)),
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, CampaignPlanningResponseError),
            'estimate_id': bundle.inputData?.[`${keyPrefix}estimate_id`],
            'max_potential_spend': bundle.inputData?.[`${keyPrefix}max_potential_spend`],
        }
    },
}
