const utils = require('../utils/utils');
const ConversionEvents_data_inner_custom_data_contents_inner = require('../models/ConversionEvents_data_inner_custom_data_contents_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}currency`,
                label: `The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. - [${labelPrefix}currency]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}value`,
                label: `Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price - [${labelPrefix}value]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_ids`,
                label: `List of products IDs - [${labelPrefix}content_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}contents`,
                label: `[${labelPrefix}contents]`,
                children: ConversionEvents_data_inner_custom_data_contents_inner.fields(`${keyPrefix}contents${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}num_items`,
                label: `Total number of products of the event. For example, the total number of items purchased in a checkout event. - [${labelPrefix}num_items]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}order_id`,
                label: `The order ID - [${labelPrefix}order_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}search_string`,
                label: `The search string related to the user conversion event. - [${labelPrefix}search_string]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}opt_out_type`,
                label: `Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. - [${labelPrefix}opt_out_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}np`,
                label: `Named partner. Not required, this is for Pinterest internal use only. - [${labelPrefix}np]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'content_ids': bundle.inputData?.[`${keyPrefix}content_ids`],
            'contents': utils.childMapping(bundle.inputData?.[`${keyPrefix}contents`], `${keyPrefix}contents`, ConversionEvents_data_inner_custom_data_contents_inner),
            'num_items': bundle.inputData?.[`${keyPrefix}num_items`],
            'order_id': bundle.inputData?.[`${keyPrefix}order_id`],
            'search_string': bundle.inputData?.[`${keyPrefix}search_string`],
            'opt_out_type': bundle.inputData?.[`${keyPrefix}opt_out_type`],
            'np': bundle.inputData?.[`${keyPrefix}np`],
        }
    },
}
