const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Label parent entity type. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CAMPAIGN',
                ],
            }
        )
    }
