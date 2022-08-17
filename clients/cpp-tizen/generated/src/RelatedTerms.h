/*
 * RelatedTerms.h
 *
 * 
 */

#ifndef _RelatedTerms_H_
#define _RelatedTerms_H_


#include <string>
#include "RelatedTerms_related_terms_list_inner.h"
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

class RelatedTerms : public Object {
public:
	/*! \brief Constructor.
	 */
	RelatedTerms();
	RelatedTerms(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RelatedTerms();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
	 */
	std::string getId();

	/*! \brief Set First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
	 */
	void setId(std::string  id);
	/*! \brief Get Total number of related terms returned
	 */
	int getRelatedTermCount();

	/*! \brief Set Total number of related terms returned
	 */
	void setRelatedTermCount(int  related_term_count);
	/*! \brief Get The id of the advertiser.
	 */
	std::list<RelatedTerms_related_terms_list_inner> getRelatedTermsList();

	/*! \brief Set The id of the advertiser.
	 */
	void setRelatedTermsList(std::list <RelatedTerms_related_terms_list_inner> related_terms_list);

private:
	std::string id;
	int related_term_count;
	std::list <RelatedTerms_related_terms_list_inner>related_terms_list;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RelatedTerms_H_ */
