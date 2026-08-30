import { Country } from './country';


/**
 * Resource create operation model.
 */
export interface LocalStoreCreate { 
  /**
   * Primary address line of the store.
   */
  address_primary?: string;
  /**
   * Secondary address line of the store.
   */
  address_secondary?: string;
  /**
   * City where the store is located.
   */
  city?: string;
  /**
   * Country code where the store is located.
   */
  country: Country;
  /**
   * Geographic latitude coordinate of the store.
   */
  latitude?: number;
  /**
   * Geographic longitude coordinate of the store.
   */
  longitude?: number;
  /**
   * The name of the local store.
   */
  name: string;
  /**
   * Postal or ZIP code of the store.
   */
  postal_code?: string;
  /**
   * State or region code where the store is located.
   */
  region?: string;
  /**
   * Merchant provided code for the local store. Unique within the merchant\'s catalog.
   */
  store_code: string;
}
export namespace LocalStoreCreate {
}


