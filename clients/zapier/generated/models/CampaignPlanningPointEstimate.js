const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}budget`,
                label: `The budget value of the point. - [${labelPrefix}budget]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}double_y`,
                label: `Y value as a decimal. - [${labelPrefix}double_y]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}max_y`,
                label: `The maximum Y value of the point. - [${labelPrefix}max_y]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_y`,
                label: `The minimum Y value of the point. - [${labelPrefix}min_y]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}y`,
                label: `The expected Y value of the point. - [${labelPrefix}y]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'budget': bundle.inputData?.[`${keyPrefix}budget`],
            'double_y': bundle.inputData?.[`${keyPrefix}double_y`],
            'max_y': bundle.inputData?.[`${keyPrefix}max_y`],
            'min_y': bundle.inputData?.[`${keyPrefix}min_y`],
            'y': bundle.inputData?.[`${keyPrefix}y`],
        }
    },
}
