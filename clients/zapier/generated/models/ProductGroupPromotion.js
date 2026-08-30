const utils = require('../utils/utils');
const CollectionsHeaderType = require('../models/CollectionsHeaderType');
const CreativeType = require('../models/CreativeType');
const EntityStatus = require('../models/EntityStatus');
const GridClickType = require('../models/GridClickType');
const PreferredMediaType = require('../models/PreferredMediaType');
const ProductGroupPromotionCustomizableCTAType = require('../models/ProductGroupPromotionCustomizableCTAType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_group_id`,
                label: `ID of the ad group the product group belongs to. - [${labelPrefix}ad_group_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}bid_in_micro_currency`,
                label: `The bid in micro currency. - [${labelPrefix}bid_in_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}catalog_product_group_id`,
                label: `ID of the catalogs product group that this product group promotion references (required for create operations) - [${labelPrefix}catalog_product_group_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalog_product_group_name`,
                label: `Catalogs product group name - [${labelPrefix}catalog_product_group_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}collections_header_type`,
                ...CollectionsHeaderType.fields(`${keyPrefix}collections_header_type`, isInput),
            },
            {
                key: `${keyPrefix}collections_hero_destination_url`,
                label: `Collections Hero Destination Url - [${labelPrefix}collections_hero_destination_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}collections_hero_pin_id`,
                label: `Hero Pin ID if this PG is promoted as a Collection - [${labelPrefix}collections_hero_pin_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}creative_type`,
                ...CreativeType.fields(`${keyPrefix}creative_type`, isInput),
            },
            {
                key: `${keyPrefix}customizable_cta_type`,
                ...ProductGroupPromotionCustomizableCTAType.fields(`${keyPrefix}customizable_cta_type`, isInput),
            },
            {
                key: `${keyPrefix}definition`,
                label: `The full product group definition path - [${labelPrefix}definition]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}grid_click_type`,
                ...GridClickType.fields(`${keyPrefix}grid_click_type`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `ID of the product group promotion (required for update operations). - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}included`,
                label: `True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. - [${labelPrefix}included]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_generate_background`,
                label: `Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. - [${labelPrefix}is_generate_background]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_image_auto_resizing`,
                label: `Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. - [${labelPrefix}is_image_auto_resizing]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_mdl`,
                label: `If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog - [${labelPrefix}is_mdl]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}parent_id`,
                label: `The parent Product Group ID of this Product Group - [${labelPrefix}parent_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}preferred_media_type`,
                ...PreferredMediaType.fields(`${keyPrefix}preferred_media_type`, isInput),
            },
            {
                key: `${keyPrefix}relative_definition`,
                label: `The definition of the product group, relative to its parent - an attribute name/value pair - [${labelPrefix}relative_definition]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}selected_image_tag`,
                label: `The ad image tag selected for the product group promotion. - [${labelPrefix}selected_image_tag]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}selected_video_tag`,
                label: `The ad video tag selected for the product group promotion. - [${labelPrefix}selected_video_tag]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}slideshow_collections_description`,
                label: `Slideshow Collections Description - [${labelPrefix}slideshow_collections_description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}slideshow_collections_title`,
                label: `Slideshow Collections Title - [${labelPrefix}slideshow_collections_title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}tracking_url`,
                label: `Tracking template for proudct group promotions. 4000 limit - [${labelPrefix}tracking_url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_group_id': bundle.inputData?.[`${keyPrefix}ad_group_id`],
            'bid_in_micro_currency': bundle.inputData?.[`${keyPrefix}bid_in_micro_currency`],
            'catalog_product_group_id': bundle.inputData?.[`${keyPrefix}catalog_product_group_id`],
            'catalog_product_group_name': bundle.inputData?.[`${keyPrefix}catalog_product_group_name`],
            'collections_header_type': bundle.inputData?.[`${keyPrefix}collections_header_type`],
            'collections_hero_destination_url': bundle.inputData?.[`${keyPrefix}collections_hero_destination_url`],
            'collections_hero_pin_id': bundle.inputData?.[`${keyPrefix}collections_hero_pin_id`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'customizable_cta_type': bundle.inputData?.[`${keyPrefix}customizable_cta_type`],
            'definition': bundle.inputData?.[`${keyPrefix}definition`],
            'grid_click_type': bundle.inputData?.[`${keyPrefix}grid_click_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'included': bundle.inputData?.[`${keyPrefix}included`],
            'is_generate_background': bundle.inputData?.[`${keyPrefix}is_generate_background`],
            'is_image_auto_resizing': bundle.inputData?.[`${keyPrefix}is_image_auto_resizing`],
            'is_mdl': bundle.inputData?.[`${keyPrefix}is_mdl`],
            'parent_id': bundle.inputData?.[`${keyPrefix}parent_id`],
            'preferred_media_type': bundle.inputData?.[`${keyPrefix}preferred_media_type`],
            'relative_definition': bundle.inputData?.[`${keyPrefix}relative_definition`],
            'selected_image_tag': bundle.inputData?.[`${keyPrefix}selected_image_tag`],
            'selected_video_tag': bundle.inputData?.[`${keyPrefix}selected_video_tag`],
            'slideshow_collections_description': bundle.inputData?.[`${keyPrefix}slideshow_collections_description`],
            'slideshow_collections_title': bundle.inputData?.[`${keyPrefix}slideshow_collections_title`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'tracking_url': bundle.inputData?.[`${keyPrefix}tracking_url`],
        }
    },
}
