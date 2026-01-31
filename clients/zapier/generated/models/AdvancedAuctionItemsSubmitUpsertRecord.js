const utils = require('../utils/utils');
const AdvancedAuctionBidOptions = require('../models/AdvancedAuctionBidOptions');
const AdvancedAuctionOperationError = require('../models/AdvancedAuctionOperationError');
const Country = require('../models/Country');
const Language = require('../models/Language');
const UpdateMaskBidOptionField = require('../models/UpdateMaskBidOptionField');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog retail item id in the merchant namespace - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}language`,
                ...Language.fields(`${keyPrefix}language`, isInput),
            },
            ...AdvancedAuctionBidOptions.fields(`${keyPrefix}bid_options`, isInput),
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: AdvancedAuctionOperationError.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}update_mask`,
                list: true,
                type: 'string',
                ...UpdateMaskBidOptionField.fields(`${keyPrefix}update_mask`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'language': bundle.inputData?.[`${keyPrefix}language`],
            'bid_options': utils.removeIfEmpty(AdvancedAuctionBidOptions.mapping(bundle, `${keyPrefix}bid_options`)),
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, AdvancedAuctionOperationError),
            'update_mask': utils.childMapping(bundle.inputData?.[`${keyPrefix}update_mask`], `${keyPrefix}update_mask`, UpdateMaskBidOptionField),
        }
    },
}
