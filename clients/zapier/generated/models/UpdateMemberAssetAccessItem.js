const utils = require('../utils/utils');
const Permissions = require('../models/Permissions');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_id`,
                label: `Id of the asset to update. - [${labelPrefix}asset_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}member_id`,
                label: `Unique identifier of the member on which to perform the update - [${labelPrefix}member_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}permissions`,
                list: true,
                type: 'string',
                ...Permissions.fields(`${keyPrefix}permissions`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'member_id': bundle.inputData?.[`${keyPrefix}member_id`],
            'permissions': utils.childMapping(bundle.inputData?.[`${keyPrefix}permissions`], `${keyPrefix}permissions`, Permissions),
        }
    },
}
