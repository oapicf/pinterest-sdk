const utils = require('../utils/utils');
const KeywordInfo = require('../models/KeywordInfo');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}board_url`,
                label: `URL of the editorial board - [${labelPrefix}board_url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Description of the editorial article - [${labelPrefix}description]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}interests`,
                label: `List of interests related to the editorial article - [${labelPrefix}interests]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}pins_url`,
                label: `URL of the pins related to the editorial article - [${labelPrefix}pins_url]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}related_keywords`,
                label: `[${labelPrefix}related_keywords]`,
                children: KeywordInfo.fields(`${keyPrefix}related_keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}title`,
                label: `Title of the editorial article - [${labelPrefix}title]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'board_url': bundle.inputData?.[`${keyPrefix}board_url`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'interests': bundle.inputData?.[`${keyPrefix}interests`],
            'pins_url': bundle.inputData?.[`${keyPrefix}pins_url`],
            'related_keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}related_keywords`], `${keyPrefix}related_keywords`, KeywordInfo),
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
