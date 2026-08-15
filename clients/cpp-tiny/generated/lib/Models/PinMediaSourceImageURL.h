
/*
 * PinMediaSourceImageURL.h
 *
 * Image URL-based media source.
 */

#ifndef TINY_CPP_CLIENT_PinMediaSourceImageURL_H_
#define TINY_CPP_CLIENT_PinMediaSourceImageURL_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Image URL-based media source.
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImageURL{
public:

    /*! \brief Constructor.
	 */
    PinMediaSourceImageURL();
    PinMediaSourceImageURL(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaSourceImageURL();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	bool isIsStandard();

	/*! \brief Set Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	void setIsStandard(bool  is_standard);
	/*! \brief Get The source type of the media.
	 */
	std::string getSourceType();

	/*! \brief Set The source type of the media.
	 */
	void setSourceType(std::string  source_type);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);


    private:
    bool is_standard{};
    std::string source_type{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaSourceImageURL_H_ */
