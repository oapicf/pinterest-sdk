/*
 * BoardCreate.h
 *
 * Resource create operation model.
 */

#ifndef _BoardCreate_H_
#define _BoardCreate_H_


#include <string>
#include "BoardPrivacy.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class BoardCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	BoardCreate();
	BoardCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BoardCreate();

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
	/*! \brief Get If set to `true`, the board will be ad-only and can store ad-only Pins.
	 */
	bool getIsAdsOnly();

	/*! \brief Set If set to `true`, the board will be ad-only and can store ad-only Pins.
	 */
	void setIsAdsOnly(bool  is_ads_only);
	/*! \brief Get      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	 */
	std::string getName();

	/*! \brief Set      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	 */
	void setName(std::string  name);
	/*! \brief Get     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
	 */
	BoardPrivacy getPrivacy();

	/*! \brief Set     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
	 */
	void setPrivacy(BoardPrivacy  privacy);

private:
	std::string description;
	bool is_ads_only;
	std::string name;
	BoardPrivacy privacy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BoardCreate_H_ */
