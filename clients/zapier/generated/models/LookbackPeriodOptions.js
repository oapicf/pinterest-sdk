const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Days in lookback window in the GET Conversion EQS response. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    '1d',
                    '14d',
                ],
            }
        )
    }
