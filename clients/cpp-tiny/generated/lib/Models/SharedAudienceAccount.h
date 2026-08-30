
/*
 * SharedAudienceAccount.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SharedAudienceAccount_H_
#define TINY_CPP_CLIENT_SharedAudienceAccount_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceAccountType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SharedAudienceAccount{
public:

    /*! \brief Constructor.
	 */
    SharedAudienceAccount();
    SharedAudienceAccount(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SharedAudienceAccount();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Account ID (ad account or business ID).
	 */
	std::string getAccountId();

	/*! \brief Set Account ID (ad account or business ID).
	 */
	void setAccountId(std::string account_id);
	/*! \brief Get Account name.
	 */
	std::string getAccountName();

	/*! \brief Set Account name.
	 */
	void setAccountName(std::string account_name);
	/*! \brief Get account type
	 */
	AudienceAccountType getAccountType();

	/*! \brief Set account type
	 */
	void setAccountType(AudienceAccountType account_type);
	/*! \brief Get Epoch timestamp in seconds for the shared audience event
	 */
	int getSharedOnTimestamp();

	/*! \brief Set Epoch timestamp in seconds for the shared audience event
	 */
	void setSharedOnTimestamp(int shared_on_timestamp);


    private:
    std::string account_id{};
    std::string account_name{};
    AudienceAccountType account_type;
    int shared_on_timestamp{};
};
}

#endif /* TINY_CPP_CLIENT_SharedAudienceAccount_H_ */
