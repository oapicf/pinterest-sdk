/*
 * CustomerListUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _CustomerListUpdateWithRequiredBody_H_
#define _CustomerListUpdateWithRequiredBody_H_


#include <string>
#include "CustomerListRecordRow.h"
#include "UserListOperationType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class CustomerListUpdateWithRequiredBody : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerListUpdateWithRequiredBody();
	CustomerListUpdateWithRequiredBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerListUpdateWithRequiredBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Customer list update operation type (add or remove). Only valid in update request body.
	 */
	UserListOperationType getOperationType();

	/*! \brief Set Customer list update operation type (add or remove). Only valid in update request body.
	 */
	void setOperationType(UserListOperationType  operation_type);
	/*! \brief Get Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	std::string getRecords();

	/*! \brief Set Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	void setRecords(std::string  records);
	/*! \brief Get Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
	 */
	std::list<CustomerListRecordRow> getRecordsV2();

	/*! \brief Set Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
	 */
	void setRecordsV2(std::list <CustomerListRecordRow> records_v2);

private:
	UserListOperationType operation_type;
	std::string records;
	std::list <CustomerListRecordRow>records_v2;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerListUpdateWithRequiredBody_H_ */
