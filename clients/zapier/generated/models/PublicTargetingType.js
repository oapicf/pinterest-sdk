const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Public ad targeting type with external names - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'APPTYPE',
                    'GENDER',
                    'LOCALE',
                    'AGE_BUCKET',
                    'LOCATION',
                    'GEO',
                    'INTEREST',
                    'KEYWORD',
                    'AUDIENCE_INCLUDE',
                    'AUDIENCE_EXCLUDE',
                ],
            }
        )
    }
