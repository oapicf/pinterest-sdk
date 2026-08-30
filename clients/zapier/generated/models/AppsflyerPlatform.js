const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Platform options for AppsFlyer audience - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'android',
                    'ios',
                ],
            }
        )
    }
