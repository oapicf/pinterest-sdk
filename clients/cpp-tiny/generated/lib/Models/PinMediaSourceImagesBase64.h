
/*
 * PinMediaSourceImagesBase64.h
 *
 * Multiple Base64-based images media source
 */

#ifndef TINY_CPP_CLIENT_PinMediaSourceImagesBase64_H_
#define TINY_CPP_CLIENT_PinMediaSourceImagesBase64_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PinMediaSourceImagesBase64Item.h"
#include <list>

namespace Tiny {


/*! \brief Multiple Base64-based images media source
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImagesBase64{
public:

    /*! \brief Constructor.
	 */
    PinMediaSourceImagesBase64();
    PinMediaSourceImagesBase64(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaSourceImagesBase64();


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
	std::list<PinMediaSourceImagesBase64Item> getItems();

	/*! \brief Set Array with image objects.
	 */
	void setItems(std::list<PinMediaSourceImagesBase64Item> items);
	/*! \brief Get The source type of the media.
	 */
	std::string getSourceType();

	/*! \brief Set The source type of the media.
	 */
	void setSourceType(std::string source_type);


    private:
    int index{};
    std::list<PinMediaSourceImagesBase64Item> items;
    std::string source_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaSourceImagesBase64_H_ */
