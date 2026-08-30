const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'ENGAGEMENT',
                    'ENGAGEMENT_RATE',
                    'IMPRESSION',
                    'OUTBOUND_CLICK',
                    'OUTBOUND_CLICK_RATE',
                    'PIN_CLICK',
                    'PIN_CLICK_RATE',
                    'SAVE',
                    'SAVE_RATE',
                ],
            }
        )
    }
