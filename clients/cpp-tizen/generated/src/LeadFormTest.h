/*
 * LeadFormTest.h
 *
 * Lead form test action: submit sample answers and receive the resulting subscription id.
 */

#ifndef _LeadFormTest_H_
#define _LeadFormTest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Lead form test action: submit sample answers and receive the resulting subscription id.
 *
 *  \ingroup Models
 *
 */

class LeadFormTest : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormTest();
	LeadFormTest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormTest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Subscription ID.
	 */
	std::string getSubscriptionId();

	/*! \brief Set Subscription ID.
	 */
	void setSubscriptionId(std::string  subscription_id);

private:
	std::string subscription_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormTest_H_ */
