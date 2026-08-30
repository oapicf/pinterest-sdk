
/*
 * PinMediaSourceImageBase64.h
 *
 * Image Base64-based media source.
 */

#ifndef TINY_CPP_CLIENT_PinMediaSourceImageBase64_H_
#define TINY_CPP_CLIENT_PinMediaSourceImageBase64_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ContentType.h"

namespace Tiny {


/*! \brief Image Base64-based media source.
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImageBase64{
public:

    /*! \brief Constructor.
	 */
    PinMediaSourceImageBase64();
    PinMediaSourceImageBase64(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaSourceImageBase64();


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
	void setContentType(ContentType content_type);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string data);
	/*! \brief Get Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	bool isIsStandard();

	/*! \brief Set Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	void setIsStandard(bool is_standard);
	/*! \brief Get The source type of the media.
	 */
	std::string getSourceType();

	/*! \brief Set The source type of the media.
	 */
	void setSourceType(std::string source_type);


    private:
    ContentType content_type;
    std::string data{};
    bool is_standard{};
    std::string source_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaSourceImageBase64_H_ */
