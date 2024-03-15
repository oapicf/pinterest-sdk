package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ConversionTagCreate {
    /* Conversion tag name. */
    String name
    /* Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    Boolean aemEnabled = false
    /* Metadata ingestion frequency. */
    BigDecimal mdFrequency = new BigDecimal("1")
    /* Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    Boolean aemFnlnEnabled = false
    /* Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    Boolean aemPhEnabled = false
    /* Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    Boolean aemGeEnabled = false
    /* Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    Boolean aemDbEnabled = false
    /* Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    Boolean aemLocEnabled = false
}
