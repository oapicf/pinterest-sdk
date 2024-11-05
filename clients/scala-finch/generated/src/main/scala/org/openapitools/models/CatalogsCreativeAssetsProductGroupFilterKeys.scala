package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.models.CreativeAssetsIdFilter
import org.openapitools.models.CustomLabel0Filter
import org.openapitools.models.CustomLabel1Filter
import org.openapitools.models.CustomLabel2Filter
import org.openapitools.models.CustomLabel3Filter
import org.openapitools.models.CustomLabel4Filter
import org.openapitools.models.GoogleProductCategory0Filter
import org.openapitools.models.GoogleProductCategory1Filter
import org.openapitools.models.GoogleProductCategory2Filter
import org.openapitools.models.GoogleProductCategory3Filter
import org.openapitools.models.GoogleProductCategory4Filter
import org.openapitools.models.GoogleProductCategory5Filter
import org.openapitools.models.GoogleProductCategory6Filter
import org.openapitools.models.MediaTypeFilter

/**
 * 
 * @param CREATIVEUnderscoreASSETSUnderscoreID 
 * @param CUSTOMUnderscoreLABELUnderscore0 
 * @param CUSTOMUnderscoreLABELUnderscore1 
 * @param CUSTOMUnderscoreLABELUnderscore2 
 * @param CUSTOMUnderscoreLABELUnderscore3 
 * @param CUSTOMUnderscoreLABELUnderscore4 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0 
 * @param MEDIAUnderscoreTYPE 
 */
case class CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVEUnderscoreASSETSUnderscoreID: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore0: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore1: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore2: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore3: CatalogsProductGroupMultipleStringCriteria,
                CUSTOMUnderscoreLABELUnderscore4: CatalogsProductGroupMultipleStringCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1: CatalogsProductGroupMultipleStringListCriteria,
                GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0: CatalogsProductGroupMultipleStringListCriteria,
                MEDIAUnderscoreTYPE: CatalogsProductGroupMultipleMediaTypesCriteria
                )

object CatalogsCreativeAssetsProductGroupFilterKeys {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductGroupFilterKeys from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductGroupFilterKeys] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductGroupFilterKeys] = deriveEncoder
}
