const utils = require('../utils/utils');
const ConversionEvents_data_inner_custom_data_contents_inner = require('../models/ConversionEvents_data_inner_custom_data_contents_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}currency`,
                label: `The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. - [${labelPrefix}currency]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}value`,
                label: `Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. - [${labelPrefix}value]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_ids`,
                label: `List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). - [${labelPrefix}content_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_name`,
                label: `The name of the page or product associated with the event. - [${labelPrefix}content_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_category`,
                label: `The category of the content associated with the event. - [${labelPrefix}content_category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_brand`,
                label: `The brand of the content associated with the event. - [${labelPrefix}content_brand]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}contents`,
                label: `[${labelPrefix}contents]`,
                children: ConversionEvents_data_inner_custom_data_contents_inner.fields(`${keyPrefix}contents${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}num_items`,
                label: `Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). - [${labelPrefix}num_items]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}order_id`,
                label: `The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. - [${labelPrefix}order_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}search_string`,
                label: `The search string related to the user conversion event. - [${labelPrefix}search_string]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}opt_out_type`,
                label: `Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up. - [${labelPrefix}opt_out_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}np`,
                label: `Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. - [${labelPrefix}np]`,
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
            'content_name': bundle.inputData?.[`${keyPrefix}content_name`],
            'content_category': bundle.inputData?.[`${keyPrefix}content_category`],
            'content_brand': bundle.inputData?.[`${keyPrefix}content_brand`],
            'contents': utils.childMapping(bundle.inputData?.[`${keyPrefix}contents`], `${keyPrefix}contents`, ConversionEvents_data_inner_custom_data_contents_inner),
            'num_items': bundle.inputData?.[`${keyPrefix}num_items`],
            'order_id': bundle.inputData?.[`${keyPrefix}order_id`],
            'search_string': bundle.inputData?.[`${keyPrefix}search_string`],
            'opt_out_type': bundle.inputData?.[`${keyPrefix}opt_out_type`],
            'np': bundle.inputData?.[`${keyPrefix}np`],
        }
    },
}
