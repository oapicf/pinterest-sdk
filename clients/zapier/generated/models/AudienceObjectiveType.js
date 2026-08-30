const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS). - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AWARENESS',
                    'CONSIDERATION',
                    'WEB_CONVERSION',
                    'CATALOG_SALES',
                    'VIDEO_COMPLETION',
                    'SALES',
                ],
            }
        )
    }
