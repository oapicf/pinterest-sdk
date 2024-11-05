const utils = require('../utils/utils');
const MatchType = require('../models/MatchType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}match_type`,
                ...MatchType.fields(`${keyPrefix}match_type`, isInput),
            },
            {
                key: `${keyPrefix}value`,
                label: `The keyword targeting (120 chars max). - [${labelPrefix}value]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'match_type': bundle.inputData?.[`${keyPrefix}match_type`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
