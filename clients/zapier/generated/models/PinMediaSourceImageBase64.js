const utils = require('../utils/utils');
const ContentType = require('../models/ContentType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}content_type`,
                ...ContentType.fields(`${keyPrefix}content_type`, isInput),
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_standard`,
                label: `Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. - [${labelPrefix}is_standard]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}source_type`,
                label: `The source type of the media. - [${labelPrefix}source_type]`,
                required: true,
                type: 'string',
                choices: [
                    'image_base64',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'content_type': bundle.inputData?.[`${keyPrefix}content_type`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
            'is_standard': bundle.inputData?.[`${keyPrefix}is_standard`],
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
        }
    },
}
