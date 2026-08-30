const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Video Pin metric types - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'IMPRESSION',
                    'OUTBOUND_CLICK',
                    'PIN_CLICK',
                    'SAVE',
                    'SAVE_RATE',
                    'VIDEO_MRC_VIEW',
                    'VIDEO_10S_VIEW',
                    'QUARTILE_95_PERCENT_VIEW',
                    'VIDEO_V50_WATCH_TIME',
                    'VIDEO_START',
                    'VIDEO_AVG_WATCH_TIME',
                    'TOTAL_COMMENTS',
                    'TOTAL_REACTIONS',
                ],
            }
        )
    }
