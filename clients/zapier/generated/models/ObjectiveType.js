const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Campaign objective type. [\"WEB_SESSIONS\"] in BETA. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AWARENESS',
                    'CONSIDERATION',
                    'VIDEO_VIEW',
                    'WEB_CONVERSION',
                    'CATALOG_SALES',
                    'WEB_SESSIONS',
                ],
            }
        )
    }
