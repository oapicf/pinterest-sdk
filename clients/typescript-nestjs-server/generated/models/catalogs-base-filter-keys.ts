import { CatalogsProductGroupPricingCriteria } from './catalogs-product-group-pricing-criteria';
import { GoogleProductCategory3Filter } from './google-product-category3-filter';
import { MaxPriceFilter } from './max-price-filter';
import { BrandFilter } from './brand-filter';
import { CatalogsProductGroupCurrencyCriteria } from './catalogs-product-group-currency-criteria';
import { ProductType3Filter } from './product-type3-filter';
import { CustomLabel3Filter } from './custom-label3-filter';
import { CustomNumber2Filter } from './custom-number2-filter';
import { MinPriceFilter } from './min-price-filter';
import { CustomLabel0Filter } from './custom-label0-filter';
import { CustomNumber1Filter } from './custom-number1-filter';
import { CustomLabel2Filter } from './custom-label2-filter';
import { CustomNumber4Filter } from './custom-number4-filter';
import { MediaTypeFilter } from './media-type-filter';
import { GoogleProductCategory1Filter } from './google-product-category1-filter';
import { GoogleProductCategory6Filter } from './google-product-category6-filter';
import { CatalogsProductGroupFilterOperatorTypeCriteria } from './catalogs-product-group-filter-operator-type-criteria';
import { CurrencyFilter } from './currency-filter';
import { CustomLabel4Filter } from './custom-label4-filter';
import { GoogleProductCategory4Filter } from './google-product-category4-filter';
import { CatalogsProductGroupUint32Criteria } from './catalogs-product-group-uint32-criteria';
import { ProductType2Filter } from './product-type2-filter';
import { ProductType0Filter } from './product-type0-filter';
import { AvailabilityFilter } from './availability-filter';
import { ItemGroupIdFilter } from './item-group-id-filter';
import { GenderFilter } from './gender-filter';
import { CatalogsProductGroupMultipleGenderCriteria } from './catalogs-product-group-multiple-gender-criteria';
import { CatalogsProductGroupMultipleStringListCriteria } from './catalogs-product-group-multiple-string-list-criteria';
import { CustomLabel1Filter } from './custom-label1-filter';
import { CatalogsProductGroupMultiplePinterestProductCategoryCriteria } from './catalogs-product-group-multiple-pinterest-product-category-criteria';
import { ProductType4Filter } from './product-type4-filter';
import { CatalogsProductGroupMultipleStringCriteria } from './catalogs-product-group-multiple-string-criteria';
import { GoogleProductCategory0Filter } from './google-product-category0-filter';
import { PinterestProductCategoriesFilter } from './pinterest-product-categories-filter';
import { GoogleProductCategory2Filter } from './google-product-category2-filter';
import { GoogleProductCategory5Filter } from './google-product-category5-filter';
import { CustomNumber3Filter } from './custom-number3-filter';
import { CatalogsProductGroupMultipleMediaTypesCriteria } from './catalogs-product-group-multiple-media-types-criteria';
import { CustomNumber0Filter } from './custom-number0-filter';
import { ItemIdFilter } from './item-id-filter';
import { TitleKeywordsFilter } from './title-keywords-filter';
import { ConditionFilter } from './condition-filter';
import { ProductType1Filter } from './product-type1-filter';


/**
 * Base filter keys shared across catalog filtering
 */
export interface CatalogsBaseFilterKeys { 
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
}

