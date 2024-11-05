/*
 * LeadFormCommon_policy_links_inner.h
 *
 * 
 */

#ifndef _LeadFormCommon_policy_links_inner_H_
#define _LeadFormCommon_policy_links_inner_H_


#include <string>
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

class LeadFormCommon_policy_links_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormCommon_policy_links_inner();
	LeadFormCommon_policy_links_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormCommon_policy_links_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Policy label for an additional policy link.
	 */
	std::string getLabel();

	/*! \brief Set Policy label for an additional policy link.
	 */
	void setLabel(std::string  label);
	/*! \brief Get Policy link for an additional policy link.
	 */
	std::string getLink();

	/*! \brief Set Policy link for an additional policy link.
	 */
	void setLink(std::string  link);

private:
	std::string label;
	std::string link;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormCommon_policy_links_inner_H_ */
