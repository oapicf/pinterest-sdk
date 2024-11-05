package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AvailabilityFilter
import org.openapitools.models.BrandFilter
import org.openapitools.models.CatalogsProductGroupCurrencyCriteria
import org.openapitools.models.CatalogsProductGroupMultipleGenderCriteria
import org.openapitools.models.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.models.CatalogsProductGroupPricingCriteria
import org.openapitools.models.ConditionFilter
import org.openapitools.models.CurrencyFilter
import org.openapitools.models.CustomLabel0Filter
import org.openapitools.models.CustomLabel1Filter
import org.openapitools.models.CustomLabel2Filter
import org.openapitools.models.CustomLabel3Filter
import org.openapitools.models.CustomLabel4Filter
import org.openapitools.models.GenderFilter
import org.openapitools.models.GoogleProductCategory0Filter
import org.openapitools.models.GoogleProductCategory1Filter
import org.openapitools.models.GoogleProductCategory2Filter
import org.openapitools.models.GoogleProductCategory3Filter
import org.openapitools.models.GoogleProductCategory4Filter
import org.openapitools.models.GoogleProductCategory5Filter
import org.openapitools.models.GoogleProductCategory6Filter
import org.openapitools.models.ItemGroupIdFilter
import org.openapitools.models.ItemIdFilter
import org.openapitools.models.MaxPriceFilter
import org.openapitools.models.MediaTypeFilter
import org.openapitools.models.MinPriceFilter
import org.openapitools.models.ProductGroupReferenceFilter
import org.openapitools.models.ProductType0Filter
import org.openapitools.models.ProductType1Filter
import org.openapitools.models.ProductType2Filter
import org.openapitools.models.ProductType3Filter
import org.openapitools.models.ProductType4Filter

/**
 * 
 * @param MINUnderscorePRICE 
 * @param MAXUnderscorePRICE 
 * @param CURRENCY 
 * @param ITEMUnderscoreID 
 * @param AVAILABILITY 
 * @param BRAND 
 * @param CONDITION 
 * @param CUSTOMUnderscoreLABELUnderscore0 
 * @param CUSTOMUnderscoreLABELUnderscore1 
 * @param CUSTOMUnderscoreLABELUnderscore2 
 * @param CUSTOMUnderscoreLABELUnderscore3 
 * @param CUSTOMUnderscoreLABELUnderscore4 
 * @param ITEMUnderscoreGROUPUnderscoreID 
 * @param GENDER 
 * @param MEDIAUnderscoreTYPE 
 * @param PRODUCTUnderscoreTYPEUnderscore4 
 * @param PRODUCTUnderscoreTYPEUnderscore3 
 * @param PRODUCTUnderscoreTYPEUnderscore2 
 * @param PRODUCTUnderscoreTYPEUnderscore1 
 * @param PRODUCTUnderscoreTYPEUnderscore0 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0 
 * @param PRODUCTUnderscoreGROUP 
 */
case class CatalogsProductGroupFilterKeys(MINUnderscorePRICE: CatalogsProductGroupPricingCriteria,
                MAXUnderscorePRICE: CatalogsProductGroupPricingCriteria,
                CURRENCY: CatalogsProductGroupCurrencyCriteria,
                ITEMUnderscoreID: CatalogsProductGroupMultipleStringCriteria,
                AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,
                BRAND: CatalogsProductGroupMultipleStringCriteria,
                CONDITION: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore0: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore1: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore2: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore3: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore4: CatalogsProductGroupMultipleStringCriteria,
                ITEMUnderscoreGROUPUnderscoreID: CatalogsProductGroupMultipleStringCriteria,
                GENDER: CatalogsProductGroupMultipleGenderCriteria,
                MEDIAUnderscoreTYPE: CatalogsProductGroupMultipleMediaTypesCriteria,
                PRODUCTUnderscoreTYPEUnderscore4: CatalogsProductGroupMultipleStringListCriteria,
                PRODUCTUnderscoreTYPEUnderscore3: CatalogsProductGroupMultipleStringListCriteria,
                PRODUCTUnderscoreTYPEUnderscore2: CatalogsProductGroupMultipleStringListCriteria,
                PRODUCTUnderscoreTYPEUnderscore1: CatalogsProductGroupMultipleStringListCriteria,
                PRODUCTUnderscoreTYPEUnderscore0: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0: CatalogsProductGroupMultipleStringListCriteria,
                PRODUCTUnderscoreGROUP: CatalogsProductGroupMultipleStringCriteria
                )

object CatalogsProductGroupFilterKeys {
    /**
     * Creates the codec for converting CatalogsProductGroupFilterKeys from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupFilterKeys] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupFilterKeys] = deriveEncoder
}
