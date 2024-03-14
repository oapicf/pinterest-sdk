const utils = require('../utils/utils');
const BidFloorSpec = require('../models/BidFloorSpec');
const TargetingSpec_1 = require('../models/TargetingSpec_1');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bid_floor_specs`,
                label: `[${labelPrefix}bid_floor_specs]`,
                children: BidFloorSpec.fields(`${keyPrefix}bid_floor_specs${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...TargetingSpec_1.fields(`${keyPrefix}targeting_spec`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid_floor_specs': utils.childMapping(bundle.inputData?.[`${keyPrefix}bid_floor_specs`], `${keyPrefix}bid_floor_specs`, BidFloorSpec),
            'targeting_spec': utils.removeIfEmpty(TargetingSpec_1.mapping(bundle, `${keyPrefix}targeting_spec`)),
        }
    },
}
