const utils = require('../utils/utils');
const Board_owner = require('../models/Board_owner');
const CreativeType = require('../models/CreativeType');
const PinMediaSource = require('../models/PinMediaSource');
const SummaryPin_media = require('../models/SummaryPin_media');

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
                label: `[${labelPrefix}created_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `[${labelPrefix}link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `[${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dominant_color`,
                label: `Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". - [${labelPrefix}dominant_color]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}alt_text`,
                label: `[${labelPrefix}alt_text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}creative_type`,
                ...CreativeType.fields(`${keyPrefix}creative_type`, isInput),
            },
            {
                key: `${keyPrefix}board_id`,
                label: `The board to which this Pin belongs. - [${labelPrefix}board_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}board_section_id`,
                label: `The board section to which this Pin belongs. - [${labelPrefix}board_section_id]`,
                type: 'string',
            },
            ...Board_owner.fields(`${keyPrefix}board_owner`, isInput),
            {
                key: `${keyPrefix}is_owner`,
                label: `Whether the \"operation user_account\" is the Pin owner. - [${labelPrefix}is_owner]`,
                type: 'boolean',
            },
            ...SummaryPin_media.fields(`${keyPrefix}media`, isInput),
            ...PinMediaSource.fields(`${keyPrefix}media_source`, isInput),
            {
                key: `${keyPrefix}parent_pin_id`,
                label: `The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. - [${labelPrefix}parent_pin_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_standard`,
                label: `Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information. - [${labelPrefix}is_standard]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}has_been_promoted`,
                label: `Whether the Pin has been promoted or not. - [${labelPrefix}has_been_promoted]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}note`,
                label: `Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. - [${labelPrefix}note]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pin_metrics`,
                label: `Pin metrics with associated time intervals if any. - [${labelPrefix}pin_metrics]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'dominant_color': bundle.inputData?.[`${keyPrefix}dominant_color`],
            'alt_text': bundle.inputData?.[`${keyPrefix}alt_text`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'board_id': bundle.inputData?.[`${keyPrefix}board_id`],
            'board_section_id': bundle.inputData?.[`${keyPrefix}board_section_id`],
            'board_owner': utils.removeIfEmpty(Board_owner.mapping(bundle, `${keyPrefix}board_owner`)),
            'is_owner': bundle.inputData?.[`${keyPrefix}is_owner`],
            'media': utils.removeIfEmpty(SummaryPin_media.mapping(bundle, `${keyPrefix}media`)),
            'media_source': utils.removeIfEmpty(PinMediaSource.mapping(bundle, `${keyPrefix}media_source`)),
            'parent_pin_id': bundle.inputData?.[`${keyPrefix}parent_pin_id`],
            'is_standard': bundle.inputData?.[`${keyPrefix}is_standard`],
            'has_been_promoted': bundle.inputData?.[`${keyPrefix}has_been_promoted`],
            'note': bundle.inputData?.[`${keyPrefix}note`],
            'pin_metrics': bundle.inputData?.[`${keyPrefix}pin_metrics`],
        }
    },
}
