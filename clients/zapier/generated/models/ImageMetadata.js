const utils = require('../utils/utils');
const ImageSize = require('../models/ImageSize');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            ...ImageSize.fields(`${keyPrefix}images`, isInput),
            {
                key: `${keyPrefix}item_type`,
                label: `Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload. - [${labelPrefix}item_type]`,
                required: true,
                type: 'string',
                choices: [
                    'image',
                ],
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'images': utils.removeIfEmpty(ImageSize.mapping(bundle, `${keyPrefix}images`)),
            'item_type': bundle.inputData?.[`${keyPrefix}item_type`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
