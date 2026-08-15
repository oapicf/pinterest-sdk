
/*
 * PinMediaSourceImagesBase64Item.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PinMediaSourceImagesBase64Item_H_
#define TINY_CPP_CLIENT_PinMediaSourceImagesBase64Item_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ContentType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImagesBase64Item{
public:

    /*! \brief Constructor.
	 */
    PinMediaSourceImagesBase64Item();
    PinMediaSourceImagesBase64Item(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaSourceImagesBase64Item();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ContentType getContentType();

	/*! \brief Set 
	 */
	void setContentType(ContentType  content_type);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);


    private:
    ContentType content_type;
    std::string data{};
    std::string description{};
    std::string link{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaSourceImagesBase64Item_H_ */
