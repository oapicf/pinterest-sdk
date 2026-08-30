const utils = require('../utils/utils');
const CampaignPlanningResponseErrorCode = require('../models/CampaignPlanningResponseErrorCode');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                ...CampaignPlanningResponseErrorCode.fields(`${keyPrefix}code`, isInput),
            },
            {
                key: `${keyPrefix}message`,
                label: `Human-readable error message. - [${labelPrefix}message]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
