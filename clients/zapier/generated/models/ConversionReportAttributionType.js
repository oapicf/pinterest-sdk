const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Attribution type. Refers to the Pinterest Tag endpoints - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'INDIVIDUAL',
                    'HOUSEHOLD',
                ],
            }
        )
    }
