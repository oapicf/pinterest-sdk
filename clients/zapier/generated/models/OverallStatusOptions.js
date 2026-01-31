const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Overall status of event quality score. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NEEDS_IMPROVEMENT',
                    'FAIR',
                    'GOOD',
                ],
            }
        )
    }
