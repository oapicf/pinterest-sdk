

#include "CatalogsHotelProductGroupFilterKeys.h"

using namespace Tiny;

CatalogsHotelProductGroupFilterKeys::CatalogsHotelProductGroupFilterKeys()
{
	pRICE = PriceFilterPrice();
	hOTEL_ID = CatalogsProductGroupMultipleStringCriteria();
	bRAND = CatalogsProductGroupMultipleStringCriteria();
	cUSTOM_LABEL_0 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_1 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_2 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_3 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_4 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cOUNTRY = CatalogsProductGroupMultipleCountriesCriteria();
	tITLE_KEYWORDS = CatalogsProductGroupMultipleStringCriteria();
}

CatalogsHotelProductGroupFilterKeys::CatalogsHotelProductGroupFilterKeys(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductGroupFilterKeys::~CatalogsHotelProductGroupFilterKeys()
{

}

void
CatalogsHotelProductGroupFilterKeys::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pRICEKey = "PRICE";

    if(object.has_key(pRICEKey))
    {
        bourne::json value = object[pRICEKey];




        PriceFilterPrice* obj = &pRICE;
		obj->fromJson(value.dump());

    }

    const char *hOTEL_IDKey = "HOTEL_ID";

    if(object.has_key(hOTEL_IDKey))
    {
        bourne::json value = object[hOTEL_IDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &hOTEL_ID;
		obj->fromJson(value.dump());

    }

    const char *bRANDKey = "BRAND";

    if(object.has_key(bRANDKey))
    {
        bourne::json value = object[bRANDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &bRAND;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";

    if(object.has_key(cUSTOM_LABEL_0Key))
    {
        bourne::json value = object[cUSTOM_LABEL_0Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_0;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";

    if(object.has_key(cUSTOM_LABEL_1Key))
    {
        bourne::json value = object[cUSTOM_LABEL_1Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_1;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";

    if(object.has_key(cUSTOM_LABEL_2Key))
    {
        bourne::json value = object[cUSTOM_LABEL_2Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_2;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";

    if(object.has_key(cUSTOM_LABEL_3Key))
    {
        bourne::json value = object[cUSTOM_LABEL_3Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_3;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";

    if(object.has_key(cUSTOM_LABEL_4Key))
    {
        bourne::json value = object[cUSTOM_LABEL_4Key];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &cUSTOM_LABEL_4;
		obj->fromJson(value.dump());

    }

    const char *cOUNTRYKey = "COUNTRY";

    if(object.has_key(cOUNTRYKey))
    {
        bourne::json value = object[cOUNTRYKey];




        CatalogsProductGroupMultipleCountriesCriteria* obj = &cOUNTRY;
		obj->fromJson(value.dump());

    }

    const char *tITLE_KEYWORDSKey = "TITLE_KEYWORDS";

    if(object.has_key(tITLE_KEYWORDSKey))
    {
        bourne::json value = object[tITLE_KEYWORDSKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &tITLE_KEYWORDS;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsHotelProductGroupFilterKeys::toJson()
{
    bourne::json object = bourne::json::object();






	object["pRICE"] = getPRICE().toJson();






	object["hOTEL_ID"] = getHOTELID().toJson();






	object["bRAND"] = getBRAND().toJson();






	object["cUSTOM_LABEL_0"] = getCUSTOMLABEL0().toJson();






	object["cUSTOM_LABEL_1"] = getCUSTOMLABEL1().toJson();






	object["cUSTOM_LABEL_2"] = getCUSTOMLABEL2().toJson();






	object["cUSTOM_LABEL_3"] = getCUSTOMLABEL3().toJson();






	object["cUSTOM_LABEL_4"] = getCUSTOMLABEL4().toJson();






	object["cOUNTRY"] = getCOUNTRY().toJson();






	object["tITLE_KEYWORDS"] = getTITLEKEYWORDS().toJson();


    return object;

}

PriceFilterPrice
CatalogsHotelProductGroupFilterKeys::getPRICE()
{
	return pRICE;
}

void
CatalogsHotelProductGroupFilterKeys::setPRICE(PriceFilterPrice pRICE)
{
	this->pRICE = pRICE;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getHOTELID()
{
	return hOTEL_ID;
}

void
CatalogsHotelProductGroupFilterKeys::setHOTELID(CatalogsProductGroupMultipleStringCriteria hOTEL_ID)
{
	this->hOTEL_ID = hOTEL_ID;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getBRAND()
{
	return bRAND;
}

void
CatalogsHotelProductGroupFilterKeys::setBRAND(CatalogsProductGroupMultipleStringCriteria bRAND)
{
	this->bRAND = bRAND;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4)
{
	this->cUSTOM_LABEL_4 = cUSTOM_LABEL_4;
}

CatalogsProductGroupMultipleCountriesCriteria
CatalogsHotelProductGroupFilterKeys::getCOUNTRY()
{
	return cOUNTRY;
}

void
CatalogsHotelProductGroupFilterKeys::setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria cOUNTRY)
{
	this->cOUNTRY = cOUNTRY;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getTITLEKEYWORDS()
{
	return tITLE_KEYWORDS;
}

void
CatalogsHotelProductGroupFilterKeys::setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS)
{
	this->tITLE_KEYWORDS = tITLE_KEYWORDS;
}



