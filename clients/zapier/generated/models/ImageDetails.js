const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}width`,
                label: `[${labelPrefix}width]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}height`,
                label: `[${labelPrefix}height]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'width': bundle.inputData?.[`${keyPrefix}width`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
        }
    },
}
