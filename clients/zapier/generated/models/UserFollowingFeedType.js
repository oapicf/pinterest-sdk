const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Specifies the type of followees to be kept when filtering them. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ALL',
                    'RANKED',
                    'CREATOR_ONLY',
                    'RANKED_CREATOR_ONLY',
                ],
            }
        )
    }
