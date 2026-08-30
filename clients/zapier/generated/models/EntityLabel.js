const utils = require('../utils/utils');
const EntityLabelStatus = require('../models/EntityLabelStatus');
const LabelParentType = require('../models/LabelParentType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}entity_id`,
                label: `Entity ID to apply label to. - [${labelPrefix}entity_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}entity_type`,
                ...LabelParentType.fields(`${keyPrefix}entity_type`, isInput),
            },
            {
                key: `${keyPrefix}label_id`,
                label: `Label ID. - [${labelPrefix}label_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityLabelStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'entity_id': bundle.inputData?.[`${keyPrefix}entity_id`],
            'entity_type': bundle.inputData?.[`${keyPrefix}entity_type`],
            'label_id': bundle.inputData?.[`${keyPrefix}label_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
