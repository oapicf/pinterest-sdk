/*
 * LeadFormTestRequest.h
 *
 * Request to create test data for lead data test API.
 */

#ifndef _LeadFormTestRequest_H_
#define _LeadFormTestRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request to create test data for lead data test API.
 *
 *  \ingroup Models
 *
 */

class LeadFormTestRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormTestRequest();
	LeadFormTestRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormTestRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Test lead answers. Should follow the creation order.
	 */
	std::list<std::string> getAnswers();

	/*! \brief Set Test lead answers. Should follow the creation order.
	 */
	void setAnswers(std::list <std::string> answers);

private:
	std::list <std::string>answers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormTestRequest_H_ */
