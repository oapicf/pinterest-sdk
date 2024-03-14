const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}lookback_window`,
                label: `Number of days ago to start lookback timeframe for dynamic retargeting - [${labelPrefix}lookback_window]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}tag_types`,
                label: `Event types to target for dynamic retargeting - [${labelPrefix}tag_types]`,
                list: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}exclusion_window`,
                label: `Number of days ago to stop lookback timeframe for dynamic retargeting - [${labelPrefix}exclusion_window]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'lookback_window': bundle.inputData?.[`${keyPrefix}lookback_window`],
            'tag_types': bundle.inputData?.[`${keyPrefix}tag_types`],
            'exclusion_window': bundle.inputData?.[`${keyPrefix}exclusion_window`],
        }
    },
}
