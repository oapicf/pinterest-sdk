const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Discount status based on the current time and start and end time of discount - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OTHER',
                    'ACTIVE',
                    'PAUSED',
                    'SCHEDULED',
                    'EXPIRED',
                ],
            }
        )
    }
