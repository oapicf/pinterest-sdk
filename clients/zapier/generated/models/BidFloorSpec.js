const utils = require('../utils/utils');
const ActionType = require('../models/ActionType');
const Country = require('../models/Country');
const CreativeType = require('../models/CreativeType');
const Currency = require('../models/Currency');
const ObjectiveType = require('../models/ObjectiveType');
const OptimizationGoalMetadata = require('../models/OptimizationGoalMetadata');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}countries`,
                list: true,
                type: 'string',
                ...Country.fields(`${keyPrefix}countries`, isInput),
            },
            {
                key: `${keyPrefix}currency`,
                ...Currency.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}objective_type`,
                ...ObjectiveType.fields(`${keyPrefix}objective_type`, isInput),
            },
            {
                key: `${keyPrefix}billable_event`,
                ...ActionType.fields(`${keyPrefix}billable_event`, isInput),
            },
            ...OptimizationGoalMetadata.fields(`${keyPrefix}optimization_goal_metadata`, isInput),
            {
                key: `${keyPrefix}creative_type`,
                ...CreativeType.fields(`${keyPrefix}creative_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'countries': utils.childMapping(bundle.inputData?.[`${keyPrefix}countries`], `${keyPrefix}countries`, Country),
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'objective_type': bundle.inputData?.[`${keyPrefix}objective_type`],
            'billable_event': bundle.inputData?.[`${keyPrefix}billable_event`],
            'optimization_goal_metadata': utils.removeIfEmpty(OptimizationGoalMetadata.mapping(bundle, `${keyPrefix}optimization_goal_metadata`)),
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
        }
    },
}
