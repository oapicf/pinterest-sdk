import { NumericFilterOperatorType } from './numeric-filter-operator-type';
import { NonNullableCatalogsCurrency } from './non-nullable-catalogs-currency';


export interface PriceFilterPrice { 
  currency: NonNullableCatalogsCurrency;
  negated?: boolean;
  operator: NumericFilterOperatorType;
  value: number;
}
export namespace PriceFilterPrice {
}


