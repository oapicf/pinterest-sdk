const utils = require('../utils/utils');
const LabelStatus = require('../models/LabelStatus');
const LabelType = require('../models/LabelType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Label ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}label_type`,
                ...LabelType.fields(`${keyPrefix}label_type`, isInput),
            },
            {
                key: `${keyPrefix}parent_id`,
                label: `Label parent entity ID. - [${labelPrefix}parent_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}parent_type`,
                label: `Label parent entity type. - [${labelPrefix}parent_type]`,
                type: 'string',
                choices: [
                    'CAMPAIGN',
                ],
            },
            {
                key: `${keyPrefix}status`,
                ...LabelStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}value`,
                label: `Label name. - [${labelPrefix}value]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'label_type': bundle.inputData?.[`${keyPrefix}label_type`],
            'parent_id': bundle.inputData?.[`${keyPrefix}parent_id`],
            'parent_type': bundle.inputData?.[`${keyPrefix}parent_type`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
