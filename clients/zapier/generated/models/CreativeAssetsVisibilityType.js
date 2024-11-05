const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Creative assets visibility. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'VISIBLE',
                    'HIDDEN',
                ],
            }
        )
    }
