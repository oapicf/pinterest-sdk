
/*
 * CustomerListUploadCreateResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomerListUploadCreateResponse_H_
#define TINY_CPP_CLIENT_CustomerListUploadCreateResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CustomerListUpload.h"
#include "S3MultipartUploadData.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomerListUploadCreateResponse{
public:

    /*! \brief Constructor.
	 */
    CustomerListUploadCreateResponse();
    CustomerListUploadCreateResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListUploadCreateResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CustomerListUpload getCustomerListUpload();

	/*! \brief Set 
	 */
	void setCustomerListUpload(CustomerListUpload  customer_list_upload);
	/*! \brief Get 
	 */
	S3MultipartUploadData getS3MultipartUploadData();

	/*! \brief Set 
	 */
	void setS3MultipartUploadData(S3MultipartUploadData  s3_multipart_upload_data);


    private:
    CustomerListUpload customer_list_upload;
    S3MultipartUploadData s3_multipart_upload_data;
};
}

#endif /* TINY_CPP_CLIENT_CustomerListUploadCreateResponse_H_ */
