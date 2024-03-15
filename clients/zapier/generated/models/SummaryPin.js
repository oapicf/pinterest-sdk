const utils = require('../utils/utils');
const SummaryPin_media = require('../models/SummaryPin_media');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...SummaryPin_media.fields(`${keyPrefix}media`, isInput),
            {
                key: `${keyPrefix}alt_text`,
                label: `[${labelPrefix}alt_text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `[${labelPrefix}link]`,
                type: 'string',
            },
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media': utils.removeIfEmpty(SummaryPin_media.mapping(bundle, `${keyPrefix}media`)),
            'alt_text': bundle.inputData?.[`${keyPrefix}alt_text`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
        }
    },
}
