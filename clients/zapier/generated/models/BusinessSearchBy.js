const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The names of fields that business accounts are searched by - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FULL_NAME',
                    'USERNAME',
                    'BUSINESS_ID',
                    'EMAIL',
                ],
            }
        )
    }
