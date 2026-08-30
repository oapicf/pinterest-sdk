const utils = require('../utils/utils');
const RetailLocalInventoryItemAttributesOptional = require('../models/RetailLocalInventoryItemAttributesOptional');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...RetailLocalInventoryItemAttributesOptional.fields(`${keyPrefix}attributes`, isInput),
            {
                key: `${keyPrefix}item_id`,
                label: `Catalog item id in the merchant namespace - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation`,
                label: `[${labelPrefix}operation]`,
                required: true,
                type: 'string',
                choices: [
                    'UPDATE',
                ],
            },
            {
                key: `${keyPrefix}store_code`,
                label: `Store code for the local inventory item - [${labelPrefix}store_code]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attributes': utils.removeIfEmpty(RetailLocalInventoryItemAttributesOptional.mapping(bundle, `${keyPrefix}attributes`)),
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'store_code': bundle.inputData?.[`${keyPrefix}store_code`],
        }
    },
}
