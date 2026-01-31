const utils = require('../utils/utils');
const GenderDemographics = require('../models/GenderDemographics');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}age`,
                label: `Age demographic distribution - [${labelPrefix}age]`,
                required: true,
                type: 'object',
            },
            ...GenderDemographics.fields(`${keyPrefix}gender`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'age': bundle.inputData?.[`${keyPrefix}age`],
            'gender': utils.removeIfEmpty(GenderDemographics.mapping(bundle, `${keyPrefix}gender`)),
        }
    },
}
