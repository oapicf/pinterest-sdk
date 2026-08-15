
/*
 * BoardCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_BoardCreate_H_
#define TINY_CPP_CLIENT_BoardCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BoardPrivacy.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class BoardCreate{
public:

    /*! \brief Constructor.
	 */
    BoardCreate();
    BoardCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardCreate();


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
	void setDescription(std::string  description);
	/*! \brief Get If set to `true`, the board will be ad-only and can store ad-only Pins.
	 */
	bool isIsAdsOnly();

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
    std::string description{};
    bool is_ads_only{};
    std::string name{};
    BoardPrivacy privacy;
};
}

#endif /* TINY_CPP_CLIENT_BoardCreate_H_ */
