const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The file format of a feed. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'TSV',
                    'CSV',
                    'XML',
                ],
            }
        )
    }
