const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'MEMBER_INVITE',
                    'PARTNER_INVITE',
                    'PARTNER_REQUEST',
                ],
            }
        )
    }
