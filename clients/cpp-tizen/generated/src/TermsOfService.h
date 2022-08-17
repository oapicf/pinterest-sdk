/*
 * TermsOfService.h
 *
 * 
 */

#ifndef _TermsOfService_H_
#define _TermsOfService_H_


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

class TermsOfService : public Object {
public:
	/*! \brief Constructor.
	 */
	TermsOfService();
	TermsOfService(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TermsOfService();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the terms of service
	 */
	std::string getId();

	/*! \brief Set The ID of the terms of service
	 */
	void setId(std::string  id);
	/*! \brief Get The terms of service content
	 */
	std::string getHtml();

	/*! \brief Set The terms of service content
	 */
	void setHtml(std::string  html);
	/*! \brief Get Whether the ad account has accepted terms of service.
	 */
	bool getHasAccepted();

	/*! \brief Set Whether the ad account has accepted terms of service.
	 */
	void setHasAccepted(bool  has_accepted);
	/*! \brief Get The ID of the ad account.
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the ad account.
	 */
	void setAdAccountId(std::string  ad_account_id);

private:
	std::string id;
	std::string html;
	bool has_accepted;
	std::string ad_account_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TermsOfService_H_ */
