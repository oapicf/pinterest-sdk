const utils = require('../utils/utils');
const OrderLinePaidType = require('../models/OrderLinePaidType');
const OrderLineStatus = require('../models/OrderLineStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Order line ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"orderline\". - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Ad account ID. - [${labelPrefix}ad_account_id]`,
                type: 'string',
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
                key: `${keyPrefix}end_time`,
                label: `End time. Unix timestamp. - [${labelPrefix}end_time]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}budget`,
                label: `Order line budget in micro currency. - [${labelPrefix}budget]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}paid_budget`,
                label: `Order line paid budget in micro currency. - [${labelPrefix}paid_budget]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}status`,
                ...OrderLineStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `Order line name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}paid_type`,
                ...OrderLinePaidType.fields(`${keyPrefix}paid_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'purchase_order_id': bundle.inputData?.[`${keyPrefix}purchase_order_id`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'budget': bundle.inputData?.[`${keyPrefix}budget`],
            'paid_budget': bundle.inputData?.[`${keyPrefix}paid_budget`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'paid_type': bundle.inputData?.[`${keyPrefix}paid_type`],
        }
    },
}
