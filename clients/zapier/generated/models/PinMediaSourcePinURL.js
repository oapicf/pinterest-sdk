const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}is_affiliate_link`,
                label: `This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. - [${labelPrefix}is_affiliate_link]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}source_type`,
                label: `[${labelPrefix}source_type]`,
                required: true,
                type: 'string',
                choices: [
                    'pin_url',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'is_affiliate_link': bundle.inputData?.[`${keyPrefix}is_affiliate_link`],
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
        }
    },
}
