const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'android_mobile',
                    'android_tablet',
                    'ipad',
                    'iphone',
                    'web',
                    'web_mobile',
                ],
            }
        )
    }
