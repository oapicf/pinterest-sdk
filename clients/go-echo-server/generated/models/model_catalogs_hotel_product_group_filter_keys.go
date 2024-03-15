package models

type CatalogsHotelProductGroupFilterKeys struct {

	PRICE CatalogsProductGroupPricingCurrencyCriteria `json:"PRICE"`

	HOTEL_ID CatalogsProductGroupMultipleStringCriteria `json:"HOTEL_ID"`

	BRAND CatalogsProductGroupMultipleStringCriteria `json:"BRAND"`

	CUSTOMLABEL0 CatalogsProductGroupMultipleStringCriteria `json:"CUSTOM_LABEL_0"`

	CUSTOMLABEL1 CatalogsProductGroupMultipleStringCriteria `json:"CUSTOM_LABEL_1"`

	CUSTOMLABEL2 CatalogsProductGroupMultipleStringCriteria `json:"CUSTOM_LABEL_2"`

	CUSTOMLABEL3 CatalogsProductGroupMultipleStringCriteria `json:"CUSTOM_LABEL_3"`

	CUSTOMLABEL4 CatalogsProductGroupMultipleStringCriteria `json:"CUSTOM_LABEL_4"`

	COUNTRY CatalogsProductGroupMultipleCountriesCriteria `json:"COUNTRY"`
}
