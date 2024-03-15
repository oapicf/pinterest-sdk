const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad targeting types for MMM report - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'APPTYPE',
                    'COUNTRY',
                    'CREATIVE_TYPE',
                    'GENDER',
                    'LOCATION',
                ],
            }
        )
    }
