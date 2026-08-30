const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The status of the batch operation - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PROCESSING',
                    'COMPLETED',
                    'FAILED',
                ],
            }
        )
    }
