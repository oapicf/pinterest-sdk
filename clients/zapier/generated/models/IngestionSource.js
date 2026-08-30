const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'TAG',
                    'MMP',
                    'FILE_UPLOAD',
                    'CONVERSIONS_API',
                    'NATIVE',
                ],
            }
        )
    }
