const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Level of the reporting request - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ADVERTISER',
                    'ADVERTISER_TARGETING',
                    'CAMPAIGN',
                    'CAMPAIGN_TARGETING',
                    'AD_GROUP',
                    'AD_GROUP_TARGETING',
                    'PIN_PROMOTION',
                    'PIN_PROMOTION_TARGETING',
                    'KEYWORD',
                    'PRODUCT_GROUP',
                    'PRODUCT_GROUP_TARGETING',
                    'PRODUCT_ITEM',
                    'PRODUCT_ITEM_TARGETING',
                ],
            }
        )
    }
