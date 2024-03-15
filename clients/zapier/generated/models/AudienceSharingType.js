const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"] - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CUSTOM',
                    'SYNDICATED',
                ],
            }
        )
    }
