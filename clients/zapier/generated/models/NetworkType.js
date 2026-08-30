const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Type of network connection. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'wifi',
                    'cellular_2g',
                    'cellular_3g',
                    'cellular_4g',
                    'cellular_5g',
                    'cellular_6g',
                    'ethernet',
                    'unknown',
                ],
            }
        )
    }
