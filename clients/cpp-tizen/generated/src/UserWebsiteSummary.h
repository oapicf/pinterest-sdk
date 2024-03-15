/*
 * UserWebsiteSummary.h
 *
 * 
 */

#ifndef _UserWebsiteSummary_H_
#define _UserWebsiteSummary_H_


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

class UserWebsiteSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	UserWebsiteSummary();
	UserWebsiteSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserWebsiteSummary();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Website with path or domain only
	 */
	std::string getWebsite();

	/*! \brief Set Website with path or domain only
	 */
	void setWebsite(std::string  website);
	/*! \brief Get Status of the verification process
	 */
	std::string getStatus();

	/*! \brief Set Status of the verification process
	 */
	void setStatus(std::string  status);
	/*! \brief Get UTC timestamp when the verification happened - sometimes missing
	 */
	std::string getVerifiedAt();

	/*! \brief Set UTC timestamp when the verification happened - sometimes missing
	 */
	void setVerifiedAt(std::string  verified_at);

private:
	std::string website;
	std::string status;
	std::string verified_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserWebsiteSummary_H_ */
