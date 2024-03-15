const utils = require('../utils/utils');
const PinUpdate_carousel_slots_inner = require('../models/PinUpdate_carousel_slots_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}alt_text`,
                label: `Pin's alternative text. - [${labelPrefix}alt_text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}board_id`,
                label: `The id of the board to move the Pin onto. - [${labelPrefix}board_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}board_section_id`,
                label: `<a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID. - [${labelPrefix}board_section_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Pin description - 800 characters maximum. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `URL viewer is taken to when they click pin. - [${labelPrefix}link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `The native pin title that creators explicitly prefer to display. - [${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}carousel_slots`,
                label: `[${labelPrefix}carousel_slots]`,
                children: PinUpdate_carousel_slots_inner.fields(`${keyPrefix}carousel_slots${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}note`,
                label: `Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. - [${labelPrefix}note]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'alt_text': bundle.inputData?.[`${keyPrefix}alt_text`],
            'board_id': bundle.inputData?.[`${keyPrefix}board_id`],
            'board_section_id': bundle.inputData?.[`${keyPrefix}board_section_id`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'carousel_slots': utils.childMapping(bundle.inputData?.[`${keyPrefix}carousel_slots`], `${keyPrefix}carousel_slots`, PinUpdate_carousel_slots_inner),
            'note': bundle.inputData?.[`${keyPrefix}note`],
        }
    },
}
