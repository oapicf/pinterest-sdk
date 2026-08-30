const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'CHOOSE_YOUR_OWN',
                    'FIND_NEW_CUSTOMERS',
                    'RECONNECT_WITH_USERS',
                ],
            }
        )
    }
