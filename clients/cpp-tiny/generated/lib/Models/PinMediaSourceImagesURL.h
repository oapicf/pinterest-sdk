
/*
 * PinMediaSourceImagesURL.h
 *
 * Multiple URL-based images media source
 */

#ifndef TINY_CPP_CLIENT_PinMediaSourceImagesURL_H_
#define TINY_CPP_CLIENT_PinMediaSourceImagesURL_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PinMediaSourceImagesURLItem.h"
#include <list>

namespace Tiny {


/*! \brief Multiple URL-based images media source
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImagesURL{
public:

    /*! \brief Constructor.
	 */
    PinMediaSourceImagesURL();
    PinMediaSourceImagesURL(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaSourceImagesURL();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int index);
	/*! \brief Get Array with image objects.
	 */
	std::list<PinMediaSourceImagesURLItem> getItems();

	/*! \brief Set Array with image objects.
	 */
	void setItems(std::list<PinMediaSourceImagesURLItem> items);
	/*! \brief Get The source type of the media.
	 */
	std::string getSourceType();

	/*! \brief Set The source type of the media.
	 */
	void setSourceType(std::string source_type);


    private:
    int index{};
    std::list<PinMediaSourceImagesURLItem> items;
    std::string source_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaSourceImagesURL_H_ */
