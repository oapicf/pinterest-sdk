
/*
 * CustomerList.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomerList_H_
#define TINY_CPP_CLIENT_CustomerList_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CustomerListStatus.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomerList{
public:

    /*! \brief Constructor.
	 */
    CustomerList();
    CustomerList(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerList();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Associated ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Associated ad account ID.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get Creation time. Unix timestamp in seconds.
	 */
	long getCreatedTime();

	/*! \brief Set Creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(long created_time);
	/*! \brief Get Customer list errors.
	 */
	Object getExceptions();

	/*! \brief Set Customer list errors.
	 */
	void setExceptions(Object exceptions);
	/*! \brief Get Customer list ID.
	 */
	std::string getId();

	/*! \brief Set Customer list ID.
	 */
	void setId(std::string id);
	/*! \brief Get Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
	 */
	bool isIsNca();

	/*! \brief Set Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
	 */
	void setIsNca(bool is_nca);
	/*! \brief Get Customer list name.
	 */
	std::string getName();

	/*! \brief Set Customer list name.
	 */
	void setName(std::string name);
	/*! \brief Get Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
	 */
	long getNumBatches();

	/*! \brief Set Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
	 */
	void setNumBatches(long num_batches);
	/*! \brief Get Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
	 */
	long getNumRemovedUserRecords();

	/*! \brief Set Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
	 */
	void setNumRemovedUserRecords(long num_removed_user_records);
	/*! \brief Get Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
	 */
	long getNumUploadedUserRecords();

	/*! \brief Set Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
	 */
	void setNumUploadedUserRecords(long num_uploaded_user_records);
	/*! \brief Get Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
	 */
	CustomerListStatus getStatus();

	/*! \brief Set Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
	 */
	void setStatus(CustomerListStatus status);
	/*! \brief Get Always `customerlist`.
	 */
	std::string getType();

	/*! \brief Set Always `customerlist`.
	 */
	void setType(std::string type);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	long getUpdatedTime();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(long updated_time);


    private:
    std::string ad_account_id{};
    long created_time{};
    Object exceptions;
    std::string id{};
    bool is_nca{};
    std::string name{};
    long num_batches{};
    long num_removed_user_records{};
    long num_uploaded_user_records{};
    CustomerListStatus status;
    std::string type{};
    long updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_CustomerList_H_ */
