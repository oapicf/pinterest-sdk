const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Order Line Paid Type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PAID',
                    'BONUS',
                    'MAKE_GOOD',
                    'TEST',
                    '',
                ],
            }
        )
    }
