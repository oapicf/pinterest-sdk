
/*
 * CustomerListUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef TINY_CPP_CLIENT_CustomerListUpdateWithRequiredBody_H_
#define TINY_CPP_CLIENT_CustomerListUpdateWithRequiredBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CustomerListRecordRow.h"
#include "UserListOperationType.h"
#include <list>

namespace Tiny {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class CustomerListUpdateWithRequiredBody{
public:

    /*! \brief Constructor.
	 */
    CustomerListUpdateWithRequiredBody();
    CustomerListUpdateWithRequiredBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListUpdateWithRequiredBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Customer list update operation type (add or remove). Only valid in update request body.
	 */
	UserListOperationType getOperationType();

	/*! \brief Set Customer list update operation type (add or remove). Only valid in update request body.
	 */
	void setOperationType(UserListOperationType operation_type);
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
    UserListOperationType operation_type;
    std::string records{};
    std::list<CustomerListRecordRow> records_v2;
};
}

#endif /* TINY_CPP_CLIENT_CustomerListUpdateWithRequiredBody_H_ */
