const utils = require('../utils/utils');
const MatchType = require('../models/MatchType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bid`,
                label: `**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. - [${labelPrefix}bid]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}match_type`,
                ...MatchType.fields(`${keyPrefix}match_type`, isInput),
            },
            {
                key: `${keyPrefix}value`,
                label: `Keyword value (120 chars max). - [${labelPrefix}value]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid': bundle.inputData?.[`${keyPrefix}bid`],
            'match_type': bundle.inputData?.[`${keyPrefix}match_type`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
