const utils = require('../utils/utils');
const ObjectiveType = require('../models/ObjectiveType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaign_objective_types`,
                list: true,
                type: 'string',
                ...ObjectiveType.fields(`${keyPrefix}campaign_objective_types`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaign_objective_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaign_objective_types`], `${keyPrefix}campaign_objective_types`, ObjectiveType),
        }
    },
}
