package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ConversionHealthSelectionItem {
    /* Status for conversion types */
    Object conversionType
    /* Status for criteria */
    Object criteria
    /* Status for ingestion sources */
    Object ingestionSource
    /* Overall status for this selection item */
    Object status = null
}
