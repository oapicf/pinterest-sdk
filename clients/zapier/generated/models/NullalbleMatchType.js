const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Keyword match type allowing null - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BROAD',
                    'PHRASE',
                    'EXACT',
                    'EXACT_NEGATIVE',
                    'PHRASE_NEGATIVE',
                    '',
                ],
            }
        )
    }
