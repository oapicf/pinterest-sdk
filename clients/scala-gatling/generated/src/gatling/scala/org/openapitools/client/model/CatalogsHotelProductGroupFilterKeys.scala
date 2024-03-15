
package org.openapitools.client.model


case class CatalogsHotelProductGroupFilterKeys (
    _PRICE: CatalogsProductGroupPricingCurrencyCriteria,
    _HOTEL_ID: CatalogsProductGroupMultipleStringCriteria,
    _BRAND: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
    _COUNTRY: CatalogsProductGroupMultipleCountriesCriteria
)
object CatalogsHotelProductGroupFilterKeys {
    def toStringBody(var_PRICE: Object, var_HOTEL_ID: Object, var_BRAND: Object, var_CUSTOM_LABEL_0: Object, var_CUSTOM_LABEL_1: Object, var_CUSTOM_LABEL_2: Object, var_CUSTOM_LABEL_3: Object, var_CUSTOM_LABEL_4: Object, var_COUNTRY: Object) =
        s"""
        | {
        | "PRICE":$var_PRICE,"HOTEL_ID":$var_HOTEL_ID,"BRAND":$var_BRAND,"CUSTOM_LABEL_0":$var_CUSTOM_LABEL_0,"CUSTOM_LABEL_1":$var_CUSTOM_LABEL_1,"CUSTOM_LABEL_2":$var_CUSTOM_LABEL_2,"CUSTOM_LABEL_3":$var_CUSTOM_LABEL_3,"CUSTOM_LABEL_4":$var_CUSTOM_LABEL_4,"COUNTRY":$var_COUNTRY
        | }
        """.stripMargin
}
