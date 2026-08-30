const utils = require('../utils/utils');
const AiDisclosures = require('../models/AiDisclosures');
const BoardOwner = require('../models/BoardOwner');
const CreativeType = require('../models/CreativeType');
const PinMedia = require('../models/PinMedia');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AiDisclosures.fields(`${keyPrefix}ai_disclosures`, isInput),
            {
                key: `${keyPrefix}alt_text`,
                label: `[${labelPrefix}alt_text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}board_id`,
                label: `The board to which this Pin belongs. - [${labelPrefix}board_id]`,
                type: 'string',
            },
            ...BoardOwner.fields(`${keyPrefix}board_owner`, isInput),
            {
                key: `${keyPrefix}board_section_id`,
                label: `The board section to which this Pin belongs. - [${labelPrefix}board_section_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}creative_type`,
                ...CreativeType.fields(`${keyPrefix}creative_type`, isInput),
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dominant_color`,
                label: `Dominant pin color. Hex number, e.g. `#6E7874`. - [${labelPrefix}dominant_color]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}has_been_promoted`,
                label: `Whether the Pin has been promoted or not. - [${labelPrefix}has_been_promoted]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_owner`,
                label: `Whether the \"operation user_account\" is the Pin owner. - [${labelPrefix}is_owner]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_product`,
                label: `Whether the Pin is a product Pin. - [${labelPrefix}is_product]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_standard`,
                label: `Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. - [${labelPrefix}is_standard]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}link`,
                label: `[${labelPrefix}link]`,
                type: 'string',
            },
            ...PinMedia.fields(`${keyPrefix}media`, isInput),
            {
                key: `${keyPrefix}parent_pin_id`,
                label: `The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). - [${labelPrefix}parent_pin_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pin_metrics`,
                label: `Pin metrics with associated time intervals if any. - [${labelPrefix}pin_metrics]`,
                dict: true,
            },
            {
                key: `${keyPrefix}title`,
                label: `[${labelPrefix}title]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ai_disclosures': utils.removeIfEmpty(AiDisclosures.mapping(bundle, `${keyPrefix}ai_disclosures`)),
            'alt_text': bundle.inputData?.[`${keyPrefix}alt_text`],
            'board_id': bundle.inputData?.[`${keyPrefix}board_id`],
            'board_owner': utils.removeIfEmpty(BoardOwner.mapping(bundle, `${keyPrefix}board_owner`)),
            'board_section_id': bundle.inputData?.[`${keyPrefix}board_section_id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'dominant_color': bundle.inputData?.[`${keyPrefix}dominant_color`],
            'has_been_promoted': bundle.inputData?.[`${keyPrefix}has_been_promoted`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'is_owner': bundle.inputData?.[`${keyPrefix}is_owner`],
            'is_product': bundle.inputData?.[`${keyPrefix}is_product`],
            'is_standard': bundle.inputData?.[`${keyPrefix}is_standard`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'media': utils.removeIfEmpty(PinMedia.mapping(bundle, `${keyPrefix}media`)),
            'parent_pin_id': bundle.inputData?.[`${keyPrefix}parent_pin_id`],
            'pin_metrics': bundle.inputData?.[`${keyPrefix}pin_metrics`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
