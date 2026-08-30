
/*
 * CustomerListCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_CustomerListCreate_H_
#define TINY_CPP_CLIENT_CustomerListCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CustomerListRecordRow.h"
#include "UserListType.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class CustomerListCreate{
public:

    /*! \brief Constructor.
	 */
    CustomerListCreate();
    CustomerListCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
	 */
	bool isIsNca();

	/*! \brief Set Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
	 */
	void setIsNca(bool is_nca);
	/*! \brief Get Type of customer list (e.g., EMAIL, IDFA, MAID).
	 */
	UserListType getListType();

	/*! \brief Set Type of customer list (e.g., EMAIL, IDFA, MAID).
	 */
	void setListType(UserListType list_type);
	/*! \brief Get Customer list name.
	 */
	std::string getName();

	/*! \brief Set Customer list name.
	 */
	void setName(std::string name);
	/*! \brief Get Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	std::string getRecords();

	/*! \brief Set Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	void setRecords(std::string records);
	/*! \brief Get Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
	 */
	std::list<CustomerListRecordRow> getRecordsV2();

	/*! \brief Set Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
	 */
	void setRecordsV2(std::list<CustomerListRecordRow> records_v2);


    private:
    bool is_nca{};
    UserListType list_type;
    std::string name{};
    std::string records{};
    std::list<CustomerListRecordRow> records_v2;
};
}

#endif /* TINY_CPP_CLIENT_CustomerListCreate_H_ */
