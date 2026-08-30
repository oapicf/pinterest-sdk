const utils = require('../utils/utils');
const ChangeHistoryDataType = require('../models/ChangeHistoryDataType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}changed_field_id`,
                label: `A string identifier representing the changed field on the entity - [${labelPrefix}changed_field_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}changed_field_name`,
                label: `The human readable name of the changed field on the entity - [${labelPrefix}changed_field_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}data_type`,
                ...ChangeHistoryDataType.fields(`${keyPrefix}data_type`, isInput),
            },
            {
                key: `${keyPrefix}new_data_value`,
                label: `A string representation of the value of the changed field, after the change - [${labelPrefix}new_data_value]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}old_data_value`,
                label: `A string representation of the value of the changed field, before the change - [${labelPrefix}old_data_value]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'changed_field_id': bundle.inputData?.[`${keyPrefix}changed_field_id`],
            'changed_field_name': bundle.inputData?.[`${keyPrefix}changed_field_name`],
            'data_type': bundle.inputData?.[`${keyPrefix}data_type`],
            'new_data_value': bundle.inputData?.[`${keyPrefix}new_data_value`],
            'old_data_value': bundle.inputData?.[`${keyPrefix}old_data_value`],
        }
    },
}
