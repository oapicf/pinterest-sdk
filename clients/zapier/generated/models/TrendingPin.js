const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}color`,
                label: `Dominant color of the pin image in hex format - [${labelPrefix}color]`,
                required: true,
                type: 'string',
            },
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
                key: `${keyPrefix}vertical_offset`,
                label: `The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. - [${labelPrefix}vertical_offset]`,
                type: 'number',
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
            'color': bundle.inputData?.[`${keyPrefix}color`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'src': bundle.inputData?.[`${keyPrefix}src`],
            'vertical_offset': bundle.inputData?.[`${keyPrefix}vertical_offset`],
            'width': bundle.inputData?.[`${keyPrefix}width`],
        }
    },
}
