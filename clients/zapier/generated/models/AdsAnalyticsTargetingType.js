const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Reporting targeting type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'KEYWORD',
                    'APPTYPE',
                    'GENDER',
                    'LOCATION',
                    'PLACEMENT',
                    'COUNTRY',
                    'TARGETED_INTEREST',
                    'PINNER_INTEREST',
                    'AUDIENCE_INCLUDE',
                    'GEO',
                    'AGE_BUCKET',
                    'REGION',
                ],
            }
        )
    }
