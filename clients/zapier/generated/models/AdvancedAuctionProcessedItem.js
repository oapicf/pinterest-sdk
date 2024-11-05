const utils = require('../utils/utils');
const AdvancedAuctionBidOptions = require('../models/AdvancedAuctionBidOptions');
const AdvancedAuctionItemsSubmitRecord = require('../models/AdvancedAuctionItemsSubmitRecord');
const AdvancedAuctionOperation = require('../models/AdvancedAuctionOperation');
const AdvancedAuctionOperationError = require('../models/AdvancedAuctionOperationError');
const Country = require('../models/Country');
const Language = require('../models/Language');
const UpdateMaskBidOptionField = require('../models/UpdateMaskBidOptionField');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}operation`,
                ...AdvancedAuctionOperation.fields(`${keyPrefix}operation`, isInput),
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog retail item id in the merchant namespace - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}language`,
                ...Language.fields(`${keyPrefix}language`, isInput),
            },
            ...AdvancedAuctionBidOptions.fields(`${keyPrefix}bid_options`, isInput),
            {
                key: `${keyPrefix}update_mask`,
                list: true,
                type: 'string',
                ...UpdateMaskBidOptionField.fields(`${keyPrefix}update_mask`, isInput),
            },
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: AdvancedAuctionOperationError.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'language': bundle.inputData?.[`${keyPrefix}language`],
            'bid_options': utils.removeIfEmpty(AdvancedAuctionBidOptions.mapping(bundle, `${keyPrefix}bid_options`)),
            'update_mask': utils.childMapping(bundle.inputData?.[`${keyPrefix}update_mask`], `${keyPrefix}update_mask`, UpdateMaskBidOptionField),
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, AdvancedAuctionOperationError),
        }
    },
}
