const utils = require('../utils/utils');
const CreativeType = require('../models/CreativeType');
const EntityStatus = require('../models/EntityStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                key: `${keyPrefix}catalogs_product_group_id`,
                label: `ID of the catalogs product group that this product group promotion references - [${labelPrefix}catalogs_product_group_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalogs_product_group_name`,
                label: `Catalogs product group - [${labelPrefix}catalogs_product_group_name]`,
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'tracking_url': bundle.inputData?.[`${keyPrefix}tracking_url`],
            'catalogs_product_group_id': bundle.inputData?.[`${keyPrefix}catalogs_product_group_id`],
            'catalogs_product_group_name': bundle.inputData?.[`${keyPrefix}catalogs_product_group_name`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'collections_hero_pin_id': bundle.inputData?.[`${keyPrefix}collections_hero_pin_id`],
            'collections_hero_destination_url': bundle.inputData?.[`${keyPrefix}collections_hero_destination_url`],
            'slideshow_collections_title': bundle.inputData?.[`${keyPrefix}slideshow_collections_title`],
            'slideshow_collections_description': bundle.inputData?.[`${keyPrefix}slideshow_collections_description`],
            'is_mdl': bundle.inputData?.[`${keyPrefix}is_mdl`],
        }
    },
}
