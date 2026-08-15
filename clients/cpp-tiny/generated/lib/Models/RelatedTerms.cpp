

#include "RelatedTerms.h"

using namespace Tiny;

RelatedTerms::RelatedTerms()
{
	id = std::string();
	related_term_count = int(0);
	related_terms_list = std::list<RelatedTerms_related_terms_list_inner>();
}

RelatedTerms::RelatedTerms(std::string jsonString)
{
	this->fromJson(jsonString);
}

RelatedTerms::~RelatedTerms()
{

}

void
RelatedTerms::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *related_term_countKey = "related_term_count";

    if(object.has_key(related_term_countKey))
    {
        bourne::json value = object[related_term_countKey];



        jsonToValue(&related_term_count, value, "int");


    }

    const char *related_terms_listKey = "related_terms_list";

    if(object.has_key(related_terms_listKey))
    {
        bourne::json value = object[related_terms_listKey];


        std::list<RelatedTerms_related_terms_list_inner> related_terms_list_list;
        RelatedTerms_related_terms_list_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            related_terms_list_list.push_back(element);
        }
        related_terms_list = related_terms_list_list;


    }


}

bourne::json
RelatedTerms::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["related_term_count"] = getRelatedTermCount();





    std::list<RelatedTerms_related_terms_list_inner> related_terms_list_list = getRelatedTermsList();
    bourne::json related_terms_list_arr = bourne::json::array();

    for(auto& var : related_terms_list_list)
    {
        RelatedTerms_related_terms_list_inner obj = var;
        related_terms_list_arr.append(obj.toJson());
    }
    object["related_terms_list"] = related_terms_list_arr;




    return object;

}

std::string
RelatedTerms::getId()
{
	return id;
}

void
RelatedTerms::setId(std::string  id)
{
	this->id = id;
}

int
RelatedTerms::getRelatedTermCount()
{
	return related_term_count;
}

void
RelatedTerms::setRelatedTermCount(int  related_term_count)
{
	this->related_term_count = related_term_count;
}

std::list<RelatedTerms_related_terms_list_inner>
RelatedTerms::getRelatedTermsList()
{
	return related_terms_list;
}

void
RelatedTerms::setRelatedTermsList(std::list <RelatedTerms_related_terms_list_inner> related_terms_list)
{
	this->related_terms_list = related_terms_list;
}



