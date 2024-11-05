const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Type of the catalog entity. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'RETAIL',
                    'HOTEL',
                    'CREATIVE_ASSETS',
                ],
            }
        )
    }
