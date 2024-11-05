const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_groups_to_delete`,
                label: `List of ids of asset groups to be deleted - [${labelPrefix}asset_groups_to_delete]`,
                required: true,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_groups_to_delete': bundle.inputData?.[`${keyPrefix}asset_groups_to_delete`],
        }
    },
}
