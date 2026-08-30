
/*
 * CustomerListUpload.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomerListUpload_H_
#define TINY_CPP_CLIENT_CustomerListUpload_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ErrorDetail.h"
#include "RecordCounts.h"
#include "UserListOperationType.h"
#include "WorkloadState.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomerListUpload{
public:

    /*! \brief Constructor.
	 */
    CustomerListUpload();
    CustomerListUpload(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListUpload();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Advertiser ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Advertiser ID.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get Customer List Upload creation_time. Epoch (seconds).
	 */
	int getCreationTime();

	/*! \brief Set Customer List Upload creation_time. Epoch (seconds).
	 */
	void setCreationTime(int creation_time);
	/*! \brief Get ID of the customer list associated with this upload.
	 */
	std::string getCustomerListId();

	/*! \brief Set ID of the customer list associated with this upload.
	 */
	void setCustomerListId(std::string customer_list_id);
	/*! \brief Get Error counts by error code
	 */
	std::list<ErrorDetail> getErrorCounts();

	/*! \brief Set Error counts by error code
	 */
	void setErrorCounts(std::list<ErrorDetail> error_counts);
	/*! \brief Get Customer List Upload ID.
	 */
	std::string getId();

	/*! \brief Set Customer List Upload ID.
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	UserListOperationType getOperation();

	/*! \brief Set 
	 */
	void setOperation(UserListOperationType operation);
	/*! \brief Get Record processing counts
	 */
	RecordCounts getRecordCounts();

	/*! \brief Set Record processing counts
	 */
	void setRecordCounts(RecordCounts record_counts);
	/*! \brief Get 
	 */
	WorkloadState getState();

	/*! \brief Set 
	 */
	void setState(WorkloadState state);
	/*! \brief Get Customer List Upload updated_time. Epoch (seconds).
	 */
	int getUpdatedTime();

	/*! \brief Set Customer List Upload updated_time. Epoch (seconds).
	 */
	void setUpdatedTime(int updated_time);


    private:
    std::string ad_account_id{};
    int creation_time{};
    std::string customer_list_id{};
    std::list<ErrorDetail> error_counts;
    std::string id{};
    UserListOperationType operation;
    RecordCounts record_counts;
    WorkloadState state;
    int updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_CustomerListUpload_H_ */
