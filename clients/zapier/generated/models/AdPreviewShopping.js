const utils = require('../utils/utils');
const AdShoppingPreviewCreativeType = require('../models/AdShoppingPreviewCreativeType');
const BasePreferredMediaType = require('../models/BasePreferredMediaType');
const CustomizableCTAType = require('../models/CustomizableCTAType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_product_group_id`,
                label: `Catalog Product Group Id. - [${labelPrefix}catalog_product_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}creative_type`,
                ...AdShoppingPreviewCreativeType.fields(`${keyPrefix}creative_type`, isInput),
            },
            {
                key: `${keyPrefix}customizable_cta_type`,
                ...CustomizableCTAType.fields(`${keyPrefix}customizable_cta_type`, isInput),
            },
            {
                key: `${keyPrefix}hero_image_title`,
                label: `Title displayed below ad. - [${labelPrefix}hero_image_title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}hero_image_url`,
                label: `Hero image URL. - [${labelPrefix}hero_image_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}hero_pin_id`,
                label: `Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. - [${labelPrefix}hero_pin_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}image_tag`,
                label: `Multi image template tag. - [${labelPrefix}image_tag]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_id`,
                label: `Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. - [${labelPrefix}item_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}preferred_media_type`,
                ...BasePreferredMediaType.fields(`${keyPrefix}preferred_media_type`, isInput),
            },
            {
                key: `${keyPrefix}show_promotion`,
                label: `Include promotion data in preview when available on catalog item. Defaults to false. - [${labelPrefix}show_promotion]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}video_tag`,
                label: `Multi video template tag, image_tag and video_tag are mutual exclusive. - [${labelPrefix}video_tag]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_product_group_id': bundle.inputData?.[`${keyPrefix}catalog_product_group_id`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'customizable_cta_type': bundle.inputData?.[`${keyPrefix}customizable_cta_type`],
            'hero_image_title': bundle.inputData?.[`${keyPrefix}hero_image_title`],
            'hero_image_url': bundle.inputData?.[`${keyPrefix}hero_image_url`],
            'hero_pin_id': bundle.inputData?.[`${keyPrefix}hero_pin_id`],
            'image_tag': bundle.inputData?.[`${keyPrefix}image_tag`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'preferred_media_type': bundle.inputData?.[`${keyPrefix}preferred_media_type`],
            'show_promotion': bundle.inputData?.[`${keyPrefix}show_promotion`],
            'video_tag': bundle.inputData?.[`${keyPrefix}video_tag`],
        }
    },
}
