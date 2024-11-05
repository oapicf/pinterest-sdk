const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Keyword ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}archived`,
                label: `Is keyword archived? - [${labelPrefix}archived]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}bid`,
                label: `</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. - [${labelPrefix}bid]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'archived': bundle.inputData?.[`${keyPrefix}archived`],
            'bid': bundle.inputData?.[`${keyPrefix}bid`],
        }
    },
}
