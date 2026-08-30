
/*
 * RelatedTerms.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RelatedTerms_H_
#define TINY_CPP_CLIENT_RelatedTerms_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RelatedTermsRelatedTermsListItems.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RelatedTerms{
public:

    /*! \brief Constructor.
	 */
    RelatedTerms();
    RelatedTerms(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RelatedTerms();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
	 */
	std::string getId();

	/*! \brief Set First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
	 */
	void setId(std::string id);
	/*! \brief Get Total number of related terms returned
	 */
	int getRelatedTermCount();

	/*! \brief Set Total number of related terms returned
	 */
	void setRelatedTermCount(int related_term_count);
	/*! \brief Get The id of the advertiser.
	 */
	std::list<RelatedTermsRelatedTermsListItems> getRelatedTermsList();

	/*! \brief Set The id of the advertiser.
	 */
	void setRelatedTermsList(std::list<RelatedTermsRelatedTermsListItems> related_terms_list);


    private:
    std::string id{};
    int related_term_count{};
    std::list<RelatedTermsRelatedTermsListItems> related_terms_list;
};
}

#endif /* TINY_CPP_CLIENT_RelatedTerms_H_ */
