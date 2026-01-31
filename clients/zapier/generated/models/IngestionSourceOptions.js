const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `List of ingestion sources for a conversion event. - [${key.replaceAll('__', '.')}]`,
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
