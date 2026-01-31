const utils = require('../utils/utils');
const CatalogsCreateRetailItem = require('../models/CatalogsCreateRetailItem');
const CatalogsDeleteRetailItem = require('../models/CatalogsDeleteRetailItem');
const CatalogsUpdateRetailItem = require('../models/CatalogsUpdateRetailItem');
const CatalogsUpsertRetailItem = require('../models/CatalogsUpsertRetailItem');
const ItemAttributesRequest = require('../models/ItemAttributesRequest');
const UpdateMaskFieldType = require('../models/UpdateMaskFieldType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ItemAttributesRequest.fields(`${keyPrefix}attributes`, isInput),
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog item id in the merchant namespace - [${labelPrefix}item_id]`,
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
                key: `${keyPrefix}update_mask`,
                list: true,
                type: 'string',
                ...UpdateMaskFieldType.fields(`${keyPrefix}update_mask`, isInput),
            },
            {
                key: `${keyPrefix}last_updated_time`,
                label: `The millisecond timestamp when the item was lastly modified by the merchant. - [${labelPrefix}last_updated_time]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attributes': utils.removeIfEmpty(ItemAttributesRequest.mapping(bundle, `${keyPrefix}attributes`)),
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'update_mask': utils.childMapping(bundle.inputData?.[`${keyPrefix}update_mask`], `${keyPrefix}update_mask`, UpdateMaskFieldType),
            'last_updated_time': bundle.inputData?.[`${keyPrefix}last_updated_time`],
        }
    },
}
