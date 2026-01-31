/*
 * BoardWithUpdatePrivacyUpdate.h
 *
 * Resource create or update operation model.
 */

#ifndef _BoardWithUpdatePrivacyUpdate_H_
#define _BoardWithUpdatePrivacyUpdate_H_


#include <string>
#include "BoardUpdatePrivacy.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model.
 *
 *  \ingroup Models
 *
 */

class BoardWithUpdatePrivacyUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	BoardWithUpdatePrivacyUpdate();
	BoardWithUpdatePrivacyUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BoardWithUpdatePrivacyUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	 */
	std::string getName();

	/*! \brief Set      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	BoardUpdatePrivacy getPrivacy();

	/*! \brief Set 
	 */
	void setPrivacy(BoardUpdatePrivacy  privacy);

private:
	std::string description;
	std::string name;
	BoardUpdatePrivacy privacy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BoardWithUpdatePrivacyUpdate_H_ */
