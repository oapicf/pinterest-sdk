const utils = require('../utils/utils');
const QualityComponentIssue = require('../models/QualityComponentIssue');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}coverage`,
                label: `Coverage percentage for this event type. - [${labelPrefix}coverage]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}issues`,
                label: `[${labelPrefix}issues]`,
                children: QualityComponentIssue.fields(`${keyPrefix}issues${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}overlap`,
                label: `Overlap percentage for this event type. Only populated for external_event_id - [${labelPrefix}overlap]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'coverage': bundle.inputData?.[`${keyPrefix}coverage`],
            'issues': utils.childMapping(bundle.inputData?.[`${keyPrefix}issues`], `${keyPrefix}issues`, QualityComponentIssue),
            'overlap': bundle.inputData?.[`${keyPrefix}overlap`],
        }
    },
}
