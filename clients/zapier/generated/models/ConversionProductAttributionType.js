const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Conversion product attribution level - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DEFAULT',
                    'BRAND_ATTRIBUTION',
                ],
            }
        )
    }
