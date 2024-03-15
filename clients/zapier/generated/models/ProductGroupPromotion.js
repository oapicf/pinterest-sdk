const utils = require('../utils/utils');
const CreativeType = require('../models/CreativeType');
const EntityStatus = require('../models/EntityStatus');
const GridClickType = require('../models/GridClickType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `ID of the product group promotion. - [${labelPrefix}id]`,
                type: 'string',
            },
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
                key: `${keyPrefix}included`,
                label: `True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. - [${labelPrefix}included]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}definition`,
                label: `The full product group definition path - [${labelPrefix}definition]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}relative_definition`,
                label: `The definition of the product group, relative to its parent - an attribute name/value pair - [${labelPrefix}relative_definition]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}parent_id`,
                label: `The parent Product Group ID of this Product Group - [${labelPrefix}parent_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}slideshow_collections_title`,
                label: `Slideshow Collections Title - [${labelPrefix}slideshow_collections_title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}slideshow_collections_description`,
                label: `Slideshow Collections Description - [${labelPrefix}slideshow_collections_description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_mdl`,
                label: `If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog - [${labelPrefix}is_mdl]`,
                type: 'boolean',
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
            {
                key: `${keyPrefix}catalog_product_group_id`,
                label: `ID of the catalogs product group that this product group promotion references - [${labelPrefix}catalog_product_group_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalog_product_group_name`,
                label: `Catalogs product group name - [${labelPrefix}catalog_product_group_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}creative_type`,
                ...CreativeType.fields(`${keyPrefix}creative_type`, isInput),
            },
            {
                key: `${keyPrefix}collections_hero_pin_id`,
                label: `Hero Pin ID if this PG is promoted as a Collection - [${labelPrefix}collections_hero_pin_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}collections_hero_destination_url`,
                label: `Collections Hero Destination Url - [${labelPrefix}collections_hero_destination_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}grid_click_type`,
                ...GridClickType.fields(`${keyPrefix}grid_click_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ad_group_id': bundle.inputData?.[`${keyPrefix}ad_group_id`],
            'bid_in_micro_currency': bundle.inputData?.[`${keyPrefix}bid_in_micro_currency`],
            'included': bundle.inputData?.[`${keyPrefix}included`],
            'definition': bundle.inputData?.[`${keyPrefix}definition`],
            'relative_definition': bundle.inputData?.[`${keyPrefix}relative_definition`],
            'parent_id': bundle.inputData?.[`${keyPrefix}parent_id`],
            'slideshow_collections_title': bundle.inputData?.[`${keyPrefix}slideshow_collections_title`],
            'slideshow_collections_description': bundle.inputData?.[`${keyPrefix}slideshow_collections_description`],
            'is_mdl': bundle.inputData?.[`${keyPrefix}is_mdl`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'tracking_url': bundle.inputData?.[`${keyPrefix}tracking_url`],
            'catalog_product_group_id': bundle.inputData?.[`${keyPrefix}catalog_product_group_id`],
            'catalog_product_group_name': bundle.inputData?.[`${keyPrefix}catalog_product_group_name`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'collections_hero_pin_id': bundle.inputData?.[`${keyPrefix}collections_hero_pin_id`],
            'collections_hero_destination_url': bundle.inputData?.[`${keyPrefix}collections_hero_destination_url`],
            'grid_click_type': bundle.inputData?.[`${keyPrefix}grid_click_type`],
        }
    },
}
