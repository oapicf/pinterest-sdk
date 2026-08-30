const utils = require('../utils/utils');
const AdPinPreviewCreativeType = require('../models/AdPinPreviewCreativeType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}creative_type`,
                ...AdPinPreviewCreativeType.fields(`${keyPrefix}creative_type`, isInput),
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
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
        }
    },
}
