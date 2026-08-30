import { NullableCatalogsItemFieldType } from './nullable-catalogs-item-field-type';


export interface CatalogsItemValidationDetails { 
  /**
   * Attribute that has a validation issue.
   */
  attribute_name: NullableCatalogsItemFieldType | null;
  /**
   * Provided value that caused the validation issue.
   */
  provided_value: string | null;
}
export namespace CatalogsItemValidationDetails {
}


