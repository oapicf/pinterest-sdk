const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'IMPRESSION',
                    'SAVE',
                    'VIDEO_MRC_VIEW',
                    'VIDEO_AVG_WATCH_TIME',
                    'VIDEO_V50_WATCH_TIME',
                    'QUARTILE_95_PERCENT_VIEW',
                    'VIDEO_10S_VIEW',
                    'VIDEO_START',
                    'OUTBOUND_CLICK',
                ],
            }
        )
    }
