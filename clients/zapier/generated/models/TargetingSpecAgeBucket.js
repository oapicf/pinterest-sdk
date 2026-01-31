const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    '18-24',
                    '19+',
                    '20+',
                    '21+',
                    '25-34',
                    '35-44',
                    '45-49',
                    '50-54',
                    '55-64',
                    '65+',
                ],
            }
        )
    }
