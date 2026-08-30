const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Schedule status - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DRAFT',
                    'CREATED',
                    'SCHEDULED',
                    'ACTIVE',
                    'COMPLETED',
                    'FAILED',
                    'CANCELED',
                ],
            }
        )
    }
