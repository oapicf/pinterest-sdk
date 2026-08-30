const utils = require('../utils/utils');
const BoardUpdatePrivacy = require('../models/BoardUpdatePrivacy');

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
                key: `${keyPrefix}name`,
                label: `    Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}privacy`,
                ...BoardUpdatePrivacy.fields(`${keyPrefix}privacy`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'privacy': bundle.inputData?.[`${keyPrefix}privacy`],
        }
    },
}
