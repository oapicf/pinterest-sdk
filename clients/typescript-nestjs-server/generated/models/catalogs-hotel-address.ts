

export interface CatalogsHotelAddress { 
  /**
   * Primary street address of hotel.
   */
  addr1?: string;
  /**
   * City where the hotel is located.
   */
  city?: string;
  /**
   * Country where the hotel is located.
   */
  country?: string;
  /**
   * Required for countries with a postal code system. Postal or zip code of the hotel.
   */
  postal_code?: string;
  /**
   * State, county, province, where the hotel is located.
   */
  region?: string;
}

