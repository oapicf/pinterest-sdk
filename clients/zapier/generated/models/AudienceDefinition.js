const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}date`,
                label: `Generation date - [${labelPrefix}date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `Generated audience type to request. - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}scope`,
                label: `Generated audience scope to request. - [${labelPrefix}scope]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'date': bundle.inputData?.[`${keyPrefix}date`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'scope': bundle.inputData?.[`${keyPrefix}scope`],
        }
    },
}
