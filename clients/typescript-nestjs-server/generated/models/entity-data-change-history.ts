import { ChangeHistoryDataType } from './change-history-data-type';


export interface EntityDataChangeHistory { 
  /**
   * A string identifier representing the changed field on the entity
   */
  changed_field_id?: string;
  /**
   * The human readable name of the changed field on the entity
   */
  changed_field_name?: string;
  /**
   * Specifies the type of the field\'s data values
   */
  data_type?: ChangeHistoryDataType;
  /**
   * A string representation of the value of the changed field, after the change
   */
  new_data_value?: string;
  /**
   * A string representation of the value of the changed field, before the change
   */
  old_data_value?: string;
}
export namespace EntityDataChangeHistory {
}


