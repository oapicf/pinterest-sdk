const utils = require('../utils/utils');
const PinMedia = require('../models/PinMedia');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}alt_text`,
                label: `[${labelPrefix}alt_text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `[${labelPrefix}link]`,
                type: 'string',
            },
            ...PinMedia.fields(`${keyPrefix}media`, isInput),
            {
                key: `${keyPrefix}title`,
                label: `[${labelPrefix}title]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'alt_text': bundle.inputData?.[`${keyPrefix}alt_text`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'media': utils.removeIfEmpty(PinMedia.mapping(bundle, `${keyPrefix}media`)),
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
