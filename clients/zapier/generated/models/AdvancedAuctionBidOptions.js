const utils = require('../utils/utils');
const AppTypeMultipliers = require('../models/AppTypeMultipliers');
const PlacementMultipliers = require('../models/PlacementMultipliers');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bid_in_micro_currency`,
                label: `Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. - [${labelPrefix}bid_in_micro_currency]`,
                type: 'number',
            },
            ...AppTypeMultipliers.fields(`${keyPrefix}app_type_multipliers`, isInput),
            ...PlacementMultipliers.fields(`${keyPrefix}placement_multipliers`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid_in_micro_currency': bundle.inputData?.[`${keyPrefix}bid_in_micro_currency`],
            'app_type_multipliers': utils.removeIfEmpty(AppTypeMultipliers.mapping(bundle, `${keyPrefix}app_type_multipliers`)),
            'placement_multipliers': utils.removeIfEmpty(PlacementMultipliers.mapping(bundle, `${keyPrefix}placement_multipliers`)),
        }
    },
}
