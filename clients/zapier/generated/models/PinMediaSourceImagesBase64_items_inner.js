const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}title`,
                label: `[${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `Destination link for the image. - [${labelPrefix}link]`,
                type: 'string',
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
                label: `Image to upload as base64 string. - [${labelPrefix}data]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'content_type': bundle.inputData?.[`${keyPrefix}content_type`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
        }
    },
}
