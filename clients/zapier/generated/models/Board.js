const utils = require('../utils/utils');
const Board_media = require('../models/Board_media');
const Board_owner = require('../models/Board_owner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `Date and time of board creation. - [${labelPrefix}created_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}board_pins_modified_at`,
                label: `Date and time of last board pins modified. - [${labelPrefix}board_pins_modified_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}collaborator_count`,
                label: `Count of collaborators on the board. - [${labelPrefix}collaborator_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pin_count`,
                label: `Count of pins on the board. - [${labelPrefix}pin_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}follower_count`,
                label: `Board follower count. - [${labelPrefix}follower_count]`,
                type: 'integer',
            },
            ...Board_media.fields(`${keyPrefix}media`, isInput),
            ...Board_owner.fields(`${keyPrefix}owner`, isInput),
            {
                key: `${keyPrefix}privacy`,
                label: `Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> - [${labelPrefix}privacy]`,
                type: 'string',
                choices: [
                    'PUBLIC',
                    'PROTECTED',
                    'SECRET',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'board_pins_modified_at': bundle.inputData?.[`${keyPrefix}board_pins_modified_at`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'collaborator_count': bundle.inputData?.[`${keyPrefix}collaborator_count`],
            'pin_count': bundle.inputData?.[`${keyPrefix}pin_count`],
            'follower_count': bundle.inputData?.[`${keyPrefix}follower_count`],
            'media': utils.removeIfEmpty(Board_media.mapping(bundle, `${keyPrefix}media`)),
            'owner': utils.removeIfEmpty(Board_owner.mapping(bundle, `${keyPrefix}owner`)),
            'privacy': bundle.inputData?.[`${keyPrefix}privacy`],
        }
    },
}
