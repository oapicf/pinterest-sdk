import { CatalogsItemValidationWarnings } from './catalogs-item-validation-warnings';
import { CatalogsItemValidationErrors } from './catalogs-item-validation-errors';


export interface CatalogsItemValidationIssues { 
  errors: CatalogsItemValidationErrors;
  /**
   * The merchant-created unique ID that represents the product.
   */
  item_id: string | null;
  /**
   * Item number based on order of appearance in the Catalogs Feed. For example, \'0\' refers to first item found in a feed that was downloaded from a \'location\' specified during feed creation.
   */
  item_number: number;
  warnings: CatalogsItemValidationWarnings;
}

