const utils = require('../utils/utils');
const AdvancedAuctionBidOptions = require('../models/AdvancedAuctionBidOptions');
const Country = require('../models/Country');
const Language = require('../models/Language');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AdvancedAuctionBidOptions.fields(`${keyPrefix}bid_options`, isInput),
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid_options': utils.removeIfEmpty(AdvancedAuctionBidOptions.mapping(bundle, `${keyPrefix}bid_options`)),
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'language': bundle.inputData?.[`${keyPrefix}language`],
        }
    },
}
