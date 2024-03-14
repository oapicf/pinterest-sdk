const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Summary status for product group - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'RUNNING',
                    'PAUSED',
                    'EXCLUDED',
                    'ARCHIVED',
                ],
            }
        )
    }
