const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `List of source platforms for a conversion event. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'WEB',
                    'MOBILE',
                    'MOBILE_ANDROID',
                    'MOBILE_IOS',
                    'OFFLINE',
                    'PINTEREST_WEB',
                    'PINTEREST_ANDROID',
                    'PINTEREST_IOS',
                    'POINT_OF_SALE',
                ],
            }
        )
    }
