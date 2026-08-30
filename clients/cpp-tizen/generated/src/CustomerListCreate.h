/*
 * CustomerListCreate.h
 *
 * Resource create operation model.
 */

#ifndef _CustomerListCreate_H_
#define _CustomerListCreate_H_


#include <string>
#include "CustomerListRecordRow.h"
#include "UserListType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class CustomerListCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerListCreate();
	CustomerListCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerListCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
	 */
	bool getIsNca();

	/*! \brief Set Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
	 */
	void setIsNca(bool  is_nca);
	/*! \brief Get Type of customer list (e.g., EMAIL, IDFA, MAID).
	 */
	UserListType getListType();

	/*! \brief Set Type of customer list (e.g., EMAIL, IDFA, MAID).
	 */
	void setListType(UserListType  list_type);
	/*! \brief Get Customer list name.
	 */
	std::string getName();

	/*! \brief Set Customer list name.
	 */
	void setName(std::string  name);
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
	bool is_nca;
	UserListType list_type;
	std::string name;
	std::string records;
	std::list <CustomerListRecordRow>records_v2;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerListCreate_H_ */
