const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'ALL',
                    'ANIMALS',
                    'ARCHITECTURE',
                    'ART',
                    'BEAUTY',
                    'DIY_AND_CRAFTS',
                    'EDUCATION',
                    'EVENT_PLANNING',
                    'FASHION',
                    'FOOD_AND_DRINKS',
                    'GARDENING',
                    'HEALTH',
                    'HOME_DECOR',
                    'PARENTING',
                    'TRAVEL',
                    'WEDDING',
                ],
            }
        )
    }
