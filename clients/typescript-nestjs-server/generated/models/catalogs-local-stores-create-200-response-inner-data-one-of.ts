import { PinterestLibError } from './pinterest-lib-error';


export interface CatalogsLocalStoresCreate200ResponseInnerDataOneOf { 
  /**
   * The ID of the local store.
   */
  id: string;
  exceptions: PinterestLibError;
}

