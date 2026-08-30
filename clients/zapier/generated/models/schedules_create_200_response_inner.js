const utils = require('../utils/utils');
const schedules_create_200_response_inner_data = require('../models/schedules_create_200_response_inner_data');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...schedules_create_200_response_inner_data.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(schedules_create_200_response_inner_data.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
