const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Audience type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CUSTOMER_LIST',
                    'VISITOR',
                    'ENGAGEMENT',
                    'ACTALIKE',
                    'PERSONA',
                ],
            }
        )
    }
