const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Asset group type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BRAND',
                    'LOCATION_OR_LANGUAGE',
                    'PRODUCT_LINE',
                    'OTHER',
                ],
            }
        )
    }
