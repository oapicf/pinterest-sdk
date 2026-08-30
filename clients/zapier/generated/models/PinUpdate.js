const utils = require('../utils/utils');
const AiDisclosuresUpdate = require('../models/AiDisclosuresUpdate');
const CarouselSlot = require('../models/CarouselSlot');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AiDisclosuresUpdate.fields(`${keyPrefix}ai_disclosures`, isInput),
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
            {
                key: `${keyPrefix}board_section_id`,
                label: `The board section to which this Pin belongs. - [${labelPrefix}board_section_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}carousel_slots`,
                label: `[${labelPrefix}carousel_slots]`,
                children: CarouselSlot.fields(`${keyPrefix}carousel_slots${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ai_disclosures': utils.removeIfEmpty(AiDisclosuresUpdate.mapping(bundle, `${keyPrefix}ai_disclosures`)),
            'alt_text': bundle.inputData?.[`${keyPrefix}alt_text`],
            'board_id': bundle.inputData?.[`${keyPrefix}board_id`],
            'board_section_id': bundle.inputData?.[`${keyPrefix}board_section_id`],
            'carousel_slots': utils.childMapping(bundle.inputData?.[`${keyPrefix}carousel_slots`], `${keyPrefix}carousel_slots`, CarouselSlot),
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
