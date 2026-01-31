const utils = require('../utils/utils');
const PinMediaSource = require('../models/PinMediaSource');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                key: `${keyPrefix}link`,
                label: `[${labelPrefix}link]`,
                type: 'string',
            },
            ...PinMediaSource.fields(`${keyPrefix}media_source`, isInput),
            {
                key: `${keyPrefix}parent_pin_id`,
                label: `The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). - [${labelPrefix}parent_pin_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}sponsor_id`,
                label: `The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. - [${labelPrefix}sponsor_id]`,
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
            'alt_text': bundle.inputData?.[`${keyPrefix}alt_text`],
            'board_id': bundle.inputData?.[`${keyPrefix}board_id`],
            'board_section_id': bundle.inputData?.[`${keyPrefix}board_section_id`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'dominant_color': bundle.inputData?.[`${keyPrefix}dominant_color`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'media_source': utils.removeIfEmpty(PinMediaSource.mapping(bundle, `${keyPrefix}media_source`)),
            'parent_pin_id': bundle.inputData?.[`${keyPrefix}parent_pin_id`],
            'sponsor_id': bundle.inputData?.[`${keyPrefix}sponsor_id`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
