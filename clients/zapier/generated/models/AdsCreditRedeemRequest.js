const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerCodeHash`,
                label: `Takes in a SHA256 hash of the offerCode. - [${labelPrefix}offerCodeHash]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}validateOnly`,
                label: `If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account - [${labelPrefix}validateOnly]`,
                required: true,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerCodeHash': bundle.inputData?.[`${keyPrefix}offerCodeHash`],
            'validateOnly': bundle.inputData?.[`${keyPrefix}validateOnly`],
        }
    },
}
