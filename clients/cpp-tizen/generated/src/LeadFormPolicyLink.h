/*
 * LeadFormPolicyLink.h
 *
 * 
 */

#ifndef _LeadFormPolicyLink_H_
#define _LeadFormPolicyLink_H_


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

class LeadFormPolicyLink : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormPolicyLink();
	LeadFormPolicyLink(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormPolicyLink();

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

#endif /* _LeadFormPolicyLink_H_ */
