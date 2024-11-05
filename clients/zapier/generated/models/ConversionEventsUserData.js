const utils = require('../utils/utils');
const ConversionEventsUserData_anyOf = require('../models/ConversionEventsUserData_anyOf');
const ConversionEventsUserData_anyOf_1 = require('../models/ConversionEventsUserData_anyOf_1');
const ConversionEventsUserData_anyOf_2 = require('../models/ConversionEventsUserData_anyOf_2');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ph`,
                label: `Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. - [${labelPrefix}ph]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ge`,
                label: `Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format. - [${labelPrefix}ge]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}db`,
                label: `Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format. - [${labelPrefix}db]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ln`,
                label: `Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. - [${labelPrefix}ln]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}fn`,
                label: `Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. - [${labelPrefix}fn]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ct`,
                label: `Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. - [${labelPrefix}ct]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}st`,
                label: `Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. - [${labelPrefix}st]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}zp`,
                label: `Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. - [${labelPrefix}zp]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}country`,
                label: `Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format. - [${labelPrefix}country]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}external_id`,
                label: `Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. - [${labelPrefix}external_id]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}click_id`,
                label: `The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}click_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_id`,
                label: `A unique identifier of visitors' information defined by third party partners. e.g RampID - [${labelPrefix}partner_id]`,
                type: 'string',
            },
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
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}client_ip_address`,
                label: `The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}client_ip_address]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}client_user_agent`,
                label: `The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}client_user_agent]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ph': bundle.inputData?.[`${keyPrefix}ph`],
            'ge': bundle.inputData?.[`${keyPrefix}ge`],
            'db': bundle.inputData?.[`${keyPrefix}db`],
            'ln': bundle.inputData?.[`${keyPrefix}ln`],
            'fn': bundle.inputData?.[`${keyPrefix}fn`],
            'ct': bundle.inputData?.[`${keyPrefix}ct`],
            'st': bundle.inputData?.[`${keyPrefix}st`],
            'zp': bundle.inputData?.[`${keyPrefix}zp`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'external_id': bundle.inputData?.[`${keyPrefix}external_id`],
            'click_id': bundle.inputData?.[`${keyPrefix}click_id`],
            'partner_id': bundle.inputData?.[`${keyPrefix}partner_id`],
            'em': bundle.inputData?.[`${keyPrefix}em`],
            'hashed_maids': bundle.inputData?.[`${keyPrefix}hashed_maids`],
            'client_ip_address': bundle.inputData?.[`${keyPrefix}client_ip_address`],
            'client_user_agent': bundle.inputData?.[`${keyPrefix}client_user_agent`],
        }
    },
}
