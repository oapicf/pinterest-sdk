const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Summary status for ad group - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'RUNNING',
                    'PAUSED',
                    'NOT_STARTED',
                    'COMPLETED',
                    'ADVERTISER_DISABLED',
                    'ARCHIVED',
                ],
            }
        )
    }
