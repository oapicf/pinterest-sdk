const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'IOS',
                    'ANDROID',
                ],
            }
        )
    }
