
/*
 * AdPreviewURLResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdPreviewURLResponse_H_
#define TINY_CPP_CLIENT_AdPreviewURLResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdPreviewURLResponse{
public:

    /*! \brief Constructor.
	 */
    AdPreviewURLResponse();
    AdPreviewURLResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdPreviewURLResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19
	 */
	std::string getUrl();

	/*! \brief Set Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19
	 */
	void setUrl(std::string url);


    private:
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_AdPreviewURLResponse_H_ */
