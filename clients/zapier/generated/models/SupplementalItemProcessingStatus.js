const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The status of the item processing record - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SUCCESS',
                    'FAILURE',
                    'PROCESSING',
                ],
            }
        )
    }
