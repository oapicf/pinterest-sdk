

#include "RelatedTermsRelatedTermsListItems.h"

using namespace Tiny;

RelatedTermsRelatedTermsListItems::RelatedTermsRelatedTermsListItems()
{
	related_terms = std::list<std::string>();
	term = std::string();
}

RelatedTermsRelatedTermsListItems::RelatedTermsRelatedTermsListItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

RelatedTermsRelatedTermsListItems::~RelatedTermsRelatedTermsListItems()
{

}

void
RelatedTermsRelatedTermsListItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *related_termsKey = "related_terms";

    if(object.has_key(related_termsKey))
    {
        bourne::json value = object[related_termsKey];


        std::list<std::string> related_terms_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            related_terms_list.push_back(element);
        }
        related_terms = related_terms_list;


    }

    const char *termKey = "term";

    if(object.has_key(termKey))
    {
        bourne::json value = object[termKey];



        jsonToValue(&term, value, "std::string");


    }


}

bourne::json
RelatedTermsRelatedTermsListItems::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> related_terms_list = getRelatedTerms();
    bourne::json related_terms_arr = bourne::json::array();

    for(auto& var : related_terms_list)
    {
        related_terms_arr.append(var);
    }
    object["related_terms"] = related_terms_arr;









    object["term"] = getTerm();



    return object;

}

std::list<std::string>
RelatedTermsRelatedTermsListItems::getRelatedTerms()
{
	return related_terms;
}

void
RelatedTermsRelatedTermsListItems::setRelatedTerms(std::list<std::string> related_terms)
{
	this->related_terms = related_terms;
}

std::string
RelatedTermsRelatedTermsListItems::getTerm()
{
	return term;
}

void
RelatedTermsRelatedTermsListItems::setTerm(std::string term)
{
	this->term = term;
}



