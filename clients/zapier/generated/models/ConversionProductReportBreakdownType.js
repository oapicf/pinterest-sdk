const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'PRODUCT_BRAND',
                    'PRODUCT_CATEGORY',
                    'PRODUCT_BRAND_AND_CATEGORY',
                    'PRODUCT_SKU',
                    'PRODUCT_SKU_GROUP',
                ],
            }
        )
    }
