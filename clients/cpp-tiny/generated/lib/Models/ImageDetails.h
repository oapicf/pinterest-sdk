
/*
 * ImageDetails.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ImageDetails_H_
#define TINY_CPP_CLIENT_ImageDetails_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ImageDetails{
public:

    /*! \brief Constructor.
	 */
    ImageDetails();
    ImageDetails(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ImageDetails();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getHeight();

	/*! \brief Set 
	 */
	void setHeight(int  height);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get 
	 */
	int getWidth();

	/*! \brief Set 
	 */
	void setWidth(int  width);


    private:
    int height{};
    std::string url{};
    int width{};
};
}

#endif /* TINY_CPP_CLIENT_ImageDetails_H_ */
