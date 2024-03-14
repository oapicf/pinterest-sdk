/*
 * AudienceCreateRequest_1_audience_type.h
 *
 * 
 */

#ifndef _AudienceCreateRequest_1_audience_type_H_
#define _AudienceCreateRequest_1_audience_type_H_


#include <string>
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

class AudienceCreateRequest_1_audience_type : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceCreateRequest_1_audience_type();
	AudienceCreateRequest_1_audience_type(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceCreateRequest_1_audience_type();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceCreateRequest_1_audience_type_H_ */
