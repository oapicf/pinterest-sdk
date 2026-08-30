const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Bulk request status - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'RUNNING',
                    'SUCCEEDED',
                    'FAILED',
                ],
            }
        )
    }
