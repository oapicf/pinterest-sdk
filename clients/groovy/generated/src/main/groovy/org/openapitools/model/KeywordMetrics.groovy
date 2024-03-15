package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class KeywordMetrics {
    /* Average cost per click */
    BigDecimal avgCpcInMicroCurrency
    /* Keyword's search frequency. This value is based on keyword frequency in pepsi client response */
    String keywordQueryVolume
}
