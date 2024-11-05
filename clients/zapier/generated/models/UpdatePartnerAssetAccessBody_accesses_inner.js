const utils = require('../utils/utils');
const Permissions = require('../models/Permissions');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}partner_id`,
                label: `Unique identifier of a business partner to update asset access to. - [${labelPrefix}partner_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_id`,
                label: `Unique identifier of the business asset. - [${labelPrefix}asset_id]`,
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
            'partner_id': bundle.inputData?.[`${keyPrefix}partner_id`],
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'permissions': utils.childMapping(bundle.inputData?.[`${keyPrefix}permissions`], `${keyPrefix}permissions`, Permissions),
        }
    },
}
