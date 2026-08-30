

export const TargetingStrategy = {
    ChooseYourOwn: 'CHOOSE_YOUR_OWN',
    FindNewCustomers: 'FIND_NEW_CUSTOMERS',
    ReconnectWithUsers: 'RECONNECT_WITH_USERS'
} as const;
export type TargetingStrategy = typeof TargetingStrategy[keyof typeof TargetingStrategy];

