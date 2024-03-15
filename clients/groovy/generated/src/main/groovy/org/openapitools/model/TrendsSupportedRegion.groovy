package org.openapitools.model;

import groovy.transform.Canonical

enum TrendsSupportedRegion {

    US("US"),
    
    CA("CA"),
    
    DE("DE"),
    
    FR("FR"),
    
    ES("ES"),
    
    IT("IT"),
    
    DE_AT_CH("DE+AT+CH"),
    
    GB_IE("GB+IE"),
    
    IT_ES_PT_GR_MT("IT+ES+PT+GR+MT"),
    
    PL_RO_HU_SK_CZ("PL+RO+HU+SK+CZ"),
    
    SE_DK_FI_NO("SE+DK+FI+NO"),
    
    NL_BE_LU("NL+BE+LU"),
    
    AR("AR"),
    
    BR("BR"),
    
    CO("CO"),
    
    MX("MX"),
    
    MX_AR_CO_CL("MX+AR+CO+CL"),
    
    AU_NZ("AU+NZ")

    private final String value

    TrendsSupportedRegion(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
