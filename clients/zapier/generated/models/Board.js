const utils = require('../utils/utils');
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
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'owner': utils.removeIfEmpty(Board_owner.mapping(bundle, `${keyPrefix}owner`)),
            'privacy': bundle.inputData?.[`${keyPrefix}privacy`],
        }
    },
}
