const utils = require('../utils/utils');
const AudienceUpdateOperationType = require('../models/AudienceUpdateOperationType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}audience_ids`,
                label: `Audience IDs to update the customer segment to. Only applicable for UPDATE operations. - [${labelPrefix}audience_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Customer segment ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation_type`,
                ...AudienceUpdateOperationType.fields(`${keyPrefix}operation_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'audience_ids': bundle.inputData?.[`${keyPrefix}audience_ids`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'operation_type': bundle.inputData?.[`${keyPrefix}operation_type`],
        }
    },
}
