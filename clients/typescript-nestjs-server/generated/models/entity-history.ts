import { ChangeHistoryOperationType } from './change-history-operation-type';
import { EntityDataChangeHistory } from './entity-data-change-history';


export interface EntityHistory { 
  /**
   * A Unix timestamp representing the time of the change in seconds
   */
  change_timestamp?: number;
  /**
   * Properties associated with a particular change to an entity\'s data
   */
  data_changes?: Array<EntityDataChangeHistory>;
  /**
   * The id of the entity that was changed
   */
  entity_id?: string;
  /**
   * The name of the entity that was changed
   */
  entity_name?: string;
  /**
   * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
   */
  ldap?: string;
  /**
   * The type of operation that caused the change
   */
  operation?: ChangeHistoryOperationType;
  /**
   * The id of the user who initiated the change
   */
  user_id?: string;
}
export namespace EntityHistory {
}


