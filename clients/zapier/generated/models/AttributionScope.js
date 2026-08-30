const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad event type used for attribution. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'view',
                    'engagement',
                    'click',
                ],
            }
        )
    }
