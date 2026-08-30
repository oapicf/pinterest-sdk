const utils = require('../utils/utils');
const BoardMedia = require('../models/BoardMedia');
const BoardOwner = require('../models/BoardOwner');
const BoardPrivacy = require('../models/BoardPrivacy');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}board_pins_modified_at`,
                label: `Date and time of last board pins modified. - [${labelPrefix}board_pins_modified_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}collaborator_count`,
                label: `Count of collaborators on the board. - [${labelPrefix}collaborator_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `Date and time of board creation. - [${labelPrefix}created_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}follower_count`,
                label: `Board follower count. - [${labelPrefix}follower_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_ads_only`,
                label: `If set to `true`, the board will be ad-only and can store ad-only Pins. - [${labelPrefix}is_ads_only]`,
                type: 'boolean',
            },
            ...BoardMedia.fields(`${keyPrefix}media`, isInput),
            {
                key: `${keyPrefix}name`,
                label: `    Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...BoardOwner.fields(`${keyPrefix}owner`, isInput),
            {
                key: `${keyPrefix}pin_count`,
                label: `Count of Pins on the board. - [${labelPrefix}pin_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}privacy`,
                ...BoardPrivacy.fields(`${keyPrefix}privacy`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'board_pins_modified_at': bundle.inputData?.[`${keyPrefix}board_pins_modified_at`],
            'collaborator_count': bundle.inputData?.[`${keyPrefix}collaborator_count`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'follower_count': bundle.inputData?.[`${keyPrefix}follower_count`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'is_ads_only': bundle.inputData?.[`${keyPrefix}is_ads_only`],
            'media': utils.removeIfEmpty(BoardMedia.mapping(bundle, `${keyPrefix}media`)),
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'owner': utils.removeIfEmpty(BoardOwner.mapping(bundle, `${keyPrefix}owner`)),
            'pin_count': bundle.inputData?.[`${keyPrefix}pin_count`],
            'privacy': bundle.inputData?.[`${keyPrefix}privacy`],
        }
    },
}
