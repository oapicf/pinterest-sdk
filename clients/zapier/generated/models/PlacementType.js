const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Placement type for bid multiplier targeting. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SEARCH',
                    'BROWSE',
                    'RELATED_PINS',
                ],
            }
        )
    }
