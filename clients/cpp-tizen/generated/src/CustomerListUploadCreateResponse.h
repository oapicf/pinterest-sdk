/*
 * CustomerListUploadCreateResponse.h
 *
 * 
 */

#ifndef _CustomerListUploadCreateResponse_H_
#define _CustomerListUploadCreateResponse_H_


#include <string>
#include "CustomerListUpload.h"
#include "S3MultipartUploadData.h"
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

class CustomerListUploadCreateResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerListUploadCreateResponse();
	CustomerListUploadCreateResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerListUploadCreateResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerListUploadCreateResponse_H_ */
