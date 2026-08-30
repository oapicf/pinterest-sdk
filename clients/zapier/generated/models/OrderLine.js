const utils = require('../utils/utils');
const OrderLinePaidType = require('../models/OrderLinePaidType');
const OrderLineStatus = require('../models/OrderLineStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Ad account ID. - [${labelPrefix}ad_account_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}budget`,
                label: `Order line budget in micro currency. - [${labelPrefix}budget]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}campaign_ids`,
                label: `Associated List of campaign IDs. - [${labelPrefix}campaign_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}end_time`,
                label: `End time. Unix timestamp. - [${labelPrefix}end_time]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}id`,
                label: `Order line ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Order line name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}paid_budget`,
                label: `Order line paid budget in micro currency. - [${labelPrefix}paid_budget]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}paid_type`,
                ...OrderLinePaidType.fields(`${keyPrefix}paid_type`, isInput),
            },
            {
                key: `${keyPrefix}purchase_order_id`,
                label: `Purchase order ID. - [${labelPrefix}purchase_order_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_time`,
                label: `Start time. Unix timestamp. - [${labelPrefix}start_time]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}status`,
                ...OrderLineStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"orderline\". - [${labelPrefix}type]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'budget': bundle.inputData?.[`${keyPrefix}budget`],
            'campaign_ids': bundle.inputData?.[`${keyPrefix}campaign_ids`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'paid_budget': bundle.inputData?.[`${keyPrefix}paid_budget`],
            'paid_type': bundle.inputData?.[`${keyPrefix}paid_type`],
            'purchase_order_id': bundle.inputData?.[`${keyPrefix}purchase_order_id`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
