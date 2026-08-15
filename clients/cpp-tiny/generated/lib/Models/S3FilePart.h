
/*
 * S3FilePart.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_S3FilePart_H_
#define TINY_CPP_CLIENT_S3FilePart_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class S3FilePart{
public:

    /*! \brief Constructor.
	 */
    S3FilePart();
    S3FilePart(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~S3FilePart();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Part number for upload.
	 */
	int getPartNumber();

	/*! \brief Set Part number for upload.
	 */
	void setPartNumber(int  part_number);
	/*! \brief Get Pre-signed URL.
	 */
	std::string getPresignedUrl();

	/*! \brief Set Pre-signed URL.
	 */
	void setPresignedUrl(std::string  presigned_url);


    private:
    int part_number{};
    std::string presigned_url{};
};
}

#endif /* TINY_CPP_CLIENT_S3FilePart_H_ */
