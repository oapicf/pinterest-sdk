const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'EMPLOYEE',
                    'BIZ_ADMIN',
                ],
            }
        )
    }
