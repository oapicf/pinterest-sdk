const utils = require('../utils/utils');
const LabelStatus = require('../models/LabelStatus');

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
                key: `${keyPrefix}status`,
                ...LabelStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}value`,
                label: `Label name. 100-character limit. - [${labelPrefix}value]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
