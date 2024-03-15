const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}success`,
                label: `Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). - [${labelPrefix}success]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}errorCode`,
                label: `Error code type if error occurs - [${labelPrefix}errorCode]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}errorMessage`,
                label: `Reason for failure - [${labelPrefix}errorMessage]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'success': bundle.inputData?.[`${keyPrefix}success`],
            'errorCode': bundle.inputData?.[`${keyPrefix}errorCode`],
            'errorMessage': bundle.inputData?.[`${keyPrefix}errorMessage`],
        }
    },
}
