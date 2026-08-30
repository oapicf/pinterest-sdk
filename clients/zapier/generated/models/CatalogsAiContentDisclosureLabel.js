const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Disclosure label for AI-generated or AI-modified content in a catalog item asset. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ai_modified',
                    'synthetic_performer',
                ],
            }
        )
    }
