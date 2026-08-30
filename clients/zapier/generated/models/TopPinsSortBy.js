const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Sort metric for top pins analytics. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ENGAGEMENT',
                    'SAVE',
                    'IMPRESSION',
                    'OUTBOUND_CLICK',
                    'PIN_CLICK',
                ],
            }
        )
    }
