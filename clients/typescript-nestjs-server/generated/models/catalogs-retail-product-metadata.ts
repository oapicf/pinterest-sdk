import { ProductAvailability } from './product-availability';
import { NonNullableCatalogsCurrency } from './non-nullable-catalogs-currency';


/**
 * Retail product metadata entity
 */
export interface CatalogsRetailProductMetadata { 
  availability: ProductAvailability;
  currency: NonNullableCatalogsCurrency;
  /**
   * The parent ID of the product.
   */
  item_group_id: string | null;
  /**
   * The user-created unique ID that represents the product.
   */
  item_id: string;
  /**
   * The price of the product.
   */
  price: number;
  /**
   * The discounted price of the product.
   */
  sale_price: number | null;
}
export namespace CatalogsRetailProductMetadata {
}


