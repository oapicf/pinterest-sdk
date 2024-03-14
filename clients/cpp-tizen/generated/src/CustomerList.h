/*
 * CustomerList.h
 *
 * 
 */

#ifndef _CustomerList_H_
#define _CustomerList_H_


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

class CustomerList : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerList();
	CustomerList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerList();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Associated ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Associated ad account ID.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Creation time. Unix timestamp in seconds.
	 */
	long long getCreatedTime();

	/*! \brief Set Creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(long long  created_time);
	/*! \brief Get Customer list ID.
	 */
	std::string getId();

	/*! \brief Set Customer list ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Customer list name.
	 */
	std::string getName();

	/*! \brief Set Customer list name.
	 */
	void setName(std::string  name);
	/*! \brief Get Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
	 */
	long long getNumBatches();

	/*! \brief Set Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
	 */
	void setNumBatches(long long  num_batches);
	/*! \brief Get Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
	 */
	long long getNumRemovedUserRecords();

	/*! \brief Set Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
	 */
	void setNumRemovedUserRecords(long long  num_removed_user_records);
	/*! \brief Get Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
	 */
	long long getNumUploadedUserRecords();

	/*! \brief Set Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
	 */
	void setNumUploadedUserRecords(long long  num_uploaded_user_records);
	/*! \brief Get Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
	 */
	std::string getStatus();

	/*! \brief Set Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
	 */
	void setStatus(std::string  status);
	/*! \brief Get Always \"customerlist\".
	 */
	std::string getType();

	/*! \brief Set Always \"customerlist\".
	 */
	void setType(std::string  type);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	long long getUpdatedTime();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(long long  updated_time);
	/*! \brief Get Customer list errors
	 */
	std::string getExceptions();

	/*! \brief Set Customer list errors
	 */
	void setExceptions(std::string  exceptions);

private:
	std::string ad_account_id;
	long long created_time;
	std::string id;
	std::string name;
	long long num_batches;
	long long num_removed_user_records;
	long long num_uploaded_user_records;
	std::string status;
	std::string type;
	long long updated_time;
	std::string exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerList_H_ */
