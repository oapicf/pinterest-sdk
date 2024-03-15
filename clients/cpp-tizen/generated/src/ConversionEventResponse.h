/*
 * ConversionEventResponse.h
 *
 * 
 */

#ifndef _ConversionEventResponse_H_
#define _ConversionEventResponse_H_


#include <string>
#include "ConversionTagType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionEventResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventResponse();
	ConversionEventResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get Id of the ad account.
	 */
	std::string getAdAccountId();

	/*! \brief Set Id of the ad account.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Creation date in epoch format.
	 */
	int getCreatedTime();

	/*! \brief Set Creation date in epoch format.
	 */
	void setCreatedTime(int  created_time);

private:
	ConversionTagType conversion_event;
	std::string conversion_tag_id;
	std::string ad_account_id;
	int created_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventResponse_H_ */
