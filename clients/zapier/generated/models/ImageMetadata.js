const utils = require('../utils/utils');
const ImageDetails = require('../models/ImageDetails');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}item_type`,
                label: `[${labelPrefix}item_type]`,
                type: 'string',
            },
            ...ImageDetails.fields(`${keyPrefix}images`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item_type': bundle.inputData?.[`${keyPrefix}item_type`],
            'images': utils.removeIfEmpty(ImageDetails.mapping(bundle, `${keyPrefix}images`)),
        }
    },
}
