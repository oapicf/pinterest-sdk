const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The name of field that businesses are sorted by - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FULL_NAME',
                    'BUSINESS_ROLES',
                    'CREATED_TIME',
                ],
            }
        )
    }
