const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'STRING',
                    'NUMERIC',
                    'MICROCURRENCY',
                    'DATE',
                    'BOOL',
                    'GENDER_LIST',
                    'AGE_BUCKET_LIST',
                    'APPTYPE_LIST',
                    'COUNTRY_LIST',
                    'LOCALE_LIST',
                ],
            }
        )
    }
