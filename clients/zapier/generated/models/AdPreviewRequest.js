const utils = require('../utils/utils');
const AdPreviewCreateFromImage = require('../models/AdPreviewCreateFromImage');
const AdPreviewCreateFromPin = require('../models/AdPreviewCreateFromPin');
const AdPreviewShopping = require('../models/AdPreviewShopping');
const CustomizableCTAType = require('../models/CustomizableCTAType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}image_url`,
                label: `Image URL. - [${labelPrefix}image_url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `Title displayed below ad. - [${labelPrefix}title]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}pin_id`,
                label: `Pin ID. - [${labelPrefix}pin_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalog_product_group_id`,
                label: `Catalog Product Group Id. - [${labelPrefix}catalog_product_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}creative_type`,
                label: `Ad format of the shopping ad preview. - [${labelPrefix}creative_type]`,
                required: true,
                type: 'string',
                choices: [
                    'SHOPPING',
                    'CAROUSEL',
                    'COLLECTION',
                    'REGULAR',
                ],
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
                label: `Preferred media type. - [${labelPrefix}preferred_media_type]`,
                type: 'string',
                choices: [
                    'VIDEO',
                    'IMAGE',
                ],
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
            'image_url': bundle.inputData?.[`${keyPrefix}image_url`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
            'catalog_product_group_id': bundle.inputData?.[`${keyPrefix}catalog_product_group_id`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'customizable_cta_type': bundle.inputData?.[`${keyPrefix}customizable_cta_type`],
            'hero_image_title': bundle.inputData?.[`${keyPrefix}hero_image_title`],
            'hero_image_url': bundle.inputData?.[`${keyPrefix}hero_image_url`],
            'hero_pin_id': bundle.inputData?.[`${keyPrefix}hero_pin_id`],
            'image_tag': bundle.inputData?.[`${keyPrefix}image_tag`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'preferred_media_type': bundle.inputData?.[`${keyPrefix}preferred_media_type`],
            'video_tag': bundle.inputData?.[`${keyPrefix}video_tag`],
        }
    },
}
