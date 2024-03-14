const utils = require('../utils/utils');
const AdPreviewCreateFromImage = require('../models/AdPreviewCreateFromImage');
const AdPreviewCreateFromPin = require('../models/AdPreviewCreateFromPin');

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
            {
                key: `${keyPrefix}pin_id`,
                label: `Pin ID. - [${labelPrefix}pin_id]`,
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
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
        }
    },
}
