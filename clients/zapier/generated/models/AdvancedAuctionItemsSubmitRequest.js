const utils = require('../utils/utils');
const AdvancedAuctionItemsSubmitRecord = require('../models/AdvancedAuctionItemsSubmitRecord');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to all items - [${labelPrefix}catalog_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: AdvancedAuctionItemsSubmitRecord.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, AdvancedAuctionItemsSubmitRecord),
        }
    },
}
