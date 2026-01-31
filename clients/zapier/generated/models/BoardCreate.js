const utils = require('../utils/utils');
const BoardPrivacy = require('../models/BoardPrivacy');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_ads_only`,
                label: `If set to `true`, the board will be ad-only and can store ad-only Pins. - [${labelPrefix}is_ads_only]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}name`,
                label: `     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}privacy`,
                ...BoardPrivacy.fields(`${keyPrefix}privacy`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'is_ads_only': bundle.inputData?.[`${keyPrefix}is_ads_only`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'privacy': bundle.inputData?.[`${keyPrefix}privacy`],
        }
    },
}
