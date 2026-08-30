const utils = require('../utils/utils');
const DiscountStatus = require('../models/DiscountStatus');
const PromotionTemplateValue = require('../models/PromotionTemplateValue');
const PromotionType = require('../models/PromotionType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}discount_status`,
                ...DiscountStatus.fields(`${keyPrefix}discount_status`, isInput),
            },
            {
                key: `${keyPrefix}end_time`,
                label: `Promotion end time. Unix timestamp in seconds. Independent of campaign end time. - [${labelPrefix}end_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}external_id`,
                label: `Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. - [${labelPrefix}external_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}platform_type`,
                label: `The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. - [${labelPrefix}platform_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}promotion_code`,
                label: `Code that can be used to redeem a promotion. - [${labelPrefix}promotion_code]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}promotion_custom_id`,
                label: `An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. - [${labelPrefix}promotion_custom_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}promotion_title`,
                label: `Internal name for the promotion. - [${labelPrefix}promotion_title]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}promotion_type`,
                ...PromotionType.fields(`${keyPrefix}promotion_type`, isInput),
            },
            {
                key: `${keyPrefix}start_time`,
                label: `Promotion start time. Unix timestamp in seconds. Independent of campaign start time. - [${labelPrefix}start_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}template_values`,
                label: `[${labelPrefix}template_values]`,
                children: PromotionTemplateValue.fields(`${keyPrefix}template_values${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'discount_status': bundle.inputData?.[`${keyPrefix}discount_status`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'external_id': bundle.inputData?.[`${keyPrefix}external_id`],
            'platform_type': bundle.inputData?.[`${keyPrefix}platform_type`],
            'promotion_code': bundle.inputData?.[`${keyPrefix}promotion_code`],
            'promotion_custom_id': bundle.inputData?.[`${keyPrefix}promotion_custom_id`],
            'promotion_title': bundle.inputData?.[`${keyPrefix}promotion_title`],
            'promotion_type': bundle.inputData?.[`${keyPrefix}promotion_type`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'template_values': utils.childMapping(bundle.inputData?.[`${keyPrefix}template_values`], `${keyPrefix}template_values`, PromotionTemplateValue),
        }
    },
}
