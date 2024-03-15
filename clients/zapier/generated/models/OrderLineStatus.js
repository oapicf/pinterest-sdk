const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Order Line Status - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ACTIVE',
                    'PAUSED',
                    'DELETED',
                ],
            }
        )
    }
