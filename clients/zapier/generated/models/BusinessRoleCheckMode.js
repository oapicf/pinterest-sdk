const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Specifies if the partner is internal or external. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'INTERNAL',
                    'EXTERNAL',
                ],
            }
        )
    }
