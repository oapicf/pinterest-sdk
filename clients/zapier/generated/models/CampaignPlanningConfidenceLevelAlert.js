const utils = require('../utils/utils');
const CampaignPlanningConfidenceLevelAlertReason = require('../models/CampaignPlanningConfidenceLevelAlertReason');
const CampaignPlanningConfidenceLevelAlertSeverity = require('../models/CampaignPlanningConfidenceLevelAlertSeverity');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}description`,
                label: `Human-readable context for debugging. Not intended for display to end users. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}reason`,
                ...CampaignPlanningConfidenceLevelAlertReason.fields(`${keyPrefix}reason`, isInput),
            },
            {
                key: `${keyPrefix}severity`,
                ...CampaignPlanningConfidenceLevelAlertSeverity.fields(`${keyPrefix}severity`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
            'severity': bundle.inputData?.[`${keyPrefix}severity`],
        }
    },
}
