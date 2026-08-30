const utils = require('../utils/utils');
const CampaignPlanningConversionAttribution = require('../models/CampaignPlanningConversionAttribution');
const CampaignPlanningConversionEvent = require('../models/CampaignPlanningConversionEvent');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CampaignPlanningConversionAttribution.fields(`${keyPrefix}attribution_windows`, isInput),
            {
                key: `${keyPrefix}conversion_event`,
                ...CampaignPlanningConversionEvent.fields(`${keyPrefix}conversion_event`, isInput),
            },
            {
                key: `${keyPrefix}conversion_rate`,
                label: `Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. - [${labelPrefix}conversion_rate]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attribution_windows': utils.removeIfEmpty(CampaignPlanningConversionAttribution.mapping(bundle, `${keyPrefix}attribution_windows`)),
            'conversion_event': bundle.inputData?.[`${keyPrefix}conversion_event`],
            'conversion_rate': bundle.inputData?.[`${keyPrefix}conversion_rate`],
        }
    },
}
