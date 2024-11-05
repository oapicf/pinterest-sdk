const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. <br> - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'EMPLOYEE',
                    'BIZ_ADMIN',
                ],
            }
        )
    }
