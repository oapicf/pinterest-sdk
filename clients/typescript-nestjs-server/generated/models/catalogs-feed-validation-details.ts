import { CatalogsFeedValidationErrors } from './catalogs-feed-validation-errors';
import { CatalogsFeedValidationWarnings } from './catalogs-feed-validation-warnings';


export interface CatalogsFeedValidationDetails { 
  errors: CatalogsFeedValidationErrors;
  warnings: CatalogsFeedValidationWarnings;
}

