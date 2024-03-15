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
                    'AGE',
                    'GENDER',
                    'CITY',
                    'COUNTRY',
                    'PREFERRED_CONTACT_METHOD',
                    'STATE_PROVINCE',
                    'ADDRESS',
                    'DATE_OF_BIRTH',
                ],
            }
        )
    }
