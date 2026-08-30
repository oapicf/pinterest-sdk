const utils = require('../utils/utils');
const BudgetType = require('../models/BudgetType');
const PacingDeliveryType = require('../models/PacingDeliveryType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}auto_targeting_enabled`,
                label: `Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. - [${labelPrefix}auto_targeting_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}bid_multiplier`,
                label: `<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. - [${labelPrefix}bid_multiplier]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}budget_type`,
                ...BudgetType.fields(`${keyPrefix}budget_type`, isInput),
            },
            {
                key: `${keyPrefix}pacing_delivery_type`,
                ...PacingDeliveryType.fields(`${keyPrefix}pacing_delivery_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'bid_multiplier': bundle.inputData?.[`${keyPrefix}bid_multiplier`],
            'budget_type': bundle.inputData?.[`${keyPrefix}budget_type`],
            'pacing_delivery_type': bundle.inputData?.[`${keyPrefix}pacing_delivery_type`],
        }
    },
}
