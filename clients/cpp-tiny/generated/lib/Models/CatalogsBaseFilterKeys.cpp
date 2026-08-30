

#include "CatalogsBaseFilterKeys.h"

using namespace Tiny;

CatalogsBaseFilterKeys::CatalogsBaseFilterKeys()
{
	mIN_PRICE = CatalogsProductGroupPricingCriteria();
	mAX_PRICE = CatalogsProductGroupPricingCriteria();
	cURRENCY = CatalogsProductGroupCurrencyCriteria();
	iTEM_ID = CatalogsProductGroupMultipleStringCriteria();
	aVAILABILITY = CatalogsProductGroupMultipleStringCriteria();
	bRAND = CatalogsProductGroupMultipleStringCriteria();
	cONDITION = CatalogsProductGroupMultipleStringCriteria();
	cUSTOM_LABEL_0 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_1 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_2 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_3 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_4 = CatalogsProductGroupFilterOperatorTypeCriteria();
	iTEM_GROUP_ID = CatalogsProductGroupMultipleStringCriteria();
	gENDER = CatalogsProductGroupMultipleGenderCriteria();
	mEDIA_TYPE = CatalogsProductGroupMultipleMediaTypesCriteria();
	pRODUCT_TYPE_4 = CatalogsProductGroupMultipleStringListCriteria();
	pRODUCT_TYPE_3 = CatalogsProductGroupMultipleStringListCriteria();
	pRODUCT_TYPE_2 = CatalogsProductGroupMultipleStringListCriteria();
	pRODUCT_TYPE_1 = CatalogsProductGroupMultipleStringListCriteria();
	pRODUCT_TYPE_0 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_6 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_5 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_4 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_3 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_2 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_1 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_0 = CatalogsProductGroupMultipleStringListCriteria();
	cUSTOM_NUMBER_0 = CatalogsProductGroupUint32Criteria();
	cUSTOM_NUMBER_1 = CatalogsProductGroupUint32Criteria();
	cUSTOM_NUMBER_2 = CatalogsProductGroupUint32Criteria();
	cUSTOM_NUMBER_3 = CatalogsProductGroupUint32Criteria();
	cUSTOM_NUMBER_4 = CatalogsProductGroupUint32Criteria();
	tITLE_KEYWORDS = CatalogsProductGroupMultipleStringCriteria();
	pINTEREST_PRODUCT_CATEGORIES = CatalogsProductGroupMultiplePinterestProductCategoryCriteria();
}

CatalogsBaseFilterKeys::CatalogsBaseFilterKeys(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsBaseFilterKeys::~CatalogsBaseFilterKeys()
{

}

void
CatalogsBaseFilterKeys::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mIN_PRICEKey = "MIN_PRICE";

    if(object.has_key(mIN_PRICEKey))
    {
        bourne::json value = object[mIN_PRICEKey];




        CatalogsProductGroupPricingCriteria* obj = &mIN_PRICE;
		obj->fromJson(value.dump());

    }

    const char *mAX_PRICEKey = "MAX_PRICE";

    if(object.has_key(mAX_PRICEKey))
    {
        bourne::json value = object[mAX_PRICEKey];




        CatalogsProductGroupPricingCriteria* obj = &mAX_PRICE;
		obj->fromJson(value.dump());

    }

    const char *cURRENCYKey = "CURRENCY";

    if(object.has_key(cURRENCYKey))
    {
        bourne::json value = object[cURRENCYKey];




        CatalogsProductGroupCurrencyCriteria* obj = &cURRENCY;
		obj->fromJson(value.dump());

    }

    const char *iTEM_IDKey = "ITEM_ID";

    if(object.has_key(iTEM_IDKey))
    {
        bourne::json value = object[iTEM_IDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &iTEM_ID;
		obj->fromJson(value.dump());

    }

    const char *aVAILABILITYKey = "AVAILABILITY";

    if(object.has_key(aVAILABILITYKey))
    {
        bourne::json value = object[aVAILABILITYKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &aVAILABILITY;
		obj->fromJson(value.dump());

    }

    const char *bRANDKey = "BRAND";

    if(object.has_key(bRANDKey))
    {
        bourne::json value = object[bRANDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &bRAND;
		obj->fromJson(value.dump());

    }

    const char *cONDITIONKey = "CONDITION";

    if(object.has_key(cONDITIONKey))
    {
        bourne::json value = object[cONDITIONKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &cONDITION;
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

    const char *iTEM_GROUP_IDKey = "ITEM_GROUP_ID";

    if(object.has_key(iTEM_GROUP_IDKey))
    {
        bourne::json value = object[iTEM_GROUP_IDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &iTEM_GROUP_ID;
		obj->fromJson(value.dump());

    }

    const char *gENDERKey = "GENDER";

    if(object.has_key(gENDERKey))
    {
        bourne::json value = object[gENDERKey];




        CatalogsProductGroupMultipleGenderCriteria* obj = &gENDER;
		obj->fromJson(value.dump());

    }

    const char *mEDIA_TYPEKey = "MEDIA_TYPE";

    if(object.has_key(mEDIA_TYPEKey))
    {
        bourne::json value = object[mEDIA_TYPEKey];




        CatalogsProductGroupMultipleMediaTypesCriteria* obj = &mEDIA_TYPE;
		obj->fromJson(value.dump());

    }

    const char *pRODUCT_TYPE_4Key = "PRODUCT_TYPE_4";

    if(object.has_key(pRODUCT_TYPE_4Key))
    {
        bourne::json value = object[pRODUCT_TYPE_4Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_4;
		obj->fromJson(value.dump());

    }

    const char *pRODUCT_TYPE_3Key = "PRODUCT_TYPE_3";

    if(object.has_key(pRODUCT_TYPE_3Key))
    {
        bourne::json value = object[pRODUCT_TYPE_3Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_3;
		obj->fromJson(value.dump());

    }

    const char *pRODUCT_TYPE_2Key = "PRODUCT_TYPE_2";

    if(object.has_key(pRODUCT_TYPE_2Key))
    {
        bourne::json value = object[pRODUCT_TYPE_2Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_2;
		obj->fromJson(value.dump());

    }

    const char *pRODUCT_TYPE_1Key = "PRODUCT_TYPE_1";

    if(object.has_key(pRODUCT_TYPE_1Key))
    {
        bourne::json value = object[pRODUCT_TYPE_1Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_1;
		obj->fromJson(value.dump());

    }

    const char *pRODUCT_TYPE_0Key = "PRODUCT_TYPE_0";

    if(object.has_key(pRODUCT_TYPE_0Key))
    {
        bourne::json value = object[pRODUCT_TYPE_0Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_0;
		obj->fromJson(value.dump());

    }

    const char *gOOGLE_PRODUCT_CATEGORY_6Key = "GOOGLE_PRODUCT_CATEGORY_6";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_6Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_6Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_6;
		obj->fromJson(value.dump());

    }

    const char *gOOGLE_PRODUCT_CATEGORY_5Key = "GOOGLE_PRODUCT_CATEGORY_5";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_5Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_5Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_5;
		obj->fromJson(value.dump());

    }

    const char *gOOGLE_PRODUCT_CATEGORY_4Key = "GOOGLE_PRODUCT_CATEGORY_4";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_4Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_4Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_4;
		obj->fromJson(value.dump());

    }

    const char *gOOGLE_PRODUCT_CATEGORY_3Key = "GOOGLE_PRODUCT_CATEGORY_3";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_3Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_3Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_3;
		obj->fromJson(value.dump());

    }

    const char *gOOGLE_PRODUCT_CATEGORY_2Key = "GOOGLE_PRODUCT_CATEGORY_2";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_2Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_2Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_2;
		obj->fromJson(value.dump());

    }

    const char *gOOGLE_PRODUCT_CATEGORY_1Key = "GOOGLE_PRODUCT_CATEGORY_1";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_1Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_1Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_1;
		obj->fromJson(value.dump());

    }

    const char *gOOGLE_PRODUCT_CATEGORY_0Key = "GOOGLE_PRODUCT_CATEGORY_0";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_0Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_0Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_0;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_NUMBER_0Key = "CUSTOM_NUMBER_0";

    if(object.has_key(cUSTOM_NUMBER_0Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_0Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_0;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_NUMBER_1Key = "CUSTOM_NUMBER_1";

    if(object.has_key(cUSTOM_NUMBER_1Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_1Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_1;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_NUMBER_2Key = "CUSTOM_NUMBER_2";

    if(object.has_key(cUSTOM_NUMBER_2Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_2Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_2;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_NUMBER_3Key = "CUSTOM_NUMBER_3";

    if(object.has_key(cUSTOM_NUMBER_3Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_3Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_3;
		obj->fromJson(value.dump());

    }

    const char *cUSTOM_NUMBER_4Key = "CUSTOM_NUMBER_4";

    if(object.has_key(cUSTOM_NUMBER_4Key))
    {
        bourne::json value = object[cUSTOM_NUMBER_4Key];




        CatalogsProductGroupUint32Criteria* obj = &cUSTOM_NUMBER_4;
		obj->fromJson(value.dump());

    }

    const char *tITLE_KEYWORDSKey = "TITLE_KEYWORDS";

    if(object.has_key(tITLE_KEYWORDSKey))
    {
        bourne::json value = object[tITLE_KEYWORDSKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &tITLE_KEYWORDS;
		obj->fromJson(value.dump());

    }

    const char *pINTEREST_PRODUCT_CATEGORIESKey = "PINTEREST_PRODUCT_CATEGORIES";

    if(object.has_key(pINTEREST_PRODUCT_CATEGORIESKey))
    {
        bourne::json value = object[pINTEREST_PRODUCT_CATEGORIESKey];




        CatalogsProductGroupMultiplePinterestProductCategoryCriteria* obj = &pINTEREST_PRODUCT_CATEGORIES;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsBaseFilterKeys::toJson()
{
    bourne::json object = bourne::json::object();






	object["mIN_PRICE"] = getMINPRICE().toJson();






	object["mAX_PRICE"] = getMAXPRICE().toJson();






	object["cURRENCY"] = getCURRENCY().toJson();






	object["iTEM_ID"] = getITEMID().toJson();






	object["aVAILABILITY"] = getAVAILABILITY().toJson();






	object["bRAND"] = getBRAND().toJson();






	object["cONDITION"] = getCONDITION().toJson();






	object["cUSTOM_LABEL_0"] = getCUSTOMLABEL0().toJson();






	object["cUSTOM_LABEL_1"] = getCUSTOMLABEL1().toJson();






	object["cUSTOM_LABEL_2"] = getCUSTOMLABEL2().toJson();






	object["cUSTOM_LABEL_3"] = getCUSTOMLABEL3().toJson();






	object["cUSTOM_LABEL_4"] = getCUSTOMLABEL4().toJson();






	object["iTEM_GROUP_ID"] = getITEMGROUPID().toJson();






	object["gENDER"] = getGENDER().toJson();






	object["mEDIA_TYPE"] = getMEDIATYPE().toJson();






	object["pRODUCT_TYPE_4"] = getPRODUCTTYPE4().toJson();






	object["pRODUCT_TYPE_3"] = getPRODUCTTYPE3().toJson();






	object["pRODUCT_TYPE_2"] = getPRODUCTTYPE2().toJson();






	object["pRODUCT_TYPE_1"] = getPRODUCTTYPE1().toJson();






	object["pRODUCT_TYPE_0"] = getPRODUCTTYPE0().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_6"] = getGOOGLEPRODUCTCATEGORY6().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_5"] = getGOOGLEPRODUCTCATEGORY5().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_4"] = getGOOGLEPRODUCTCATEGORY4().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_3"] = getGOOGLEPRODUCTCATEGORY3().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_2"] = getGOOGLEPRODUCTCATEGORY2().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_1"] = getGOOGLEPRODUCTCATEGORY1().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_0"] = getGOOGLEPRODUCTCATEGORY0().toJson();






	object["cUSTOM_NUMBER_0"] = getCUSTOMNUMBER0().toJson();






	object["cUSTOM_NUMBER_1"] = getCUSTOMNUMBER1().toJson();






	object["cUSTOM_NUMBER_2"] = getCUSTOMNUMBER2().toJson();






	object["cUSTOM_NUMBER_3"] = getCUSTOMNUMBER3().toJson();






	object["cUSTOM_NUMBER_4"] = getCUSTOMNUMBER4().toJson();






	object["tITLE_KEYWORDS"] = getTITLEKEYWORDS().toJson();






	object["pINTEREST_PRODUCT_CATEGORIES"] = getPINTERESTPRODUCTCATEGORIES().toJson();


    return object;

}

CatalogsProductGroupPricingCriteria
CatalogsBaseFilterKeys::getMINPRICE()
{
	return mIN_PRICE;
}

void
CatalogsBaseFilterKeys::setMINPRICE(CatalogsProductGroupPricingCriteria mIN_PRICE)
{
	this->mIN_PRICE = mIN_PRICE;
}

CatalogsProductGroupPricingCriteria
CatalogsBaseFilterKeys::getMAXPRICE()
{
	return mAX_PRICE;
}

void
CatalogsBaseFilterKeys::setMAXPRICE(CatalogsProductGroupPricingCriteria mAX_PRICE)
{
	this->mAX_PRICE = mAX_PRICE;
}

CatalogsProductGroupCurrencyCriteria
CatalogsBaseFilterKeys::getCURRENCY()
{
	return cURRENCY;
}

void
CatalogsBaseFilterKeys::setCURRENCY(CatalogsProductGroupCurrencyCriteria cURRENCY)
{
	this->cURRENCY = cURRENCY;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsBaseFilterKeys::getITEMID()
{
	return iTEM_ID;
}

void
CatalogsBaseFilterKeys::setITEMID(CatalogsProductGroupMultipleStringCriteria iTEM_ID)
{
	this->iTEM_ID = iTEM_ID;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsBaseFilterKeys::getAVAILABILITY()
{
	return aVAILABILITY;
}

void
CatalogsBaseFilterKeys::setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria aVAILABILITY)
{
	this->aVAILABILITY = aVAILABILITY;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsBaseFilterKeys::getBRAND()
{
	return bRAND;
}

void
CatalogsBaseFilterKeys::setBRAND(CatalogsProductGroupMultipleStringCriteria bRAND)
{
	this->bRAND = bRAND;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsBaseFilterKeys::getCONDITION()
{
	return cONDITION;
}

void
CatalogsBaseFilterKeys::setCONDITION(CatalogsProductGroupMultipleStringCriteria cONDITION)
{
	this->cONDITION = cONDITION;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsBaseFilterKeys::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CatalogsBaseFilterKeys::setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsBaseFilterKeys::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CatalogsBaseFilterKeys::setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsBaseFilterKeys::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CatalogsBaseFilterKeys::setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsBaseFilterKeys::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CatalogsBaseFilterKeys::setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsBaseFilterKeys::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CatalogsBaseFilterKeys::setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4)
{
	this->cUSTOM_LABEL_4 = cUSTOM_LABEL_4;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsBaseFilterKeys::getITEMGROUPID()
{
	return iTEM_GROUP_ID;
}

void
CatalogsBaseFilterKeys::setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria iTEM_GROUP_ID)
{
	this->iTEM_GROUP_ID = iTEM_GROUP_ID;
}

CatalogsProductGroupMultipleGenderCriteria
CatalogsBaseFilterKeys::getGENDER()
{
	return gENDER;
}

void
CatalogsBaseFilterKeys::setGENDER(CatalogsProductGroupMultipleGenderCriteria gENDER)
{
	this->gENDER = gENDER;
}

CatalogsProductGroupMultipleMediaTypesCriteria
CatalogsBaseFilterKeys::getMEDIATYPE()
{
	return mEDIA_TYPE;
}

void
CatalogsBaseFilterKeys::setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE)
{
	this->mEDIA_TYPE = mEDIA_TYPE;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getPRODUCTTYPE4()
{
	return pRODUCT_TYPE_4;
}

void
CatalogsBaseFilterKeys::setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_4)
{
	this->pRODUCT_TYPE_4 = pRODUCT_TYPE_4;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getPRODUCTTYPE3()
{
	return pRODUCT_TYPE_3;
}

void
CatalogsBaseFilterKeys::setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_3)
{
	this->pRODUCT_TYPE_3 = pRODUCT_TYPE_3;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getPRODUCTTYPE2()
{
	return pRODUCT_TYPE_2;
}

void
CatalogsBaseFilterKeys::setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_2)
{
	this->pRODUCT_TYPE_2 = pRODUCT_TYPE_2;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getPRODUCTTYPE1()
{
	return pRODUCT_TYPE_1;
}

void
CatalogsBaseFilterKeys::setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_1)
{
	this->pRODUCT_TYPE_1 = pRODUCT_TYPE_1;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getPRODUCTTYPE0()
{
	return pRODUCT_TYPE_0;
}

void
CatalogsBaseFilterKeys::setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_0)
{
	this->pRODUCT_TYPE_0 = pRODUCT_TYPE_0;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getGOOGLEPRODUCTCATEGORY6()
{
	return gOOGLE_PRODUCT_CATEGORY_6;
}

void
CatalogsBaseFilterKeys::setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6)
{
	this->gOOGLE_PRODUCT_CATEGORY_6 = gOOGLE_PRODUCT_CATEGORY_6;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getGOOGLEPRODUCTCATEGORY5()
{
	return gOOGLE_PRODUCT_CATEGORY_5;
}

void
CatalogsBaseFilterKeys::setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5)
{
	this->gOOGLE_PRODUCT_CATEGORY_5 = gOOGLE_PRODUCT_CATEGORY_5;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getGOOGLEPRODUCTCATEGORY4()
{
	return gOOGLE_PRODUCT_CATEGORY_4;
}

void
CatalogsBaseFilterKeys::setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4)
{
	this->gOOGLE_PRODUCT_CATEGORY_4 = gOOGLE_PRODUCT_CATEGORY_4;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getGOOGLEPRODUCTCATEGORY3()
{
	return gOOGLE_PRODUCT_CATEGORY_3;
}

void
CatalogsBaseFilterKeys::setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3)
{
	this->gOOGLE_PRODUCT_CATEGORY_3 = gOOGLE_PRODUCT_CATEGORY_3;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getGOOGLEPRODUCTCATEGORY2()
{
	return gOOGLE_PRODUCT_CATEGORY_2;
}

void
CatalogsBaseFilterKeys::setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2)
{
	this->gOOGLE_PRODUCT_CATEGORY_2 = gOOGLE_PRODUCT_CATEGORY_2;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getGOOGLEPRODUCTCATEGORY1()
{
	return gOOGLE_PRODUCT_CATEGORY_1;
}

void
CatalogsBaseFilterKeys::setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1)
{
	this->gOOGLE_PRODUCT_CATEGORY_1 = gOOGLE_PRODUCT_CATEGORY_1;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsBaseFilterKeys::getGOOGLEPRODUCTCATEGORY0()
{
	return gOOGLE_PRODUCT_CATEGORY_0;
}

void
CatalogsBaseFilterKeys::setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0)
{
	this->gOOGLE_PRODUCT_CATEGORY_0 = gOOGLE_PRODUCT_CATEGORY_0;
}

CatalogsProductGroupUint32Criteria
CatalogsBaseFilterKeys::getCUSTOMNUMBER0()
{
	return cUSTOM_NUMBER_0;
}

void
CatalogsBaseFilterKeys::setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_0)
{
	this->cUSTOM_NUMBER_0 = cUSTOM_NUMBER_0;
}

CatalogsProductGroupUint32Criteria
CatalogsBaseFilterKeys::getCUSTOMNUMBER1()
{
	return cUSTOM_NUMBER_1;
}

void
CatalogsBaseFilterKeys::setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_1)
{
	this->cUSTOM_NUMBER_1 = cUSTOM_NUMBER_1;
}

CatalogsProductGroupUint32Criteria
CatalogsBaseFilterKeys::getCUSTOMNUMBER2()
{
	return cUSTOM_NUMBER_2;
}

void
CatalogsBaseFilterKeys::setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_2)
{
	this->cUSTOM_NUMBER_2 = cUSTOM_NUMBER_2;
}

CatalogsProductGroupUint32Criteria
CatalogsBaseFilterKeys::getCUSTOMNUMBER3()
{
	return cUSTOM_NUMBER_3;
}

void
CatalogsBaseFilterKeys::setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_3)
{
	this->cUSTOM_NUMBER_3 = cUSTOM_NUMBER_3;
}

CatalogsProductGroupUint32Criteria
CatalogsBaseFilterKeys::getCUSTOMNUMBER4()
{
	return cUSTOM_NUMBER_4;
}

void
CatalogsBaseFilterKeys::setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_4)
{
	this->cUSTOM_NUMBER_4 = cUSTOM_NUMBER_4;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsBaseFilterKeys::getTITLEKEYWORDS()
{
	return tITLE_KEYWORDS;
}

void
CatalogsBaseFilterKeys::setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS)
{
	this->tITLE_KEYWORDS = tITLE_KEYWORDS;
}

CatalogsProductGroupMultiplePinterestProductCategoryCriteria
CatalogsBaseFilterKeys::getPINTERESTPRODUCTCATEGORIES()
{
	return pINTEREST_PRODUCT_CATEGORIES;
}

void
CatalogsBaseFilterKeys::setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria pINTEREST_PRODUCT_CATEGORIES)
{
	this->pINTEREST_PRODUCT_CATEGORIES = pINTEREST_PRODUCT_CATEGORIES;
}



