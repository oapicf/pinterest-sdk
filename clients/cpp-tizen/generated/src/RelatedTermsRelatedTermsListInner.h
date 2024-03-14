/*
 * RelatedTerms_related_terms_list_inner.h
 *
 * 
 */

#ifndef _RelatedTerms_related_terms_list_inner_H_
#define _RelatedTerms_related_terms_list_inner_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RelatedTerms_related_terms_list_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	RelatedTerms_related_terms_list_inner();
	RelatedTerms_related_terms_list_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RelatedTerms_related_terms_list_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getTerm();

	/*! \brief Set 
	 */
	void setTerm(std::string  term);
	/*! \brief Get 
	 */
	std::list<std::string> getRelatedTerms();

	/*! \brief Set 
	 */
	void setRelatedTerms(std::list <std::string> related_terms);

private:
	std::string term;
	std::list <std::string>related_terms;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RelatedTerms_related_terms_list_inner_H_ */
