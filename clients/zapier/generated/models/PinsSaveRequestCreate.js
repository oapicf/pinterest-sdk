const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}board_id`,
                label: `Unique identifier of the board to which the pin will be saved. - [${labelPrefix}board_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}board_section_id`,
                label: `Unique identifier of the board section to which the pin will be saved. - [${labelPrefix}board_section_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'board_id': bundle.inputData?.[`${keyPrefix}board_id`],
            'board_section_id': bundle.inputData?.[`${keyPrefix}board_section_id`],
        }
    },
}
