const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_id`,
                label: `Id of the asset on which to remove member permissions. - [${labelPrefix}asset_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}member_id`,
                label: `Unique identifier of the member on which to perform the asset permission removal - [${labelPrefix}member_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'member_id': bundle.inputData?.[`${keyPrefix}member_id`],
        }
    },
}
