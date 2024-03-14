const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ph`,
                label: `Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. - [${labelPrefix}ph]`,
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
                label: `Sha256 hashes of user's last name, in lowercase. - [${labelPrefix}ln]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}fn`,
                label: `Sha256 hashes of user's first name, in lowercase. - [${labelPrefix}fn]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ct`,
                label: `Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. - [${labelPrefix}ct]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}st`,
                label: `Sha256 hashes of user's state, given as a two-letter code in lowercase. - [${labelPrefix}st]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}zp`,
                label: `Sha256 hashes of user's zipcode, only digits. - [${labelPrefix}zp]`,
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
                label: `Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. - [${labelPrefix}external_id]`,
                list: true,
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
        }
    },
}
