const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}image_url`,
                label: `Image URL. - [${labelPrefix}image_url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `Title displayed below ad. - [${labelPrefix}title]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'image_url': bundle.inputData?.[`${keyPrefix}image_url`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
