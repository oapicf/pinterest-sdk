const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}invite_id`,
                label: `Unique identifier of an invite. - [${labelPrefix}invite_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}message`,
                label: `Error message associated with the error in performing the action on the invite/request. - [${labelPrefix}message]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'invite_id': bundle.inputData?.[`${keyPrefix}invite_id`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
