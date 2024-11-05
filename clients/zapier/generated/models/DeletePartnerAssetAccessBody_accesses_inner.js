const utils = require('../utils/utils');

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
                key: `${keyPrefix}partner_type`,
                label: `If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. - [${labelPrefix}partner_type]`,
                type: 'string',
                choices: [
                    'INTERNAL',
                    'EXTERNAL',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'partner_id': bundle.inputData?.[`${keyPrefix}partner_id`],
            'asset_id': bundle.inputData?.[`${keyPrefix}asset_id`],
            'partner_type': bundle.inputData?.[`${keyPrefix}partner_type`],
        }
    },
}
