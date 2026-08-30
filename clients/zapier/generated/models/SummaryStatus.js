const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Summary status for campaign - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'RUNNING',
                    'PAUSED',
                    'NOT_STARTED',
                    'COMPLETED',
                    'ADVERTISER_DISABLED',
                    'ARCHIVED',
                    'DRAFT',
                    'DELETED_DRAFT',
                ],
            }
        )
    }
