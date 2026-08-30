const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Sort metric for top video pins analytics. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SAVE',
                    'IMPRESSION',
                    'OUTBOUND_CLICK',
                    'VIDEO_MRC_VIEW',
                    'VIDEO_AVG_WATCH_TIME',
                    'VIDEO_V50_WATCH_TIME',
                    'QUARTILE_95_PERCENT_VIEW',
                    'VIDEO_10S_VIEW',
                    'VIDEO_START',
                ],
            }
        )
    }
