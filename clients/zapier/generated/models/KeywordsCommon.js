const utils = require('../utils/utils');
const MatchTypeResponse = require('../models/MatchTypeResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bid`,
                label: `</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. - [${labelPrefix}bid]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}match_type`,
                ...MatchTypeResponse.fields(`${keyPrefix}match_type`, isInput),
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
