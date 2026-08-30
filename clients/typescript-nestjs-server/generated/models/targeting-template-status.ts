

/**
 * Indicate targeting template is active or Deleted
 */
export const TargetingTemplateStatus = {
    Active: 'ACTIVE',
    Deleted: 'DELETED'
} as const;
export type TargetingTemplateStatus = typeof TargetingTemplateStatus[keyof typeof TargetingTemplateStatus];

