const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Lead form question type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CUSTOM',
                    'FULL_NAME',
                    'FIRST_NAME',
                    'LAST_NAME',
                    'EMAIL',
                    'PHONE_NUMBER',
                    'ZIP_CODE',
                    'GENDER',
                    'CITY',
                    'COUNTRY',
                    'STATE_PROVINCE',
                    'ADDRESS',
                    'DATE_OF_BIRTH',
                    'AGE',
                ],
            }
        )
    }
