const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Conversion tag name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}aem_enabled`,
                label: `Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. - [${labelPrefix}aem_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}md_frequency`,
                label: `Metadata ingestion frequency. - [${labelPrefix}md_frequency]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}aem_fnln_enabled`,
                label: `Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. - [${labelPrefix}aem_fnln_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}aem_ph_enabled`,
                label: `Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. - [${labelPrefix}aem_ph_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}aem_ge_enabled`,
                label: `Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. - [${labelPrefix}aem_ge_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}aem_db_enabled`,
                label: `Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. - [${labelPrefix}aem_db_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}aem_loc_enabled`,
                label: `Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. - [${labelPrefix}aem_loc_enabled]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'aem_enabled': bundle.inputData?.[`${keyPrefix}aem_enabled`],
            'md_frequency': bundle.inputData?.[`${keyPrefix}md_frequency`],
            'aem_fnln_enabled': bundle.inputData?.[`${keyPrefix}aem_fnln_enabled`],
            'aem_ph_enabled': bundle.inputData?.[`${keyPrefix}aem_ph_enabled`],
            'aem_ge_enabled': bundle.inputData?.[`${keyPrefix}aem_ge_enabled`],
            'aem_db_enabled': bundle.inputData?.[`${keyPrefix}aem_db_enabled`],
            'aem_loc_enabled': bundle.inputData?.[`${keyPrefix}aem_loc_enabled`],
        }
    },
}
