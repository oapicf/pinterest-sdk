/*
 * AudienceDataParty.h
 *
 * Whether the data is owned by the partner (1p) or by the data provider (3p)
 */

#ifndef _AudienceDataParty_H_
#define _AudienceDataParty_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Whether the data is owned by the partner (1p) or by the data provider (3p)
 *
 *  \ingroup Models
 *
 */

class AudienceDataParty : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceDataParty();
	AudienceDataParty(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceDataParty();

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

#endif /* _AudienceDataParty_H_ */
