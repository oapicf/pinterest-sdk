import { CatalogsHotelAddress } from './catalogs-hotel-address';
import { CatalogsHotelGuestRatings } from './catalogs-hotel-guest-ratings';


export interface CatalogsUpdatableHotelAttributes { 
  /**
   * Hotel address
   */
  address?: CatalogsHotelAddress;
  /**
   * Base price of the hotel room per night followed by the ISO currency code
   */
  base_price?: string | null;
  /**
   * The brand to which this hotel belongs to.
   */
  brand?: string | null;
  /**
   * The type of property. The category can be any type of internal description desired.
   */
  category?: string | null;
  /**
   * Custom grouping of hotels
   */
  custom_label_0?: string | null;
  /**
   * Custom grouping of hotels
   */
  custom_label_1?: string | null;
  /**
   * Custom grouping of hotels
   */
  custom_label_2?: string | null;
  /**
   * Custom grouping of hotels
   */
  custom_label_3?: string | null;
  /**
   * Custom grouping of hotels
   */
  custom_label_4?: string | null;
  /**
   * Brief description of the hotel.
   */
  description?: string | null;
  /**
   * If specified, you must provide all properties
   */
  guest_ratings?: CatalogsHotelGuestRatings;
  /**
   * Latitude of the hotel.
   */
  latitude?: number;
  /**
   * Link to the product page
   */
  link?: string | null;
  /**
   * Longitude of the hotel.
   */
  longitude?: number | null;
  /**
   * The hotel\'s name.
   */
  name?: string | null;
  /**
   * A list of neighborhoods where the hotel is located
   */
  neighborhood?: Array<string> | null;
  /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   */
  sale_price?: string | null;
}

