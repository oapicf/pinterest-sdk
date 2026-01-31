const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `List of verticals for product categories. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FASHION',
                    'HOME_DECOR',
                    'BEAUTY',
                ],
            }
        )
    }
