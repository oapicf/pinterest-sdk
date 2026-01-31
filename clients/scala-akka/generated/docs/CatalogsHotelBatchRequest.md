

# CatalogsHotelBatchRequest

Request object to update catalogs hotel items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**country** | **Country** |  | 
**language** | [**Language**](#Language) | We recommend using the CatalogsLocale values. | 
**items** | [**Seq&lt;CatalogsHotelBatchItem&gt;**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**catalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog |  [optional]


## Enum: CatalogType
Allowed values: [HOTEL]



## Enum: Language
Allowed values: [af-ZA, ar-SA, bg-BG, bn-IN, cs-CZ, da-DK, de, el-GR, en-AU, en-CA, en-GB, en-IN, en-US, es-419, es-AR, es-ES, es-MX, fi-FI, fr, fr-CA, he-IL, hi-IN, hr-HR, hu-HU, id-ID, it, ja, ko-KR, ms-MY, nb-NO, nl, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU, sk-SK, sv-SE, te-IN, th-TH, tl-PH, tr, uk-UA, vi-VN, zh-CN, zh-TW, AM, AR, AZ, BG, BN, BS, CA, CS, DA, DV, DZ, DE, EL, EN, ES, ET, FA, FI, FR, HE, HI, HR, HU, HY, ID, IN, IS, IT, IW, JA, KA, KM, KO, LO, LT, LV, MK, MN, MS, MY, NB, NE, NL, NO, PL, PT, RO, RU, SK, SL, SQ, SR, SV, TL, UK, VI, TE, TH, TR, XX, ZH]




