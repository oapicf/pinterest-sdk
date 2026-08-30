

#include "CatalogsCreativeAssetsProductGroupFilterKeys.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroupFilterKeys::CatalogsCreativeAssetsProductGroupFilterKeys()
{
	cREATIVE_ASSETS_ID = CatalogsProductGroupMultipleStringCriteria();
	cUSTOM_LABEL_0 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_1 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_2 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_3 = CatalogsProductGroupFilterOperatorTypeCriteria();
	cUSTOM_LABEL_4 = CatalogsProductGroupFilterOperatorTypeCriteria();
	gOOGLE_PRODUCT_CATEGORY_6 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_5 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_4 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_3 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_2 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_1 = CatalogsProductGroupMultipleStringListCriteria();
	gOOGLE_PRODUCT_CATEGORY_0 = CatalogsProductGroupMultipleStringListCriteria();
	mEDIA_TYPE = CatalogsProductGroupMultipleMediaTypesCriteria();
	tITLE_KEYWORDS = CatalogsProductGroupMultipleStringCriteria();
	lINK = CatalogsProductGroupFilterOperatorTypeCriteria();
}

CatalogsCreativeAssetsProductGroupFilterKeys::CatalogsCreativeAssetsProductGroupFilterKeys(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductGroupFilterKeys::~CatalogsCreativeAssetsProductGroupFilterKeys()
{

}

void
CatalogsCreativeAssetsProductGroupFilterKeys::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cREATIVE_ASSETS_IDKey = "CREATIVE_ASSETS_ID";

    if(object.has_key(cREATIVE_ASSETS_IDKey))
    {
        bourne::json value = object[cREATIVE_ASSETS_IDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &cREATIVE_ASSETS_ID;
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

    const char *mEDIA_TYPEKey = "MEDIA_TYPE";

    if(object.has_key(mEDIA_TYPEKey))
    {
        bourne::json value = object[mEDIA_TYPEKey];




        CatalogsProductGroupMultipleMediaTypesCriteria* obj = &mEDIA_TYPE;
		obj->fromJson(value.dump());

    }

    const char *tITLE_KEYWORDSKey = "TITLE_KEYWORDS";

    if(object.has_key(tITLE_KEYWORDSKey))
    {
        bourne::json value = object[tITLE_KEYWORDSKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &tITLE_KEYWORDS;
		obj->fromJson(value.dump());

    }

    const char *lINKKey = "LINK";

    if(object.has_key(lINKKey))
    {
        bourne::json value = object[lINKKey];




        CatalogsProductGroupFilterOperatorTypeCriteria* obj = &lINK;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsCreativeAssetsProductGroupFilterKeys::toJson()
{
    bourne::json object = bourne::json::object();






	object["cREATIVE_ASSETS_ID"] = getCREATIVEASSETSID().toJson();






	object["cUSTOM_LABEL_0"] = getCUSTOMLABEL0().toJson();






	object["cUSTOM_LABEL_1"] = getCUSTOMLABEL1().toJson();






	object["cUSTOM_LABEL_2"] = getCUSTOMLABEL2().toJson();






	object["cUSTOM_LABEL_3"] = getCUSTOMLABEL3().toJson();






	object["cUSTOM_LABEL_4"] = getCUSTOMLABEL4().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_6"] = getGOOGLEPRODUCTCATEGORY6().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_5"] = getGOOGLEPRODUCTCATEGORY5().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_4"] = getGOOGLEPRODUCTCATEGORY4().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_3"] = getGOOGLEPRODUCTCATEGORY3().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_2"] = getGOOGLEPRODUCTCATEGORY2().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_1"] = getGOOGLEPRODUCTCATEGORY1().toJson();






	object["gOOGLE_PRODUCT_CATEGORY_0"] = getGOOGLEPRODUCTCATEGORY0().toJson();






	object["mEDIA_TYPE"] = getMEDIATYPE().toJson();






	object["tITLE_KEYWORDS"] = getTITLEKEYWORDS().toJson();






	object["lINK"] = getLINK().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCREATIVEASSETSID()
{
	return cREATIVE_ASSETS_ID;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria cREATIVE_ASSETS_ID)
{
	this->cREATIVE_ASSETS_ID = cREATIVE_ASSETS_ID;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4)
{
	this->cUSTOM_LABEL_4 = cUSTOM_LABEL_4;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY6()
{
	return gOOGLE_PRODUCT_CATEGORY_6;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6)
{
	this->gOOGLE_PRODUCT_CATEGORY_6 = gOOGLE_PRODUCT_CATEGORY_6;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY5()
{
	return gOOGLE_PRODUCT_CATEGORY_5;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5)
{
	this->gOOGLE_PRODUCT_CATEGORY_5 = gOOGLE_PRODUCT_CATEGORY_5;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY4()
{
	return gOOGLE_PRODUCT_CATEGORY_4;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4)
{
	this->gOOGLE_PRODUCT_CATEGORY_4 = gOOGLE_PRODUCT_CATEGORY_4;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY3()
{
	return gOOGLE_PRODUCT_CATEGORY_3;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3)
{
	this->gOOGLE_PRODUCT_CATEGORY_3 = gOOGLE_PRODUCT_CATEGORY_3;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY2()
{
	return gOOGLE_PRODUCT_CATEGORY_2;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2)
{
	this->gOOGLE_PRODUCT_CATEGORY_2 = gOOGLE_PRODUCT_CATEGORY_2;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY1()
{
	return gOOGLE_PRODUCT_CATEGORY_1;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1)
{
	this->gOOGLE_PRODUCT_CATEGORY_1 = gOOGLE_PRODUCT_CATEGORY_1;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY0()
{
	return gOOGLE_PRODUCT_CATEGORY_0;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0)
{
	this->gOOGLE_PRODUCT_CATEGORY_0 = gOOGLE_PRODUCT_CATEGORY_0;
}

CatalogsProductGroupMultipleMediaTypesCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getMEDIATYPE()
{
	return mEDIA_TYPE;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE)
{
	this->mEDIA_TYPE = mEDIA_TYPE;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getTITLEKEYWORDS()
{
	return tITLE_KEYWORDS;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS)
{
	this->tITLE_KEYWORDS = tITLE_KEYWORDS;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getLINK()
{
	return lINK;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setLINK(CatalogsProductGroupFilterOperatorTypeCriteria lINK)
{
	this->lINK = lINK;
}



