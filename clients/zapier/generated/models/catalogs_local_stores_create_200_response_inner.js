const utils = require('../utils/utils');
const catalogs_local_stores_create_200_response_inner_data = require('../models/catalogs_local_stores_create_200_response_inner_data');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...catalogs_local_stores_create_200_response_inner_data.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(catalogs_local_stores_create_200_response_inner_data.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
