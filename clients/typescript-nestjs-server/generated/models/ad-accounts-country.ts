import { Country } from './country';


export interface AdAccountsCountry { 
  code: Country;
  /**
   * Country currency.
   */
  currency: string;
  /**
   * Country index
   */
  index: number;
  /**
   * Country name
   */
  name: string;
}
export namespace AdAccountsCountry {
}


