

export const TargetingSpecTargetingStrategyItems = {
    ChooseYourOwn: 'CHOOSE_YOUR_OWN',
    FindNewCustomers: 'FIND_NEW_CUSTOMERS',
    ReconnectWithUsers: 'RECONNECT_WITH_USERS'
} as const;
export type TargetingSpecTargetingStrategyItems = typeof TargetingSpecTargetingStrategyItems[keyof typeof TargetingSpecTargetingStrategyItems];

