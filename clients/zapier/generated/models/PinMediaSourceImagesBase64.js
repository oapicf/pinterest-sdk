const utils = require('../utils/utils');
const PinMediaSourceImagesBase64Item = require('../models/PinMediaSourceImagesBase64Item');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: PinMediaSourceImagesBase64Item.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}source_type`,
                label: `The source type of the media. - [${labelPrefix}source_type]`,
                required: true,
                type: 'string',
                choices: [
                    'multiple_image_base64',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, PinMediaSourceImagesBase64Item),
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
        }
    },
}
