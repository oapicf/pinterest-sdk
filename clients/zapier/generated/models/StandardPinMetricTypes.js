const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Standard Pin metric types - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'IMPRESSION',
                    'OUTBOUND_CLICK',
                    'PIN_CLICK',
                    'SAVE',
                    'SAVE_RATE',
                    'TOTAL_COMMENTS',
                    'TOTAL_REACTIONS',
                    'USER_FOLLOW',
                    'PROFILE_VISIT',
                ],
            }
        )
    }
