const utils = require('../utils/utils');
const NullableLabelStatus = require('../models/NullableLabelStatus');
const NullableLabelType = require('../models/NullableLabelType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Label ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}label_type`,
                ...NullableLabelType.fields(`${keyPrefix}label_type`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...NullableLabelStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}value`,
                label: `Label name. 100-character limit. - [${labelPrefix}value]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'label_type': bundle.inputData?.[`${keyPrefix}label_type`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
