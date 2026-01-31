const utils = require('../utils/utils');
const SSIOAccountItem = require('../models/SSIOAccountItem');
const SSIOAccountPMPName = require('../models/SSIOAccountPMPName');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}billto_infos`,
                label: `[${labelPrefix}billto_infos]`,
                children: SSIOAccountItem.fields(`${keyPrefix}billto_infos${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}can_edit`,
                label: `Advertiser eligible to update order lines - [${labelPrefix}can_edit]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}currency`,
                label: `[${labelPrefix}currency]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}eligible`,
                label: `Advertiser eligible to create order lines - [${labelPrefix}eligible]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}error`,
                label: `Error indicator from Salesforce which could be \"No Error\" - [${labelPrefix}error]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pmp_names`,
                label: `[${labelPrefix}pmp_names]`,
                children: SSIOAccountPMPName.fields(`${keyPrefix}pmp_names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'billto_infos': utils.childMapping(bundle.inputData?.[`${keyPrefix}billto_infos`], `${keyPrefix}billto_infos`, SSIOAccountItem),
            'can_edit': bundle.inputData?.[`${keyPrefix}can_edit`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'eligible': bundle.inputData?.[`${keyPrefix}eligible`],
            'error': bundle.inputData?.[`${keyPrefix}error`],
            'pmp_names': utils.childMapping(bundle.inputData?.[`${keyPrefix}pmp_names`], `${keyPrefix}pmp_names`, SSIOAccountPMPName),
        }
    },
}
