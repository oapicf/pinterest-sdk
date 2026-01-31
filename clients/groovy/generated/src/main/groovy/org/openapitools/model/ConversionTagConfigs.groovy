package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ConversionTagConfigs {
    /* Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    Boolean aemDbEnabled = false
    /* Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    Boolean aemEnabled = false
    /* Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    Boolean aemExternalIdEnabled = false
    /* Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    Boolean aemFnlnEnabled = false
    /* Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    Boolean aemGeEnabled = false
    /* Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    Boolean aemLocEnabled = false
    /* Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    Boolean aemPhEnabled = false
    /* Metadata ingestion frequency. */
    BigDecimal mdFrequency = new BigDecimal("1")
    /* List of advertiser subdomains configured for NoCodeCAPI calls. */
    List<String> noCodeCapiDomains = new ArrayList<>()
}
