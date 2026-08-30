const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Workload processing state - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NOT_STARTED',
                    'RUNNING',
                    'PAUSED',
                    'SUCCEEDED',
                    'FAILED',
                ],
            }
        )
    }
