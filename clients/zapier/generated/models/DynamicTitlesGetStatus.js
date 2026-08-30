const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}generated_count`,
                label: `The count of generated titles. - [${labelPrefix}generated_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_ready`,
                label: `Whether dynamic titles have been generated and are ready to be reviewed for the ad group. - [${labelPrefix}is_ready]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}reviewed_count`,
                label: `The count of advertiser reviewed titles. - [${labelPrefix}reviewed_count]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'generated_count': bundle.inputData?.[`${keyPrefix}generated_count`],
            'is_ready': bundle.inputData?.[`${keyPrefix}is_ready`],
            'reviewed_count': bundle.inputData?.[`${keyPrefix}reviewed_count`],
        }
    },
}
