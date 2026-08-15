
/*
 * ConversionEventResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionEventResponse_H_
#define TINY_CPP_CLIENT_ConversionEventResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionTagType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionEventResponse{
public:

    /*! \brief Constructor.
	 */
    ConversionEventResponse();
    ConversionEventResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionEventResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Id of the ad account.
	 */
	std::string getAdAccountId();

	/*! \brief Set Id of the ad account.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get 
	 */
	ConversionTagType getConversionEvent();

	/*! \brief Set 
	 */
	void setConversionEvent(ConversionTagType  conversion_event);
	/*! \brief Get Id of the tag.
	 */
	std::string getConversionTagId();

	/*! \brief Set Id of the tag.
	 */
	void setConversionTagId(std::string  conversion_tag_id);
	/*! \brief Get Creation date in epoch format.
	 */
	int getCreatedTime();

	/*! \brief Set Creation date in epoch format.
	 */
	void setCreatedTime(int  created_time);


    private:
    std::string ad_account_id{};
    ConversionTagType conversion_event;
    std::string conversion_tag_id{};
    int created_time{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionEventResponse_H_ */
