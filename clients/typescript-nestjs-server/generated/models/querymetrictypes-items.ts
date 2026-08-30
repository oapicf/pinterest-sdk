

export const QuerymetrictypesItems = {
    Engagement: 'ENGAGEMENT',
    EngagementRate: 'ENGAGEMENT_RATE',
    Impression: 'IMPRESSION',
    OutboundClick: 'OUTBOUND_CLICK',
    OutboundClickRate: 'OUTBOUND_CLICK_RATE',
    PinClick: 'PIN_CLICK',
    PinClickRate: 'PIN_CLICK_RATE',
    Save: 'SAVE',
    SaveRate: 'SAVE_RATE'
} as const;
export type QuerymetrictypesItems = typeof QuerymetrictypesItems[keyof typeof QuerymetrictypesItems];

