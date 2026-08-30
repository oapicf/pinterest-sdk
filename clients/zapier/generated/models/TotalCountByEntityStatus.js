const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ACTIVE`,
                label: `Count of ACTIVE assets - [${labelPrefix}ACTIVE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ARCHIVED`,
                label: `Count of ARCHIVED assets - [${labelPrefix}ARCHIVED]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}PAUSED`,
                label: `Count of PAUSED assets - [${labelPrefix}PAUSED]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ACTIVE': bundle.inputData?.[`${keyPrefix}ACTIVE`],
            'ARCHIVED': bundle.inputData?.[`${keyPrefix}ARCHIVED`],
            'PAUSED': bundle.inputData?.[`${keyPrefix}PAUSED`],
        }
    },
}
