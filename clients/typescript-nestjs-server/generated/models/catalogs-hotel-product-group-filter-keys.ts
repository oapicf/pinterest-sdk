import { CountryFilter } from './country-filter';
import { CustomLabel4Filter } from './custom-label4-filter';
import { PriceFilterPrice } from './price-filter-price';
import { BrandFilter } from './brand-filter';
import { HotelIdFilter } from './hotel-id-filter';
import { CustomLabel3Filter } from './custom-label3-filter';
import { CustomLabel1Filter } from './custom-label1-filter';
import { CustomLabel0Filter } from './custom-label0-filter';
import { PriceFilter } from './price-filter';
import { CatalogsProductGroupMultipleStringCriteria } from './catalogs-product-group-multiple-string-criteria';
import { CatalogsProductGroupMultipleCountriesCriteria } from './catalogs-product-group-multiple-countries-criteria';
import { CustomLabel2Filter } from './custom-label2-filter';
import { TitleKeywordsFilter } from './title-keywords-filter';
import { CatalogsProductGroupFilterOperatorTypeCriteria } from './catalogs-product-group-filter-operator-type-criteria';


export interface CatalogsHotelProductGroupFilterKeys { 
  PRICE: PriceFilterPrice;
  HOTEL_ID: CatalogsProductGroupMultipleStringCriteria;
  BRAND: CatalogsProductGroupMultipleStringCriteria;
  CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria;
  CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria;
  CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria;
  CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria;
  CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria;
  COUNTRY: CatalogsProductGroupMultipleCountriesCriteria;
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria;
}

