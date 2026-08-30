const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'MERCHANT_CREATED',
                    'ALL_PRODUCTS',
                    'BEST_DEALS',
                    'PINNER_FAVORITES',
                    'TOP_SELLERS',
                    'BACK_IN_STOCK',
                    'NEW_ARRIVALS',
                    'SHOPIFY_COLLECTIONS',
                    'I2PC',
                    'CATALOG_EXPANSION',
                ],
            }
        )
    }
