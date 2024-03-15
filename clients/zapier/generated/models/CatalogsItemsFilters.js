const utils = require('../utils/utils');
const CatalogsHotelItemsFilter = require('../models/CatalogsHotelItemsFilter');
const CatalogsRetailItemsFilter = require('../models/CatalogsRetailItemsFilter');
const CatalogsType = require('../models/CatalogsType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            {
                key: `${keyPrefix}item_ids`,
                label: `[${labelPrefix}item_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}hotel_ids`,
                label: `[${labelPrefix}hotel_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'item_ids': bundle.inputData?.[`${keyPrefix}item_ids`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'hotel_ids': bundle.inputData?.[`${keyPrefix}hotel_ids`],
        }
    },
}
