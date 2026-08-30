const utils = require('../utils/utils');
const LocalInventoryCreateOperation = require('../models/LocalInventoryCreateOperation');
const LocalInventoryDeleteOperation = require('../models/LocalInventoryDeleteOperation');
const LocalInventoryUpdateOperation = require('../models/LocalInventoryUpdateOperation');
const LocalInventoryUpsertOperation = require('../models/LocalInventoryUpsertOperation');
const RetailLocalInventoryItemAttributes = require('../models/RetailLocalInventoryItemAttributes');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...RetailLocalInventoryItemAttributes.fields(`${keyPrefix}attributes`, isInput),
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
                    'DELETE',
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
            'attributes': utils.removeIfEmpty(RetailLocalInventoryItemAttributes.mapping(bundle, `${keyPrefix}attributes`)),
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'store_code': bundle.inputData?.[`${keyPrefix}store_code`],
        }
    },
}
