import { CatalogsProductGroupMultipleGenderCriteria } from './catalogs-product-group-multiple-gender-criteria';
import { CatalogsProductGroupMultipleStringListCriteria } from './catalogs-product-group-multiple-string-list-criteria';
import { CatalogsProductGroupPricingCriteria } from './catalogs-product-group-pricing-criteria';
import { CatalogsProductGroupMultiplePinterestProductCategoryCriteria } from './catalogs-product-group-multiple-pinterest-product-category-criteria';
import { CatalogsBaseFilterKeys } from './catalogs-base-filter-keys';
import { CatalogsProductGroupUint32Criteria } from './catalogs-product-group-uint32-criteria';
import { CatalogsProductGroupMultipleStringCriteria } from './catalogs-product-group-multiple-string-criteria';
import { ProductGroupReferenceFilter } from './product-group-reference-filter';
import { CatalogsProductGroupCurrencyCriteria } from './catalogs-product-group-currency-criteria';
import { CatalogsProductGroupMultipleMediaTypesCriteria } from './catalogs-product-group-multiple-media-types-criteria';
import { CatalogsProductGroupFilterOperatorTypeCriteria } from './catalogs-product-group-filter-operator-type-criteria';


export interface CatalogsProductGroupFilterKeys { 
  MIN_PRICE: CatalogsProductGroupPricingCriteria;
  MAX_PRICE: CatalogsProductGroupPricingCriteria;
  CURRENCY: CatalogsProductGroupCurrencyCriteria;
  ITEM_ID: CatalogsProductGroupMultipleStringCriteria;
  AVAILABILITY: CatalogsProductGroupMultipleStringCriteria;
  BRAND: CatalogsProductGroupMultipleStringCriteria;
  CONDITION: CatalogsProductGroupMultipleStringCriteria;
  CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria;
  CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria;
  CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria;
  CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria;
  CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria;
  ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria;
  GENDER: CatalogsProductGroupMultipleGenderCriteria;
  MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria;
  PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria;
  PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria;
  PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria;
  PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria;
  PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria;
  GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria;
  GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria;
  GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria;
  GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria;
  GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria;
  GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria;
  GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria;
  CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria;
  CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria;
  CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria;
  CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria;
  CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria;
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria;
  PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
  PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria;
}

