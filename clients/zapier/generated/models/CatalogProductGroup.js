const utils = require('../utils/utils');
const Board = require('../models/Board');
const EntityStatus = require('../models/EntityStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `ID of the catalog product group. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}merchant_id`,
                label: `Merchant ID pertaining to the owner of the catalog product group. - [${labelPrefix}merchant_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Name of catalog product group - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}filters`,
                label: `Object holding a list of filters - [${labelPrefix}filters]`,
                dict: true,
            },
            {
                key: `${keyPrefix}filter_v2`,
                label: `Object holding a list of filters - [${labelPrefix}filter_v2]`,
                dict: true,
            },
            ...Board.fields(`${keyPrefix}type`, isInput),
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}feed_profile_id`,
                label: `id of the feed profile belonging to this catalog product group - [${labelPrefix}feed_profile_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `Unix timestamp in seconds of when catalog product group was created. - [${labelPrefix}created_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}last_update`,
                label: `Unix timestamp in seconds of last time catalog product group was updated. - [${labelPrefix}last_update]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}product_count`,
                label: `Amount of products in the catalog product group - [${labelPrefix}product_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}featured_position`,
                label: `index of the featured position of the catalog product group - [${labelPrefix}featured_position]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'merchant_id': bundle.inputData?.[`${keyPrefix}merchant_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'filters': bundle.inputData?.[`${keyPrefix}filters`],
            'filter_v2': bundle.inputData?.[`${keyPrefix}filter_v2`],
            'type': utils.removeIfEmpty(Board.mapping(bundle, `${keyPrefix}type`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'feed_profile_id': bundle.inputData?.[`${keyPrefix}feed_profile_id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'last_update': bundle.inputData?.[`${keyPrefix}last_update`],
            'product_count': bundle.inputData?.[`${keyPrefix}product_count`],
            'featured_position': bundle.inputData?.[`${keyPrefix}featured_position`],
        }
    },
}
