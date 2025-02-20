/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.CatalogsProductGroupMultipleMediaTypesCriteria
import org.openapitools.server.models.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.server.models.CatalogsProductGroupMultipleStringListCriteria
import org.openapitools.server.models.CreativeAssetsIdFilter
import org.openapitools.server.models.CustomLabel0Filter
import org.openapitools.server.models.CustomLabel1Filter
import org.openapitools.server.models.CustomLabel2Filter
import org.openapitools.server.models.CustomLabel3Filter
import org.openapitools.server.models.CustomLabel4Filter
import org.openapitools.server.models.GoogleProductCategory0Filter
import org.openapitools.server.models.GoogleProductCategory1Filter
import org.openapitools.server.models.GoogleProductCategory2Filter
import org.openapitools.server.models.GoogleProductCategory3Filter
import org.openapitools.server.models.GoogleProductCategory4Filter
import org.openapitools.server.models.GoogleProductCategory5Filter
import org.openapitools.server.models.GoogleProductCategory6Filter
import org.openapitools.server.models.MediaTypeFilter

/**
 * 
 * @param CREATIVE_ASSETS_ID 
 * @param CUSTOM_LABEL_0 
 * @param CUSTOM_LABEL_1 
 * @param CUSTOM_LABEL_2 
 * @param CUSTOM_LABEL_3 
 * @param CUSTOM_LABEL_4 
 * @param GOOGLE_PRODUCT_CATEGORY_6 
 * @param GOOGLE_PRODUCT_CATEGORY_5 
 * @param GOOGLE_PRODUCT_CATEGORY_4 
 * @param GOOGLE_PRODUCT_CATEGORY_3 
 * @param GOOGLE_PRODUCT_CATEGORY_2 
 * @param GOOGLE_PRODUCT_CATEGORY_1 
 * @param GOOGLE_PRODUCT_CATEGORY_0 
 * @param MEDIA_TYPE 
 */
data class CatalogsCreativeAssetsProductGroupFilterKeys(
    val CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria,
    val CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
    val CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
    val CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
    val CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
    val CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
    val GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,
    val GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,
    val MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria
) 

