const utils = require('../utils/utils');
const LabelStatusBulkUpdate = require('../models/LabelStatusBulkUpdate');

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
                key: `${keyPrefix}parent_id`,
                label: `Unique identifier of the asset you are labelling. Currently, you can only label campaigns. - [${labelPrefix}parent_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...LabelStatusBulkUpdate.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'parent_id': bundle.inputData?.[`${keyPrefix}parent_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
