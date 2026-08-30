
/*
 * ImageSize.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ImageSize_H_
#define TINY_CPP_CLIENT_ImageSize_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ImageDetails.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ImageSize{
public:

    /*! \brief Constructor.
	 */
    ImageSize();
    ImageSize(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ImageSize();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ImageDetails get1200x();

	/*! \brief Set 
	 */
	void set1200x(ImageDetails 1200x);
	/*! \brief Get 
	 */
	ImageDetails get150x150();

	/*! \brief Set 
	 */
	void set150x150(ImageDetails 150x150);
	/*! \brief Get 
	 */
	ImageDetails get400x300();

	/*! \brief Set 
	 */
	void set400x300(ImageDetails 400x300);
	/*! \brief Get 
	 */
	ImageDetails get600x();

	/*! \brief Set 
	 */
	void set600x(ImageDetails 600x);


    private:
    ImageDetails 1200x;
    ImageDetails 150x150;
    ImageDetails 400x300;
    ImageDetails 600x;
};
}

#endif /* TINY_CPP_CLIENT_ImageSize_H_ */
