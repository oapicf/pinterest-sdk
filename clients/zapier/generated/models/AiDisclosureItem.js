const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `AI disclosure declaration the creator has made about the Pin. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AI_MODIFIED',
                    'SYNTHETIC_PERFORMER',
                ],
            }
        )
    }
