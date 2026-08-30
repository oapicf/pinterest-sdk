const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'SHOPPING',
                    'COLLECTION',
                    'CAROUSEL',
                    'MAX_WIDTH_COLLECTION',
                ],
            }
        )
    }
