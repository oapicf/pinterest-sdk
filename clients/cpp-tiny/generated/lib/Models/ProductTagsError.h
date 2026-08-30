
/*
 * ProductTagsError.h
 *
 * Error response for requests containing ineligible product tags.
 */

#ifndef TINY_CPP_CLIENT_ProductTagsError_H_
#define TINY_CPP_CLIENT_ProductTagsError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "IneligibleProductTagsErrorDetails.h"

namespace Tiny {


/*! \brief Error response for requests containing ineligible product tags.
 *
 *  \ingroup Models
 *
 */

class ProductTagsError{
public:

    /*! \brief Constructor.
	 */
    ProductTagsError();
    ProductTagsError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductTagsError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int code);
	/*! \brief Get Details about which product tags failed eligibility check.
	 */
	IneligibleProductTagsErrorDetails getDetails();

	/*! \brief Set Details about which product tags failed eligibility check.
	 */
	void setDetails(IneligibleProductTagsErrorDetails details);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string message);


    private:
    int code{};
    IneligibleProductTagsErrorDetails details;
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_ProductTagsError_H_ */
