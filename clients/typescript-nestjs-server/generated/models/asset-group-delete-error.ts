

export interface AssetGroupDeleteError { 
  /**
   * Asset group id of the exception.
   */
  asset_group_id?: string;
  /**
   * Error code associated with the error deleting asset group.
   */
  code?: number;
  /**
   * Error message associated with the error deleting asset group.
   */
  message?: string;
}

