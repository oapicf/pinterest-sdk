const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}score`,
                label: `Your hotel's rating. - [${labelPrefix}score]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}number_of_reviewers`,
                label: `Total number of people who have rated this hotel. - [${labelPrefix}number_of_reviewers]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_score`,
                label: `Max value for the hotel rating score. - [${labelPrefix}max_score]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}rating_system`,
                label: `System you use for guest reviews. - [${labelPrefix}rating_system]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'score': bundle.inputData?.[`${keyPrefix}score`],
            'number_of_reviewers': bundle.inputData?.[`${keyPrefix}number_of_reviewers`],
            'max_score': bundle.inputData?.[`${keyPrefix}max_score`],
            'rating_system': bundle.inputData?.[`${keyPrefix}rating_system`],
        }
    },
}
