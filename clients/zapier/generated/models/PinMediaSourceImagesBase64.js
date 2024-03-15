const utils = require('../utils/utils');
const PinMediaSourceImagesBase64_items_inner = require('../models/PinMediaSourceImagesBase64_items_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}source_type`,
                label: `[${labelPrefix}source_type]`,
                type: 'string',
                choices: [
                    'multiple_image_base64',
                ],
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: PinMediaSourceImagesBase64_items_inner.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, PinMediaSourceImagesBase64_items_inner),
            'index': bundle.inputData?.[`${keyPrefix}index`],
        }
    },
}
