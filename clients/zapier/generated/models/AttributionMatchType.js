const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'P',
                    'D',
                    'NA',
                ],
            }
        )
    }
