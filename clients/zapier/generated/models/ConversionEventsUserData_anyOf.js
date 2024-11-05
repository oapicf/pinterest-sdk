const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}em`,
                label: `Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. - [${labelPrefix}em]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}hashed_maids`,
                label: `Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. - [${labelPrefix}hashed_maids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}client_ip_address`,
                label: `The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}client_ip_address]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}client_user_agent`,
                label: `The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}client_user_agent]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'em': bundle.inputData?.[`${keyPrefix}em`],
            'hashed_maids': bundle.inputData?.[`${keyPrefix}hashed_maids`],
            'client_ip_address': bundle.inputData?.[`${keyPrefix}client_ip_address`],
            'client_user_agent': bundle.inputData?.[`${keyPrefix}client_user_agent`],
        }
    },
}
