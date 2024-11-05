const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Reporting targeting type for campaigns - [${key.replaceAll('__', '.')}]`,
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
                    'CREATIVE_TYPE',
                    'AGE_BUCKET_AND_GENDER',
                ],
            }
        )
    }
