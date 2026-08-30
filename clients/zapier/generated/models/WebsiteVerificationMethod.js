const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Method used to verify website ownership. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FILENAME',
                    'METATAG',
                    'DNSTXT',
                ],
            }
        )
    }
