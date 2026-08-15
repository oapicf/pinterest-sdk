

#include "CatalogsProductGroupFilterKeys.h"

using namespace Tiny;

CatalogsProductGroupFilterKeys::CatalogsProductGroupFilterKeys()
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
	pRODUCT_GROUP = CatalogsProductGroupMultipleStringCriteria();
	cUSTOM_NUMBER_0 = CatalogsProductGroupUint32Criteria();
	cUSTOM_NUMBER_1 = CatalogsProductGroupUint32Criteria();
	cUSTOM_NUMBER_2 = CatalogsProductGroupUint32Criteria();
	cUSTOM_NUMBER_3 = CatalogsProductGroupUint32Criteria();
	cUSTOM_NUMBER_4 = CatalogsProductGroupUint32Criteria();
	tITLE_KEYWORDS = CatalogsProductGroupMultipleStringCriteria();
}

CatalogsProductGroupFilterKeys::CatalogsProductGroupFilterKeys(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupFilterKeys::~CatalogsProductGroupFilterKeys()
{

}

void
CatalogsProductGroupFilterKeys::fromJson(std::string jsonObj)
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

    const char *pRODUCT_GROUPKey = "PRODUCT_GROUP";

    if(object.has_key(pRODUCT_GROUPKey))
    {
        bourne::json value = object[pRODUCT_GROUPKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &pRODUCT_GROUP;
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


}

bourne::json
CatalogsProductGroupFilterKeys::toJson()
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






	object["pRODUCT_GROUP"] = getPRODUCTGROUP().toJson();






	object["cUSTOM_NUMBER_0"] = getCUSTOMNUMBER0().toJson();






	object["cUSTOM_NUMBER_1"] = getCUSTOMNUMBER1().toJson();






	object["cUSTOM_NUMBER_2"] = getCUSTOMNUMBER2().toJson();






	object["cUSTOM_NUMBER_3"] = getCUSTOMNUMBER3().toJson();






	object["cUSTOM_NUMBER_4"] = getCUSTOMNUMBER4().toJson();






	object["tITLE_KEYWORDS"] = getTITLEKEYWORDS().toJson();


    return object;

}

CatalogsProductGroupPricingCriteria
CatalogsProductGroupFilterKeys::getMINPRICE()
{
	return mIN_PRICE;
}

void
CatalogsProductGroupFilterKeys::setMINPRICE(CatalogsProductGroupPricingCriteria  mIN_PRICE)
{
	this->mIN_PRICE = mIN_PRICE;
}

CatalogsProductGroupPricingCriteria
CatalogsProductGroupFilterKeys::getMAXPRICE()
{
	return mAX_PRICE;
}

void
CatalogsProductGroupFilterKeys::setMAXPRICE(CatalogsProductGroupPricingCriteria  mAX_PRICE)
{
	this->mAX_PRICE = mAX_PRICE;
}

CatalogsProductGroupCurrencyCriteria
CatalogsProductGroupFilterKeys::getCURRENCY()
{
	return cURRENCY;
}

void
CatalogsProductGroupFilterKeys::setCURRENCY(CatalogsProductGroupCurrencyCriteria  cURRENCY)
{
	this->cURRENCY = cURRENCY;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsProductGroupFilterKeys::getITEMID()
{
	return iTEM_ID;
}

void
CatalogsProductGroupFilterKeys::setITEMID(CatalogsProductGroupMultipleStringCriteria  iTEM_ID)
{
	this->iTEM_ID = iTEM_ID;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsProductGroupFilterKeys::getAVAILABILITY()
{
	return aVAILABILITY;
}

void
CatalogsProductGroupFilterKeys::setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria  aVAILABILITY)
{
	this->aVAILABILITY = aVAILABILITY;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsProductGroupFilterKeys::getBRAND()
{
	return bRAND;
}

void
CatalogsProductGroupFilterKeys::setBRAND(CatalogsProductGroupMultipleStringCriteria  bRAND)
{
	this->bRAND = bRAND;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsProductGroupFilterKeys::getCONDITION()
{
	return cONDITION;
}

void
CatalogsProductGroupFilterKeys::setCONDITION(CatalogsProductGroupMultipleStringCriteria  cONDITION)
{
	this->cONDITION = cONDITION;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsProductGroupFilterKeys::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsProductGroupFilterKeys::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsProductGroupFilterKeys::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsProductGroupFilterKeys::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsProductGroupFilterKeys::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_4)
{
	this->cUSTOM_LABEL_4 = cUSTOM_LABEL_4;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsProductGroupFilterKeys::getITEMGROUPID()
{
	return iTEM_GROUP_ID;
}

void
CatalogsProductGroupFilterKeys::setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria  iTEM_GROUP_ID)
{
	this->iTEM_GROUP_ID = iTEM_GROUP_ID;
}

CatalogsProductGroupMultipleGenderCriteria
CatalogsProductGroupFilterKeys::getGENDER()
{
	return gENDER;
}

void
CatalogsProductGroupFilterKeys::setGENDER(CatalogsProductGroupMultipleGenderCriteria  gENDER)
{
	this->gENDER = gENDER;
}

CatalogsProductGroupMultipleMediaTypesCriteria
CatalogsProductGroupFilterKeys::getMEDIATYPE()
{
	return mEDIA_TYPE;
}

void
CatalogsProductGroupFilterKeys::setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria  mEDIA_TYPE)
{
	this->mEDIA_TYPE = mEDIA_TYPE;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getPRODUCTTYPE4()
{
	return pRODUCT_TYPE_4;
}

void
CatalogsProductGroupFilterKeys::setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_4)
{
	this->pRODUCT_TYPE_4 = pRODUCT_TYPE_4;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getPRODUCTTYPE3()
{
	return pRODUCT_TYPE_3;
}

void
CatalogsProductGroupFilterKeys::setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_3)
{
	this->pRODUCT_TYPE_3 = pRODUCT_TYPE_3;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getPRODUCTTYPE2()
{
	return pRODUCT_TYPE_2;
}

void
CatalogsProductGroupFilterKeys::setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_2)
{
	this->pRODUCT_TYPE_2 = pRODUCT_TYPE_2;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getPRODUCTTYPE1()
{
	return pRODUCT_TYPE_1;
}

void
CatalogsProductGroupFilterKeys::setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_1)
{
	this->pRODUCT_TYPE_1 = pRODUCT_TYPE_1;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getPRODUCTTYPE0()
{
	return pRODUCT_TYPE_0;
}

void
CatalogsProductGroupFilterKeys::setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_0)
{
	this->pRODUCT_TYPE_0 = pRODUCT_TYPE_0;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY6()
{
	return gOOGLE_PRODUCT_CATEGORY_6;
}

void
CatalogsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_6)
{
	this->gOOGLE_PRODUCT_CATEGORY_6 = gOOGLE_PRODUCT_CATEGORY_6;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY5()
{
	return gOOGLE_PRODUCT_CATEGORY_5;
}

void
CatalogsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_5)
{
	this->gOOGLE_PRODUCT_CATEGORY_5 = gOOGLE_PRODUCT_CATEGORY_5;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY4()
{
	return gOOGLE_PRODUCT_CATEGORY_4;
}

void
CatalogsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_4)
{
	this->gOOGLE_PRODUCT_CATEGORY_4 = gOOGLE_PRODUCT_CATEGORY_4;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY3()
{
	return gOOGLE_PRODUCT_CATEGORY_3;
}

void
CatalogsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_3)
{
	this->gOOGLE_PRODUCT_CATEGORY_3 = gOOGLE_PRODUCT_CATEGORY_3;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY2()
{
	return gOOGLE_PRODUCT_CATEGORY_2;
}

void
CatalogsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_2)
{
	this->gOOGLE_PRODUCT_CATEGORY_2 = gOOGLE_PRODUCT_CATEGORY_2;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY1()
{
	return gOOGLE_PRODUCT_CATEGORY_1;
}

void
CatalogsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_1)
{
	this->gOOGLE_PRODUCT_CATEGORY_1 = gOOGLE_PRODUCT_CATEGORY_1;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY0()
{
	return gOOGLE_PRODUCT_CATEGORY_0;
}

void
CatalogsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_0)
{
	this->gOOGLE_PRODUCT_CATEGORY_0 = gOOGLE_PRODUCT_CATEGORY_0;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsProductGroupFilterKeys::getPRODUCTGROUP()
{
	return pRODUCT_GROUP;
}

void
CatalogsProductGroupFilterKeys::setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria  pRODUCT_GROUP)
{
	this->pRODUCT_GROUP = pRODUCT_GROUP;
}

CatalogsProductGroupUint32Criteria
CatalogsProductGroupFilterKeys::getCUSTOMNUMBER0()
{
	return cUSTOM_NUMBER_0;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_0)
{
	this->cUSTOM_NUMBER_0 = cUSTOM_NUMBER_0;
}

CatalogsProductGroupUint32Criteria
CatalogsProductGroupFilterKeys::getCUSTOMNUMBER1()
{
	return cUSTOM_NUMBER_1;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_1)
{
	this->cUSTOM_NUMBER_1 = cUSTOM_NUMBER_1;
}

CatalogsProductGroupUint32Criteria
CatalogsProductGroupFilterKeys::getCUSTOMNUMBER2()
{
	return cUSTOM_NUMBER_2;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_2)
{
	this->cUSTOM_NUMBER_2 = cUSTOM_NUMBER_2;
}

CatalogsProductGroupUint32Criteria
CatalogsProductGroupFilterKeys::getCUSTOMNUMBER3()
{
	return cUSTOM_NUMBER_3;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_3)
{
	this->cUSTOM_NUMBER_3 = cUSTOM_NUMBER_3;
}

CatalogsProductGroupUint32Criteria
CatalogsProductGroupFilterKeys::getCUSTOMNUMBER4()
{
	return cUSTOM_NUMBER_4;
}

void
CatalogsProductGroupFilterKeys::setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_4)
{
	this->cUSTOM_NUMBER_4 = cUSTOM_NUMBER_4;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsProductGroupFilterKeys::getTITLEKEYWORDS()
{
	return tITLE_KEYWORDS;
}

void
CatalogsProductGroupFilterKeys::setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria  tITLE_KEYWORDS)
{
	this->tITLE_KEYWORDS = tITLE_KEYWORDS;
}



