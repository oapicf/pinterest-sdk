const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `L1 interest categories for filtering trends. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'animals',
                    'architecture',
                    'art',
                    'beauty',
                    'childrens_fashion',
                    'design',
                    'diy_and_crafts',
                    'education',
                    'electronics',
                    'entertainment',
                    'event_planning',
                    'finance',
                    'food_and_drinks',
                    'gardening',
                    'health',
                    'home_decor',
                    'mens_fashion',
                    'parenting',
                    'quotes',
                    'sport',
                    'travel',
                    'vehicles',
                    'wedding',
                    'womens_fashion',
                ],
            }
        )
    }
