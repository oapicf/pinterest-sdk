

#include "CatalogsAiContentDisclosure.h"

using namespace Tiny;

CatalogsAiContentDisclosure::CatalogsAiContentDisclosure()
{
	disclosure = std::list<CatalogsAiContentDisclosureLabel>();
	url = std::string();
}

CatalogsAiContentDisclosure::CatalogsAiContentDisclosure(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsAiContentDisclosure::~CatalogsAiContentDisclosure()
{

}

void
CatalogsAiContentDisclosure::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *disclosureKey = "disclosure";

    if(object.has_key(disclosureKey))
    {
        bourne::json value = object[disclosureKey];


        std::list<CatalogsAiContentDisclosureLabel> disclosure_list;
        CatalogsAiContentDisclosureLabel element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            disclosure_list.push_back(element);
        }
        disclosure = disclosure_list;


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
CatalogsAiContentDisclosure::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CatalogsAiContentDisclosureLabel> disclosure_list = getDisclosure();
    bourne::json disclosure_arr = bourne::json::array();

    for(auto& var : disclosure_list)
    {
        CatalogsAiContentDisclosureLabel obj = var;
        disclosure_arr.append(obj.toJson());
    }
    object["disclosure"] = disclosure_arr;







    object["url"] = getUrl();



    return object;

}

std::list<CatalogsAiContentDisclosureLabel>
CatalogsAiContentDisclosure::getDisclosure()
{
	return disclosure;
}

void
CatalogsAiContentDisclosure::setDisclosure(std::list<CatalogsAiContentDisclosureLabel> disclosure)
{
	this->disclosure = disclosure;
}

std::string
CatalogsAiContentDisclosure::getUrl()
{
	return url;
}

void
CatalogsAiContentDisclosure::setUrl(std::string url)
{
	this->url = url;
}



