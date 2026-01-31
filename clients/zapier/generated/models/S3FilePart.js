const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}part_number`,
                label: `Part number for upload. - [${labelPrefix}part_number]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}presigned_url`,
                label: `Pre-signed URL. - [${labelPrefix}presigned_url]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'part_number': bundle.inputData?.[`${keyPrefix}part_number`],
            'presigned_url': bundle.inputData?.[`${keyPrefix}presigned_url`],
        }
    },
}
