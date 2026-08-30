const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}audience_size_lower_bound`,
                label: `The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. - [${labelPrefix}audience_size_lower_bound]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}audience_size_upper_bound`,
                label: `The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. - [${labelPrefix}audience_size_upper_bound]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'audience_size_lower_bound': bundle.inputData?.[`${keyPrefix}audience_size_lower_bound`],
            'audience_size_upper_bound': bundle.inputData?.[`${keyPrefix}audience_size_upper_bound`],
        }
    },
}
