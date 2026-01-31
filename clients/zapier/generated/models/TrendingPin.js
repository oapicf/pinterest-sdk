const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}height`,
                label: `Height of the pin image in pixels - [${labelPrefix}height]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier for the pin - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}src`,
                label: `URL of the pin image - [${labelPrefix}src]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}width`,
                label: `Width of the pin image in pixels - [${labelPrefix}width]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'src': bundle.inputData?.[`${keyPrefix}src`],
            'width': bundle.inputData?.[`${keyPrefix}width`],
        }
    },
}
