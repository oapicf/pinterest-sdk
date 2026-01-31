const utils = require('../utils/utils');
const CampaignSummaryStatus = require('../models/CampaignSummaryStatus');
const ObjectiveType = require('../models/ObjectiveType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaign_status`,
                list: true,
                type: 'string',
                ...CampaignSummaryStatus.fields(`${keyPrefix}campaign_status`, isInput),
            },
            {
                key: `${keyPrefix}end_time`,
                label: `Unix UTC timestamp. - [${labelPrefix}end_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Campaign name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}objective_type`,
                list: true,
                type: 'string',
                ...ObjectiveType.fields(`${keyPrefix}objective_type`, isInput),
            },
            {
                key: `${keyPrefix}start_time`,
                label: `Unix UTC timestamp. - [${labelPrefix}start_time]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaign_status': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaign_status`], `${keyPrefix}campaign_status`, CampaignSummaryStatus),
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'objective_type': utils.childMapping(bundle.inputData?.[`${keyPrefix}objective_type`], `${keyPrefix}objective_type`, ObjectiveType),
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
        }
    },
}
