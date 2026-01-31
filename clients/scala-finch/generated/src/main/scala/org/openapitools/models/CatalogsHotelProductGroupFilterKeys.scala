package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BrandFilter
import org.openapitools.models.CatalogsProductGroupFilterOperatorTypeCriteria
import org.openapitools.models.CatalogsProductGroupMultipleCountriesCriteria
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.models.CatalogsProductGroupPricingCurrencyCriteria
import org.openapitools.models.CountryFilter
import org.openapitools.models.CustomLabel0Filter
import org.openapitools.models.CustomLabel1Filter
import org.openapitools.models.CustomLabel2Filter
import org.openapitools.models.CustomLabel3Filter
import org.openapitools.models.CustomLabel4Filter
import org.openapitools.models.HotelIdFilter
import org.openapitools.models.PriceFilter
import org.openapitools.models.TitleKeywordsFilter

/**
 * 
 * @param PRICE 
 * @param HOTELUnderscoreID 
 * @param BRAND 
 * @param CUSTOMUnderscoreLABELUnderscore0 
 * @param CUSTOMUnderscoreLABELUnderscore1 
 * @param CUSTOMUnderscoreLABELUnderscore2 
 * @param CUSTOMUnderscoreLABELUnderscore3 
 * @param CUSTOMUnderscoreLABELUnderscore4 
 * @param COUNTRY 
 * @param TITLEUnderscoreKEYWORDS 
 */
case class CatalogsHotelProductGroupFilterKeys(PRICE: CatalogsProductGroupPricingCurrencyCriteria,
                HOTELUnderscoreID: CatalogsProductGroupMultipleStringCriteria,
                BRAND: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore0: CatalogsProductGroupFilterOperatorTypeCriteria,
                CUSTOMUnderscoreLABELUnderscore1: CatalogsProductGroupFilterOperatorTypeCriteria,
                CUSTOMUnderscoreLABELUnderscore2: CatalogsProductGroupFilterOperatorTypeCriteria,
                CUSTOMUnderscoreLABELUnderscore3: CatalogsProductGroupFilterOperatorTypeCriteria,
                CUSTOMUnderscoreLABELUnderscore4: CatalogsProductGroupFilterOperatorTypeCriteria,
                COUNTRY: CatalogsProductGroupMultipleCountriesCriteria,
                TITLEUnderscoreKEYWORDS: CatalogsProductGroupMultipleStringCriteria
                )

object CatalogsHotelProductGroupFilterKeys {
    /**
     * Creates the codec for converting CatalogsHotelProductGroupFilterKeys from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroupFilterKeys] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroupFilterKeys] = deriveEncoder
}
