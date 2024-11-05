/*
 * SharedAudienceAccount.h
 *
 * 
 */

#ifndef _SharedAudienceAccount_H_
#define _SharedAudienceAccount_H_


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

class SharedAudienceAccount : public Object {
public:
	/*! \brief Constructor.
	 */
	SharedAudienceAccount();
	SharedAudienceAccount(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SharedAudienceAccount();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Account ID (ad account or business ID).
	 */
	std::string getAccountId();

	/*! \brief Set Account ID (ad account or business ID).
	 */
	void setAccountId(std::string  account_id);
	/*! \brief Get Account name.
	 */
	std::string getAccountName();

	/*! \brief Set Account name.
	 */
	void setAccountName(std::string  account_name);
	/*! \brief Get account type
	 */
	std::string getAccountType();

	/*! \brief Set account type
	 */
	void setAccountType(std::string  account_type);
	/*! \brief Get Epoch timestamp in seconds for the shared audience event
	 */
	int getSharedOnTimestamp();

	/*! \brief Set Epoch timestamp in seconds for the shared audience event
	 */
	void setSharedOnTimestamp(int  shared_on_timestamp);

private:
	std::string account_id;
	std::string account_name;
	std::string account_type;
	int shared_on_timestamp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SharedAudienceAccount_H_ */
