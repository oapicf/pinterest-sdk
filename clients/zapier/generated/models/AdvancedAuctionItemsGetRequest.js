const utils = require('../utils/utils');
const AdvancedAuctionItemsGetRecord = require('../models/AdvancedAuctionItemsGetRecord');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the retail item - [${labelPrefix}catalog_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: AdvancedAuctionItemsGetRecord.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, AdvancedAuctionItemsGetRecord),
        }
    },
}
