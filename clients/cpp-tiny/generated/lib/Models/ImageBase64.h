
/*
 * Image_Base64.h
 *
 * Base64-encoded image media source
 */

#ifndef TINY_CPP_CLIENT_Image_Base64_H_
#define TINY_CPP_CLIENT_Image_Base64_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Base64-encoded image media source
 *
 *  \ingroup Models
 *
 */

class Image_Base64{
public:

    /*! \brief Constructor.
	 */
    Image_Base64();
    Image_Base64(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Image_Base64();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getContentType();

	/*! \brief Set 
	 */
	void setContentType(std::string  content_type);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);


    private:
    std::string content_type{};
    std::string data{};
};
}

#endif /* TINY_CPP_CLIENT_Image_Base64_H_ */
