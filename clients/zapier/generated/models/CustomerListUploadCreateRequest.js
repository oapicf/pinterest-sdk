const utils = require('../utils/utils');
const UserListOperationType = require('../models/UserListOperationType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}operation`,
                ...UserListOperationType.fields(`${keyPrefix}operation`, isInput),
            },
            {
                key: `${keyPrefix}total_parts`,
                label: `Number of parts to upload the file in. - [${labelPrefix}total_parts]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'total_parts': bundle.inputData?.[`${keyPrefix}total_parts`],
        }
    },
}
