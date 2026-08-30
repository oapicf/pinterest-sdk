
/*
 * PinMediaSourceImagesURLItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PinMediaSourceImagesURLItem_H_
#define TINY_CPP_CLIENT_PinMediaSourceImagesURLItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImagesURLItem{
public:

    /*! \brief Constructor.
	 */
    PinMediaSourceImagesURLItem();
    PinMediaSourceImagesURLItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaSourceImagesURLItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string link);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    std::string description{};
    std::string link{};
    std::string title{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaSourceImagesURLItem_H_ */
