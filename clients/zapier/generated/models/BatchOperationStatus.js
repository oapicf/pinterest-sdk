const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The status of the operation performed by the batch - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PROCESSING',
                    'COMPLETED',
                    'FAILED',
                ],
            }
        )
    }
