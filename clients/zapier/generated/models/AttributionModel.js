const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Attribution model used to attribute the conversion event. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'first_touch',
                    'last_touch',
                    'multi_touch',
                    'mmm',
                ],
            }
        )
    }
