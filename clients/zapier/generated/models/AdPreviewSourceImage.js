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
                key: `${keyPrefix}promotion_id`,
                label: `Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. - [${labelPrefix}promotion_id]`,
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
            'promotion_id': bundle.inputData?.[`${keyPrefix}promotion_id`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
