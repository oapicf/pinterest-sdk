const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ph`,
                label: `Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}ph]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ge`,
                label: `Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. - [${labelPrefix}ge]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}db`,
                label: `Sha256 hashes of user's date of birthday, given as year, month, and day. - [${labelPrefix}db]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ln`,
                label: `Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}ln]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}fn`,
                label: `Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}fn]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ct`,
                label: `Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). - [${labelPrefix}ct]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}st`,
                label: `Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). - [${labelPrefix}st]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}zp`,
                label: `Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). - [${labelPrefix}zp]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}country`,
                label: `Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. - [${labelPrefix}country]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}external_id`,
                label: `Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. - [${labelPrefix}external_id]`,
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
        }
    },
}
