/*
 * ConversionTagListResponse.h
 *
 * 
 */

#ifndef _ConversionTagListResponse_H_
#define _ConversionTagListResponse_H_


#include <string>
#include "ConversionTagResponse.h"
#include <list>
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

class ConversionTagListResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionTagListResponse();
	ConversionTagListResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionTagListResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<ConversionTagResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ConversionTagResponse> items);

private:
	std::list <ConversionTagResponse>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionTagListResponse_H_ */
