

#include "TitleKeywordsFilter.h"

using namespace Tiny;

TitleKeywordsFilter::TitleKeywordsFilter()
{
	tITLE_KEYWORDS = CatalogsProductGroupMultipleStringCriteria();
}

TitleKeywordsFilter::TitleKeywordsFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

TitleKeywordsFilter::~TitleKeywordsFilter()
{

}

void
TitleKeywordsFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tITLE_KEYWORDSKey = "TITLE_KEYWORDS";

    if(object.has_key(tITLE_KEYWORDSKey))
    {
        bourne::json value = object[tITLE_KEYWORDSKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &tITLE_KEYWORDS;
		obj->fromJson(value.dump());

    }


}

bourne::json
TitleKeywordsFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["tITLE_KEYWORDS"] = getTITLEKEYWORDS().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
TitleKeywordsFilter::getTITLEKEYWORDS()
{
	return tITLE_KEYWORDS;
}

void
TitleKeywordsFilter::setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria  tITLE_KEYWORDS)
{
	this->tITLE_KEYWORDS = tITLE_KEYWORDS;
}



