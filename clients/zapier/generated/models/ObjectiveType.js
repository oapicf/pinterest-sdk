const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AWARENESS',
                    'CONSIDERATION',
                    'WEB_CONVERSION',
                    'CATALOG_SALES',
                    'VIDEO_COMPLETION',
                    'SALES',
                    'APP_INSTALL',
                    'CTV_CONSIDERATION',
                ],
            }
        )
    }
