const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Operating system family. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ios',
                    'android',
                    'macos',
                    'windows',
                    'linux',
                    'bsd',
                    'other',
                ],
            }
        )
    }
