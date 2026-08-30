const utils = require('../utils/utils');
const IneligibleProductTagsErrorDetails = require('../models/IneligibleProductTagsErrorDetails');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                label: `[${labelPrefix}code]`,
                required: true,
                type: 'integer',
            },
            ...IneligibleProductTagsErrorDetails.fields(`${keyPrefix}details`, isInput),
            {
                key: `${keyPrefix}message`,
                label: `[${labelPrefix}message]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'details': utils.removeIfEmpty(IneligibleProductTagsErrorDetails.mapping(bundle, `${keyPrefix}details`)),
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
