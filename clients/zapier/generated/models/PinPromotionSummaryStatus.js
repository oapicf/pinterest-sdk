const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Summary status for pin promotions - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'APPROVED',
                    'PAUSED',
                    'PENDING',
                    'REJECTED',
                    'ADVERTISER_DISABLED',
                    'ARCHIVED',
                    'DRAFT',
                    'DELETED_DRAFT',
                ],
            }
        )
    }
