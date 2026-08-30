const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Error code returned for a campaign planning estimate failure. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SERVER_ERROR',
                    'AUDIENCE_LIST_MISSING',
                    'INVALID_REQUEST',
                    'PRODUCT_GROUP_MISSING',
                ],
            }
        )
    }
