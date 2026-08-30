
/*
 * RelatedTermsRelatedTermsListItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RelatedTermsRelatedTermsListItems_H_
#define TINY_CPP_CLIENT_RelatedTermsRelatedTermsListItems_H_


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

class RelatedTermsRelatedTermsListItems{
public:

    /*! \brief Constructor.
	 */
    RelatedTermsRelatedTermsListItems();
    RelatedTermsRelatedTermsListItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RelatedTermsRelatedTermsListItems();


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
	void setRelatedTerms(std::list<std::string> related_terms);
	/*! \brief Get 
	 */
	std::string getTerm();

	/*! \brief Set 
	 */
	void setTerm(std::string term);


    private:
    std::list<std::string> related_terms;
    std::string term{};
};
}

#endif /* TINY_CPP_CLIENT_RelatedTermsRelatedTermsListItems_H_ */
