const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AWARENESS',
                    'CONSIDERATION',
                    'WEB_CONVERSION',
                    'CATALOG_SALES',
                    'VIDEO_COMPLETION',
                    'APP_INSTALL',
                    'SALES',
                    'LEADS',
                    'CTV_CONSIDERATION',
                ],
            }
        )
    }
