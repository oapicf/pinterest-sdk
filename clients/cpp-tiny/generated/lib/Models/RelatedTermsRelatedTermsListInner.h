
/*
 * RelatedTerms_related_terms_list_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RelatedTerms_related_terms_list_inner_H_
#define TINY_CPP_CLIENT_RelatedTerms_related_terms_list_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RelatedTerms_related_terms_list_inner{
public:

    /*! \brief Constructor.
	 */
    RelatedTerms_related_terms_list_inner();
    RelatedTerms_related_terms_list_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RelatedTerms_related_terms_list_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getRelatedTerms();

	/*! \brief Set 
	 */
	void setRelatedTerms(std::list <std::string> related_terms);
	/*! \brief Get 
	 */
	std::string getTerm();

	/*! \brief Set 
	 */
	void setTerm(std::string  term);


    private:
    std::list<std::string> related_terms;
    std::string term{};
};
}

#endif /* TINY_CPP_CLIENT_RelatedTerms_related_terms_list_inner_H_ */
