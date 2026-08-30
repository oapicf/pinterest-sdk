const utils = require('../utils/utils');
const TargetingSpecOperations = require('../models/TargetingSpecOperations');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bid_multiplier`,
                label: `<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. - [${labelPrefix}bid_multiplier]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}id`,
                label: `Ad group ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}targeting_spec_operations`,
                label: `[${labelPrefix}targeting_spec_operations]`,
                children: TargetingSpecOperations.fields(`${keyPrefix}targeting_spec_operations${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid_multiplier': bundle.inputData?.[`${keyPrefix}bid_multiplier`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'targeting_spec_operations': utils.childMapping(bundle.inputData?.[`${keyPrefix}targeting_spec_operations`], `${keyPrefix}targeting_spec_operations`, TargetingSpecOperations),
        }
    },
}
