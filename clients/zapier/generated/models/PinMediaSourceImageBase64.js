const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}source_type`,
                label: `[${labelPrefix}source_type]`,
                required: true,
                type: 'string',
                choices: [
                    'image_base64',
                ],
            },
            {
                key: `${keyPrefix}content_type`,
                label: `[${labelPrefix}content_type]`,
                required: true,
                type: 'string',
                choices: [
                    'image/jpeg',
                    'image/png',
                ],
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
            'content_type': bundle.inputData?.[`${keyPrefix}content_type`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
        }
    },
}
