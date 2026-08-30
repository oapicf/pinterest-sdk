import { EntityLabelStatus } from './entity-label-status';
import { LabelParentType } from './label-parent-type';


export interface EntityLabel { 
  /**
   * Entity ID to apply label to.
   */
  entity_id: string;
  entity_type?: LabelParentType | null;
  /**
   * Label ID.
   */
  label_id: string;
  status?: EntityLabelStatus | null;
}
export namespace EntityLabel {
}


