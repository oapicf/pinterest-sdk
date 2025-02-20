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
                    'image_url',
                ],
            },
            {
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_standard`,
                label: `Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. - [${labelPrefix}is_standard]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'is_standard': bundle.inputData?.[`${keyPrefix}is_standard`],
        }
    },
}
