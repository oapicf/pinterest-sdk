/*
 * ConversionDeletionRequestUserEmailTargets.h
 *
 * 
 */

#ifndef _ConversionDeletionRequestUserEmailTargets_H_
#define _ConversionDeletionRequestUserEmailTargets_H_


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

class ConversionDeletionRequestUserEmailTargets : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionDeletionRequestUserEmailTargets();
	ConversionDeletionRequestUserEmailTargets(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionDeletionRequestUserEmailTargets();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array of plain text user emails.
	 */
	std::list<std::string> getUserEmails();

	/*! \brief Set Array of plain text user emails.
	 */
	void setUserEmails(std::list <std::string> user_emails);

private:
	std::list <std::string>user_emails;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionDeletionRequestUserEmailTargets_H_ */
