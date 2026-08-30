import { EntityLabelError } from './entity-label-error';
import { EntityLabel } from './entity-label';


export interface LabeledEntities { 
  readonly entities_labels?: Array<EntityLabel>;
  /**
   * Labels that were not successfully applied.
   */
  readonly errors?: Array<EntityLabelError>;
}

