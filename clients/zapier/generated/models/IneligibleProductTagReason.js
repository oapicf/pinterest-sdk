const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Reason why a product pin is ineligible for tagging. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PIN_MISSING',
                    'PIN_IS_PRIVATE',
                    'PRODUCT_METADATA_MISSING',
                    'PIN_NOT_FROM_VERIFIED_DOMAIN',
                    'PIN_NOT_FROM_SAME_USER_AS_HERO_PIN',
                ],
            }
        )
    }
