

#include "TargetingSpec.h"

using namespace Tiny;

TargetingSpec::TargetingSpec()
{
	aGE_BUCKET = std::list<TargetingSpecAgeBucket>();
	aPPTYPE = std::list<TargetingSpecAppType>();
	aUDIENCE_EXCLUDE = std::list<std::string>();
	aUDIENCE_INCLUDE = std::list<std::string>();
	gENDER = std::list<TargetingSpecGender>();
	gEO = std::list<std::string>();
	gEO_EXCLUDE = std::list<std::string>();
	iNTEREST = std::list<std::string>();
	lOCALE = std::list<std::string>();
	lOCATION = std::list<std::string>();
	lOCATION_EXCLUDE = std::list<std::string>();
	mAXIMUM_AGE = std::string();
	mINIMUM_AGE = std::string();
	sHOPPING_RETARGETING = std::list<TargetingSpecShoppingRetargeting>();
	tARGETING_STRATEGY = std::list<std::string>();
}

TargetingSpec::TargetingSpec(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpec::~TargetingSpec()
{

}

void
TargetingSpec::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aGE_BUCKETKey = "AGE_BUCKET";

    if(object.has_key(aGE_BUCKETKey))
    {
        bourne::json value = object[aGE_BUCKETKey];


        std::list<TargetingSpecAgeBucket> aGE_BUCKET_list;
        TargetingSpecAgeBucket element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            aGE_BUCKET_list.push_back(element);
        }
        aGE_BUCKET = aGE_BUCKET_list;


    }

    const char *aPPTYPEKey = "APPTYPE";

    if(object.has_key(aPPTYPEKey))
    {
        bourne::json value = object[aPPTYPEKey];


        std::list<TargetingSpecAppType> aPPTYPE_list;
        TargetingSpecAppType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            aPPTYPE_list.push_back(element);
        }
        aPPTYPE = aPPTYPE_list;


    }

    const char *aUDIENCE_EXCLUDEKey = "AUDIENCE_EXCLUDE";

    if(object.has_key(aUDIENCE_EXCLUDEKey))
    {
        bourne::json value = object[aUDIENCE_EXCLUDEKey];


        std::list<std::string> aUDIENCE_EXCLUDE_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            aUDIENCE_EXCLUDE_list.push_back(element);
        }
        aUDIENCE_EXCLUDE = aUDIENCE_EXCLUDE_list;


    }

    const char *aUDIENCE_INCLUDEKey = "AUDIENCE_INCLUDE";

    if(object.has_key(aUDIENCE_INCLUDEKey))
    {
        bourne::json value = object[aUDIENCE_INCLUDEKey];


        std::list<std::string> aUDIENCE_INCLUDE_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            aUDIENCE_INCLUDE_list.push_back(element);
        }
        aUDIENCE_INCLUDE = aUDIENCE_INCLUDE_list;


    }

    const char *gENDERKey = "GENDER";

    if(object.has_key(gENDERKey))
    {
        bourne::json value = object[gENDERKey];


        std::list<TargetingSpecGender> gENDER_list;
        TargetingSpecGender element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            gENDER_list.push_back(element);
        }
        gENDER = gENDER_list;


    }

    const char *gEOKey = "GEO";

    if(object.has_key(gEOKey))
    {
        bourne::json value = object[gEOKey];


        std::list<std::string> gEO_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            gEO_list.push_back(element);
        }
        gEO = gEO_list;


    }

    const char *gEO_EXCLUDEKey = "GEO_EXCLUDE";

    if(object.has_key(gEO_EXCLUDEKey))
    {
        bourne::json value = object[gEO_EXCLUDEKey];


        std::list<std::string> gEO_EXCLUDE_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            gEO_EXCLUDE_list.push_back(element);
        }
        gEO_EXCLUDE = gEO_EXCLUDE_list;


    }

    const char *iNTERESTKey = "INTEREST";

    if(object.has_key(iNTERESTKey))
    {
        bourne::json value = object[iNTERESTKey];


        std::list<std::string> iNTEREST_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            iNTEREST_list.push_back(element);
        }
        iNTEREST = iNTEREST_list;


    }

    const char *lOCALEKey = "LOCALE";

    if(object.has_key(lOCALEKey))
    {
        bourne::json value = object[lOCALEKey];


        std::list<std::string> lOCALE_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            lOCALE_list.push_back(element);
        }
        lOCALE = lOCALE_list;


    }

    const char *lOCATIONKey = "LOCATION";

    if(object.has_key(lOCATIONKey))
    {
        bourne::json value = object[lOCATIONKey];


        std::list<std::string> lOCATION_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            lOCATION_list.push_back(element);
        }
        lOCATION = lOCATION_list;


    }

    const char *lOCATION_EXCLUDEKey = "LOCATION_EXCLUDE";

    if(object.has_key(lOCATION_EXCLUDEKey))
    {
        bourne::json value = object[lOCATION_EXCLUDEKey];


        std::list<std::string> lOCATION_EXCLUDE_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            lOCATION_EXCLUDE_list.push_back(element);
        }
        lOCATION_EXCLUDE = lOCATION_EXCLUDE_list;


    }

    const char *mAXIMUM_AGEKey = "MAXIMUM_AGE";

    if(object.has_key(mAXIMUM_AGEKey))
    {
        bourne::json value = object[mAXIMUM_AGEKey];



        jsonToValue(&mAXIMUM_AGE, value, "std::string");


    }

    const char *mINIMUM_AGEKey = "MINIMUM_AGE";

    if(object.has_key(mINIMUM_AGEKey))
    {
        bourne::json value = object[mINIMUM_AGEKey];



        jsonToValue(&mINIMUM_AGE, value, "std::string");


    }

    const char *sHOPPING_RETARGETINGKey = "SHOPPING_RETARGETING";

    if(object.has_key(sHOPPING_RETARGETINGKey))
    {
        bourne::json value = object[sHOPPING_RETARGETINGKey];


        std::list<TargetingSpecShoppingRetargeting> sHOPPING_RETARGETING_list;
        TargetingSpecShoppingRetargeting element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            sHOPPING_RETARGETING_list.push_back(element);
        }
        sHOPPING_RETARGETING = sHOPPING_RETARGETING_list;


    }

    const char *tARGETING_STRATEGYKey = "TARGETING_STRATEGY";

    if(object.has_key(tARGETING_STRATEGYKey))
    {
        bourne::json value = object[tARGETING_STRATEGYKey];


        std::list<std::string> tARGETING_STRATEGY_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            tARGETING_STRATEGY_list.push_back(element);
        }
        tARGETING_STRATEGY = tARGETING_STRATEGY_list;


    }


}

bourne::json
TargetingSpec::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<TargetingSpecAgeBucket> aGE_BUCKET_list = getAGEBUCKET();
    bourne::json aGE_BUCKET_arr = bourne::json::array();

    for(auto& var : aGE_BUCKET_list)
    {
        TargetingSpecAgeBucket obj = var;
        aGE_BUCKET_arr.append(obj.toJson());
    }
    object["aGE_BUCKET"] = aGE_BUCKET_arr;






    std::list<TargetingSpecAppType> aPPTYPE_list = getAPPTYPE();
    bourne::json aPPTYPE_arr = bourne::json::array();

    for(auto& var : aPPTYPE_list)
    {
        TargetingSpecAppType obj = var;
        aPPTYPE_arr.append(obj.toJson());
    }
    object["aPPTYPE"] = aPPTYPE_arr;






    std::list<std::string> aUDIENCE_EXCLUDE_list = getAUDIENCEEXCLUDE();
    bourne::json aUDIENCE_EXCLUDE_arr = bourne::json::array();

    for(auto& var : aUDIENCE_EXCLUDE_list)
    {
        aUDIENCE_EXCLUDE_arr.append(var);
    }
    object["aUDIENCE_EXCLUDE"] = aUDIENCE_EXCLUDE_arr;








    std::list<std::string> aUDIENCE_INCLUDE_list = getAUDIENCEINCLUDE();
    bourne::json aUDIENCE_INCLUDE_arr = bourne::json::array();

    for(auto& var : aUDIENCE_INCLUDE_list)
    {
        aUDIENCE_INCLUDE_arr.append(var);
    }
    object["aUDIENCE_INCLUDE"] = aUDIENCE_INCLUDE_arr;








    std::list<TargetingSpecGender> gENDER_list = getGENDER();
    bourne::json gENDER_arr = bourne::json::array();

    for(auto& var : gENDER_list)
    {
        TargetingSpecGender obj = var;
        gENDER_arr.append(obj.toJson());
    }
    object["gENDER"] = gENDER_arr;






    std::list<std::string> gEO_list = getGEO();
    bourne::json gEO_arr = bourne::json::array();

    for(auto& var : gEO_list)
    {
        gEO_arr.append(var);
    }
    object["gEO"] = gEO_arr;








    std::list<std::string> gEO_EXCLUDE_list = getGEOEXCLUDE();
    bourne::json gEO_EXCLUDE_arr = bourne::json::array();

    for(auto& var : gEO_EXCLUDE_list)
    {
        gEO_EXCLUDE_arr.append(var);
    }
    object["gEO_EXCLUDE"] = gEO_EXCLUDE_arr;








    std::list<std::string> iNTEREST_list = getINTEREST();
    bourne::json iNTEREST_arr = bourne::json::array();

    for(auto& var : iNTEREST_list)
    {
        iNTEREST_arr.append(var);
    }
    object["iNTEREST"] = iNTEREST_arr;








    std::list<std::string> lOCALE_list = getLOCALE();
    bourne::json lOCALE_arr = bourne::json::array();

    for(auto& var : lOCALE_list)
    {
        lOCALE_arr.append(var);
    }
    object["lOCALE"] = lOCALE_arr;








    std::list<std::string> lOCATION_list = getLOCATION();
    bourne::json lOCATION_arr = bourne::json::array();

    for(auto& var : lOCATION_list)
    {
        lOCATION_arr.append(var);
    }
    object["lOCATION"] = lOCATION_arr;








    std::list<std::string> lOCATION_EXCLUDE_list = getLOCATIONEXCLUDE();
    bourne::json lOCATION_EXCLUDE_arr = bourne::json::array();

    for(auto& var : lOCATION_EXCLUDE_list)
    {
        lOCATION_EXCLUDE_arr.append(var);
    }
    object["lOCATION_EXCLUDE"] = lOCATION_EXCLUDE_arr;









    object["mAXIMUM_AGE"] = getMAXIMUMAGE();






    object["mINIMUM_AGE"] = getMINIMUMAGE();





    std::list<TargetingSpecShoppingRetargeting> sHOPPING_RETARGETING_list = getSHOPPINGRETARGETING();
    bourne::json sHOPPING_RETARGETING_arr = bourne::json::array();

    for(auto& var : sHOPPING_RETARGETING_list)
    {
        TargetingSpecShoppingRetargeting obj = var;
        sHOPPING_RETARGETING_arr.append(obj.toJson());
    }
    object["sHOPPING_RETARGETING"] = sHOPPING_RETARGETING_arr;






    std::list<std::string> tARGETING_STRATEGY_list = getTARGETINGSTRATEGY();
    bourne::json tARGETING_STRATEGY_arr = bourne::json::array();

    for(auto& var : tARGETING_STRATEGY_list)
    {
        tARGETING_STRATEGY_arr.append(var);
    }
    object["tARGETING_STRATEGY"] = tARGETING_STRATEGY_arr;






    return object;

}

std::list<TargetingSpecAgeBucket>
TargetingSpec::getAGEBUCKET()
{
	return aGE_BUCKET;
}

void
TargetingSpec::setAGEBUCKET(std::list<TargetingSpecAgeBucket> aGE_BUCKET)
{
	this->aGE_BUCKET = aGE_BUCKET;
}

std::list<TargetingSpecAppType>
TargetingSpec::getAPPTYPE()
{
	return aPPTYPE;
}

void
TargetingSpec::setAPPTYPE(std::list<TargetingSpecAppType> aPPTYPE)
{
	this->aPPTYPE = aPPTYPE;
}

std::list<std::string>
TargetingSpec::getAUDIENCEEXCLUDE()
{
	return aUDIENCE_EXCLUDE;
}

void
TargetingSpec::setAUDIENCEEXCLUDE(std::list<std::string> aUDIENCE_EXCLUDE)
{
	this->aUDIENCE_EXCLUDE = aUDIENCE_EXCLUDE;
}

std::list<std::string>
TargetingSpec::getAUDIENCEINCLUDE()
{
	return aUDIENCE_INCLUDE;
}

void
TargetingSpec::setAUDIENCEINCLUDE(std::list<std::string> aUDIENCE_INCLUDE)
{
	this->aUDIENCE_INCLUDE = aUDIENCE_INCLUDE;
}

std::list<TargetingSpecGender>
TargetingSpec::getGENDER()
{
	return gENDER;
}

void
TargetingSpec::setGENDER(std::list<TargetingSpecGender> gENDER)
{
	this->gENDER = gENDER;
}

std::list<std::string>
TargetingSpec::getGEO()
{
	return gEO;
}

void
TargetingSpec::setGEO(std::list<std::string> gEO)
{
	this->gEO = gEO;
}

std::list<std::string>
TargetingSpec::getGEOEXCLUDE()
{
	return gEO_EXCLUDE;
}

void
TargetingSpec::setGEOEXCLUDE(std::list<std::string> gEO_EXCLUDE)
{
	this->gEO_EXCLUDE = gEO_EXCLUDE;
}

std::list<std::string>
TargetingSpec::getINTEREST()
{
	return iNTEREST;
}

void
TargetingSpec::setINTEREST(std::list<std::string> iNTEREST)
{
	this->iNTEREST = iNTEREST;
}

std::list<std::string>
TargetingSpec::getLOCALE()
{
	return lOCALE;
}

void
TargetingSpec::setLOCALE(std::list<std::string> lOCALE)
{
	this->lOCALE = lOCALE;
}

std::list<std::string>
TargetingSpec::getLOCATION()
{
	return lOCATION;
}

void
TargetingSpec::setLOCATION(std::list<std::string> lOCATION)
{
	this->lOCATION = lOCATION;
}

std::list<std::string>
TargetingSpec::getLOCATIONEXCLUDE()
{
	return lOCATION_EXCLUDE;
}

void
TargetingSpec::setLOCATIONEXCLUDE(std::list<std::string> lOCATION_EXCLUDE)
{
	this->lOCATION_EXCLUDE = lOCATION_EXCLUDE;
}

std::string
TargetingSpec::getMAXIMUMAGE()
{
	return mAXIMUM_AGE;
}

void
TargetingSpec::setMAXIMUMAGE(std::string mAXIMUM_AGE)
{
	this->mAXIMUM_AGE = mAXIMUM_AGE;
}

std::string
TargetingSpec::getMINIMUMAGE()
{
	return mINIMUM_AGE;
}

void
TargetingSpec::setMINIMUMAGE(std::string mINIMUM_AGE)
{
	this->mINIMUM_AGE = mINIMUM_AGE;
}

std::list<TargetingSpecShoppingRetargeting>
TargetingSpec::getSHOPPINGRETARGETING()
{
	return sHOPPING_RETARGETING;
}

void
TargetingSpec::setSHOPPINGRETARGETING(std::list<TargetingSpecShoppingRetargeting> sHOPPING_RETARGETING)
{
	this->sHOPPING_RETARGETING = sHOPPING_RETARGETING;
}

std::list<std::string>
TargetingSpec::getTARGETINGSTRATEGY()
{
	return tARGETING_STRATEGY;
}

void
TargetingSpec::setTARGETINGSTRATEGY(std::list<std::string> tARGETING_STRATEGY)
{
	this->tARGETING_STRATEGY = tARGETING_STRATEGY;
}



