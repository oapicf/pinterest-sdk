import { CatalogsItemValidationIssues } from './catalogs-item-validation-issues';


export interface ItemsIssuesList200Response { 
  bookmark?: string | null;
  items: Array<CatalogsItemValidationIssues>;
}

