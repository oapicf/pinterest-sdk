const utils = require('../utils/utils');
const PlacementType = require('../models/PlacementType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}PLACEMENT`,
                ...PlacementType.fields(`${keyPrefix}PLACEMENT`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'PLACEMENT': bundle.inputData?.[`${keyPrefix}PLACEMENT`],
        }
    },
}
