const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}conversion_metrics_ready`,
                label: `Are conversion metrics ready? - [${labelPrefix}conversion_metrics_ready]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}non_conversion_metrics_ready`,
                label: `Are non-conversion metrics ready? - [${labelPrefix}non_conversion_metrics_ready]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'conversion_metrics_ready': bundle.inputData?.[`${keyPrefix}conversion_metrics_ready`],
            'non_conversion_metrics_ready': bundle.inputData?.[`${keyPrefix}non_conversion_metrics_ready`],
        }
    },
}
