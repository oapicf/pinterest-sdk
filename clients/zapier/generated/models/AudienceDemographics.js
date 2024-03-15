const utils = require('../utils/utils');
const AudienceDemographicValue = require('../models/AudienceDemographicValue');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ages`,
                label: `[${labelPrefix}ages]`,
                children: AudienceDemographicValue.fields(`${keyPrefix}ages${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}genders`,
                label: `[${labelPrefix}genders]`,
                children: AudienceDemographicValue.fields(`${keyPrefix}genders${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}devices`,
                label: `[${labelPrefix}devices]`,
                children: AudienceDemographicValue.fields(`${keyPrefix}devices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}metros`,
                label: `[${labelPrefix}metros]`,
                children: AudienceDemographicValue.fields(`${keyPrefix}metros${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}countries`,
                label: `[${labelPrefix}countries]`,
                children: AudienceDemographicValue.fields(`${keyPrefix}countries${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ages': utils.childMapping(bundle.inputData?.[`${keyPrefix}ages`], `${keyPrefix}ages`, AudienceDemographicValue),
            'genders': utils.childMapping(bundle.inputData?.[`${keyPrefix}genders`], `${keyPrefix}genders`, AudienceDemographicValue),
            'devices': utils.childMapping(bundle.inputData?.[`${keyPrefix}devices`], `${keyPrefix}devices`, AudienceDemographicValue),
            'metros': utils.childMapping(bundle.inputData?.[`${keyPrefix}metros`], `${keyPrefix}metros`, AudienceDemographicValue),
            'countries': utils.childMapping(bundle.inputData?.[`${keyPrefix}countries`], `${keyPrefix}countries`, AudienceDemographicValue),
        }
    },
}
