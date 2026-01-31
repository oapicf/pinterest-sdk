const utils = require('../utils/utils');
const LabelType = require('../models/LabelType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}label_type`,
                ...LabelType.fields(`${keyPrefix}label_type`, isInput),
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
            'label_type': bundle.inputData?.[`${keyPrefix}label_type`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
